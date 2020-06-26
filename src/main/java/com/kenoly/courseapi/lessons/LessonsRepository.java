package com.kenoly.courseapi.lessons;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LessonsRepository extends CrudRepository<LessonModel, String> {
     List<LessonModel> findByClassesModel_Id(String LessonId);
}
