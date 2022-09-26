package main;

import LinkedListClasses.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.append(55);
        ll.append(40);
        ll.append(30);
        ll.prepend(20);
        ll.insert(1, 50);
        ll.insert(2, 45);
        ll.getFirst();
        ll.getLast();
        int primeiroNumero = ll.removeFirst();
        int ultimoNumero = ll.removeLast();
        System.out.println(primeiroNumero);
        System.out.println(ultimoNumero);
        System.out.println(ll);
    }
}