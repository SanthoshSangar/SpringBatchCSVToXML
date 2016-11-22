package com.arun.springbatch;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.arun.beans.StudentDetails;

public class StudentDetailsFieldSetMapper implements FieldSetMapper<StudentDetails> {

	public StudentDetails mapFieldSet(FieldSet fieldSet) throws BindException {

		StudentDetails studentDetails = new StudentDetails();
		studentDetails.setName(fieldSet.readString(0));
		studentDetails.setAge(fieldSet.readString(1));
		studentDetails.setAddress(fieldSet.readString(2));
		studentDetails.setEmail(fieldSet.readString(3));
		studentDetails.setPercentage(fieldSet.readDouble(4));
		
		System.out.println("Inside mapper " + studentDetails);
		return studentDetails;
	}

}
