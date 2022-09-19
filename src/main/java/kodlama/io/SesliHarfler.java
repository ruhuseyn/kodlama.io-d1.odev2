package kodlama.io;

public class SesliHarfler {

    public static void sesliHarfler(){

        char c = 'E';
        switch (c) {
            case 'A':
            case 'I':
            case 'U':
            case 'O':
                System.out.println("Qalin saitlerdir");
                break;
            default:
                System.out.println("Ince saitlerdir");
        }
    }
}
