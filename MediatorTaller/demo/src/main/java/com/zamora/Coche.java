package com.zamora;

public class Coche extends Componente {
    public Coche(Mediador mediador){
        super(mediador);
    }

    public void enciende(){
        mediador.notificar(this, "enciende");
    }

    public void apaga(){
        mediador.notificar(this, "apagar");
    }
}
