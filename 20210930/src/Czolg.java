public class Czolg {
    public String kraj;
    public int zaloga;
    public enum rodzaj{
        LEKKI,
        ŚREDNI,
        CIĘŻKI,
    }
    public String nazwa;
    public int rocznik;
    public Czolg(String nazwa,rodzaj,int rocznik,String kraj, int zaloga){
        this.nazwa = nazwa;
        this.rodzaj = rodzaj;
        this.rocznik = rocznik;
        this.kraj = kraj;
        this.zaloga = zaloga;

    }
}
