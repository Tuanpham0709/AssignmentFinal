package com.example.assignmentfinal.model;

public class StudentClass {
    private  String name;
    private  String classRoom;
    private  String birthday;private  String id;

    public StudentClass(){
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StudentClass(String name, String classRoom, String birthday) {
        this.name = name;
        this.classRoom = classRoom;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
