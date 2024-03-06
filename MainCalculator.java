//Perform user defined operation on given two numbers using sw itch.

// #WAP in Java to use switch statements where,
// 1. The user will provide two numbers as input and store them in inputFirstNumber, and inputSecondNumber
// 2. The user will declare add/subtract/multiply/divide to be performed and will use the inputByUser variable to assign the desired input to be performed
// 3. Based on the conditions 1 and 2
// 4. The program should be able to return add/subtract/multiply/divide of two numbers
// 5. If add/subtract/multiply/divide none of this is asked by the user then no operation is required to be performed.
// 6. After the operation is performed, the end user should know what was the operation performed by the user and its result.

// Example, if the user wants to perform an add operation where the input Numbers are inputFirstNumber=10 and inputSecondNumber=5; The print statement should be displayed as ;

// SUM: 15.0
// Task: add Operation Was Successful

// for no operation following should be printed:
// Task: none Operation Was Successful

public class MainCalculator
{
    double inputFirstNumber;
    double inputSecondNumber;
    String operation;
    double result;

    public MainCalculator(double inputFirstNumber, double inputSecondNumber, String operation){
        this.inputFirstNumber = inputFirstNumber;
        this.inputSecondNumber = inputSecondNumber;
        this.operation = operation.toLowerCase();
    }
    public MainCalculator(double inputFirstNumber, double inputSecondNumber){
        this.inputFirstNumber = inputFirstNumber;
        this.inputSecondNumber = inputSecondNumber;
        this.operation = "null";
    }

    public void performOperation(){
        switch (operation){
            case "add" :
                result = inputFirstNumber + inputSecondNumber;
                System.out.println("SUM: " + result);
                System.out.println("Task: add Operation Was Successful.");
                break;
            case "subtract" :
                result = inputFirstNumber - inputSecondNumber;
                System.out.println("DIFF: " + result);
                System.out.println("Task: substraction Operation Was Successful.");
                break;
            case "multiply" :
                result = inputFirstNumber * inputSecondNumber;
                System.out.println("MULTIPLY: " + result);
                System.out.println("Task: multiplication Operation Was Successful.");
                break;
            case "divide" :
                if (inputSecondNumber != 0){
                    result = inputFirstNumber / inputSecondNumber;
                    System.out.println("DIV: " + result);
                    System.out.println("Task: division Operation Was Successful.");
                } else {
                    System.out.println("Cannot Divide by Zero.");
                }
                break;    
            default : 
                System.out.println("none Operation Was Successful.");
                break;

        }
    }
    public static void main(String[] args)
    {
        MainCalculator calculator = new MainCalculator(10.0, 5.0, "add");
        calculator.performOperation();
    }
}