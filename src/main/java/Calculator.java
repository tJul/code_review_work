public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        return a / b;
    }
    public int times(int a, int b){
        return a *b;
    }
    public int solver(){ // (1/a)*x+b=0
        return (times(-b, a));
    }
}
