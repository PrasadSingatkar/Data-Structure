package DoubleStack;

public class Main {
    public static void main(String[] args) {
        DoubleStack ds=new DoubleStack(6);

        ds.push1(1);
        ds.push1(3);

        System.out.println(ds);
        ds.push1(122);
        
        System.out.println(ds);
        ds.push2(3);
        ds.push2(9);
        
        System.out.println(ds);
        ds.push2(15);

        System.out.println(ds);
    }
}
