package fr.jrbox.archeologie.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.List;
import java.util.UUID;

/**
 * Site de fouille archéologique.
 * - Espace géographique sur lequel réaliser la fouille
 */
@Data
@AllArgsConstructor
public class Site {

    /**
     * Identifiant du site
     */
    private UUID id;

    /**
     * Nom du site
     */
    @NotEmpty(message = "Le nom du site est obligatoire")
    @NotBlank(message = "Le nom du site est obligatoire")
    @Pattern(regexp = "[A-Z][a-z]+")
    @Length(max=32, message = "Le nom du site ne doit pas dépasser 32 caractères")
    private String nom;

    /**
     * Liste des parcelles
     */
    @NotEmpty(message = "Le site doit contenir au moins une parcelle")
    private List<Parcelle> parcelles;
}
