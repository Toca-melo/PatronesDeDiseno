package com.zamora;

public class Telefono extends Componente{

    private boolean musicaOn = false;
    
    public Telefono(Mediador mediador){
        super(mediador);
    }

    public void recibeLlamada(){
        mediador.notificar(this,"recibirLlamada");    
    }

    public void enciendeMusica(){
        musicaOn = true;
    }

    public void apagaMusica(){
        musicaOn = false;
    }

    public boolean musicaEncendida(){
        return musicaOn;
    }
}
