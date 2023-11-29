package DoubleStack;

import java.util.Arrays;

public class DoubleStack{
    int [] arr;
    int size;
    int top1,top2;

    public DoubleStack(int size){
        this.size=size;
        top1=-1;
        top2=size;
        arr=new int[size];
    }

    public boolean isFull(){
        return top1+1==top2;
    }

    public boolean isEmpty1(){
        return top1==-1;
    }

    public boolean isEmpty2(){
        return top2==size;
    }

    public boolean push1(int data){
        if (isFull()) {
            return false;
        }

        arr[++top1]=data;
//        System.out.println("top1 "+arr[++top1]);
        return true;
    }

    public boolean push2(int data){
        if(isFull()){
            return false;
        }

        arr[--top2]=data;
//          System.out.println("top2   "+arr[++top2]);
        return true;
    }

    @Override
	public String toString() {
		return "DoubleStack=" + Arrays.toString(arr) + ", size=" + size + ", top1=" + top1 + ", top2=" + top2 ;
	}

}