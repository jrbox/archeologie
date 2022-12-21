package fr.jrbox.archeologie.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

/**
 * Categorie de l'artefacte
 */
@Data
@AllArgsConstructor
public class ArtefactCategorie {

    /**
     * Identifiant de la categorie
     */
    private UUID id;

    /**
     * Nom de la catégorie.
     */
    @Length(max = 24)
    @NotEmpty(message = "le nom de la catégorie est obligatoire")
    @NotBlank(message="le nom de la catégorie est obligatoire")
    private String nom;

    /**
     * Description
     */
    @Length(max = 64, message = "la description est limitée à 64 caractères")
    private String description;
}
