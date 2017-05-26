package com.mycompany;

/**
 * Created by kornel on 26.05.17.
 */
public class Main {
    public static void main(String[] args) {
        Fifo myFifo = new Fifo();

        System.out.println(myFifo.pull());

        Item i1 = new Item();
        Item i2 = new Item();
        Item i3 = new Item();
        Item i4 = new Item();
        Item i5 = new Item();
        System.out.println(i1);
        System.out.println(i2);


        myFifo.push(i1);
        myFifo.push(i2);
        myFifo.push(i3);
        myFifo.push(i4);
        myFifo.push(i5);

        System.out.println(myFifo.pull());
        System.out.println(myFifo.pull());


    }
}
