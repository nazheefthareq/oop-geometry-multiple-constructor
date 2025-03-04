public class MainBangunRuang {
    public static void main(String[] args){
        System.out.println("========================== KUBUS ============================");
        Kubus cube1 = new Kubus();
        cube1.setSisi(2.5);
        cube1.ComputeAndSetVolume();
        System.out.println("Volume kubus 1 adalah:"+ cube1.ComputeAndSetVolume());
        System.out.println("-------------------------------------------------------------");
        Kubus cube2 = new Kubus(2.5);
        cube2.ComputeAndSetVolume();
        System.out.println("Volume kubus 2 (constructor) adalah:"+ cube2.ComputeAndSetVolume());

        System.out.println("========================== BALOK ============================");
        Balok block1 = new Balok();
        block1.setPanjang(4);
        block1.setLebar(2.5);
        block1.setTinggi(3);
        block1.ComputeAndSetVolume();
        System.out.println("Volume balok 1 adalah:"+ block1.ComputeAndSetVolume());
        System.out.println("-------------------------------------------------------------");
        Balok block2 = new Balok(4,2.5,3);
        block2.ComputeAndSetVolume();
        System.out.println("Volume balok 2 (constructor) adalah:"+ block2.ComputeAndSetVolume());
    }
}
