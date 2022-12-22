package fr.jrbox.archeologie.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

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
    @Size(max = 24, message = "Le nom de la catégorie ne doit pas dépasser 24 caractères")
    @NotEmpty(message = "le nom de la catégorie est obligatoire")
    @NotBlank(message = "le nom de la catégorie est obligatoire")
    @NonNull
    private String nom;

    /**
     * Description
     */
    @Size(max = 64, message = "la description est limitée à 64 caractères")
    private String description;
}
