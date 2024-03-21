package fr.ghisswill.spotifyclone.usercontext.application;

import fr.ghisswill.spotifyclone.usercontext.ReadUserDTO;
import fr.ghisswill.spotifyclone.usercontext.domain.User;
import fr.ghisswill.spotifyclone.usercontext.mapper.UserMapper;
import fr.ghisswill.spotifyclone.usercontext.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public ReadUserDTO getAuthenticatedUserFromSecurityContext() {
        OAuth2User principal = (OAuth2User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = map0auth2AttributesToUser(principal.getAttributes());
        return userMapper.readUserDTOToUser(user);
    }

    private void updateUser(User user) {
        Optional<User> userToUpdateOpt = userRepository.findOneByEmail(user.getEmail());

        if(userToUpdateOpt.isPresent()) {
            User userToUpdate = userToUpdateOpt.get();
            userToUpdate.setEmail(user.getEmail());
            userToUpdate.setImageUrl(user.getImageUrl());
            userToUpdate.setLastName(user.getLastName());
            userToUpdate.setFirstName(user.getFirstName());
            userRepository.saveAndFlush(userToUpdate);
        }
    }

    private User map0auth2AttributesToUser(Map<String, Object> attributes) {
        User user = new User();
        String sub = String.valueOf(attributes.get("sub"));

        String username = null;

        if(attributes.get("preferred_username") != null) {
            username = ((String) attributes.get("preferred_username")).toLowerCase();
        }

        if(attributes.get("given_name") != null) {
            user.setFirstName((String) attributes.get("give_name"));
        } else if (attributes.get("name") != null) {
            user.setFirstName((String) attributes.get("name"));
        }

        if(attributes.get("family_name") != null) {
            user.setLastName((String) attributes.get("family_name"));
        }

        if(attributes.get("email") != null) {
            user.setEmail((String) attributes.get("email"));
        } else if(sub.contains("|") && (username != null && username.contains("@"))) {
            user.setEmail(username);
        } else {
            user.setEmail(sub);
        }

        if(attributes.get("picture") != null) {
            user.setImageUrl((String) attributes.get("picture"));
        }

        return user;
    }
}
