package com.company;

class Node{
    int data;
    int np;
    String names;
    Node next;

    // 建構子

    public Node(int data,String names, int np) {
        this.data = data;
        this.np = np;
        this.names = names;
        this.next = null;
    }
}

public class StuLinkedList {
    public Node firstNode;
    public Node lastNode;

    public boolean isEmpty(){
        return firstNode==null;
    }

    public void print(){
        Node currentNode = firstNode;
        while (currentNode!=null){
            System.out.println("["+currentNode.data+" "+currentNode.names+" "+currentNode.np+"]");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public void add(int data, String naems, int np){
        Node newNode = new Node(data,naems,np);
        if(this.isEmpty()){
            firstNode = newNode;
        }else{
            lastNode.next = newNode;
        }
        lastNode = newNode;
    }

    public void delete(Node delNode){
        Node newNode;
        Node tmp;
        /* 當刪除的是第一筆資料時 */
        if(firstNode.data == delNode.data){
            firstNode = firstNode.next;
        } else if(lastNode.data == delNode.data){ // 當刪除的是最後一筆時
            System.out.println("I am here\n");
            newNode = firstNode;
            while (newNode.next != lastNode){
                newNode = newNode.next;
            }
            newNode.next = lastNode.next;
            lastNode = newNode;
        }else{ //其他狀況
            newNode = firstNode;
            tmp =firstNode;
            while (newNode.data!= delNode.data){
                tmp = newNode;
                newNode = newNode.next;
            }
            tmp.next = delNode.next;
        }
    }
}
