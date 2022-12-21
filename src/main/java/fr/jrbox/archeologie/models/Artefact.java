package fr.jrbox.archeologie.models;

import fr.jrbox.archeologie.models.enums.CompletudeType;
import fr.jrbox.archeologie.models.enums.ConservationType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.util.List;
import java.util.UUID;

/**
 * Artefacte.
 * - Objet trouvé sur le site de fouille
 */
@Data
@RequiredArgsConstructor
public class Artefact {

    /**
     * Identifiant de l'artefact
     */
    private UUID id;

    /**
     * Designation de l'artefact
     * - NotBlank : la chaine de caractère ne peut pas contenir que des espaces
     * - NonNull : La donnée ne peut pas être nulle
     * - Length : Nombre de caractères max autorisé
     * - NotEmpty : Nombre de caractères supérieur à 0
     *
     */
    @NotEmpty(message = "Designation obligatoire")
    @NotBlank(message = "Designation obligatoire")
    @Length(max = 128)
    private String designation;

    /**
     * Categories de l'artefact
     */
    private List<ArtefactCategorie> categories;

    /**
     * Etat de conservation de l'artefact
     */
    @NotNull(message = "Etat de conservation obligatoire")
    private ConservationType conservation;

    @NotNull(message = "Completude obligatoire")
    private CompletudeType completude;
}
