package M2.Recursion_Assignment;

public class GeometricSum {

    private static double findGeometricSum(int k) {
        if (k == 0) {
            return 1;
        }
        return (findGeometricSum(k - 1) + 1 / Math.pow(2, k));
    }

    public static void main(String[] args) {
        int k = 4;
        //      1 + 1/2 + 1/4 + 1/8 ..... + 1/2^k
        System.out.println("The Geometric Sum is :" + findGeometricSum(k));
    }
}
