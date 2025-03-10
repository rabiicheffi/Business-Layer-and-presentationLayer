package tn.esprit.rabiichefii4arctic3.services;

import tn.esprit.rabiichefii4arctic3.entities.Registration;

import java.util.List;

public interface IRegistrationService {
    public void addRegistration(Registration Registration);
    public void updateRegistration(Registration Registration);
    public void deleteRegistration(Long id);
    public Registration getRegistrationById(Long id);
    public List<Registration> getAllRegistrations();

}
