package br.eti.diegofonseca;

import java.util.ArrayList;
import java.util.LinkedList;
 
public class App {
 
    public static void main(String args[]) {

        ArrayList a = new ArrayList();    
        LinkedList l = new LinkedList();

        // add to ArrayList
        long start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            a.add(i);
        }
        
        System.out.println("Tempo para add em ArrayList:  " + (System.nanoTime() - start) );
         
        // add to LinkedList
        start = System.nanoTime();
 
        for (int i = 0; i < 100000; i++) {
            l.add(i);
        }
        System.out.println("Tempo para add em lista encadeada: " + (System.nanoTime() - start) );        
 
    }
 
}