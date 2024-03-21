package fr.ghisswill.spotifyclone.catalogcontext.application.dto;

import fr.ghisswill.spotifyclone.catalogcontext.application.vo.SongAuthorVO;
import fr.ghisswill.spotifyclone.catalogcontext.application.vo.SongTitleVO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record saveSpngDTO(
        @Valid SongTitleVO songTitleVO,
        @Valid SongAuthorVO songAuthorVO,
        @NotNull Byte[] cover,
        @NotNull String coverContent,
        @NotNull Byte[] file,
        @NotNull String fileContentType
        ) {
}
