package banco;

public class Domiciliacion {


    public CuentaCorriente getCC() {
        return CC;
    }

    public void setCC(CuentaCorriente CC) {
        this.CC = CC;
    }

    private CuentaCorriente CC;


    public Domiciliacion(int nDom, String companya, int cuentia) {
        this.nDom = nDom;
        this.companya = companya;
        this.cuentia = cuentia;
    }

    private int nDom;
    private String companya;

    public int getnDom() {
        return nDom;
    }

    public void setnDom(int nDom) {
        this.nDom = nDom;
    }

    public String getCompanya() {
        return companya;
    }

    public void setCompanya(String companya) {
        this.companya = companya;
    }

    public int getCuentia() {
        return cuentia;
    }

    public void setCuentia(int cuentia) {
        this.cuentia = cuentia;
    }

    private int cuentia;



}
