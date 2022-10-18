package futbol;
public abstract class Futbolista {
    private String nombre;
    private int edad;
    private final String posicion;


    protected Futbolista(String n, int e, String p) {
        this.nombre = n;
        this.edad = e;
        this.posicion = p;
    }

    protected Futbolista() {
        this("Maradona", 30, "delantero");
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }


    @Override
    public String toString() {
        return ("El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion());
    }

    public boolean equals(Futbolista f){
        if (this == f){
            return true;
        }
        return false;
    }
    public abstract boolean jugarConLasManos(Futbolista f);



}