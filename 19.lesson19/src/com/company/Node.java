package com.company;

public class Node {
    public int value; //значение элемента списка
    public Node next; //хранит ссылку на следующий элемент в списке, усли null-это последний эллемент
    public Node (int value) {
        this.value = value;
        //создаем MYList-здесь будет вся логика работы
    }
}
