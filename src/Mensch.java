public class Mensch extends Saugetier{


    Mensch(String name, int alter, char geschlecht){
        super(name, alter, geschlecht);
    }

    public String printAll(){
        return (name+"#"+alter+"#"+geschlecht);
    }

    public static void main(String[] args)
    {
        Mensch first = new Mensch("Kadir", 18, 'm');

        System.out.println(first.printAll());
    }

}
