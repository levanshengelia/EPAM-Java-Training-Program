package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addLast(firstQueue.remove());
        arrayDeque.addLast(firstQueue.remove());
        arrayDeque.addLast(secondQueue.remove());
        arrayDeque.addLast(secondQueue.remove());
        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            firstQueue.add(arrayDeque.removeLast());
            arrayDeque.addLast(firstQueue.remove());
            arrayDeque.addLast(firstQueue.remove());

            secondQueue.add(arrayDeque.removeLast());
            arrayDeque.addLast(secondQueue.remove());
            arrayDeque.addLast(secondQueue.remove());
        }

        return arrayDeque;
    }
}