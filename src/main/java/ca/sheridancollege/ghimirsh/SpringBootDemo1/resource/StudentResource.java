package ca.sheridancollege.ghimirsh.SpringBootDemo1.resource;

import ca.sheridancollege.ghimirsh.SpringBootDemo1.model.Student;
import ca.sheridancollege.ghimirsh.SpringBootDemo1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentResource {

    private final StudentService studentService;

    @Autowired
    public StudentResource(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Student> getAllStudents(){
        return  studentService.getAllStudents();
    }
}
