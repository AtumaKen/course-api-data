package com.kenoly.courseapi.course_classes;

import com.kenoly.courseapi.courses.CourseModel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Classes")
public class ClassesModel  {

    @Id
    private String id;
    private String name;
    private String description;


    @ManyToOne
    private CourseModel courseModel;

    public ClassesModel() {
    }

    public ClassesModel(String id, String name, String description, String topicId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.courseModel = new CourseModel(topicId, "", "");
    }

    public CourseModel getCourseModel() {
        return courseModel;
    }

    public void setCourseModel(CourseModel courseModel) {
        this.courseModel = courseModel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
