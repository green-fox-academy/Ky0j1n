package com.greenfox.comparable;

public class Thing implements Comparable<Thing> {
    private String name;
    private boolean completed;

    public Thing(String name) {
        this.name = name;
    }

    public void complete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + name;
    }


    @Override
    public int compareTo(Thing o) {
        if(completed == true) {
            return 0; }else{
            return -1;
        }
    }
}
