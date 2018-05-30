package step1;

import java.util.Scanner;
public class GradeReport{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 ");
		String name = scan.next();
		System.out.print("국어점수 ");
		int num1 = scan.nextInt();
		System.out.print("영어점수 ");
		int num2 = scan.nextInt();
		System.out.print("수학점수 ");
		int num3 = scan.nextInt();
		int num4 = (num1 + num2 + num3) / 3;
		String grade = "";
		String result = "";
		// switch(num1){
		// 	default : result = "잘못된 점수입니다."; return;
		// }

		if(num4 >= 90){ 
			grade = "A";

		} else if(num4 >= 80){
			grade = "B";

		} else if(num4 >= 70){
			grade = "C";

		} else if(num4 >= 60){
			grade = "D";

		} else if(num4 >= 50){
			grade = "E";

		} else{ grade = "F";
			
		}


		System.out.print(name + " [평균]" + num4 + " [학점]" + grade);

	}
}

// 평균 90점 이상 'A'
// 80 'B'
// 70 'C'
// 60 'D'
// 50 'E'
// 50 미만 'F'

// 평균'int'