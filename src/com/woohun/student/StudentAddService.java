package com.woohun.student;

import com.woohun.s1.Action;

public class StudentAddService implements Action{
	
	
	//execute 메서들 생성
	//내용은 매개변수로 받은 학생을
	//StudentDatabase의 students 배열에 추가
	//students의 값이 널이면
	//배열 한칸 생성해서 학생을 추가
	//널이 아니라면
	public void execute() {
		StudentInput si = new StudentInput();
		Student student = si.addStudent();
		
		if(StudentDataBase.students == null) {
			StudentDataBase.students= new Student[1];
			StudentDataBase.students[0]=student;
		}else {
			int count = StudentDataBase.students.length;
			Student [] s = new Student[count+1];
			
			for(int i=0;i<count;i++) {
				s[i]=StudentDataBase.students[i];
			}
			
			s[count]=student;
			
		}
	}

}
