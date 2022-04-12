package com.company.datastructures;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueClass {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("TestA");
        pq.add("TestB");
        pq.add("TestC");
        pq.add("TestD");
        pq.add("TestE");
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);

        for (String i : pq) {
            System.out.println(i);
        }
    }

}
