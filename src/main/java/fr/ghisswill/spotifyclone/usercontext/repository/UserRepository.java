package fr.ghisswill.spotifyclone.usercontext.repository;

import fr.ghisswill.spotifyclone.usercontext.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
