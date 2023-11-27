package main;



/**
* This program counts the sum and the number of prime (int) numbers in interval 0-1000
*/
public class Prime {

    
    private int count = 0;
    private int sumOfPrimes = 0;
    private int firstNumber;
    private int lastNumber;

    public Prime(int firstNumber, int lastNumber) {
    	if(firstNumber>= lastNumber) {
    		System.out.println("Hoppsan, fel intervall angivet!");
    	}else
    	if(firstNumber <0) {
    		System.out.println("Hoppsan, fel intervall angivet!");
    	}else
    	if(lastNumber > 1000) {
    		System.out.println("Hoppsan, fel intervall angivet!");
    	}else {
    	this.firstNumber = firstNumber;
    	this.lastNumber = lastNumber;
        
        calculatePrimes(firstNumber, lastNumber);
    	}
        
    }

    private boolean numIsPrime(int current, int depth) {
    	if(current <= 2) {
    		return current==2  ? true : false;
    	}
        if (current % depth == 0) {
            return false;
        }
        
        if(depth > current/2) {
        	return true;
        }
        

        

        return numIsPrime(current, ++depth);
    }

    private void calculatePrimes(int current, int stop) {
    	
        if (current > stop) {
            
        } else if (numIsPrime(current, 2)) {
            ++count;
            sumOfPrimes += current;
            calculatePrimes(++current, stop);
        } else {
            calculatePrimes(++current, stop);
        }
        
    }


	public void printCount() {
		System.out.println("Hej, det finns "+count+" primtal mellan "+firstNumber+" och "+lastNumber+"!");
	}

	public void printSum() {
		System.out.println("Och den totala summan av dessa primtal är "+sumOfPrimes+".");
	}
}