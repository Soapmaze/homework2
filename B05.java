import java.util.*;

class B05{
	
	int birth_year;
	int age;

	void input(){
		Scanner s = new Scanner(System.in);
		System.out.print("Input Birth Year : ");
		this.birth_year = s.nextInt();

		output();
	}

	void output(){
		this.age = 2016-this.birth_year +1;
		if(age >= 60) System.out.println("Old Age");
		else if(age >= 30) System.out.println("Middle Age");
		else if(age >= 20) System.out.println("Youth");
		else if(age >= 13) System.out.println("Teenager");
		else if(age >= 7) System.out.println("Childhood");
		else System.out.println("Toddler");
	}

	public static void main(String[] args){
		new B05().input();
	}
}
