import java.util.*;

class B01 {
	int age;
	void print(){
		if(this.age > 20)
			System.out.println("Adult");
		else
			System.out.println("Not Adult");
	}
	void input(){
		Scanner s = new Scanner(System.in);
		System.out.print("Input your birth : ");
		int year = s.nextInt();
		this.age = 2016 - year + 1;
		print();
	}
	public static void main(String[] args){ 
		new B01().input();
	}

}

