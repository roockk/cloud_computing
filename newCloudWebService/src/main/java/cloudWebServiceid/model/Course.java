package cloudWebServiceid.model;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Course {

    private long courseID;
    private long programID;
    private String courseName;
    private String professor;
    private String board;
    private ArrayList<String> students;
    private ArrayList<String> lectures;


    public Course(){}

    public Course(long courseID, long programID, String courseName, String professor, String board) {
        this.courseID = courseID;
        this.programID = programID;
        this.courseName = courseName;
        this.professor = professor;
        this.board = board;
        this.students = new ArrayList<>();
        this.lectures = new ArrayList<>();
    }

    public long getCourseID() {
        return courseID;
    }

    public void setCourseID(long courseID) {
        this.courseID = courseID;
    }

    public long getProgramID() {
        return programID;
    }

    public void setProgramID(long programID) {
        this.programID = programID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<String> students) {
        this.students = students;
    }

    public ArrayList<String> getLectures() {
        return lectures;
    }

    public void setLectures(ArrayList<String> lectures) {
        this.lectures = lectures;
    }
}

