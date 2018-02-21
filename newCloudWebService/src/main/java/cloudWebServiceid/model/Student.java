package cloudWebServiceid.model;

import javax.ws.rs.Path;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student {
    private String studentName;
    private long studentID;
    private long program;
    private Image studentImage;
    private ArrayList<String> courses;

    public Student() {
    }

    public Student(String studentName, long studentID, long program, Image studentImage) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.program = program;
        this.studentImage = studentImage;
        this.courses = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    public long getProgram() {
        return program;
    }

    public void setProgram(long program) {
        this.program = program;
    }

    public Image getStudentImage() {
        return studentImage;
    }

    public void setStudentImage(Image studentImage) {
        this.studentImage = studentImage;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }
}
