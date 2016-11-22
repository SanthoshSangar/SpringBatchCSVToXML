package com.arun.springbatch;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class StudentDetailsJobListener implements JobExecutionListener {

	public void afterJob(JobExecution job) {
		System.out.println("Job ends at " + System.currentTimeMillis());
	}

	public void beforeJob(JobExecution job) {
		System.out.println("Job starts at " + System.currentTimeMillis());
	}

}
