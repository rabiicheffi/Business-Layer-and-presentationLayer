package tn.esprit.rabiichefii4arctic3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.rabiichefii4arctic3.entities.Course;
import tn.esprit.rabiichefii4arctic3.entities.Skier;

import java.util.List;

public interface ICourseRepository extends JpaRepository<Course, Long> {

}