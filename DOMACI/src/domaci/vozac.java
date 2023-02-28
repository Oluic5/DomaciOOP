package domaci;

public class vozac {
    private String imeIprezime;
    private String jmbg;
    private String tipDozvole;

    public vozac() {
    }

    public vozac(String imeIprezime, String jmbg, String tipDozvole) {
        this.imeIprezime = imeIprezime;
        this.jmbg = jmbg;
        this.tipDozvole = tipDozvole;
    }

    @Override
    public String toString(){
        return "Ime i Prezime: "+imeIprezime+", JMBG: "+jmbg+", Tip dozvole: "+tipDozvole;
    }

    public String getImeIprezime() {
        return imeIprezime;
    }

    public void setImeIprezime(String imeIprezime) {
        this.imeIprezime = imeIprezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getTipDozvole() {
        return tipDozvole;
    }

    public void setTipDozvole(String tipDozvole) {
        this.tipDozvole = tipDozvole;
    }
}
