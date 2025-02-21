package io.loop.Practice;

public class RandomTasks {

    /*
    create a method will accept string of main method
     */

    public static String getFirstThree(String str){
        return str.substring(0,3);
    }

    public static void main(String[] args) {
        System.out.println(getFirstThree("Nadir"));
    }
}
