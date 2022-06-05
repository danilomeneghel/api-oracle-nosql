package api.nosql.service;

import api.nosql.entity.StudentEntity;
import api.nosql.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public StudentEntity save(StudentEntity studentEntity) {
        return studentRepository.save(studentEntity);
    }

    public Iterable<StudentEntity> saveStudents(List<StudentEntity> listStudentEntity) {
        return studentRepository.saveAll(listStudentEntity);
    }

    public StudentEntity updateStudent(Long id, StudentEntity studentEntity) {
        Optional<StudentEntity> student = studentRepository.findById(id);
        student.get().setFirstName(studentEntity.getFirstName());
        student.get().setLastName(studentEntity.getLastName());
        student.get().setGender(studentEntity.getGender());
        student.get().setAge(studentEntity.getAge());
        return studentRepository.save(student.get());
    }

    public Optional<StudentEntity> getById(Long id) {
        return studentRepository.findById(id);
    }

    public Iterable<StudentEntity> getAll() {
        return studentRepository.findAll();
    }

}
