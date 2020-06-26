package com.kenoly.courseapi.lessons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LessonsService {

    private LessonsRepository lessonsRepository;

    @Autowired
    public LessonsService(LessonsRepository lessonsRepository) {
        this.lessonsRepository = lessonsRepository;
    }

     List<LessonModel> getAllLessons(String classId) {
         return new ArrayList<>(lessonsRepository.findByClassesModel_Id(classId));
    }

    void addClass(LessonModel classes) {
        lessonsRepository.save(classes);
    }

    public Optional<LessonModel> getOneLesson(String lessonId) {
        return lessonsRepository.findById(lessonId);
    }

    public void updateClass(String lessonId, LessonModel lessonModel) {
        lessonsRepository.save(lessonModel);
    }

    public void deleteClass(String lessonId) {
        lessonsRepository.deleteById(lessonId);
    }
}
