package com.woohun.student;

import java.util.Scanner;

public class StudentInput {
	
	//addStudent 메서드
	//학생 한명을 만들어서 리턴
	
	public Student addStudent() {
		Student student = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력");
		student.setName(sc.next());
		System.out.println("번호 입력");
		student.setNum(sc.nextInt());
		System.out.println("국어 입력");
		student.setKor(sc.nextInt());
		System.out.println("영어 입력");
		student.setEng(sc.nextInt());
		System.out.println("수학 입력");
		student.setMath(sc.nextInt());
		
		student.setTotal(student.getKor()+student.getEng()+student.getMath());
		student.setAvg(student.getTotal()/3.0);
		
		return student;
	}
	

}
