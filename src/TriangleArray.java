public class TriangleArray {
    public static void main(String[] args) {
        int HEIGHT = 5;
        int[][] triangleArray = new int[HEIGHT][];

        for (int i = 0; i < HEIGHT; i++) {
            triangleArray[i] = new int[HEIGHT-i];
            for (int j = 0; j < HEIGHT-i; j++) {
                triangleArray[i][j] = i + j + 1;
                System.out.print(triangleArray[i][j]);
            }
            System.out.println();
        }
    }
}
