package com.company;

public class squeu <L> implements inter  <L> {
    node front;
    node rear;
    int size;

    public squeu() {
        this.front = front;
        this.rear = rear;
        this.size = size;
    }

    public node getFront() {
        return front;
    }

    public void setFront(node front) {
        this.front = front;
    }

    public node getRear() {
        return rear;
    }

    public void setRear(node rear) {
        this.rear = rear;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public node isempty() {
        return front=null;
    }

    @Override
    public boolean isfull() {
        return false;
    }

    @Override
    public void insertbelakang(L data) {
        node newnode = new node (data);
        if(size==0){

            front=rear=newnode;
        }
        else {
            rear.setNext(newnode);
            rear=rear.getNext();
        }
        size ++;
    }

    @Override
    public L hapusdepan() {
        node tempa=front;
        if(size==0){
            System.out.println("data kosong");
        }
        else {
            node temp=front;
            front= front.getNext ();
            temp.next=null;
            size--;
        }
        return (L) tempa.getData();
    }

    @Override
    public L view() {
        node tempa=front;
        if(size==0){
            System.out.println("data kosong");
        }
        else {
            while(tempa!=null){
                tempa.tampi();
                tempa=tempa.next;
            }
        }
        return null;
    }

    public L viewdepan() {
        node tempa=front;
        if(size==0){
            System.out.println("data kosong");
        }
        else {
            tempa.tampi();
            while(tempa!=null){
                tempa=tempa.next;
            }
        }
        return null;
    }

}

