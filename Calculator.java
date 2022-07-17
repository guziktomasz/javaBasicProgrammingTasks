package javaPodstawyProgramowanie;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }
//1.
    public int substract(int a, int b) {
        return a-b;
    }
//2.
    public int multiply(int a, int b) {
        return a*b;
    }
//3.
    public double divide(int a, int b) {
        return a/b;
    }
//4.
    public boolean isPsitive(int a) {
        if (a > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isNegative(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }
}
