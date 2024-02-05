package banco;

import java.util.HashSet;
import java.util.Set;

public class Cliente {

    private  int nCli;

    private String nombre;

    private Set<CuentaCorriente> cuentaCorrientes;

    public Set<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Set<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    private Set<Prestamo> prestamos;

    public int getnCli() {
        return nCli;
    }

    public void setnCli(int nCli) {
        this.nCli = nCli;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente(int nCli, String nombre) {
        this.nCli = nCli;
        this.nombre = nombre;
        this.prestamos = new HashSet<>();
    }

    public void addPrestamo (Prestamo prestamo) {
        this.prestamos.add(prestamo);
    }

    public void addCuentaCorriente (CuentaCorriente CC) {
        this.cuentaCorrientes.add(CC);
    }



}
