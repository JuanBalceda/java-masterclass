package com.jbalceda;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
/*
        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());

        String stringData = "9 3 5 2 1 7 8 6 0 4";
        String[] data = stringData.split(" ");
        for (String s : data){
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());
        list.removeItem(new Node("2"));
        list.traverse(list.getRoot());
*/
        SearchTree list = new SearchTree(null);
        list.traverse(list.getRoot());

        String stringData = "9 3 5 2 1 7 8 6 0 4 ";
        String[] data = stringData.split(" ");
        for (String s : data){
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());


    }
}
