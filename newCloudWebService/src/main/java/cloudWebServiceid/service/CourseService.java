package cloudWebServiceid.service;

import cloudWebServiceid.databaseClass.DatabaseClass;
import cloudWebServiceid.model.Course;
import cloudWebServiceid.model.Lecture;
import cloudWebServiceid.model.Program;
import cloudWebServiceid.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CourseService {
    private Map<Long , Course> courseMap = DatabaseClass.getCourseMap();
    private Map<Long , Program> programMap = DatabaseClass.getProgramMap();

    public CourseService() {}

    public  Course getCourseInfo(Long ID){
        return courseMap.get(ID);
    }

    public Course addCourses(Course course){
        course.setCourseID((long) (courseMap.size()+1));
        courseMap.put(course.getCourseID(), course);
        return course;
    }

    public  Course removeCourse(Long ID){

        return courseMap.remove(ID);
    }

    public Course updateCourse(Course course){
        courseMap.put(course.getCourseID(),course);
        return course;
    }

    public List<String> getStudents(Long ID){
        return courseMap.get(ID).getStudents();
    }

    public List<String> getLecturesInCourse(Long ID){
        return courseMap.get(ID).getLectures();
    }
}




