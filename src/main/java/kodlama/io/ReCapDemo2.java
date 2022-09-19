package kodlama.io;

public class ReCapDemo2 {

   public static void reCapDemo2(){
       double[] array = {4.2 , 5.1 , 6.7 , 4.9};
       double total = 0;
       double max = array[0];

       for(int i = 0; i<array.length;i++){
           System.out.println(array[i]);
       }

       for(int i = 0; i<array.length;i++){
           total+=array[i];
       }
       System.out.println(total);

       for(double myList: array){
           if(max<myList){
               max = myList;
           }
       }
       System.out.println(max);
   }
}
