package com.mycompany;

/**
 * Created by kornel on 26.05.17.
 */
public class Item {
    private Item previous;

//    public Item(Item previous) {
//        this.previous = previous;
//    }
    public Item() {}


    public Item getPrevious() {
        return previous;
    }

    public void setPrevious(Item previous) {
        this.previous = previous;
    }
}
