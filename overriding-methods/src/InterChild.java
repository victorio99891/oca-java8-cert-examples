package main.inter;

public interface InterChild extends InterParent {


    default void print(){
        InterParent.super.print();
        System.out.println("Print from ChildInterface!");
    }



}