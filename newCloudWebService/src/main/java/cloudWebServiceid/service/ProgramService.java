package cloudWebServiceid.service;

import cloudWebServiceid.databaseClass.DatabaseClass;
import cloudWebServiceid.model.Course;
import cloudWebServiceid.model.Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProgramService {


    private Map<Long , Program> programMap = DatabaseClass.getProgramMap();


    public ProgramService(){ }


    public List<Program> getPrograms(){
        List<Program> list = new ArrayList<>();
        for(Program program: programMap.values()){
                list.add(program);
        }
        return list;
    }


    public Program getProgramInfo(Long ID){
        return programMap.get(ID);
    }



    public Program addProgram(Program program){
        program.setProgramID((long) (programMap.size()+1));
        programMap.put(program.getProgramID(), program);
        return program;
    }

    public  Program removeProgram(Long ID){
        return programMap.remove(ID);
    }

    public Program updateProgram(Program program){
        programMap.put(program.getProgramID(),program);
        return program;
    }

    public List<String> getCoursesInProgram(Long ID){
        return programMap.get(ID).getCourses();
    }
}


