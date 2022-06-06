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
        LadaOsztaly[] Ladak ={new LadaOsztaly(Szinek.ARANY, LadaOsztaly.ARANY_ALLITAS),new LadaOsztaly(Szinek.EZUST, LadaOsztaly.EZUST_ALLITAS,true),new LadaOsztaly(Szinek.BRONZ, LadaOsztaly.BRONZ_ALLITAS)};
        for (LadaOsztaly lada : Ladak) {
            System.out.print(lada.getSzin()+": "+lada.getAllitas()+".   ");
        }
        Scanner scn = new Scanner(System.in);
        System.out.println("\nMelyik ládában van a kincs? ");
        String valasz = scn.nextLine();
        int ladaHelye = new LadaTeszt().LadaHely(valasz);
        if(ladaHelye<3){
           String ladatartalma = Ladak[ladaHelye].KincsnalavanSzoveg();
           assert ladatartalma.equals("Kincs"):"Nem abban a ládában van a kincs";
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
