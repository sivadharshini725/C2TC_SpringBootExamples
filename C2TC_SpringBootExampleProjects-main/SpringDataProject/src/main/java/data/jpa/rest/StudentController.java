package data.jpa.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository repo;

    @PostMapping
    public Student save(@RequestBody Student student) {
        return repo.save(student);
    }
    
    @GetMapping
    public List<Student> findAll() {
        return repo.findAll();
    }

    @GetMapping("/{city}")
    public List<Student> findByCity(@PathVariable String city) 
    {
    	 return repo.findByCity(city);
 
    }

}

