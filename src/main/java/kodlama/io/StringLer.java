package kodlama.io;

public class StringLer {

    public static void string(){

        java.lang.String mesaj = "Hava buludludur";

        System.out.println("ELEMENT SAYI :"+mesaj.length());
        System.out.println(mesaj.charAt(4));
        System.out.println(mesaj.concat(" Bugun getme !"));
        System.out.println(mesaj.startsWith("H"));
        System.out.println(mesaj.endsWith("r"));
        System.out.println(mesaj.replace(" ","-"));
        System.out.println(mesaj.substring(4));
        System.out.println(mesaj.split(" "));
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());


    }
}
