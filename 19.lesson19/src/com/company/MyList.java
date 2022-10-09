package com.company;

public class MyList {
    // head-всегда будет содержать ссылку на первый элемент
    // если head == null - коллекция пустая или нет элементов
    private Node head;

    public void add (int v){
        // если список пустой(head==null)
        if (this.head==null){
            this.head = new Node(v);
            return;
        }
        //список не пустой
        Node last = this.head;
        while (last.next!=null){
            last = last.next;
        }
        last.next = new Node(v);
    }
    public void print(){
        Node last = this.head;
        while (last!=null){
            System.out.println(last.value);
            last = last.next;
        }
    }
}
