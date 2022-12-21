public class Calculator {
    public int add(int a, int b){
        return x+y;
    }
    public int dif(int a, int b){
        return x-y;
    }
    public int div(int a, int b) {
        return x / y;
    }
    public int times(int a, int b){
        return x*y;
    }
    public int solver(int a, int b){ //уравнение вида ах + b =0;
        return div (-b, a);
    }
}
