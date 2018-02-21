package cloudWebServiceid.service;

import cloudWebServiceid.databaseClass.DatabaseClass;
import cloudWebServiceid.model.Course;
import cloudWebServiceid.model.Program;
import cloudWebServiceid.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentService {


    private Map<Long , Student> studentMap = DatabaseClass.getStudentMap();

    public StudentService(){
    }


    public Student getStudentInfo(Long ID){
        return studentMap.get(ID);
    }


    public Student addStudent(Student student){
        student.setStudentID((long) (studentMap.size()+1));
        studentMap.put(student.getStudentID(), student);
        return student;
    }

    public  Student removeStudent(Long ID){

        return studentMap.remove(ID);
    }

    public Student updateStudent(Student student){
        studentMap.put(student.getStudentID(),student);
        return student;
    }
}
