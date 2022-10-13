package Array;

public class My2DArray {
    public static void main(String[] args) {
        int [][] array2D;
        array2D = new int[2][3];
        array2D[0][0] = 101;
        array2D[0][1] = 102;
        array2D[0][2] = 103;
        array2D[1][0] = 201;
        array2D[1][1] = 202;
        array2D[1][2] = 203;

        System.out.println("2D Array");
        for (int i = 0; i < array2D.length; i++){
            for (int j = 0; j < array2D[i].length; j++){
                System.out.print(array2D[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
