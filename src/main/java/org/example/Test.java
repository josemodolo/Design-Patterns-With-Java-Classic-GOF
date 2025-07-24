package org.example;

import org.example.one.digitalinnovation.gof.facade.Facade;
import org.example.one.digitalinnovation.gof.singleton.SingletonEager;
import org.example.one.digitalinnovation.gof.singleton.SingletonLazy;
import org.example.one.digitalinnovation.gof.singleton.SingletonLazyHolder;

public class Test {
    public static void main (String[] args){
       Facade facade = new Facade();
       facade.migrarCliente("Jose", "12345678");

    }
}