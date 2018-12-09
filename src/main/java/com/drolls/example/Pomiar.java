package com.drolls.example;

public class Pomiar {
    private Boolean dym;
    private double temperatura;

    public Pomiar(double temp, Boolean dym){
        this.temperatura = temp;
        this.dym = dym;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }



    public Boolean getDym() {
        return dym;
    }

    public void setDym(Boolean dym) {
        this.dym = dym;
    }


}
