
public class FinalVariable {
	final double PI;
	FinalVariable(double PI){
		this.PI=PI;
	}
	FinalVariable(int a, double PI){
		this.PI=PI;
	}
	void piValue() {
		System.out.println(PI);
	}

}
