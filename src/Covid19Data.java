public class Covid19Data {
    private String region;
    private String aldersgruppe;
    private String bekræftedeTilfældeIAlt;
    private String døde;
    private String indlagtePåIntensivAfdeling;
    private String indlagte;
    private String dato;

    public Covid19Data(String region, String aldersgruppe, String bekræft,
                       String døde, String indlagteIA, String indlagte, String dato) {
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.bekræftedeTilfældeIAlt = bekræft;
        this.døde = døde;
        this.indlagtePåIntensivAfdeling = indlagteIA;
        this.indlagte = indlagte;
        this.dato = dato;
    }

    public String getRegion() {
        return this.region;
    }

    public String getAldersgruppe() {
        return this.aldersgruppe;
    }

    @Override
    public String toString() {
        return "REGION: " + this.region + " ALDERSGRUPPE: " + this.aldersgruppe + " BEKRÆFTEDETILFÆDEIALT: " + this.bekræftedeTilfældeIAlt +
                " DØDE: " + this.døde + " INDLAGTE PÅ INSTENSIV AFEDELING: " + this.indlagtePåIntensivAfdeling + this.indlagte + " DATO: " + this.dato;

    }
}
