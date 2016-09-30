import java.util.*;

class A06{
	String name;
	String grade;
	int kor;
	int mat;
	int eng;
	double avg;

	void input(){
		Scanner s = new Scanner(System.in);
		System.out.print("Input Name : ");
		this.name = s.next();
		System.out.print("Input Korean Score : ");
		this.kor = s.nextInt();
		System.out.print("Input Math Score : ");
		this.mat = s.nextInt();
		System.out.print("Input English Score : ");
		this.eng = s.nextInt();
		this.avg = ((double)kor + (double) mat + (double)eng)/3;
		if(avg >= 95.0) this.grade = "A+";
		else if(avg >= 90) this.grade = "A";
		else if(avg >= 85) this.grade = "B+";
		else if(avg >= 80) this.grade = "B";
		else if(avg >= 75) this.grade = "C+";
		else if(avg >= 70) this.grade = "C";
		else if(avg >= 65) this.grade = "D+";
		else if(avg >= 60) this.grade = "D";
		else this.grade = "F";

		output();
	}
	
	void output(){
		System.out.println("Your name : " + this.name);
		System.out.printf("Your average is %.1f\n", this.avg);
		System.out.println("Your grade is " + this.grade);
	}

	public static void main(String[] args){
		new A06().input();
	}

}
