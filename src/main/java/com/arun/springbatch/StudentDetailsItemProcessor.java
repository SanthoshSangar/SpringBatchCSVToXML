package com.arun.springbatch;

import org.springframework.batch.item.ItemProcessor;

import com.arun.beans.StudentDetails;

public class StudentDetailsItemProcessor implements ItemProcessor<StudentDetails, StudentDetails> {

	public StudentDetails process(StudentDetails studentDetails) throws Exception {
		System.out.println("Processings" + studentDetails);
		return studentDetails.getPercentage() > 5.0 ? studentDetails : null;
	}

}
