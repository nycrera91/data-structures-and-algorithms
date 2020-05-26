package com.nycrera.stack;

/**
 * Created by Alperen Asa
 * Date: 26.05.2020
 * Time: 11:29
 * Project Name: data-structures-and-algorithms
 */

public class StackByArray {

    private int[] arr;
    private int topOfStack; //keeps track of the cell which is last occupied in Array, this will help in insertion/deletion

    public StackByArray(int size) {
        this.arr = new int[size];
        topOfStack = -1;
        System.out.println("Successfully created an empty Stack pf size: " + size);
    }

    public void push(int value) {

    }


    public void pop() {

    }

    public boolean isEmptyStack() {
        if(topOfStack == -1) {
            System.out.println("Stack is empty!");
            return true;
        } else
            return false;
    }

    public boolean isFullStack() {
        if(topOfStack == arr.length - 1) {
            System.out.println("Stack is full!");
            return true;
        } else
            return false;
    }

}
