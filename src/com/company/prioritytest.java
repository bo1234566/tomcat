package com.company;

import java.util.PriorityQueue;
import java.util.Queue;

public class prioritytest {
    public static void main(String[] arg){
        Queue<Integer> que = new PriorityQueue<>((o1, o2) -> o2-o1);
        que.add(1);
        que.add(2);
        que.add(3);
        if(que.size()>=3)
            que.poll();
        que.add(5);
        que.add(4);
        que.add(7);
        que.poll();
        que.poll();
        que.poll();
        que.poll();
        que.poll();
    }

}
