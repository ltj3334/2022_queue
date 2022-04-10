package com.example;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test //상속 여부 확인
    public void testInheritance() {
        MyQueue queue = new my_queue();

        assertTrue(queue instanceof MyQueue);
    }

    @Test
    public void testQueueInit() {
        MyQueue queue = new my_queue();
    
        assertTrue(queue.isEmpty());
        assertFalse(queue.isFull());

    }

    @Test
    public void testQueueAct() {
        MyQueue queue = new my_queue();
        
        queue.push(30);
        assertEquals(30, queue.pop());
        assertTrue(queue.isEmpty());
        for(int i = 0; i < 100; i++){
            queue.push(i);
        }
        assertTrue(queue.isFull());
        queue.pop();
        queue.pop();
        assertEquals(2, queue.pop());
    }




}
