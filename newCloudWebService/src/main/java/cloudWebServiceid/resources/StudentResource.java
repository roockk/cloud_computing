package cloudWebServiceid.resources;

import cloudWebServiceid.model.Course;
import cloudWebServiceid.model.Program;
import cloudWebServiceid.model.Student;
import cloudWebServiceid.service.CourseService;
import cloudWebServiceid.service.ProgramService;
import cloudWebServiceid.service.StudentService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;



@Path("Programs/{programID}/Courses/{courseID}/Students")
public class StudentResource {
    StudentService studentService = new StudentService();
    CourseService courseService = new CourseService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> getStudents(@PathParam("courseID") Long ID) {
        return courseService.getStudents(ID);
    }

    @GET
    @Path("/{studentID}")
    @Produces(MediaType.APPLICATION_JSON)
    public Student getStudentInfo(@PathParam("studentID") Long ID) {
        return studentService.getStudentInfo(ID);
    }

    @POST
    public Student addStudent(Student student) {
        return studentService.addStudent(student);
    }

    @PUT
    @Path("/{studentID}")
    @Produces(MediaType.APPLICATION_JSON)
    public Student updateStudent(@PathParam("studentID") Long ID,Student student) {
        student.setStudentID(ID);
        return studentService.updateStudent(student);
    }

    @DELETE
    @Path("/{studentID}")
    @Produces(MediaType.APPLICATION_JSON)
    public Student removeStudent(@PathParam("studentID") Long ID) {
        return studentService.removeStudent(ID);
    }
}
