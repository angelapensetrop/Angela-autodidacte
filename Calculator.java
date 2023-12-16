package Calculator;

public class Calculator {

    //Variables
    private int first_number, second_number;
    private String op;
    private int result;


    //Default Constructor
    public Calculator (int a, String b, int c) {
        this.first_number = a;
        this.op = b;
        this.second_number = c;
    }

        //Data Input Methods
    public int getA() {
        return first_number;
    }
    public String getB() {
        return op;
    }
    public int getC() {
        return second_number;
    }

    //Arithmetic Operation Methods
public int sum() {
        return result = first_number + second_number;
}
public int sub() {
        return result = first_number - second_number;
}
public int mul() {
        return result = first_number * second_number;
}
public int div() {
        return result = first_number / second_number;
}

//Increment, Decrement Methods
    public int increment() {
        return this.result+=1;
    }
    public int decrement() {
        return this.result-=1;
    }
}

