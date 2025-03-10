package tn.esprit.rabiichefii4arctic3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.rabiichefii4arctic3.entities.Instructor;
import tn.esprit.rabiichefii4arctic3.repositories.IInstructorRepository;

import java.util.List;
@Service
public class InstructorService implements IInstructorService {
    @Autowired
    private IInstructorRepository InstructorRepo;
    @Override
    public Instructor addInstructor(Instructor Instructor) {
        return InstructorRepo.save(Instructor);
    }

    @Override
    public void deleteById(Long id) {
        InstructorRepo.deleteById(id);
    }

    @Override
    public void updateInstructor(Instructor Instructor) {
        InstructorRepo.save(Instructor);
    }

    @Override
    public Instructor getInstructorById(Long id) {
        return  InstructorRepo.findById(id).orElse(null);

    }

    @Override
    public List<Instructor> getAllInstructors() {
        return InstructorRepo.findAll();
    }

}

