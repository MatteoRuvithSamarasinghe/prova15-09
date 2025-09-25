package unibg.it.progetto2509;

public class Calculator {
	int x;
	int y;
	
	public Calculator(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void prod(int x, int y) {
		int result;
		result=x*y;
		System.out.println("il prodotto"+result);
	}
	
}
