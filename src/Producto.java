public class Producto {
    
    private String nombre;
    private Proveedor proveedor;
    private  int cantidad;
    private double precio;
                
            
    public Producto(){
        
    }
    public Producto(String nombre, Proveedor proveedor, int cantidad, double precio ){
        this.cantidad=cantidad;
        this.nombre=nombre;
        this.proveedor=proveedor;
        this.precio=precio;
        
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setProveedor(Proveedor proveedor){
        this.proveedor=proveedor;
    }
    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public Proveedor getProveedor(){
        return proveedor;
    }
    public int getCantidad(){
        return this.cantidad;
    }
    public double getPrecio(){
        return this.precio;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
