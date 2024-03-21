package fr.ghisswill.spotifyclone.catalogcontext.application.dto;

import jakarta.persistence.Lob;

import java.util.UUID;

public record SongContentDTO(UUID publicId, @Lob byte[] fine, String fileContType) {
}
