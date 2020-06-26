package com.kenoly.courseapi.lessons;

import com.kenoly.courseapi.course_classes.ClassesModel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Lessons")
public class LessonModel {

    @Id
    private String id;
    private String name;
    private int duration;
    private int difficulty;

    @ManyToOne
    private ClassesModel classesModel;



    public LessonModel(String id, String name, int duration, int difficulty, String model) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.difficulty = difficulty;
        this.classesModel = new ClassesModel(model, "", "", "");
    }

    public LessonModel() {

    }

    public ClassesModel getClassesModel() {
        return classesModel;
    }

    public void setClassesModel(ClassesModel classesModel) {
        this.classesModel = classesModel;
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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }
}
