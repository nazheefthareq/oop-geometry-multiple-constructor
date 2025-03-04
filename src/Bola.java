public class Bola {
    
    public double rad;

    // using set
    public void setRadius(double rad) {
        this.rad = rad;
    }

    // using multiple constructor
    Bola() {

    }

    Bola(double rad) {
        this.rad = rad;
    }

    public double ComputeAndSetVolume() {
        double volume = 4/3 * 3.14 * this.rad * this.rad * this.rad;
        return volume;
    }
}
