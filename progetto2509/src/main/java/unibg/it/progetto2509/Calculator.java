package unibg.it.progetto2509;

public class Calculator {
	float x;
	float y;
	
	public Calculator(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	void prod(float x, float y) {
		float result;
		result=x*y;
		System.out.println("il prodotto: " + result);
	}
	
	void diff(float x, float y) {
		float result;
		result=x-y;
		System.out.println("differenza: " + result);
	}
	
	void somm(float x, float y) {
		float result;
		result=x+y;
		System.out.println("somma: " + result);
	}
	
	void div(float x, float y) {
		float result;
		float x1 = x;
		float y1 = y;
		
		if(y1 == 0) {
			System.out.println("divisione impossibile");
		}else {
		result = x1/y1;
		System.out.println("quoziente: " + result);
		}
	}
}
