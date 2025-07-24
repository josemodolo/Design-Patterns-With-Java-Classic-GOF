package org.example.one.digitalinnovation.gof.strategy;

import org.example.one.digitalinnovation.gof.singleton.SingletonEager;
import org.example.one.digitalinnovation.gof.singleton.SingletonLazy;
import org.example.one.digitalinnovation.gof.singleton.SingletonLazyHolder;

public class Test {
    public static void main (String[] args){
        //Tests related to the Strategy Design Pattern:

        // Strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

    }
}