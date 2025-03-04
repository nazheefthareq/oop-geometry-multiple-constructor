public class Kubus {

    public double sisi, volume;

    // using set value
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // using multiple constructor
    Kubus() {

    }

    Kubus(double sisi) {
        this.sisi = sisi;
    }

    public double ComputeAndSetVolume() {
        double volume = this.sisi * this.sisi * this.sisi;
        return volume;
    }
}
