package fr.ghisswill.spotifyclone.catalogcontext.repository;

import fr.ghisswill.spotifyclone.catalogcontext.domain.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
