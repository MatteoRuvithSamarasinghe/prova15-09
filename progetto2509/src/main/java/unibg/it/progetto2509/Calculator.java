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
		System.out.println("il prodotto: "+result);
	}
	
	void diff(int x, int y) {
		int result;
		result=x-y;
		System.out.println("differenza: "+result);
	}
	
	void somm(int x, int y) {
		int result;
		result=x+y;
		System.out.println("somma: "+result);
	}
	
	void div(int x, int y) {
		float result;
		float x1=x;
		float y1=y;
		
		if(y1==0) {
			System.out.println("divisione impossibile");
		}else {
		result=x1/y1;
		System.out.println("quoziente: "+result);
		}
	}
}
