package fr.jrbox.archeologie.models;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * Fouille archéologique.
 */
@Data
@RequiredArgsConstructor
public class Fouille {

    /**
     * Date de la fouille
     */
    @NotNull(message = "La date de la fouille doit être renseignée")
    @FutureOrPresent(message = "La date de la fouille doit être présente ou future")
    @NonNull
    private Date date;

    /**
     * Equipe responsable de la fouille
     */
    @NotNull(message = "L'équipe doit être renseignée")
    private Equipe equipe;

    /**
     * Parcelle concernée par la fouille
     */
    @NotNull(message = "La parcelle doit être renseignée")
    @NonNull
    private Parcelle parcelle;

    /**
     * Liste des artefacts trouvés
     */
    @NotNull
    @NonNull
    private List<Artefact> artefacts;


}
