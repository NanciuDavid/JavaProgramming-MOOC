public class Debt {
    private double initialBalance  = 0.0 ; 
    private double initialInterestRate = 0.0 ; 

    public Debt(double initialBalance, double initialInterestRate) { 
        this.initialBalance = initialBalance ;
        this.initialInterestRate = initialInterestRate ; 
    }

    public void printBalance() { 
        System.out.println(this.initialBalance);
    }

    public void waitOneYear() { 
        initialBalance = initialBalance * initialInterestRate ; 
    }

   
}
