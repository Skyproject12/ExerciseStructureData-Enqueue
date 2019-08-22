package com.company;

public class node <L> {
    L data;
    node next;

    public node(L data) {
        this.data = data;
        this.next = next;
    }


    public L getData() {
        return data;
    }

    public void setData(L data) {
        this.data = data;
    }

    public node getNext() {
        return next;
    }

    public void setNext(node next) {
        this.next = next;
    }
    public void tampi () {
        System.out.println(data);
    }
}
