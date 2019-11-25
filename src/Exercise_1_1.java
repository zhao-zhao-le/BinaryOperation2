import java.util.ArrayList;
import java.util.Random;

public class Exercise_1_1 {
	private ArrayList<BinaryOperation_1_1> operationList = new ArrayList<BinaryOperation_1_1>();
	
	public void generateAdditionExercise(int operationCount) {
		BinaryOperation_1_1 anOperation;
		while(operationCount > 0) {
			do {
				anOperation = generateAddition();
			}while(contains(anOperation));
			operationList.add(anOperation) ;
			operationCount--;
		}
	}
	
	private BinaryOperation_1_1 generateAddition() {
		return new AdditionOperation();
	}
	
	public void generateSubdtractExercise(int operationCount) {
		BinaryOperation_1_1 anOperation;
		while(operationCount > 0) {
			do {
				anOperation = generateSubdtract();
			}while(contains(anOperation));
			operationList.add(anOperation) ;
			operationCount--;
		}
	}
	
	private BinaryOperation_1_1 generateSubdtract() {
		return new SubstractOperation();
	}
	
	public void generateBinaryExercisee(int operationCount) {
		BinaryOperation_1_1 anOperation;
		while(operationCount > 0) {
			do {
				anOperation = generateOpertation();
			}while(contains(anOperation));
			operationList.add(anOperation) ;
			operationCount--;
		}
	}
	
	private boolean contains(BinaryOperation_1_1 anOperation) {
		boolean found = false;
		for(int i = 0; i <= operationList.size()-1; i++) {
			if(anOperation.equals(operationList.get(i))) {
				found = true;
				break;
			}
		}
		return found;
	}
	
	public BinaryOperation_1_1 generateOpertation() {
		Random random = new Random();
		int opValue = random.nextInt(2);
		if(opValue == 1) {
			return new AdditionOperation();
		}
		return new SubstractOperation();
	}
	
	public void formattedDisplay(int columns) {
		for(int i = 0; i < operationList.size(); i++) {
			System.out.print( (i+1) + ":\t" + operationList.get(i).asString() + "     \t");
			if((i + 1) % columns == 0) {
				System.out.print("\n");
			}
		}
	} 
}
