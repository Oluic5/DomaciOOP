package domaci;

public class kamion extends vozilo {

    public kamion() {
    }

    public kamion(String tipVozila, boolean registrovano, int portrosnja, vozac vlasnik) {
        super(tipVozila, registrovano, portrosnja, vlasnik);
    }

    public int potrosnjaGoriva(int portrosnja, int kilometraza){
        return (portrosnja/100)*kilometraza;
    }
}