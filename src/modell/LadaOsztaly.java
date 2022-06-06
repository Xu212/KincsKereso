package modell;
public class LadaOsztaly {
    public static final String ARANY_ALLITAS = "Én rejtem a kincset";
    public static final String EZUST_ALLITAS = "Nem én rejtem a kincset";
    public static final String BRONZ_ALLITAS = "Az arany hazudik";
    private Szinek szin;
    private String allitas;
    private boolean kincsnalavan;

    public LadaOsztaly(Szinek szin, String allitas, boolean kincsnalaban) {
        this.szin = szin;
        this.allitas = allitas;
        this.kincsnalavan = kincsnalaban;
    }

    public LadaOsztaly(Szinek szin, String allitas) {
        this(szin, allitas, false);
    }

    public boolean isKincsnalavan() {
        return kincsnalavan;
    }

    public String getAllitas() {
        return allitas;
    }

    public Szinek getSzin() {
        return szin;
    }
    public String KincsnalavanSzoveg(){
        String valasz ="Üres";
        if(isKincsnalavan()){
            valasz = "Kincs";
        }
        return valasz;
    }
    
}
