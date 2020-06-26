package com.kenoly.courseapi.course_classes;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassesRepository extends CrudRepository<ClassesModel, String> {
         List<ClassesModel> findByCourseModelId(String courseId);
}
