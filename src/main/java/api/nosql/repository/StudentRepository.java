package api.nosql.repository;

import api.nosql.entity.StudentEntity;
import com.oracle.nosql.spring.data.repository.NosqlRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends NosqlRepository<StudentEntity, Long> {

}
