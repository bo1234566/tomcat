package com.company;

import java.util.LinkedList;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val  =x;
    }

}
public class tigertest{


      public static void main(String[] args) {
          //Scanner in = new Scanner(System.in);
          //int a = in.nextInt();
          //System.out.println(a);
          ListNode phead = new ListNode(1);
          phead.next = new ListNode(1);
          phead.next.next = new ListNode(2);
          phead.next.next.next = new ListNode(3);
          phead.next.next.next.next = new ListNode(3);
          ListNode ress = deleterepetenode(phead);
          System.out.println(0);
      }

      public static ListNode deleterepetenode(ListNode head) {
/*
先延长链表，再指向链表的前置哨兵，最后返回前置哨兵的后一个节点
 */
/*
          ListNode head = new ListNode(-1);
          head.next = phead;
          ListNode res = head;
          while (phead.next != null) {
              if (phead.val == phead.next.val)
                  phead = phead.next.next;
              else {
                  head.next = phead;
                  phead = phead.next;
                  head = head.next;
              }
          }
          head.next = phead;
          return res.next;
  */
          ListNode phead = new ListNode(-1);
          phead.next = head;
          ListNode res = head;
          while (head!=null && head.next != null) {
              if (head.val == head.next.val){
                  phead = head;
                  head = head.next.next;
                  phead = phead.next;
              }
              else
              {
                  phead = head;
                  head = head.next;

                  phead = phead.next;
              }
          }
          phead = head;
          return res.next;
      }

}