package banco;

import java.util.Set;

public class Prestamo {

    private int nPrestamo;
    private int cantidad;
    private Sucursal sucursal;
    
    private Cliente cliente;


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    //una sucursal tiene muchos prestamos
    private Set<Prestamo> prestamos;

    public Prestamo(int nPrestamo, int cantidad, Sucursal sucursal, Cliente cliente) {
        this.nPrestamo = nPrestamo;
        this.cantidad = cantidad;
        this.sucursal = sucursal;
        this.prestamos = getPrestamos();
        this.cliente = getCliente();
    }

    public int getnPrestamo() {
        return nPrestamo;
    }

    public void setnPrestamo(int nPrestamo) {
        this.nPrestamo = nPrestamo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Set<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Set<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public void addPrestamo (Prestamo prestamo) {
        this.prestamos.add(prestamo);
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "nPrestamo=" + nPrestamo +
                ", cantidad=" + cantidad +
                ", sucursal=" + sucursal +
                ", cliente=" + cliente +
                '}';
    }
}
