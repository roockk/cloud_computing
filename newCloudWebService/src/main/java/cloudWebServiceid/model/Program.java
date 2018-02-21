package cloudWebServiceid.model;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@XmlRootElement
public class Program {
    private String programName;
    private long programID;
    private ArrayList<String> courses;
    private ArrayList<String> students;

    public Program() {
    }

    public Program(String programName, long programID) {
        this.programName = programName;
        this.programID = programID;
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public Long getProgramID() {
        return programID;
    }

    public void setProgramID(Long programID) {
        this.programID = programID;
    }

    public void setProgramID(long programID) {
        this.programID = programID;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<String> students) {
        this.students = students;
    }
}