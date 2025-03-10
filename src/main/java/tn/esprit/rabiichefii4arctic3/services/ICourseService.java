package tn.esprit.rabiichefii4arctic3.services;

import tn.esprit.rabiichefii4arctic3.entities.Course;

import java.util.List;

public interface ICourseService {
    public Course addCourse(Course course);
    public void deleteById(Long id);
    public void updateCourse(Course course);
    public Course getCourseById(Long id);
    public List<Course> getAllCourses();
}
