package Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator(5, "+", 10);

        switch (cal.getB()) {
            case "+":
                System.out.println(cal.getA() + "+" + cal.getC() + "=" + cal.sum());
                break;
            case "-":
                System.out.println(cal.getA() + "-" + cal.getC() + "=" + cal.sub());
                break;
            case "*":
                System.out.println(cal.getA() + "*" + cal.getC() + "=" + cal.mul());
                break;
            case "/":
                if (cal.getC() == 0) {
                    System.out.println("error");
                } else {
                    System.out.println(cal.getA() + "/" + cal.getC() + "=" + cal.div());
                    break;
                }
        }
        System.out.println("옵션 : Increment / Decrement");
        System.out.println("Increment : " + cal.increment());
        //System.out.println("Decrement : " + cal.decrement());
    }
}


