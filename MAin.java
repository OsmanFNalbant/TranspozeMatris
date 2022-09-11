public class MAin {
    public static void main(String[] args) {
        int matris[][] = {{1,2}, {7,8},{9,6}};
        int tmatris[][] = new int[2][3];
        System.out.println("Matris : ");
        for (int i=0; i<3; i++) {
            for (int j=0; j<2; j++) {
                System.out.print(matris[i][j]+"   ");
            }
            System.out.print("\n");
        }
        for (int i=0; i<3; i++) {
            for (int j=0; j<2; j++)
            {
                tmatris[j][i]=matris[i][j];
            }
        }
        System.out.println("Transpoze : ");
        for (int i=0; i<2; i++) {
            for (int j=0; j<3; j++)
            {
                System.out.print(tmatris[i][j]+"   ");
            }
            System.out.print("\n");
        }
    }
}