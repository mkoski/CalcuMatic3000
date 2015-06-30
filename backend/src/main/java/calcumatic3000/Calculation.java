package calcumatic3000;

public class Calculation {
	private String arithmeticOperation;
	private int a;
	private int b;
	private String result;
	
	public Calculation(String arithmeticOperation, int a, int b, String result) {
		super();
		this.arithmeticOperation = arithmeticOperation;
		this.a = a;
		this.b = b;
		this.result = result;
	}

	public String getArithmeticOperation() {
		return arithmeticOperation;
	}

	public void setArithmeticOperation(String arithmeticOperation) {
		this.arithmeticOperation = arithmeticOperation;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
}
