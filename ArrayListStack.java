/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maze_DS;

import ADTs.StackADT;
import Exceptions.EmptyCollectionException;
import java.util.ArrayList;


/**
 * 
 * @author Anirudh Shankar
 * @version 3/5
 * @param <T> a generic variable named T
 */
public class ArrayListStack<T> implements StackADT<T> {
    
   
    private final  ArrayList<T> starter;
    
 /**
 *
 * Creates a generic Arraylist to operate as a stack
 */
    public ArrayListStack() {
        
        starter = new ArrayList<T>();
       
    }

    /**
     * Adds the specified element to the top of the stack
     * @param element element to be pushed onto the stack
     */
    public void push(T element) {
       
        starter.add(element);
    }

    /**
     * Removes and returns the element that is on top of the stack
     * @return the element removed from the stack
     * @throws EmptyCollectionException when the stack is empty it will be called
     */
    public T pop() throws EmptyCollectionException {
        
        T elementAtTop;
        if (starter.size() == 0) {

 	        throw new EmptyCollectionException("Stack is empty");
        } 
        
        elementAtTop = starter.remove((starter.size() - 1));
        
        return (elementAtTop); 
        
    }

    /**
     * Returns (without removing) the element that is on top of the stack
     * @return the element on top of the stack
     * @throws EmptyCollectionException when the stack is empty it will be called
     */
    public T peek() throws EmptyCollectionException {
        
        if (starter.size() == 0) {

 	        throw new EmptyCollectionException("Stack is empty");
        } 
        return starter.get(starter.size() - 1);                  
    }
          

        
    

    @Override
    public boolean isEmpty() {
        if (starter.size() > 0) {
            return false; 
        }
        else { 
            return true;
        }
        
    }

    @Override
    public int size() {
        int topper = starter.size();

        return topper;
    }

    @Override
    public String toString() {
        return "ArrayListStack{" + "starter=" + starter + '}';
    }
    
    
    
}
