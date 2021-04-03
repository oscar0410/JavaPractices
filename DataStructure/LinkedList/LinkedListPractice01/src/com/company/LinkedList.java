package com.company;

class Node{
    int data;
    int np;
    String names;
    Node next;
    public Node(int data, String names, int np){
        this.np = np;
        this.data = data;
        this.names = names;
        this.next = null;
    }
}

public class LinkedList {
    // 第一個節點
    private Node first;
    // 最後一個節點
    private Node last;

    public boolean isEmpty(){
        return first==null;
    }

    public void print(){
        Node current = first;
        // 有資料時
        while(current != null){
            // 印出資料
            System.out.println("["+current.data+" "+current.names+" "+current.np+"]");
            // 取得下一筆資料
            current = current.next;
        }
        System.out.println();
    }

    public void insert(int data, String names, int np){
        Node newNode = new Node(data, names, np);
        if(this.isEmpty()){
            first = newNode;
        } else{
            last.next = newNode;
        }
        last = newNode;
    }
}
