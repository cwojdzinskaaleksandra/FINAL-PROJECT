package pl.coderslab.accessibility.service;

import pl.coderslab.accessibility.model.Institutions;

import java.util.List;
import java.util.Optional;

public interface InstitutionsService {

    void addInstitution(Institutions institution);
    void deleteInstitution (Long id);
    Optional<Institutions> findInstitutionById(Long id);
    void updateInstitution (Institutions institutions);
    List<Institutions> findAllInstitutions();
}
