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
    public int second_getA() {
        return first_number;
    }
    public String second_getB() {
        return op;
    }
    public int second_getC() {
        return second_number;
    }

    //Arithmetic Operation Methods
public int second_sum() {
        return result = first_number + second_number;
}
public int second_sub() {
        return result = first_number - second_number;
}
public int second_mul() {
        return result = first_number * second_number;
}
public int second_div() {
        return result = first_number / second_number;
}

//Increment, Decrement Methods
    public int second_increment() {
        return this.result+=1;
    }
    public int second_decrement() {
        return this.result-=1;
    }
}

