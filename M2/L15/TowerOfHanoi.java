package M2.L15;

public class TowerOfHanoi {

    private static void towerOfHanoi(int disks, String s, String h, String d) {
        if (disks == 0) {
            return;
        }
        towerOfHanoi(disks - 1, s, d, h);
        System.out.println(disks + "th is shifted from " + s + " to " + d);
        towerOfHanoi(disks - 1, h, s, d);
    }

    public static void main(String[] args) {
        int disks = 3;
        towerOfHanoi(disks, "Source", "Auxiliary", "Destination");
    }
}
