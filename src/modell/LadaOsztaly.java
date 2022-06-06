package modell;
public class LadaOsztaly {
    public final String ARANY_ALLITAS = "Én rejtem a kincset";
    public final String EZUST_ALLITAS = "Nem én rejtem a kincset";
    public final String BRONZ_ALLITAS = "Az arany hazudik";
    private Szinek szin;

    public LadaOsztaly(Szinek szin) {
        this.szin = szin;
    }

    public boolean isKincsnalavan() {
        return szin== Szinek.EZUST;
    }

    public String Allitas() {
        switch(szin){      
            case ARANY:
                return ARANY_ALLITAS;
            case EZUST:
                return EZUST_ALLITAS;
            case BRONZ:
                return BRONZ_ALLITAS;
            default:
                return "Ilyen nincs";
        }
    }

    public Szinek getSzin() {
        return szin;
    }
    
}
