package com.zamora;

import java.util.List;

public class LoggerDecorator implements BaseDatos {

    private BaseDatos baseDatos;
    private Logger logger;

    public LoggerDecorator(BaseDatos baseDatos, Logger logger) {
        this.baseDatos = baseDatos;
        this.logger = logger;
    }

    public Logger getLogger() {
        return logger;
    }


    public void setLogger(Logger logger) {
        this.logger = logger;
    }


    public BaseDatos getBaseDatos() {
        return baseDatos;
    }

    public void setBaseDatos(BaseDatos baseDatos) {
        this.baseDatos = baseDatos;
    }

    @Override
    public void inserta(String registro){
        logger.add("inserta " + registro);
        baseDatos.inserta(registro);
    }

    @Override
    public List<String> registros(){
        logger.add("lectura");
        return baseDatos.registros();
    }
}
