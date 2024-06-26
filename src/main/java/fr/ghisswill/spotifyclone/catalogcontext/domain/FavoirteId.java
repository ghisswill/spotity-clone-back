package fr.ghisswill.spotifyclone.catalogcontext.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class FavoirteId {

    UUID publicId;

    String userEmail;
}
