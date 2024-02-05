package banco;

import java.util.Set;

public class Banco {

    private String nombre;

    public Banco(String nombre, int n_ent, Set<Sucursal> sucursales, Set<Prestamo> prestamos) {
        this.nombre = nombre;
        this.n_ent = n_ent;
        this.sucursales = sucursales;
        this.prestamos = prestamos;
    }

    private int n_ent;
    private Set<Sucursal> sucursales;

    public Set<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Set<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    private Set<Prestamo> prestamos;



    public Set<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(Set<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getN_ent() {
        return n_ent;
    }

    public void setN_ent(int n_ent) {
        this.n_ent = n_ent;
    }

    public void addSucursal (Sucursal sucursal) {
        this.sucursales.add(sucursal);
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nombre='" + nombre + '\'' +
                ", n_ent=" + n_ent +
                '}';
    }
}
