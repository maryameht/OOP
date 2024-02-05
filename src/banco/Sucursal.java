package banco;

import java.util.Set;

public class Sucursal {
    private int nSuc;

    private String direccion;
    private Banco banco;
    private Set<Prestamo> prestamos;

    private CuentaCorriente cuentaCorriente;

    public Sucursal(int nSuc, String direccion, Banco banco, Set<Prestamo> prestamos, CuentaCorriente cuentaCorriente) {
        this.nSuc = nSuc;
        this.direccion = direccion;
        this.banco = banco;
        this.prestamos = prestamos;
        this.cuentaCorriente = cuentaCorriente;
    }

    public CuentaCorriente getCuentaCorriente() {
        return cuentaCorriente;
    }

    public void setCuentaCorriente(CuentaCorriente cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }


    public int getnSuc() {
        return nSuc;
    }

    public void setnSuc(int nSuc) {
        this.nSuc = nSuc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Set<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Set<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public void addPrestamo(Prestamo prestamo) {
        this.prestamos.add(prestamo);
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "nSuc=" + nSuc +
                ", direccion='" + direccion + '\'' +
                ", banco=" + banco +
                ", prestamos=" + prestamos +
                ", prestamos=" + cuentaCorriente +
                '}';
    }


}

