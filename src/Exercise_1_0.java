
public class Exercise_1_0 {
	private static final short OPERATION_NUMBER=50;
	private static final short COLUMN_NUMBER=5;
	private BinaryOperation_1_0 operationList[] = new BinaryOperation_1_0[OPERATION_NUMBER];
	public void generateBinaryExercise() {
		BinaryOperation_1_0 anOperation, opCreator = new BinaryOperation_1_0();
		for(int i = 0; i < OPERATION_NUMBER; i++) {
			anOperation = opCreator.generateBinaryOpertation();
			while(contains(anOperation,i-1)) {
				anOperation = opCreator.generateBinaryOpertation();
			}	
			operationList[i] = anOperation;
		}
	}
	public void generateAdditionExercise() {
		BinaryOperation_1_0 anOperation, opCreator = new BinaryOperation_1_0();
		for(int i = 0; i < OPERATION_NUMBER; i++) {
			anOperation = opCreator.generateAdditionOperation();
			while(contains(anOperation,i-1)) {
				anOperation = opCreator.generateAdditionOperation();
			}	
			operationList[i] = anOperation;
		}
	}
	public void generateSubdtractExercise() {
		BinaryOperation_1_0 anOperation, opCreator = new BinaryOperation_1_0();
		for(int i = 0; i < OPERATION_NUMBER; i++) {
			anOperation = opCreator.generateSubstractOperation();
			while(contains(anOperation,i-1)) {
				anOperation = opCreator.generateSubstractOperation();
			}	
			operationList[i] = anOperation;
		}
	}
	private boolean contains(BinaryOperation_1_0 anOperation, int length) {
		boolean found = false;
		for(int i = 0; i <= length; i++) {
			if(anOperation.equals(operationList[i])) {
				found = true;
				break;
			}
		}
		return found;
	}
	void formateAndDisplay() {
		for(int i = 0; i < operationList.length; i++) {
			System.out.print( (i+1) + ":\t" + operationList[i].asString() + "     \t");
			if((i + 1) % COLUMN_NUMBER == 0) {
				System.out.print("\n");
			}
		}
	}
}
