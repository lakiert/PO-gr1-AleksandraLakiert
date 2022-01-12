package com.company;
import java.util.Map.Entry;
import java.util.*;


class Students{

    HashMap<String, String> Students = new HashMap<String, String>();

    public void put(String key, String value){
        Students.put(key, value);
    }

    public void remove(String key){
        Students.remove(key);
    }

    public void changeGrade(String key, String value){
        Students.replace(key, value);
    }

    public String toString(){
        TreeMap<String, String> sorted = new TreeMap<>(Students);
        Set<Entry<String, String>> mappings = sorted.entrySet();

        StringBuilder result = new StringBuilder();

        for(Entry<String, String> mapping : mappings){
            result.append(mapping.getKey()).append(" : ").append(mapping.getValue()).append("\n");
        }

        return result.toString();
    }

}

public class Main {

    public static void main(String[] args) {

        Students students = new Students();

        students.put("Carl", "db+");
        students.put("Joe", "db");
        students.put("Susan", "bdb");
        System.out.println(students);

        students.put("Amy", "db");
        students.put("Jimmy", "bdb");
        System.out.println(students);

        students.remove("Joe");
        students.remove("Jimmy");
        System.out.println(students);

        students.changeGrade("Amy", "bdb");
        students.changeGrade("Carl", "bdb");
        students.changeGrade("Susan", "bdb");
        System.out.println(students);




    }
}