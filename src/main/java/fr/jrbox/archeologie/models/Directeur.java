package fr.jrbox.archeologie.models;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Date;

/**
 * Directeur de l'équipe de fouille archéologique
 *  - il est responsable d'une équipe à une instant donné
 *  - il peut être responsable de plusieurs équipes
 */
@Data
@RequiredArgsConstructor
public class Directeur {

    /**
     * Membre associé au directeur
     */
    @NotNull(message = "Le membre est obligatoire")
    private Membre membre;

    /**
     * Date de début de la responsabilité
     */
    @NotNull(message = "la date de début est obligatoire")
    @NonNull
    private Date dateDebut;

    /**
     * Date de fin de la responsabilité
     * - null si la responsabilité est toujours en cours
     * - TODO la date de fin doit être supérieure à la date de début
     */
    private Date dateFin;
}
