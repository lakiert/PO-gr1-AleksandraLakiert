package com.company;


import java.util.Iterator;
import java.util.PriorityQueue;

class Task implements Comparable<Task> {

    int id;
    String name;

    public Task(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Task t) {
        if(id < t.id)
            return -1;
        else if (id > t.id)
            return 1;
        return 0;
    }

    public String toString(){
        return id + ". " + name;
    }


}



public class Main {

    public static void main(String[] args) {

        PriorityQueue<Task> my_tasks = new PriorityQueue<>();

        my_tasks.add(new Task(1, "walk the dog"));
        my_tasks.add(new Task(2, "homework"));
        my_tasks.add(new Task(5, "do the dishes"));
        my_tasks.add(new Task(3, "make groceries"));
        my_tasks.add(new Task(2, "have fun?"));

        System.out.println(my_tasks.size());

        Iterator<Task> it = my_tasks.iterator();
        while(it.hasNext()){
            System.out.println("doing the chores: " + my_tasks.poll().toString());

        }


    }
}
