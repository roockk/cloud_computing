package cloudWebServiceid.service;

import cloudWebServiceid.databaseClass.DatabaseClass;
import cloudWebServiceid.model.Course;
import cloudWebServiceid.model.Lecture;
import cloudWebServiceid.model.Program;
import cloudWebServiceid.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LectureService {
    private Map<Long, Lecture> lectureMap = DatabaseClass.getLectureMap();




    public  Lecture getLectureInfo(Long ID){
        return lectureMap.get(ID);
    }

    public Lecture addLectures(Lecture lecture){
        lecture.setLectureID((long) (lectureMap.size()+1));
        lectureMap.put(lecture.getLectureID(), lecture);
        return lecture;
    }

    public  Lecture removeLecture(Long ID){

        return lectureMap.remove(ID);
    }

    public Lecture updateCourse(Lecture lecture){
        lectureMap.put(lecture.getLectureID(),lecture);
        return lecture;
    }
}
