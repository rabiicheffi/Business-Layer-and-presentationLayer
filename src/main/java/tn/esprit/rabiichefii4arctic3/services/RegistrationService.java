package tn.esprit.rabiichefii4arctic3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.rabiichefii4arctic3.entities.Registration;
import tn.esprit.rabiichefii4arctic3.repositories.IRegistrationRepository;
import tn.esprit.rabiichefii4arctic3.repositories.ISkierRepository;

import java.util.List;

@Service
public class RegistrationService implements IRegistrationService {

    @Autowired
    private IRegistrationRepository registrationRepository;
    @Override
    public void addRegistration(Registration registration) {
        registrationRepository.save(registration);
    }

    @Override
    public void updateRegistration(Registration registration) {
        registrationRepository.save(registration);

    }

    @Override
    public void deleteRegistration(Long id) {
    registrationRepository.deleteById(id);
    }

    @Override
    public Registration getRegistrationById(Long id) {
        return registrationRepository.findById(id).orElse(null);
    }

    @Override
    public List<Registration> getAllRegistrations() {
        return registrationRepository.findAll();
    }
}
