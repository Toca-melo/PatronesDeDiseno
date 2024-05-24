package com.zamora;

public class MediadorImpl implements Mediador{
    private Telefono telefono;
    private Radio radio;
    private Coche coche;

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    @Override
    public void notificar(Componente remitente, String evento) {
        if(remitente == coche && evento=="enciende"){
            radio.enciende();
            telefono.apagaMusica();
        }

        if(remitente == coche && evento=="apagar"){
            radio.apaga();
        }

        if(remitente == telefono && evento=="recibirLlamada"){
            radio.apaga();
        }

        if(remitente == radio && evento=="encender"){
            telefono.apagaMusica();
        }
    }

}
