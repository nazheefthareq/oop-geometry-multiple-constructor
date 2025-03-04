public class MainBangunRuang {
    public static void main(String[] args){
        System.out.println("========================== KUBUS ============================");
        Kubus cube1 = new Kubus();
        cube1.setSisi(2.5);
        cube1.ComputeAndSetVolume();
        System.out.println("Volume kubus 1 adalah:"+ cube1.ComputeAndSetVolume());
        System.out.println("=============================================================");
        Kubus cube2 = new Kubus(2.5);
        cube2.ComputeAndSetVolume();
        System.out.println("Volume kubus 2 adalah"+ cube2.ComputeAndSetVolume());
    }
}
