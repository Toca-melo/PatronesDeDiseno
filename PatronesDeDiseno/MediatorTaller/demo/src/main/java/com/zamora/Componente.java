package com.zamora;

public class Componente {
    protected Mediador mediador;

    public Componente(Mediador mediador){
        this.mediador = mediador;
    }

    public Mediador getMediador(){
        return mediador;
    }

    public void setMediador(Mediador mediador){
        this.mediador = mediador;
    }
}
