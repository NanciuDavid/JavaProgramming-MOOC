import java.util.ArrayList;
import java.util.Scanner;



public class Statistics {
private Scanner scanner = new Scanner(System.in);
private int count;
private ArrayList<Integer> sum = new ArrayList<>();

public Statistics() {
    this.count = 0 ; 
}

public void addNumber(int number) {

    sum.add(number);
    this.count ++ ;

}

public int getCount() { 
     return this.count;
}


public int sum() {

    int sumOfNumbers = 0 ;
    for(int i = 0 ; i < sum.size() ; i++)
    sumOfNumbers+=sum.get(i);

    return sumOfNumbers;
}

public double average() {
   
    double result = 0.0 ; 

    result = sum() * 1.0 / sum.size() ;

    return result;
}

public void askUser() {
    
    //ask user

    System.out.println("Enter numbers: ");
    ArrayList<Integer> userInput = new ArrayList<>();

    int value ; 
    int overallSum = 0 ;
    int evenNumbersSum = 0 ;
    int oddNumberSum = 0;

    while(true) {
         value = Integer.valueOf(scanner.nextLine());
         if(value == -1) 
           break;
         else 
         {
            userInput.add(value);
         }
    }

    for(int i = 0 ; i < userInput.size() ; i++) {
        overallSum += userInput.get(i);
        if(userInput.get(i) % 2 == 0 ) {
            evenNumbersSum +=userInput.get(i);
        }
        else {
            oddNumberSum += userInput.get(i);
        }
    }
    
    
    System.out.println("Sum:" +overallSum);
    System.out.println("Sum of even numbers:" +evenNumbersSum);
    System.out.println("Sum of odd numbers:" +oddNumberSum);

}



}
