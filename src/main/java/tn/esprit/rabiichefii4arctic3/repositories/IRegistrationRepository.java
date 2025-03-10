package tn.esprit.rabiichefii4arctic3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.rabiichefii4arctic3.entities.Registration;

public interface IRegistrationRepository extends JpaRepository<Registration, Long> {
}