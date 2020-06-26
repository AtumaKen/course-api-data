package com.kenoly.courseapi.course_classes;

import com.kenoly.courseapi.courses.CourseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class ClassesController {

    private ClassesService classesService;


    public ClassesController() {
    }

    @Autowired
    public ClassesController(ClassesService classesService) {
        this.classesService = classesService;
    }

    @RequestMapping("/courses/{id}/classes")
    public List<ClassesModel> getAllClasses(@PathVariable String id) {
        return classesService.getAllClasses(id);
    }

    @RequestMapping("/courses/{courseId}/classes/{id}")
    public Optional<ClassesModel> getOneClass(@PathVariable String id) {
        return classesService.getOneClass(id);

    }

    @RequestMapping(method = RequestMethod.POST, value = "/courses/{courseId}/classes")
    public void addClass(@RequestBody ClassesModel classes, @PathVariable String courseId) {
        classes.setCourseModel(new CourseModel(courseId, "", ""));
        classesService.addClass(classes);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/courses/{coursesId}/classes/{id}")
    public void updateClass(@RequestBody ClassesModel classes, @PathVariable String id, @PathVariable String coursesId) {
        classes.setCourseModel(new CourseModel(coursesId, "", ""));
        classesService.updateClass(id, classes);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/courses/{coursesId}/classes/{id}")
    public void deleteClass(@PathVariable String id) {
        classesService.deleteTopic(id);
    }
}
