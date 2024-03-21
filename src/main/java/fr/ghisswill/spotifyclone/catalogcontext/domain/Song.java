package fr.ghisswill.spotifyclone.catalogcontext.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table
public class Song implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "songSequenceGenerator")
    @SequenceGenerator(name = "songSequenceGenerator", sequenceName = "song_generator", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "public_id",nullable = false)
    private UUID publicId;
    @Column(name = "tile",nullable = false)
    private String title;
    @Column(name = "author",nullable = false)
    private String author;
    @Column(name = "cover",nullable = false)
    private String cover;
    @Column(name = "cover_content_type",nullable = false)
    private String coverContentType;
}
