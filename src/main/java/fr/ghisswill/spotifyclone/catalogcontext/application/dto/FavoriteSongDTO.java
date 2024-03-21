package fr.ghisswill.spotifyclone.catalogcontext.application.dto;

import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record FavoriteSongDTO(@NotNull boolean isFavorite, @NotNull UUID publicId) {
}
