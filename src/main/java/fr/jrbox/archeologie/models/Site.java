package fr.jrbox.archeologie.models;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;

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
    @Size(max = 32, message = "Le nom du site ne doit pas dépasser 32 caractères")
    private String nom;

    /**
     * Liste des parcelles
     */
    @NotNull(message = "Le site doit contenir au moins une parcelle")
    private List<Parcelle> parcelles;
}
