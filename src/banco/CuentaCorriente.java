package banco;

import java.util.Set;

public class CuentaCorriente {

    private int n_cc;

    private int cantidad;

    //la CC puede pertenecer a mas de 1 cliente
    private Set<Cliente> clientes;

    private Set<Domiciliacion> domiciliacions;

    public CuentaCorriente(int n_cc, int cantidad, Set<Cliente> clientes, Set<Domiciliacion> domiciliacions) {
        this.n_cc = n_cc;
        this.cantidad = cantidad;
        this.clientes = clientes;
        this.domiciliacions = domiciliacions;
    }


    public void addCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public int getN_cc() {
        return n_cc;
    }

    public void setN_cc(int n_cc) {
        this.n_cc = n_cc;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Set<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Set<Domiciliacion> getDomiciliacions() {
        return domiciliacions;
    }

    public void setDomiciliacions(Set<Domiciliacion> domiciliacions) {
        this.domiciliacions = domiciliacions;
    }

    public void addDomiciliacion(Domiciliacion domiciliacion) {
        this.domiciliacions.add(domiciliacion);
    }

}


