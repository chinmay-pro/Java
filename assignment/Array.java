package assignment;

public class Array {
    public static void main(String[] args) {
        // 1D
        System.out.println("1D Array");
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\n");
        // 2D
        System.out.println("2D Array");
        int [][] dimension = {{1,2,3,4,5},{6,7,8,9,10}};
        for (int j=0;j<dimension.length;j++) {
            for (int k=0;k<dimension[j].length;k++) {
                System.out.print(dimension[j][k] + "\t");
            }
        }
    }
}
