package com.kenoly.courseapi.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@Controller
public class CourseController {

    private CourseService courseService;


    public CourseController() {
    }

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping(value = {"/", "/index", "/home"})
    public String index(Model m){
           m.addAttribute("title","Home");
           m.addAttribute("userClickHome", true);
//        return new ModelAndView("index");
        return "index";
    }

    @GetMapping("/about")
    public String about(Model m){
        m.addAttribute("title","About Us");
        m.addAttribute("userClickAbout", true);
//        return new ModelAndView("index");
        return "index";
    }

    @GetMapping("/contact")
    public String contact(Model m){
        m.addAttribute("title","Contact Us");
        m.addAttribute("userClickContact", true);
//        return new ModelAndView("index");
        return "index";
    }


    @RequestMapping("/courses")
    public List<CourseModel> getAllTopics() {
        return courseService.getAllTopics();
    }

    @RequestMapping("/courses/{id}")
    public Optional<CourseModel> getTopic(@PathVariable String id) {
        return courseService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/courses")
    public void addTopic(@RequestBody CourseModel courseModel) {
        courseService.addTopic(courseModel);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/courses/{id}")
    public void addTopic(@RequestBody CourseModel courseModel, @PathVariable String id) {
        courseService.updateTopic(id, courseModel);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/courses/{id}")
    public void deleteTopic(@PathVariable String id) {
        courseService.deleteTopic(id);
    }
}
