package cloudWebServiceid.resources;

import cloudWebServiceid.model.Course;
import cloudWebServiceid.model.Lecture;
import cloudWebServiceid.service.CourseService;
import cloudWebServiceid.service.LectureService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;



@Path("Programs/{programID}/Courses/{courseID}/Lectures")
public class LectureResource {

        LectureService lectureService = new LectureService();
        CourseService courseService =  new CourseService();

       @GET
       @Produces(MediaType.APPLICATION_JSON)
       public List<String> getLectures(@PathParam("courseID") Long ID) {
           return courseService.getLecturesInCourse(ID);
       }

        @GET
        @Path("/{lectureID}")
        @Produces(MediaType.APPLICATION_JSON)
        public Lecture getLectureIngo(@PathParam("lectureID") Long ID) {
            return lectureService.getLectureInfo(ID);
        }

        @POST
        public Lecture addCourse(Lecture lecture) {
            return lectureService.addLectures(lecture);
        }

        @PUT
        @Path("/{lectureID}")
        @Produces(MediaType.APPLICATION_JSON)
        public Lecture updateLecture(@PathParam("lectureID") Long ID, Lecture lecture) {
            lecture.setLectureID(ID);
            return lectureService.addLectures(lecture);
        }

        @DELETE
        @Path("/{lectureID}")
        @Produces(MediaType.APPLICATION_JSON)
        public Lecture removeCourse(@PathParam("lectureID") Long ID) {
            return lectureService.removeLecture(ID);
        }
}
