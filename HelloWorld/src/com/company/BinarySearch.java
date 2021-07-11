package com.company;
import java.io.*;
import java.util.*;


public class BinarySearch {

    class MyLinkedList {
        public Node head;

        /** Initialize your data structure here. */

        public class Node{
            public int value;
            public Node next;
            public Node(int value){
                this.value = value;
            }
        }
        public MyLinkedList() {
            this.head = null;

        }

        /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
        public int get(int index) {
            if (head.next == null){
                return -1;
            }
            Node temp = head;
            for (int i =1 ; i<=index;i++){
                temp = temp.next;
                if (temp==null){
                    return -1;
                }
            }
            return temp.value;

        }

        /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
        public void addAtHead(int val) {
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;

        }

        /** Append a node of value val to the last element of the linked list. */
        public void addAtTail(int val) {
            Node newNode = new Node(val);
            Node temp = head;
            while (temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;

        }

        /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
        public void addAtIndex(int index, int val) {
            Node newNode = new Node(val);

            Node temp = head;
            for (int i =1 ; i<=index;i++){
                temp = temp.next;
                if (temp==null){
                    return ;
                }
            }
            if (temp.next == null){
                addAtTail(val);
            }else {
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }

        /** Delete the index-th node in the linked list, if the index is valid. */
        public void deleteAtIndex(int index) {
           Node temp = head;
           if (index ==0){
               head = head.next;
               return;
           }else {
               for (int i = 1; i <= index; i++) {
                   temp = temp.next;
                   if (temp==null){
                       return ;
                   }
               }


           }
        }
    }

    public static void main(String[] args) {

    }

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */


}



