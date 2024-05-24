package com.zamora;

public class Radio extends Componente{

    private boolean encendida = false;

    public Radio(Mediador mediador){
        super(mediador);
    }

    public void enciende() {
        encendida = true;
        mediador.notificar(this, "encender");
    }

    public void apaga() {
        encendida = false;
    }
    
    public boolean encendida(){
        return encendida;
    }
}
