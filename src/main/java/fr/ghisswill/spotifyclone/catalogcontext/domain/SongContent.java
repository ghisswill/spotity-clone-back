package fr.ghisswill.spotifyclone.catalogcontext.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "song_content")
public class SongContent implements Serializable {

    @Id
    @Column(name = "song_id")
    private Long songId;

    @MapsId
    @OneToOne
    @JoinColumn(name = "song_id", referencedColumnName = "id")
    private Song song;

    @Column(name = "file", nullable = false)
    private Byte[] file;

    @Column(name = "file_content_type", nullable = false)
    private String fileContentType;
}
