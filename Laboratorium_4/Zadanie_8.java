abstract class Maszyna {
    protected String marka;
    protected String nazwa;
    protected double pojemnoscSilnika;
    enum rodzajSilnika{
        ELEKTRYCZNY,
        SPALINOWY,
        HYBRYDOWY,
        ATOMOWY
    }
}
class Kosiarka extends Maszyna {
    private boolean czyMelekser;
    private boolean czyNaped;
    private int liczbaOstrzy;

    public Kosiarka(boolean czyMelekser, boolean czyNaped, int liczbaOstrzy) {
        this.czyMelekser = czyMelekser;
        this.czyNaped = czyNaped;
        this.liczbaOstrzy = liczbaOstrzy;
    }

    public boolean isCzyMelekser() {
        return czyMelekser;
    }

    public void setCzyMelekser(boolean czyMelekser) {
        this.czyMelekser = czyMelekser;
    }

    public boolean isCzyNaped() {
        return czyNaped;
    }

    public void setCzyNaped(boolean czyNaped) {
        this.czyNaped = czyNaped;
    }

    public int getLiczbaOstrzy() {
        return liczbaOstrzy;
    }

    public void setLiczbaOstrzy(int liczbaOstrzy) {
        this.liczbaOstrzy = liczbaOstrzy;
    }

    public String wyswietl() {
        return "Kosiarka{" +
                "czyMelekser=" + czyMelekser +
                ", czyNaped=" + czyNaped +
                ", liczbaOstrzy=" + liczbaOstrzy +
                ", marka='" + marka + '\'' +
                ", nazwa='" + nazwa + '\'' +
                ", pojemnoscSilnika=" + pojemnoscSilnika +
                ", rodzajSilnika=" + rodzajSilnika.SPALINOWY +
                '}';
    }
}
