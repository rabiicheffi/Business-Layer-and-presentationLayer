package tn.esprit.rabiichefii4arctic3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.rabiichefii4arctic3.entities.Subscription;

public interface ISubscriptionRepository extends JpaRepository<Subscription, Long> {
}
