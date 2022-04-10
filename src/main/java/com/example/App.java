package com.example;

interface MyQueue {
    // int max = 100;
    // int[] queue = new int[max];
    // int front = 0;
    // int rear = 0;
    
    // 큐 push
    public void push(int x);
    
    // 큐 pop
    public int pop();
    
    // 큐 비었는지 확인
    public boolean isEmpty();

    // 큐 비었는지 확인
    public boolean isFull();
}

public class App 
{
    public static void main( String[] args )
    {

    }
}

// class my_queue implements MyQueue
// {
// }
