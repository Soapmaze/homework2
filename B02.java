import java.util.*;

class B02{
	double input_degree;
	String kind;
	double output_degree;
	void output(){
		if(this.kind.equals("F")){
			this.output_degree = (this.input_degree-32)/1.8;
			System.out.println("C -> F : " + output_degree + "C");
		}else if(this.kind.equals("C")){
			this.output_degree = this.input_degree * 1.8 + 32;
			System.out.println("F -> C : " + output_degree + "F");
		}else{
			System.out.println("Unknown degree type. Input again.");
			input();
		}
	}

	void input(){
		Scanner s = new Scanner(System.in);
		System.out.print("Input Degree : ");
		this.input_degree = s.nextDouble();
		System.out.print("Input Degree Type : ");
		this.kind = s.next();

		output();
	}

	public static void main(String[] args){
		new B02().input();
		return;
	}
}
