package pl.coderslab.accessibility.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.accessibility.model.Institutions;
import pl.coderslab.accessibility.repository.InstitutionsRepository;
import pl.coderslab.accessibility.service.InstitutionsService;

import java.util.List;
import java.util.Optional;

@Service
public class InstitutionsServiceImpl implements InstitutionsService {

    private final InstitutionsRepository institutionsRepository;

    @Autowired
    public InstitutionsServiceImpl(InstitutionsRepository institutionsRepository) {
        this.institutionsRepository = institutionsRepository;
    }
    @Override
    public void addInstitution(Institutions institution){
        institutionsRepository.save(institution);
    }

    @Override
    public void deleteInstitution (Long id){
        institutionsRepository.deleteById(id);
    }

    @Override
    public Optional<Institutions> findInstitutionById(Long id){
        return institutionsRepository.findById(id);
    }

    @Override
    public void updateInstitution (Institutions institutions){
        institutionsRepository.save(institutions);
    }

    @Override
    public List<Institutions> findAllInstitutions (){
        return institutionsRepository.findAll();
    }
}
