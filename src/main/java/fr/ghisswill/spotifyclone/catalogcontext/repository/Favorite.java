package fr.ghisswill.spotifyclone.catalogcontext.repository;

import fr.ghisswill.spotifyclone.catalogcontext.domain.FavoirteId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Favorite extends JpaRepository<Favorite, FavoirteId> {
}
