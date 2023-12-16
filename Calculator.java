package Calculator;

public class Calculator {

    //사용할 변수들
    private int first_number, second_number;
    private String op;
    private int result;


    //디폴트 생성자 및 정의
    public Calculator (int a, String b, int c) {
        this.first_number = a;
        this.op = b;
        this.second_number = c;
    }

        //데이터 변수 입력 메소드
    public int getA() {
        return first_number;
    }

    public String getB() {
        return op;
    }

    public int getC() {
        return second_number;
    }




    //사칙연산 메소드
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

//Increment, Decrement 메소드
    public int increment() {
        return this.result+=1;
    }
    public int decrement() {
        return this.result-=1;
    }
}

