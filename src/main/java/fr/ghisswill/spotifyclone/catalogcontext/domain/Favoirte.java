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
@IdClass(FavoirteId.class)
public class Favoirte implements Serializable {

    @Id
    private UUID public_id;

    @Id
    @Column(name = "user_email")
    private String userEmail;
}
