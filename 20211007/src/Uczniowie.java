public class Uczniowie {
    public int id;
    public String imie;
    public String nazwisko;
    public int wiek;
    public String klasa;

    public Uczniowie(int id,String imie, String nazwisko, int wiek, String klasa) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.klasa = klasa;
    }
    @Override
    public String toString(){
        return String.format(id+". "+imie+" "+nazwisko+" "+klasa+" (Wiek: "+wiek+")");
    }
}
