package com.kenoly.courseapi.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {


    private CourseRepository courseRepository;

    @Autowired
    public void setCourseRepository(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }




     List<CourseModel> getAllTopics(){
         List<CourseModel> courseModels = new ArrayList<>();
         courseRepository.findAll()
                 .forEach(courseModels::add);

         return courseModels;
    }
     Optional<CourseModel> getTopic(String id){

       return courseRepository.findById(id);
    }

     void addTopic(CourseModel courseModel) {
        courseRepository.save(courseModel);
    }

     void updateTopic(String id, CourseModel courseModel) {
         courseRepository.save(courseModel);
    }

     void deleteTopic(String id) {
        courseRepository.deleteById(id);
    }
}
