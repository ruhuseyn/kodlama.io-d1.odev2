package kodlama.io;

public class SayiBulma {

    public static void sayiBulma(){

        int[] array = new int[]{1,5,8,6,3,7};
        int axtarilan = 10;
        boolean senceVarmi = true;

        for(int i=0;i<array.length;i++){
            if(array[i] == axtarilan){
                senceVarmi = false;
            }
        }
        if(senceVarmi){
            System.out.println("Unfortunately there is not suitable element :/");
        }
        else{
            System.out.println("YEEP, available there is");
        }
    }
}
