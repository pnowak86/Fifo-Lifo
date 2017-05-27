package com.mycompany.Lifo;

import com.mycompany.Item;

/**
 * Created by kornel on 26.05.17.
 */
public class Lifo {
    private Item onTheBottomOfTheStack;
    private Item onTheTopOfTheStack;

    public void push (Item item){
        if (onTheBottomOfTheStack == null){
            this.onTheBottomOfTheStack = item;
            this.onTheTopOfTheStack = onTheBottomOfTheStack;
        }
        else {
            onTheBottomOfTheStack = onTheTopOfTheStack;
            onTheTopOfTheStack = item;
            onTheTopOfTheStack.setPrevious(onTheBottomOfTheStack);
        }
    }

    public Item pop(){
        Item current = onTheTopOfTheStack;

        if (onTheTopOfTheStack == null) {
            System.out.println("Empty queue");
            return null;
        }
        else{
            onTheTopOfTheStack = onTheTopOfTheStack.getPrevious();
            return current;
        }
    }
}
