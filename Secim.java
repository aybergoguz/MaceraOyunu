public class Secim{

    public static void karakterSecimi(Karakter[] karakterler){

        
        for(int i =0; i < karakterler.length; i++){

            System.out.println("\t\t"+(i+1)+" -) "+karakterler[i].getName());
            
        }
    }

    public static void mekanSecimi(Mekanlar [] names){

        for(int i =0; i < names.length; i++){

            System.out.println("\t\t"+(i+1)+" -) "+names[i].getName());
        }
    }
}