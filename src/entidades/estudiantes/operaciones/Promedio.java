package entidades.estudiantes.operaciones;

public class Promedio {
    public double nota1;
    public double nota2;
    public double nota3;
    public double notaf;

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNotaf() {
        return notaf;
    }

    public void setNotaf(double notaf) {
        this.notaf = notaf;
    }

    public double calcularPromedio() {
        notaf = ((this.getNota1() * 0.4) + (this.getNota2() * 0.3) + (this.getNota3() * 0.3));
        return notaf;
    }

    }