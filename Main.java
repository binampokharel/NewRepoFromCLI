//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.EfirstNumecute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        int myInt = 10;
//        float myFloatValue = 10.9956567f;
        String myFirstTxt = "Arithmetic Operation";
        System.out.println("First lab class of " + myFirstTxt);
        
        char firstChar = 'A';
        System.out.println("My first Character = " + firstChar);

        boolean myVal = true;
        System.out.println("Boolean value =  " + myVal);

        int firstNum = 15,  secondNum = 5, thirdNum = 2;

        double doubleVal1 = 10, doubleVal2 = 3;
        float floatVal1 = 20, floatVal2 = 3;

        int divValue = 5/2;
        System.out.println("Int result of division = " + divValue);

        double doubleValue = doubleVal1/doubleVal2;
        System.out.println("Double result of division = " + doubleValue);

        double divValDouble = 10/3D;
        System.out.println("Double result of division with D  = " + divValDouble);

        float floatValue = floatVal1/floatVal2;
        System.out.println("Float result of division = " + floatValue);

        float divValFloat = 20/3F;
        System.out.println("Float result of division with F = " + divValFloat);

        System.out.println("Addition of two variable = " + (firstNum + secondNum));
        System.out.println("Subtraction of two variable = " + (firstNum - secondNum));
        System.out.println("Multiplication of two variable = " + firstNum * secondNum);
        System.out.println("Modulus of two variable = " + firstNum % thirdNum);
        System.out.println("Post increment of value = " + (firstNum++));
        System.out.println("value of firstNum = " + firstNum);
        System.out.println("Pre increment of value of firstNum = " + ++firstNum);
        System.out.println("Value of firstNum = " + firstNum);
        System.out.println("Post decrement of value of firstNum = " + firstNum--);
        System.out.println("Value of firstNum = " + firstNum);
        System.out.println("Pre decrement of value of firstNum = " + --firstNum);
        System.out.println("value of firstNum = " + firstNum);
    }
}