package fr.jrbox.archeologie.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;

/**
 * Equipe de recherche d'un site archéologique
 */
@Data
@RequiredArgsConstructor
public class Equipe {

    /**
     * Identifiant de l'équipe
     */
    private UUID id;

    /**
     * Nom de l'équipe
     */
    @Size(max = 32, message = "Le nom de l'équipe ne doit pas dépasser 32 caractères")
    @NotEmpty(message = "Le nom de l'équipe est obligatoire")
    @NotBlank(message = "Le nom de l'équipe est obligatoire")
    private String nom;

    /**
     * Liste des membres de l'équipe
     */
    @NotEmpty(message = "L'équipe doit avoir au moins un membre")
    private List<Membre> membres;

    /**
     * Liste des directeurs
     */
    @NotNull(message = "L'équipe doit avoir un directeur")
    private Directeur directeur;
}
