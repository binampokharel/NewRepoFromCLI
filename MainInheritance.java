// WAP in Java to use the example of Inheritance, 
// where the parent class should have the addition and subtraction method 
// and it should be implemented by the child class. 
// Also, include an example of using super while using the parent class.

class Operations {
    public double add(double a, double b){
        return a + b;
    }
    public double sub(double a, double b){
        return a - b;
    }

}

class Calculator extends Operations
{
    public double add(double a, double b){
        return super.add(a, b);
    }
    public double sub(double a, double b){
        return super.sub(a, b);
    }
    
}

public class MainInheritance{
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        System.out.println("Sum = " + calc.add(5,6));
        System.out.println("Difference = " +calc.sub(5,6));
    }
}

