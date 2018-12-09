package drools.rodzina;


import java.util.ArrayList;

public class Osoba {
    public enum Plec {NIEZNANA,MEZCZYZNA,KOBIETA}
    public String imie;
    public Plec plec;
    public ArrayList<Relacja> relacje;

    public Osoba(String imie) {
        this.imie=imie;
        this.plec=Plec.NIEZNANA;
        this.relacje = new ArrayList<>();
    }

    public String toString() {
        return imie;
    }

    public void setPlec(Plec plec){
        this.plec = plec;
    }

    public Plec getPlec(){
        return plec;
    }
}
