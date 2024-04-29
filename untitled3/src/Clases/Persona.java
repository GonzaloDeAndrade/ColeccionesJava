package Clases;

public class Persona implements Comparable {
    private String nombre;
    private int edad;
    private int id;

    public Persona(String nombre, int edad, int id) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + getNombre() + '\'' +
                ", edad=" + getEdad() +
                ", id=" + getId() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        boolean sonIguales = false;
        if (obj != null) {

            if (obj instanceof Persona) {
                Persona AComparar = (Persona) obj;
                if (getId() == AComparar.getId() && nombre.equals(AComparar.getNombre())) {
                    sonIguales = true;
                } else {
                    sonIguales = false;
                }
            }
        }
        return sonIguales;
    }

    @Override
    public int compareTo(Object o) {
        int rta = 0;
        if (o != null) {

            if (o instanceof Persona) {

                Persona elemento = (Persona) o;
                if (getId() > elemento.getId()) {
                    rta = 1;
                } else if (getId() < elemento.getId()) {
                    rta = -1;
                } else if (getId() == elemento.getId())
                {

                    rta = 0;
                }
            }

        }
        return rta;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
