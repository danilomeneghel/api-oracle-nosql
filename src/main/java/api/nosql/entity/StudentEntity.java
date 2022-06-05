package api.nosql.entity;

import com.oracle.nosql.spring.data.core.mapping.NosqlId;
import com.oracle.nosql.spring.data.core.mapping.NosqlTable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@NosqlTable(tableName = "student", storageGB = 1, writeUnits = 10, readUnits = 10)
public class StudentEntity {

	@NosqlId(generated = true)
	private Long id;

	private String firstName;

	private String lastName;

	private String gender;

	private Integer age;

}
