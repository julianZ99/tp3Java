public class Estudiante extends Persona{
    private int ingreso;
    private double cuota;
    private String carrera;

    public Estudiante(long dni, String nombre, String apellido, String email, String direccion, int ingreso, double cuota, String carrera) {
        super(dni,nombre,apellido,email,direccion);
        this.ingreso = ingreso;
        this.cuota = cuota;
        this.carrera = carrera;
    }

    public int getIngreso() {
        return ingreso;
    }

    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return
                "----------" + "\n" +
                "Estudiante: " + "\n" +
                "dni= " + getDni() + "\n" +
                "nombre= " + getNombre() + "\n" +
                "apellido= " + getApellido() + "\n" +
                "email= " + getEmail() + "\n" +
                "direccion= " + getDireccion() + "\n" +
                "ingreso= " + getIngreso() + "\n" +
                "cuota= " + getCuota() + "\n" +
                "carrera= " + getCarrera() + "\n" +
                '}';
    }
}
