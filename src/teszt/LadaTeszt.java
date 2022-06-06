package teszt;

import java.util.Scanner;
import modell.LadaOsztaly;
import modell.Szinek;

public class LadaTeszt {
    public static void main(String[] args) {
        LadaTeszt lt = new LadaTeszt();
        lt.NalaVanTeszt();
    }
    private void NalaVanTeszt(){
        LadaOsztaly[] Ladak ={new LadaOsztaly(Szinek.ARANY),new LadaOsztaly(Szinek.EZUST),new LadaOsztaly(Szinek.BRONZ)};
        for (LadaOsztaly lada : Ladak) {
            System.out.print(lada.getSzin()+": "+lada.Allitas()+".   ");
        }
        Scanner scn = new Scanner(System.in);
        System.out.println("\nMelyik ládában van a kincs? ");
        String valasz = scn.nextLine();
        int ladaHelye = new LadaTeszt().LadaHely(valasz);
        if(ladaHelye<3){
           String ladatartalma = Ladak[ladaHelye].isKincsnalavan()?"Kincs":"Üres";
           assert ladatartalma.equals("Kincs"):"rossz a teszt";
        }
        else{
            System.out.println("Ilyen láda nincs");
        }
    }
    private int LadaHely(String melyiklada){
        int ladahelye;
        if(melyiklada.toLowerCase().equals("arany")){
            ladahelye = 0;
        }
        else if(melyiklada.toLowerCase().equals("ezust")){
            ladahelye = 1;
        }
        else if(melyiklada.toLowerCase().equals("bronz")){
            ladahelye = 2;
        }
        else{
            ladahelye = 3;
        }
        return ladahelye;
    }
}
