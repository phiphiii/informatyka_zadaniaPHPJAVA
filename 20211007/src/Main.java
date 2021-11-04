import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*ArrayList<Integer> liczby;
        liczby = new ArrayList<Integer>();
        liczby.add(5);
        liczby.add(120);
        liczby.add(420);
        liczby.add(60);
        liczby.add(123);
        liczby.add(52);
        liczby.add(74);
        liczby.add(54);
        liczby.add(456);
        liczby.add(1);
        for (int x : liczby) {
            System.out.println(x);
        }
        ArrayList<String> imiona;
        imiona = new ArrayList<String>();
        imiona.add("Filip");
        imiona.add("Norbert");
        imiona.add("Dawid");
        imiona.add("Kacper");
        imiona.add("Kinga");
        imiona.add("Mateusz");
        imiona.add("Franek");
        imiona.add("Adam");
        imiona.add("Oliwier");
        imiona.add("Nikodem");
        for (String x : imiona) {
            System.out.println(x);
        }*/
        ArrayList<Uczniowie> data;
        data = new ArrayList<Uczniowie>();
        data.add(new Uczniowie(1,"Filip","Pietrzak",18,"3Pg"));
        data.add(new Uczniowie(2,"Jan","Kowlaski",17,"3P"));
        data.add(new Uczniowie(3,"Paweł","Blok",15,"1K"));
        data.add(new Uczniowie(4,"Ola","Turek",19,"4O"));
        data.add(new Uczniowie(5,"Jarosław","Kaczka",15,"1I"));
        data.add(new Uczniowie(6,"Olek","Chromiński",16,"2T"));
        data.add(new Uczniowie(7,"Norbert","Modzalewski",17,"3Pg"));
        data.add(new Uczniowie(8,"Dawid","Szemis",18,"3Pg"));
        data.add(new Uczniowie(9,"Mateusz","Urbański",17,"3Pg"));
        data.add(new Uczniowie(10,"Franek","Kornacki",18,"3F"));
        data.add(new Uczniowie(11,"Kacper","Kaczmarek",18,"3F"));
        data.add(new Uczniowie(12,"Dawid","Świderski",18,"3Pg"));
        data.add(new Uczniowie(13,"Filip","Firek",16,"3I"));
        data.add(new Uczniowie(14,"Dominik","Goryl",19,"4P"));
        data.add(new Uczniowie(15,"Marta","Reguła",15,"1I"));

        for (Uczniowie x : data) {
            System.out.println(x);
        }
        data.remove(7)


    }
}
