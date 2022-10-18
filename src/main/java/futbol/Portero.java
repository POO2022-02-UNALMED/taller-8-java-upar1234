package futbol;
public class Portero extends Futbolista{
    public short golesRecibidos;
    public byte dorsal;
    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre,edad,"Portero");
        this.dorsal=dorsal;
        this.golesRecibidos=golesRecibidos;}

    public String toString() {
        return "El futbolista "+getNombre()+" tiene "+getEdad()+ ", y juega de "+getPosicion()+" con el dorsal "+this.dorsal+ ". Le han marcado "+this.golesRecibidos;}
    public boolean jugarConLasManos() {
        return true;}

    public int compareTo(Object futbol) {
        Portero port=(Portero)futbol;
        return port.golesRecibidos-this.golesRecibidos;}}