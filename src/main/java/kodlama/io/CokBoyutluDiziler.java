package kodlama.io;

public class CokBoyutluDiziler {

    public static void cokBoyutluDizi() {
        String[][] array = new String[3][3];
        array[0][0] = "Haciqabul";
        array[0][1] = "Baki";
        array[0][2] = "Sirvan";
        array[1][0] = "Agsu";
        array[1][1] = "Qax";
        array[1][2] = "Lenkeran";
        array[2][0] = "Sheki";
        array[2][1] = "Xankendi";
        array[2][2] = "Qebele";

        for(int i = 0; i<array.length;i++){
            for (int j = 0; j<array.length;j++){
                System.out.println(array[i][j]);
            }
        }
    }
}
