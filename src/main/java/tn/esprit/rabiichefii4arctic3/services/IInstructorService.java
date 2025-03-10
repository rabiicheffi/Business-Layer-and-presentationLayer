package tn.esprit.rabiichefii4arctic3.services;

import tn.esprit.rabiichefii4arctic3.entities.Instructor;

import java.util.List;

public interface IInstructorService {
    public Instructor addInstructor(Instructor instructor);
    public void deleteById(Long id);
    public void updateInstructor(Instructor instructor);
    public Instructor getInstructorById(Long id);
    public List<Instructor> getAllInstructors();
}
