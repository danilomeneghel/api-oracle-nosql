package api.nosql.controller;

import api.nosql.entity.StudentEntity;
import api.nosql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping
	public StudentEntity save(@RequestBody StudentEntity studentEntity) {
		return studentService.save(studentEntity);
	}

	@PostMapping("/students")
	public Iterable<StudentEntity> saveStudents(@RequestBody List<StudentEntity> listStudentEntity) {
		return studentService.saveStudents(listStudentEntity);
	}

	@PutMapping("/{id}")
	public StudentEntity updateStudent(@PathVariable("id") Long id, @RequestBody StudentEntity studentEntity) {
		return studentService.updateStudent(id, studentEntity);
	}

	@GetMapping("/{id}")
	public Optional<StudentEntity> getById(@PathVariable("id") Long id) {
		return studentService.getById(id);
	}

	@GetMapping
	public Iterable<StudentEntity> getAll() {
		return studentService.getAll();
	}

}
