package fr.jrbox.archeologie.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

/**
 * Membre
 * - chercheur et archéologue d'une équipe de fouille
 */
@Data
@RequiredArgsConstructor
public class Membre {

    /**
     * Identifiant du membre
     */
    private UUID id;

    /**
     * Nom du membre
     */
    @Pattern(regexp = "[A-Z][a-z]+")
    @NotBlank(message = "Le nom est obligatoire")
    @NotEmpty(message = "Le nom est obligatoire")
    @Length(max = 32, message = "Le nom est limité à 32 caracteres")
    private String nom;

    /**
     * Détermine si le membre est un directeur
     */
    @NotNull(message = "Indiquez si le membre est un directeur")
    private Boolean estDirecteur = false;
}
