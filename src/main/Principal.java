package main;
import javax.swing.*;
import static entidades.estudiantes.Mensajes.*;
import entidades.estudiantes.operaciones.Promedio;
import entidades.estudiantes.operaciones.Sabermensaje;
public class Principal {
    public static void main(String[] args)

    {
        Sabermensaje sabermensaje = new Sabermensaje();
        Promedio promedio = new Promedio();
        String nota1 =JOptionPane.showInputDialog(null,MENSAJE_NOTA1.getMensajes());
        String nota2 =JOptionPane.showInputDialog(null,MENSAJE_NOTA2.getMensajes());
                String nota3 =JOptionPane.showInputDialog(null,MENSAJE_NOTA3.getMensajes());

        promedio.setNota1(Double.parseDouble(nota1));
        promedio.setNota2(Double.parseDouble(nota2));
        promedio.setNota3(Double.parseDouble(nota3));
        JOptionPane.showMessageDialog(null,sabermensaje.nota()+promedio.calcularPromedio());




    }



}
