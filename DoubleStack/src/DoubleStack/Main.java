package DoubleStack;

public class Main {
    public static void main(String[] args) {
        DoubleStack ds=new DoubleStack(6);

        ds.push1(8);
        ds.push1(5);
        ds.push1(12);
        ds.push2(3);
        ds.push2(34);  
        ds.push2(99);

        System.out.println(ds);
    }
}
