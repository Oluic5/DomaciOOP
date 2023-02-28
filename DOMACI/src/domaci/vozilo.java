package domaci;

import domaci.vozac;

public class vozilo {
    private String tipVozila;
    private boolean registrovano;
    private int potrosnja;
    private vozac vlasnik;

    public vozilo() {
    }

    public vozilo(String tipVozila, boolean registrovano, int potrosnja, vozac vlasnik) {
        this.tipVozila = tipVozila;
        this.registrovano = registrovano;
        this.potrosnja = potrosnja;
        this.vlasnik = vlasnik;
    }

    public int potrosnjaGoriva(int potrosnja, int kilometraza){
        return (potrosnja/100)*kilometraza;

    }
    @Override
    public String toString(){
        return "Tip vozila: "+tipVozila+", registrovan: "+registrovano+", Portrosnja: "+potrosnja+ ", Vlasnik: "+vlasnik;
    }

    public String getTipVozila() {
        return tipVozila;
    }

    public void setTipVozila(String tipVozila) {
        this.tipVozila = tipVozila;
    }

    public boolean isRegistrovano() {
        return registrovano;
    }

    public void setRegistrovano(boolean registrovano) {
        this.registrovano = registrovano;
    }

    public int getPotrosnja() {
        return potrosnja;
    }

    public void setPotrosnja(int potrosnja) {
        this.potrosnja = potrosnja;
    }

    public vozac getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(vozac vlasnik) {
        this.vlasnik = vlasnik;
    }
}