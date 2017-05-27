package com.mycompany;

/**
 * Created by kornel on 26.05.17.
 */
public class Item {
    private Item previous;
    private Item next;
    private Object data;

    //    public Item(Item previous) {
//        this.previous = previous;
//    }


    public Item(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
}

    public Item getPrevious() {
        return previous;
    }

    public void setPrevious(Item previous) {
        this.previous = previous;
    }

    public Item getNext() {
        return next;
    }

    public void setNext(Item next) {
        this.next = next;
    }
}
