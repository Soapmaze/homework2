import java.util.*;

class B03{
	int days;
	int seconds;
	int m_count;

	void output(){
		this.seconds = this.days * 24 * 60 * 60;
		this.m_count = seconds / 1000000;
		System.out.printf("days to seconds : %d\n", seconds);
		if(m_count !=0)
			System.out.printf("seconds having million seconds time : %d\n", m_count);
	}

	void input(){
		Scanner s = new Scanner(System.in);
		System.out.print("Input Days : ");
		this.days = s.nextInt();
		
		output();

	}

	public static void main(String[] args){
		new B03().input();		
	}
}
