package com.woohun.s1;

import java.util.Scanner;

import com.woohun.student.*;

public class StudentController {
	private  Scanner sc;
	private  Action [] action;
	
	public StudentController() {
		sc = new Scanner(System.in);
		action = new Action[2];
		action[0]=new StudentAddService();
		action[1]=new StudentServiceView();
	}
	
	
	
	
	
	public void start() {
		
		boolean check = true;
		
		while(check) {
			System.out.println("1. 학생     추가");
			System.out.println("2. 학생정보 출력");
			System.out.println("3. 프로그램 종료");
			int num = sc.nextInt();
			
			action[num-1].execute();
			
			
			
			
		}
		
		
	}

}








