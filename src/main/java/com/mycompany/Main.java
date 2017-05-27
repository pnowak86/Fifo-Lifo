package com.mycompany;

import com.mycompany.Fifo.Fifo;
import com.mycompany.Lifo.Lifo;

/**
 * Created by kornel on 26.05.17.
 */
public class Main {
    public static void main(String[] args) {
        Fifo myFifo = new Fifo();
        Lifo myLifo = new Lifo();
        System.out.println(myFifo.pop());

        Item i1 = new Item("First");
        Item i2 = new Item("Second");
        Item i3 = new Item("Third");
        Item i4 = new Item("Fourth");
        Item i5 = new Item("Fifth");

        System.out.println("---pushed---");
        System.out.println(i1.getData());
        System.out.println(i2.getData());
        System.out.println(i3.getData());
        System.out.println(i4.getData());
        System.out.println(i5.getData());

//        myFifo.push(i1);
//        myFifo.push(i2);
//        myFifo.push(i3);
//        myFifo.push(i4);
//        myFifo.push(i5);
        myLifo.push(i1);
        myLifo.push(i2);
        myLifo.push(i3);
        myLifo.push(i4);
        myLifo.push(i5);

        System.out.println("---pulled---");

//        System.out.println(myFifo.pop());
//        System.out.println(myFifo.pop());
//        System.out.println(myFifo.pop());
//        System.out.println(myFifo.pop());


        System.out.println(myLifo.pop().getData());
        System.out.println(myLifo.pop().getData());
        System.out.println(myLifo.pop().getData());
        System.out.println(myLifo.pop().getData());
        System.out.println(myLifo.pop().getData());

    }
}
