public class Staff extends Persona{
    private double salario;
    private String turno;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double salarioAnual()
    {
        return this.salario*12;
    }
    public Staff(long dni, String nombre, String apellido, String email, String direccion, double salario, String turno) {
        super(dni,nombre,apellido,email,direccion);
        this.salario = salario;
        this.turno = turno;
    }

    @Override
    public String toString() {
        return
                "----------" + "\n" +
                        "Staff: " + "\n" +
                        "dni= " + getDni() + "\n" +
                        "nombre= " + getNombre() + "\n" +
                        "apellido= " + getApellido() + "\n" +
                        "email= " + getEmail() + "\n" +
                        "direccion= " + getDireccion() + "\n" +
                        "salario= " + getSalario() + "\n" +
                        "turno= " + getTurno() + "\n" +
                        "salario anual= " + salarioAnual() + "\n" +
                        '}';
    }
}
