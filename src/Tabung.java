public class Tabung {
    
    public double rad, tinggi;

    // using set
    public void setRadius(double rad) {
        this.rad = rad;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    // using multiple constructor
    Tabung() {

    }

    Tabung(double rad, double tinggi) {
        this.rad = rad;
        this.tinggi = tinggi;
    }

    public double ComputeAndSetVolume() {
        double volume = 3.14 * (this.rad * this.rad) * this.tinggi;
        return volume;
    }
}
