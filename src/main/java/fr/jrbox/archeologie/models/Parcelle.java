package fr.jrbox.archeologie.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

/**
 * Parcelle :
 * - division du site de fouille
 */
@Data
@RequiredArgsConstructor
public class Parcelle {

    /**
     * Identifiant de la parcelle
     */
    private UUID id;

    /**
     * Nom de la parcelle
     */
    @NotEmpty(message = "Le nom de la parcelle est obligatoire")
    @NotBlank(message = "Le nom de la parcelle est obligatoire")
    @Size(max = 32, message = "Le nom de la parcelle est limité à 32 caractères")
    @NonNull
    private String nom;

    /**
     * Longueur de la parcelle
     */
    @Min(value = 0, message = "La longueur de la parcelle doit être supérieure ou égale à 0")
    @NonNull
    private double longueur;

    /**
     * Largeur de la parcelle
     */
    @Min(value = 0, message = "La largeur de la parcelle doit être supérieure ou égale à 0")
    @NonNull
    private double largeur;
}
