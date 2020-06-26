package com.kenoly.courseapi.lessons;

import com.kenoly.courseapi.course_classes.ClassesModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LessonsController {

    private LessonsService lessonsService;

    @Autowired
    public LessonsController(LessonsService lessonsService) {
        this.lessonsService = lessonsService;
    }

    @RequestMapping("/courses/{courseId}/classes/{classId}/lessons")
    public List<LessonModel> getLessons(@PathVariable String classId){
         return lessonsService.getAllLessons(classId);
    }

    @RequestMapping("/courses/{courseId}/classes/{classId}/lessons/{lessonId}")
    public Optional<LessonModel> getOneLesson(@PathVariable String lessonId){
        return lessonsService.getOneLesson(lessonId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/courses/{courseId}/classes/{classId}/lessons")
    public void addLessons(@RequestBody LessonModel lessonModel, @PathVariable String classId){
        lessonModel.setClassesModel(new ClassesModel(classId, "", "", ""));
        lessonsService.addClass(lessonModel);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/courses/{courseId}/classes/{classId}/lessons/{lessonId}")
    public void updateLesson(@RequestBody LessonModel lessonModel, @PathVariable String classId, @PathVariable String lessonId){
        lessonModel.setClassesModel(new ClassesModel(classId, "", "", ""));
        lessonsService.updateClass(lessonId, lessonModel);
    }

    @RequestMapping(method = RequestMethod.DELETE, value ="/courses/{courseId}/classes/{classId}/lessons/{lessonId}")
    public void deleteLesson(@PathVariable String lessonId){
        lessonsService.deleteClass(lessonId);
    }

}
