package programacione1f;
public class Factura {
    
    public String descripcionPieza;
    public String numeroPieza;
    public int cantidadArticulos;
    public double precioArticulo;

    public Factura(String descripcionPieza, String numeroPieza, int cantidadArticulos, double precioArticulo) {
        this.descripcionPieza = descripcionPieza;
        this.numeroPieza = numeroPieza;
        this.cantidadArticulos = cantidadArticulos;
        this.precioArticulo = precioArticulo;
    }

   

    public Factura(int cant, double pre) {
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public int getCantidadArticulos() {
        return cantidadArticulos;
    }

    public void setCantidadArticulos(int cantidadArticulos) {
        this.cantidadArticulos = cantidadArticulos;
    }

    public double getPrecioArticulo() {
        return precioArticulo;
    }

    public void setPrecioArticulo(double precioArticulo) {
        this.precioArticulo = precioArticulo;
    }
    
    
    public double obtener(){
    double monto=0;
    monto = cantidadArticulos*precioArticulo;
    return monto;
 
    }
    
    
}
