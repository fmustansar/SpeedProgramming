package com.faizan.speed.programming.implementstack;

public class StackImplementedByFaizan {
    /**
     *  Whats a Stack?
     *  LIFO / FILO
     *  Methods:
     *      PUSH - Adds element on the top
     *      POP - Removes and provides you with the element from the top
     *      PEEK - Does not remove the element but provides you with the element from the top
     *
     *  Things you need.
     *      Capacity in integer to know when the stack is full
     *      Top pointer. To know how much the stack is filled
     *
     */

    private final int capacity;
    private int top;
    private int stack[];

    public StackImplementedByFaizan(int capacity) {
        this.stack = new int[capacity];
        this.capacity = capacity;
        this.top = -1;
    }

    public void push(int element) {

        if(!isStackFull()) {
            stack[++top] = element;
        } else {
            throw new RuntimeException("Stack is full");
        }

    }

    public int pop() {
        if(!isStackEmpty()) {
            return stack[top--];
        }
        throw new RuntimeException("Stack is empty");
    }

    public int peek(int element) {
        if(!isStackEmpty()) {
            return stack[top];
        }
        throw new RuntimeException("Stack is empty");
    }

    public boolean isStackFull() {
        return top==capacity-1;
    }

    public boolean isStackEmpty() {
        return top == -1;
    }
}
