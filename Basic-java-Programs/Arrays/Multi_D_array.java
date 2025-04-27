package Arrays;
public class Multi_D_array {
    public static void main(String[] args) {
        // array of array
        int [][] flats;
        
        flats = new int[2][3]; // 0 1 flats and every flat have 0,1,2 rooms
        flats[0][0] = 100;
        flats[0][1] = 101;
        flats[0][2] = 102;
        flats[1][0] = 110;
        flats[1][1] = 111;
        flats[1][2] = 112;

        // it can be better visualize through matrix

        for(int i =  0;i < flats.length;i++){
            for (int j = 0; j < flats[i].length; j++) {
                System.out.printf("%d ",flats[i][j]);
            }
            System.out.print("\n");
        }
        // in this 1st (0)row represent 1st flat
        // in this 2st (1)row represent 2st flat
    }
}
