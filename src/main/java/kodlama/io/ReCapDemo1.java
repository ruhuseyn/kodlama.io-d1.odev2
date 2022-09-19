package kodlama.io;

public class ReCapDemo1 {

    public static void reCapDemo1(){

        int a = 5;
        int b = 10;
        int c = 7;

        int max = a;

        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }

        //-----------------------------------

        System.out.println("En buyuk deger : "+max);
    }
}
