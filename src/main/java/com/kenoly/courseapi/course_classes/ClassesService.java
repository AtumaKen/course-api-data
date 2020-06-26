package com.kenoly.courseapi.course_classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClassesService {


    private ClassesRepository classesRepository;

    @Autowired
    public void setTopicRepository(ClassesRepository classesRepository) {
        this.classesRepository = classesRepository;
    }




     List<ClassesModel> getAllClasses(String courseId){
         List<ClassesModel> courses = new ArrayList<>();
         courses.addAll(classesRepository.findByCourseModelId(courseId));

         return courses;
    }
     Optional<ClassesModel> getOneClass(String id){

       return classesRepository.findById(id);
    }

     void addClass(ClassesModel classes) {
        classesRepository.save(classes);
    }

     void updateClass(String id, ClassesModel course) {
         classesRepository.save(course);
    }

     void deleteTopic(String id) {
        classesRepository.deleteById(id);
    }

}
