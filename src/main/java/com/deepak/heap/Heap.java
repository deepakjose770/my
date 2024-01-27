package com.deepak.heap;

public class Heap {

    private int[] array;
    private int size;

    public Heap(int capacity) {
        array = new int[capacity];
    }

    public void insert(int value) {
        array[size++] = value;
    }

    public void heapifyUp(int index) {

    }


    public static void main(String[] args) {

    }
}
