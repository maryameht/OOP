package banco;

import java.util.HashSet;

public class MainBanco {

    public static void main(String[] args) {

        Banco bbva = new Banco("BBVA", 120, new HashSet<Sucursal>(), new HashSet<Prestamo>());
            //CuentaCorriente cuenta1 = new CuentaCorriente(645, 876);
            //Sucursal sMayor = new Sucursal(11,"C/Mayor", bbva, new HashSet<Prestamo>(), cuenta1);
            //bbva.addSucursal(sMayor);
            Cliente juan = new Cliente(23, "Juan");
            //Prestamo p1 = new Prestamo(99,1000, sMayor, juan);
            //sMayor.addPrestamo(p1);
            //Domiciliacion dom = new Domiciliacion(789, "Iberdrola", 987, cuenta1);
            //cuenta1.addDomiciliacion(dom);


            //CuentaCorriente cuenta2 = new CuentaCorriente(765, "Cuenta de Maria");
            //Sucursal sENMedio = new Sucursal(12,"C/Medio", bbva, new HashSet<>(), cuenta2);
            //bbva.addSucursal(sENMedio);
            Cliente maria = new Cliente(67,"Maria");
            //Prestamo p2 = new Prestamo(98,2000,sENMedio, maria);
            //sENMedio.addPrestamo(p2);

        System.out.println(bbva);
        for ( Sucursal s : bbva.getSucursales()) {
            System.out.println("\t" + s);
        }
        for ( Prestamo  p : bbva.getPrestamos()) {
            System.out.println("\t" + p);
        }






    }
}
