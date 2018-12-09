package drools.rodzina;

public class Relacja {

    public Osoba[] osoby=new Osoba[2];
    public String relacja;

    public Relacja(Osoba o1, Osoba o2, String relacja) {
        this.osoby[0]=o1;
        this.osoby[1]=o2;
        this.relacja=relacja;
        o1.relacje.add(this);
        o2.relacje.add(this);
    }


    public Osoba getO1(){
        return osoby[0];
    }

    public Osoba getO2(){
        return osoby[1];
    }
}