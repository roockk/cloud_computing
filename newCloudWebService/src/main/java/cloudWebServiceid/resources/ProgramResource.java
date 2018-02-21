package cloudWebServiceid.resources;

import cloudWebServiceid.model.Course;
import cloudWebServiceid.model.Program;
import cloudWebServiceid.service.CourseService;
import cloudWebServiceid.service.ProgramService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("Programs")
public class ProgramResource {

    ProgramService programService = new ProgramService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Program> getPrograms() {
        return programService.getPrograms();
    }

    @GET
    @Path("/{programID}")
    @Produces(MediaType.APPLICATION_JSON)
    public Program getProgramInfo(@PathParam("programID") Long ID) {
        return programService.getProgramInfo(ID);
    }

    @POST
    @Path("/{programID}")
    @Produces(MediaType.APPLICATION_JSON)
    public Program addProgram(Program program) {
        return programService.addProgram(program);
    }

    @PUT
    @Path("/{programID}")
    @Produces(MediaType.APPLICATION_JSON)
    public Program updateProgram(@PathParam("programID") Long ID, Program program) {
        program.setProgramID(ID);
        return programService.updateProgram(program);
    }

    @DELETE
    @Path("/{programID}")
    @Produces(MediaType.APPLICATION_JSON)
    public Program removeProgram(@PathParam("programID") Long ID) {
        return programService.removeProgram(ID);
    }
}
