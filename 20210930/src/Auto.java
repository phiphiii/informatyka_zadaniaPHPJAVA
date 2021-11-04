public class Auto {
    public int rocznik;
    public String marka;
    public String model;

    public Auto(int rocznik, String marka, String model){
        this.rocznik = rocznik;
        this.marka = marka;
        this.model = model;
    }
    public void wyswietl(){
        System.out.println("Marka: "+marka+"\nModel: "+model+"\nRocznik: "+rocznik);
    }
}
