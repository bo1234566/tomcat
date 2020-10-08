package com.company;

import java.util.*;

public class tencent_1 {
    public static void  main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int k = sc.nextInt();
        String[] strnum = new  String[n];
        Map<String, Integer> count = new HashMap();
        for(int i = 0;i<n;i++){
            strnum[i] =  sc.next();
            count.put(strnum[i], count.getOrDefault(strnum[i], 0) + 1);
        }
        PriorityQueue<String> heap = new PriorityQueue<String>(
                (w1, w2) -> count.get(w1).equals(count.get(w2)) ?
                        w2.compareTo(w1) : count.get(w1) - count.get(w2) );
        PriorityQueue<String> heapmin = new PriorityQueue<String>(
                (w1, w2) -> count.get(w1).equals(count.get(w2)) ?
                        w2.compareTo(w1) : count.get(w2) - count.get(w1) );

        for (String word: count.keySet()) {
            heap.offer(word);
            if (heap.size() > k) heap.poll();
        }
        for (String word: count.keySet()) {
            heapmin.offer(word);
            if (heapmin.size() > k) heapmin.poll();
        }

        List<String> ans = new ArrayList();
        List<String> ansmin = new ArrayList();
        while (!heap.isEmpty()) ans.add(heap.poll());
        while (!heapmin.isEmpty()) ansmin.add(heapmin.poll());
        Collections.reverse(ans);
        Collections.reverse(ansmin);
        for(int i = 0;i<k;i++) {
            System.out.print(ans.get(i));
        System.out.print(' ');
        System.out.println(count.get(ans.get(i)));}

     for(int j = 0;j<k;j++) {
        System.out.print(ansmin.get(j));
        System.out.print(' ');
        System.out.println(count.get(ansmin.get(j)));
     }
}

}

