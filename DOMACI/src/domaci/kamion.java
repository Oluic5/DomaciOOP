package domaci;

public class kamion extends vozilo {

    public kamion() {
    }

    public kamion(String tipVozila, boolean registrovano, int potrosnja, vozac vlasnik) {
        super(tipVozila, registrovano, potrosnja, vlasnik);
    }

    public int potrosnjaGoriva(int potrosnja, int kilometraza){
        return (potrosnja/100)*kilometraza;
    }
}