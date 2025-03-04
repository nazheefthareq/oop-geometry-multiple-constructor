public class LimasPersegi {
    
    public double sisi, tinggi;

    // using set
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    // using multiple constructor
    LimasPersegi(){

    }

    LimasPersegi(double sisi, double tinggi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    public double ComputeAndSetVolume() {
        double volume = 1/3 * (this.sisi * this.sisi) * this.tinggi; 
        return volume;
    }
}
