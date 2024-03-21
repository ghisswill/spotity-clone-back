package fr.ghisswill.spotifyclone.catalogcontext.application.dto;

import fr.ghisswill.spotifyclone.catalogcontext.application.vo.SongAuthorVO;
import fr.ghisswill.spotifyclone.catalogcontext.application.vo.SongTitleVO;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.UUID;

@Data
public class ReadSongInfoDTO {
    private SongTitleVO title;
    private SongAuthorVO author;
    @NotNull
    private byte[] cove;
    @NotNull
    private String coverContentType;
    @NotNull
    private boolean isFavorite;
    @NotNull
    private UUID publicId;
}
