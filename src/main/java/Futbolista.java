public abstract class Futbolista {
    private String nombre;
    private int edad;
    private final String posicion;



    protected Futbolista(String n, int e, String p) {
        this.nombre = n;
        this.edad=e;
        this.posicion=p;
    }
    protected Futbolista(){
    this("Maradona", 30, "delantero");
    }
    
    @Override
    public boolean equals(Futbolista f) {
        return super.equals(obj);
    }
}