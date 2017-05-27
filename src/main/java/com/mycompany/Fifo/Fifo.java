package com.mycompany.Fifo;

import com.mycompany.Item;

import java.util.Iterator;

/**
 * Created by kornel on 26.05.17.
 */
public class Fifo {
    private Item firstAdded;
    private Item lastAdded;

    public void push (Item item){
        if (firstAdded == null){
            this.firstAdded = item;
            this.lastAdded = firstAdded;
        }
        else {
            lastAdded.setPrevious(item);
            lastAdded = lastAdded.getPrevious();
        }
    }

    public Item pop(){
        Item current = firstAdded;

        if (firstAdded == null) {
            System.out.println("Empty queue");
            return null;
        }
        else{
            firstAdded = firstAdded.getPrevious();
            return current;
        }
    }
}
