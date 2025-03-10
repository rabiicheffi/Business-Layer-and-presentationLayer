package tn.esprit.rabiichefii4arctic3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.rabiichefii4arctic3.entities.Course;
import tn.esprit.rabiichefii4arctic3.repositories.ICourseRepository;
import tn.esprit.rabiichefii4arctic3.repositories.ICourseRepository;

import java.util.List;

@Service
public class CourseService implements ICourseService {

    @Autowired
    private ICourseRepository CourseRepo;
    @Override
    public Course addCourse(Course Course) {
        return CourseRepo.save(Course);
    }

    @Override
    public void deleteById(Long id) {
        CourseRepo.deleteById(id);
    }

    @Override
    public void updateCourse(Course Course) {
        CourseRepo.save(Course);
    }

    @Override
    public Course getCourseById(Long id) {
        return  CourseRepo.findById(id).orElse(null);

    }

    @Override
    public List<Course> getAllCourses() {
        return CourseRepo.findAll();
    }

}
