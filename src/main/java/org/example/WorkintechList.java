package org.example;

import java.util.ArrayList;
import java.util.Collections;


public class WorkintechList extends ArrayList{

    @Override
    public boolean add(Object item) {
        if (!this.contains(item)) {
            return super.add(item);
        }
        return false;
    }

    public void sort() {
        Collections.sort(this);
    }

    @Override
    public boolean remove(Object item) {
        boolean removed = super.remove(item);
        if (removed) {
            sort();
        }
        return removed;
    }



}




