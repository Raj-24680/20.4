package h2;

public class App {

    public int add(int a ,int b) {
        return a+b;
    }

    public int sub(int a,int b) {
        return a-b;
    }

    public int mul(int a,int b) {
        return a*b;
    }

    public int div(int a,int b) {
        return a/b;
    }

    public static void main(String[] args) {
        App c = new App();

        System.out.println("add:" + c.add(4,2));
        System.out.println("sub:" + c.sub(4,2));
        System.out.println("mul:" + c.mul(4,2));
        System.out.println("div:" + c.div(4,2));
    }
}