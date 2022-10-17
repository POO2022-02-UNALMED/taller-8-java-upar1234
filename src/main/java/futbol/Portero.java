package futbol;
public class Portero extends Futbolista{
    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad, String posicion, short golesRecibidos, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesRecibidos=golesRecibidos;
        this.dorsal=dorsal;
    }

    @Override
    public String toString(){
        return("El futbolista "+getNombre()+" tiene "+getEdad()+ ", y juega de "+getPosicion()+" con el dorsal "+dorsal+ ". Le han marcado"+golesRecibidos);
    }

    public boolean jugarConLasManos(Futbolista f){
        if (f.getPosicion()=="Portero"){
            return true;
        }
        return false;
    }
}
