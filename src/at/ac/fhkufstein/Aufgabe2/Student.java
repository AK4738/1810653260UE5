package at.ac.fhkufstein.Aufgabe2;

public class Student extends Mensch{

    String pkz;
    String studiengang;

    Student(String vorname, String nachname, int alter, String pkz, String studiengang){
        super(vorname,nachname, alter);
        this.pkz=pkz;
        this.studiengang=studiengang;
    }

    public void Status()
    {
        System.out.println(vorname + nachname + alter + pkz + studiengang);
    }

    public static void main(String[] args)
    {
        Mensch first = new Mensch("Kadir", "Akdogan",18);
        first.Status();
        first = new Student("Kadir", "Akdgoan",18, "181065326", "WEB");
        first.Status();
    }

}
