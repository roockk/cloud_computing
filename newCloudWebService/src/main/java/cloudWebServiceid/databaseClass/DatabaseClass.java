package cloudWebServiceid.databaseClass;

import cloudWebServiceid.model.Course;
import cloudWebServiceid.model.Lecture;
import cloudWebServiceid.model.Program;
import cloudWebServiceid.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DatabaseClass {
    private static Map<Long, Student> studentMap = new HashMap<>();
    private static Map<Long, Lecture> lectureMap = new HashMap<>();
    private static Map<Long, Course> courseMap = new HashMap<>();
    private static Map<Long, Program> programMap = new HashMap<>();

    static{
        Lecture lecture1 = new Lecture(1,"L1","","");
        Lecture lecture2 = new Lecture(2,"L2","","");
        Lecture lecture3 = new Lecture(3,"L3","","");
        Lecture lecture4 = new Lecture(4,"L4","","");
        Lecture lecture5 = new Lecture(5,"L5","","");
        Lecture lecture6 = new Lecture(6,"L6","","");
        Lecture lecture7 = new Lecture(6,"L6","","");
        Lecture lecture8 = new Lecture(6,"L6","","");

        Student student1 = new Student("Gordon",111,9000, null);
        Student student2 = new Student("Kevin",112,9000, null);
        Student student3 = new Student("Shawn",113,9000, null);
        Student student4 = new Student("Bokin",114,9000, null);
        Student student5 = new Student("Bin",115,9000, null);
        Student student6 = new Student("Alen",116,9000, null);
        Student student7 = new Student("Durent",117,9001, null);
        Student student8 = new Student("Lucy",118,9001, null);

        Course course2 = new Course( 1001, 9000,"cloud","Avinav", "");
        Course course1 = new Course( 1002, 9000,"java","Siva", "");
        Course course3 = new Course( 1003, 9000,"javascript","Brrite", "");
        Course course4 = new Course( 2001, 9001,"database","Wang", "");

        Program program1 = new Program("IS",9000);
        Program program2 = new Program("CS",9001);

        lectureMap.put(lecture1.getLectureID(),lecture1);
        lectureMap.put(lecture2.getLectureID(),lecture2);
        lectureMap.put(lecture3.getLectureID(),lecture3);
        lectureMap.put(lecture4.getLectureID(),lecture4);
        lectureMap.put(lecture5.getLectureID(),lecture5);
        lectureMap.put(lecture6.getLectureID(),lecture6);
        lectureMap.put(lecture7.getLectureID(),lecture7);
        lectureMap.put(lecture8.getLectureID(),lecture8);

        studentMap.put(student1.getStudentID(),student1);
        studentMap.put(student2.getStudentID(),student2);
        studentMap.put(student3.getStudentID(),student3);
        studentMap.put(student4.getStudentID(),student4);
        studentMap.put(student5.getStudentID(),student5);
        studentMap.put(student6.getStudentID(),student6);
        studentMap.put(student7.getStudentID(),student7);
        studentMap.put(student8.getStudentID(),student8);

        courseMap.put(course1.getCourseID(),course1);
        courseMap.put(course2.getCourseID(),course2);
        courseMap.put(course3.getCourseID(),course3);
        courseMap.put(course4.getCourseID(),course4);

        programMap.put(program1.getProgramID(),program1);
        programMap.put(program2.getProgramID(),program2);

        course1.getLectures().add(lecture1.getLectureName());
        course1.getLectures().add(lecture2.getLectureName());
        course2.getLectures().add(lecture3.getLectureName());
        course2.getLectures().add(lecture4.getLectureName());
        course3.getLectures().add(lecture5.getLectureName());
        course3.getLectures().add(lecture6.getLectureName());
        course4.getLectures().add(lecture7.getLectureName());
        course4.getLectures().add(lecture8.getLectureName());


        course1.getStudents().add(student1.getStudentName());
        student1.getCourses().add(course1.getCourseName());

        course1.getStudents().add(student2.getStudentName());
        student2.getCourses().add(course1.getCourseName());

        course2.getStudents().add(student3.getStudentName());
        student3.getCourses().add(course2.getCourseName());

        course2.getStudents().add(student4.getStudentName());
        student4.getCourses().add(course2.getCourseName());

        course3.getStudents().add(student5.getStudentName());
        student5.getCourses().add(course3.getCourseName());

        course3.getStudents().add(student6.getStudentName());
        student6.getCourses().add(course3.getCourseName());

        course4.getStudents().add(student7.getStudentName());
        student7.getCourses().add(course4.getCourseName());

        course4.getStudents().add(student8.getStudentName());
        student8.getCourses().add(course4.getCourseName());


        course1.getStudents().add(student4.getStudentName());
        student4.getCourses().add(course1.getCourseName());

        course2.getStudents().add(student6.getStudentName());
        student6.getCourses().add(course2.getCourseName());

        course3.getStudents().add(student7.getStudentName());
        student7.getCourses().add(course3.getCourseName());

        program1.getCourses().add(course1.getCourseName());
        program1.getCourses().add(course2.getCourseName());
        program1.getCourses().add(course3.getCourseName());
        program2.getCourses().add(course4.getCourseName());

        program1.getStudents().add(student1.getStudentName());
        program1.getStudents().add(student2.getStudentName());
        program1.getStudents().add(student3.getStudentName());
        program1.getStudents().add(student4.getStudentName());
        program1.getStudents().add(student5.getStudentName());
        program1.getStudents().add(student6.getStudentName());
        program2.getStudents().add(student7.getStudentName());
        program2.getStudents().add(student8.getStudentName());

    }

    public static Map<Long, Course> getCourseMap() {
        return courseMap;
    }

    public static void setCourseMap(Map<Long, Course> courseMap) {
        DatabaseClass.courseMap = courseMap;
    }

    public static Map<Long, Student> getStudentMap() {
        return studentMap;
    }

    public static void setStudentMap(Map<Long, Student> studentMap) {
        DatabaseClass.studentMap = studentMap;
    }

    public static Map<Long, Program> getProgramMap() {
        return programMap;
    }

    public static void setProgramMap(Map<Long, Program> programMap) {
        DatabaseClass.programMap = programMap;
    }

    public static Map<Long, Lecture> getLectureMap() {
        return lectureMap;
    }

    public static void setLectureMap(Map<Long, Lecture> lectureMap) {
        DatabaseClass.lectureMap = lectureMap;
    }
}
