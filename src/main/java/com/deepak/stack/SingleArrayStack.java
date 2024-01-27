package com.deepak.stack;

public class SingleArrayStack {
    private int stackSize;
    private int[] buffer;
    private int[] stackPointers;

    public SingleArrayStack(int stackSize) {
        this.stackSize = stackSize;
        this.buffer = new int[3 * stackSize];
        this.stackPointers = new int[]{-1, -1, -1}; // Initial pointers for three stacks
    }

    public void push(int stackNum, int value) throws StackOverflowException {
        if (isFull(stackNum)) {
            throw new StackOverflowException("Stack " + stackNum + " is full.");
        }
        stackPointers[stackNum]++;
        buffer[getTopIndex(stackNum)] = value;
    }

    public int pop(int stackNum) throws StackUnderflowException {
        if (isEmpty(stackNum)) {
            throw new StackUnderflowException("Stack " + stackNum + " is empty.");
        }
        int value = buffer[getTopIndex(stackNum)];
        stackPointers[stackNum]--;
        return value;
    }

    public int peek(int stackNum) throws StackUnderflowException {
        if (isEmpty(stackNum)) {
            throw new StackUnderflowException("Stack " + stackNum + " is empty.");
        }
        return buffer[getTopIndex(stackNum)];
    }

    public boolean isEmpty(int stackNum) {
        return stackPointers[stackNum] == -1;
    }

    public boolean isFull(int stackNum) {
        return stackPointers[stackNum] == (stackSize - 1);
    }

    private int getTopIndex(int stackNum) {
        return stackNum * stackSize + stackPointers[stackNum];
    }

    public static void main(String[] args) {
        SingleArrayStack stacks = new SingleArrayStack(5);

        try {
            stacks.push(0, 1);
            stacks.push(0, 2);
            stacks.push(1, 5);
            stacks.push(2, 10);

            System.out.println("Peek stack 0: " + stacks.peek(0)); // Output: 2
            System.out.println("Peek stack 1: " + stacks.peek(1)); // Output: 5
            System.out.println("Peek stack 2: " + stacks.peek(2)); // Output: 10

            stacks.pop(0);
            stacks.pop(1);
            stacks.pop(2);

            System.out.println("Is stack 0 empty? " + stacks.isEmpty(0)); // Output: true
            System.out.println("Is stack 1 empty? " + stacks.isEmpty(1)); // Output: true
            System.out.println("Is stack 2 empty? " + stacks.isEmpty(2)); // Output: true
        } catch (StackOverflowException | StackUnderflowException e) {
            e.printStackTrace();
        }
    }
}

class StackOverflowException extends Exception {
    public StackOverflowException(String message) {
        super(message);
    }
}

class StackUnderflowException extends Exception {
    public StackUnderflowException(String message) {
        super(message);
    }
}

