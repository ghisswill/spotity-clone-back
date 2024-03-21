package fr.ghisswill.spotifyclone.usercontext.mapper;

import fr.ghisswill.spotifyclone.usercontext.ReadUserDTO;
import fr.ghisswill.spotifyclone.usercontext.domain.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    ReadUserDTO readUserDTOToUser(User entity);
}
