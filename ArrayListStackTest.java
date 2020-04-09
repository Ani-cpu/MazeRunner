/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maze_DS;

import Exceptions.EmptyCollectionException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author anirudh shankar
 * @version 3/5/2020
 */
public class ArrayListStackTest {
    
    /**
     * The automatic no-args constructor for this class
     */
    public ArrayListStackTest() {
        //does not need gto create object as that is done in each test
    }

    /**
     * Test of push method, of class ArrayListStack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object element = null;
        ArrayListStack instance = new ArrayListStack();
        instance.push(element);
        try {
            assertEquals(element, instance.peek());
        } catch (EmptyCollectionException e) {
            //only catches if the stack is empty
        }
       
    }

    /**
     * Test of pop method, of class ArrayListStack.
     * @throws java.lang.Exception
     */
    @Test
    public void testPop() throws Exception {
        
               //makes a new linked stack
        ArrayListStack instance = new ArrayListStack();
       
        Object first = 12;
        Object sec = 10;
        Object third = 9;
        
        
       
        //popping from a non-empty stack
        instance.push(first);
        instance.push(sec);
        
        try {
            instance.pop();
            assertEquals(1,instance.size());
        } catch (EmptyCollectionException e) {
            System.out.println("Stack should be empty");
        }  
        instance.push(first);
        instance.push(sec);
        instance.push(third);
        try {
            
          
            
            assertEquals(instance.peek(), instance.pop());
            
        } catch (EmptyCollectionException e) {
            //goes here if the stack is empty
        }
        instance.push(first);
        instance.push(sec);
        instance.push(third);
        try {
            
            int num = instance.size();
            
         
            instance.pop();
            int numAfter = instance.size();
            assertEquals(num, numAfter + 1);
        } catch (EmptyCollectionException e) {
           //only catches if stack is empty
        }
            
    }

    /**
     * Test of peek method, of class ArrayListStack.
     * @throws java.lang.Exception
     */
    @Test
    public void testPeek() throws Exception {
        ArrayListStack instance = new ArrayListStack();
        int countLength = 0;
        Object first;
        first = 2;
        instance.push(first);
        countLength++;
        Object sec = 4;
        instance.push(sec);
        countLength++;

        
        ArrayListStack instanceTwo = new ArrayListStack();
        instanceTwo.push(first);
        instanceTwo.push(sec);
        
        try {
            instance.peek();
            assertEquals(instance.size(),countLength);
            assertEquals(instanceTwo.peek(),instance.peek());
        } catch (EmptyCollectionException e) {
        //only if stack is empty 
        }
        try {
            Object top = instance.peek();
            assertEquals(top, instance.pop());
        } catch (EmptyCollectionException e) {
            
        }           
    }
    

    /**
     * Test of isEmpty method, of class ArrayListStack.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        ArrayListStack instance = new ArrayListStack();
        
        assertEquals(true, instance.isEmpty());
   	    assertEquals(0, instance.size());
        Object first = 2;
        
        try {
            instance.push(first);
            assertEquals(false, instance.isEmpty());
            instance.pop();
            assertEquals(instance.size(), 0);
         
        } catch (EmptyCollectionException e) { 
          //if the stack is empty, this exception runs 
        }
        instance.push(first);
        try {
            assertEquals(2, instance.peek());
   	        assertEquals(2, instance.pop());
         
        } catch (EmptyCollectionException e) {
            //when the stack is empty
        }
           
   	    assertEquals(true, instance.isEmpty());
    }

    /**
     * Test of size method, of class ArrayListStack.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ArrayListStack instance = new ArrayListStack();
        Object a  = 1;
        Object b = 2;
        Object c = 3;
       
        instance.push(a);
        instance.push(b);
        instance.push(c);
        
        try {
            instance.pop();
            assertEquals(2,instance.size());
        } catch (EmptyCollectionException e) {
            //when the stack is empty and size is 0
        }            
  
    }
    
}
