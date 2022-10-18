package futbol;

public class Jugador extends Futbolista {

    public short golesMarcados;
    public byte dorsal;

    public Jugador(String n, int e, String p, short golesMarcados, byte dorsal) {
        super(n, e, p);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    public Jugador() {
        super();
        this.golesMarcados = 287;
        this.dorsal = 7;
    }

    public byte getDorsal() {
        return dorsal;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }

    public short getGolesMarcados() {
        return golesMarcados;
    }

    public void setGolesMarcados(short golesMarcados) {
        this.golesMarcados = golesMarcados;
    }


    @Override
    public String toString() {
        return ("El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion() + " con el dorsal " + dorsal + ". Ha marcado " + golesMarcados);
    }

    public int compareTo(Object futbol) {
        Jugador juga = (Jugador) futbol;
        return this.getEdad() - juga.getEdad();
    }

    public boolean jugarConLasManos() {
        return false;
    }

}
