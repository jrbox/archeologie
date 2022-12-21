package fr.jrbox.archeologie.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.Length;

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
    @Length(max = 32)
    @NotEmpty(message = "Le nom de l'équipe est obligatoire")
    @NotBlank(message = "Le nom de l'équipe est obligatoire")
    private String nom;

    /**
     * Liste des membres
     */
    @NotEmpty(message = "L'équipe doit avoir au moins un membre")
    private List<Membre> membres;
}
