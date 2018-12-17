package at.ac.fhkufstein.Aufgabe2;

public class Mensch {

    String vorname;
    String nachname;
    int alter;

    Mensch(String vorname, String nachname, int alter){
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
    }

    public void Status()
    {
        System.out.println(vorname + nachname + alter);
    }


}
