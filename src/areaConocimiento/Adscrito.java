package areaConocimiento;

public class Adscrito {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String nombre;
    private Profesor profesor;
    private Catedra catedra;

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Catedra getCatedra() {
        return catedra;
    }

    public void setCatedra(Catedra catedra) {
        this.catedra = catedra;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    private String fecha;

    public Adscrito(String nombre, Profesor profesor, Catedra catedra, String fecha) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.catedra = catedra;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return this.nombre + " - " +this.fecha;
    }
}
