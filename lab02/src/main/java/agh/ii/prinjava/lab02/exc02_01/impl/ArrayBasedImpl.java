package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;

public class ArrayBasedImpl implements StackOfInts {
    /**Function to remove the last int added to the stack
     *throw an error if the stack is empty
     */
    @Override
    public int pop() {
        if(numOfElems == 0)
            throw new IllegalStateException("The stack is empty");


        int pop_data = array[numOfElems-1];
        numOfElems --;
        int[] new_array = new int[numOfElems];
        for(int i =0;i < numOfElems;i ++){
            new_array[i] = array[i];
        }
        array = new_array;
        return pop_data;
    }

    /**Function to add an int to the stack
     *
     */
    @Override
    public void push(int x) {

        int[] new_array = new int[numOfElems+1];
        for(int i =0;i < numOfElems;i ++){
            new_array[i] = array[i];
        }
        new_array[numOfElems] = x;
        array = new_array;
        numOfElems ++;
    }

    /**
     * function return the number of int in the stack
     */
    @Override
    public int numOfElems() {
        return numOfElems;
    }
    /**
     * Function returning the last int added to the stack
     * throw an error if the stack is empty
     */
    @Override
    public int peek() {
        if(numOfElems == 0)
            throw new IllegalStateException("The stack is empty");
        return array[numOfElems-1];
    }

    private int[] array;
    private int numOfElems = 0;
}
