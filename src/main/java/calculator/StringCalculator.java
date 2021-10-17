package calculator;

public class StringCalculator {
	
	public int add(String input) {
		String[] numbers = input.split(",");
		
        if(isEmpty(input)) {
        	return 0;
        }
        
        if(input.length() == 1) {
        	return stringtoInt(input);
        }
        else {
        	return getSum(numbers[0], numbers[1]);
        }
        
    }

    private int getSum(String numX, String numY) {
		return Integer.parseInt(numX) + Integer.parseInt(numY);
	}
	
	private boolean isEmpty(String input) {
		return input.isEmpty();
	}
	
	private int stringtoInt(String input) {
		return Integer.parseInt(input);
	}

}