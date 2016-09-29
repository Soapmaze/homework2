import java.util.*;

class B04{
	int kor;
	int eng;
	int mat;
	int tot;
	double avg;

	void input(){
		Scanner s = new Scanner(System.in);
		System.out.print("Input Korean Score : ");
		this.kor = s.nextInt();
		System.out.print("Input English Score : ");
		this.eng = s.nextInt();
		System.out.print("Input Math Score : ");
		this.mat = s.nextInt();

		this.tot = kor + eng + mat;
		this.avg = ((double)kor + (double)eng + (double)mat)/3; 

		output();
	}

	void output(){
		System.out.printf("Total Score : %d\n", this.tot);
		System.out.printf("Average : %.1f\n", this.avg);
		if(this.kor >= 90)
			System.out.println("Your Korean score is good.");
		if(this.eng >= 90)
			System.out.println("Your English score is good.");
		if(this.mat >= 90)
			System.out.println("Your Math score is good.");
	}

	public static void main(String[] args){
		new B04().input();
	}
}
