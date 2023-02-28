package domaci;

import domaci.vozac;

public class vozilo {
    private String tipVozila;
    private boolean registrovano;
    private int portrosnja;
    private vozac vlasnik;

    public vozilo() {
    }

    public vozilo(String tipVozila, boolean registrovano, int portrosnja, vozac vlasnik) {
        this.tipVozila = tipVozila;
        this.registrovano = registrovano;
        this.portrosnja = portrosnja;
        this.vlasnik = vlasnik;
    }

    public int potrosnjaGoriva(int portrosnja, int kilometraza){
        return (portrosnja/100)*kilometraza;

    }
    @Override
    public String toString(){
        return "Tip vozila: "+tipVozila+", registrovan: "+registrovano+", Portrosnja: "+portrosnja+ ", Vlasnik: "+vlasnik;
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

    public int getPortrosnja() {
        return portrosnja;
    }

    public void setPortrosnja(int portrosnja) {
        this.portrosnja = portrosnja;
    }

    public vozac getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(vozac vlasnik) {
        this.vlasnik = vlasnik;
    }
}