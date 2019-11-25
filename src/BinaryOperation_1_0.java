import java.util.Random;

public class BinaryOperation_1_0 {
	static final int UPPER = 100;
	static final int LOWER = 0;
	private int left_operand = 0, right_operand = 0;
	private char operator = '+';
	private int value = 0;
	private void construct ( int left, int right, char op) {
		left_operand = left;
		right_operand = right;
		operator = op;
		if(op == '+') {
			value = left + right;
		}
		else {
			value = left - right;
		}
	}
	public BinaryOperation_1_0 generateAdditionOperation() {
		Random random = new Random();
		int left, right, result;
		left = random.nextInt(UPPER+1);
		do {
			right = random.nextInt(UPPER+1);
			result = left + right;
		}while(result > UPPER);
		BinaryOperation_1_0 bop = new BinaryOperation_1_0();
		bop.construct(left, right, '+');
		return bop;
	}
	public BinaryOperation_1_0 generateSubstractOperation() {
		Random random = new Random();
		int left, right, result;
		left = random.nextInt(UPPER+1);
		do {
			right = random.nextInt(UPPER+1);
			result = left - right;
		}while(result < LOWER);
		BinaryOperation_1_0 bop = new BinaryOperation_1_0();
		bop.construct(left, right, '-');
		return bop;
	}
	public BinaryOperation_1_0 generateBinaryOpertation() {
		Random random = new Random();
		int n = random.nextInt();
		BinaryOperation_1_0 bop = new BinaryOperation_1_0();
		if(n == 0){
			bop = generateSubstractOperation();
		}
		else if(n == 1) {
			bop = generateAdditionOperation();
		}
		return bop;
	}
	public int getLeftOperand(){
		return left_operand;
	}
	public int getRightOperand() {
		return right_operand;
	}
	public char getOperator() {
		return operator;
	}
	public int getResult() {
		return value;
	}
	public boolean equals(BinaryOperation_1_0 anOperation) {
		return left_operand == anOperation.getLeftOperand() && right_operand == anOperation.getRightOperand() && operator == anOperation.getOperator();
	}
	public String toString() {
		return left_operand + " " + operator  + " " + right_operand;
	}
	public String asString() {
		return left_operand + " " + operator  + " " + right_operand + "=" ;
	}
	public String fullString() {
		return left_operand + " " + operator  + " " + right_operand + "=" + value;
	}
}
