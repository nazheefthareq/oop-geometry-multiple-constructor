public class Balok {

    public double panjang, lebar, tinggi;

    // using set
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    // using multiple constructor
    Balok() {

    }

    Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double ComputeAndSetVolume() {
        double volume = this.panjang * this.lebar * this.tinggi;
        return volume;
    }
}
