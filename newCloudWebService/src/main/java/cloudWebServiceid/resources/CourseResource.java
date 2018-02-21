package cloudWebServiceid.resources;


import cloudWebServiceid.model.Course;
import cloudWebServiceid.model.Lecture;
import cloudWebServiceid.service.CourseService;
import cloudWebServiceid.service.ProgramService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("Programs/{programID}/Courses")
public class CourseResource {

    CourseService courseService = new CourseService();
    ProgramService programService = new ProgramService();


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public  List<String> getcoursesInProgram(@PathParam("programID") Long ID) {
        return programService.getCoursesInProgram(ID);
    }


    @GET
    @Path("/{courseID}")
    @Produces(MediaType.APPLICATION_JSON)
    public Course getCourse(@PathParam("courseID") Long ID) {
        return courseService.getCourseInfo(ID);
    }

    @POST
    public Course addCourse(Course course) {
        return courseService.addCourses(course);
    }

    @PUT
    @Path("/{courseID}")
    public Course updateCourse(@PathParam("courseID") Long ID, Course course) {
        course.setCourseID(ID);
        return courseService.updateCourse(course);
    }

    @DELETE
    @Path("/{courseID}")
    public Course removeCourse(@PathParam("courseID") Long ID) {
        return courseService.removeCourse(ID);
    }


}



