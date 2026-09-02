public class ObjSuper {
    private String Nombre;
    private double Precio;
    private int CantDisp;
    private String Estado;

    public ObjSuper(String nombre, double precio, int cantDisp, String estado) {
        Nombre = nombre;
        Precio = precio;
        CantDisp = cantDisp;
        Estado = estado;

    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public double getPrecio() {
        return Precio;
    }
    public void setPrecio(double precio) {
        Precio = precio;
    }
    public int getCantDisp() {
        return CantDisp;
    }
    public void setCantDisp(int cantDisp) {
        CantDisp = cantDisp;
    }
    public String getEstado() {
        return Estado;
    }
    public void setEstado(String estado) {
        Estado = estado;
    }
    
}
