package com.saiev.homework_03;

public class Main {
    public static void main(String[] args) {
//        MyStack<Integer> myStack = new MyStack<>();
//
//        myStack.push(5);
//        myStack.push(2);
//        myStack.push(9);
//        myStack.push(1);
//        myStack.push(4);
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(myStack.pop());
//        }
//        Expression e = new Expression("()+{}+[{}]");
//        System.out.println(e.checkBracket());
//        MyQueue<Integer> queue = new MyQueue<>();
//
//        queue.insert(3);
//        queue.insert(2);
//        queue.insert(7);
//        queue.insert(4);
//
//        for (int i = 0; i < 4; i++) {
//            System.out.println(queue.remove());
//        }

//        MyPriorityQueue<Integer> mpq = new MyPriorityQueue<>();
//
//        mpq.insert(5);
//        mpq.insert(2);
//        mpq.insert(20);
//        mpq.insert(21);
//        mpq.insert(4);
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(mpq.remove());
//        }

        System.out.println("Задание №1");
        MyDeQueue<Integer> myDeQueue = new MyDeQueue<>();
        myDeQueue.insertRight(99);

        myDeQueue.insertRight(100);
        myDeQueue.insertLeft(66);
        myDeQueue.insertRight(88);
        myDeQueue.insertRight(77);
        myDeQueue.insertLeft(9999);

        System.out.println(myDeQueue.peekRight());
        System.out.println("___________");
//
        System.out.println(myDeQueue.peekLeft());
        System.out.println("___________");


        for (int i = 0; i < 6; i++) {
            System.out.println(myDeQueue.removeRight());
        }

        System.out.println("Задание №2");
        String test = "hello world";
        revert(test);

    }

    public static void revert(String test) {
        char[] temp = test.toCharArray();
        for (int i = temp.length-1; i >=0; i--) {
            System.out.print(temp[i]);
        }
    }



}