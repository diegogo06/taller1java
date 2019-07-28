package entidades.estudiantes.operaciones;

import entidades.estudiantes.Mensajes;

public class Sabermensaje {
    Promedio promedio=new Promedio();
 public String nota() {
     double nota = promedio.calcularPromedio();
    if (nota>=4 && nota<=5) {
        Mensajes.Mensaje_SUNOTA.getMensajes();
    }
    if (nota>3 && nota<4) {

    }
  return Mensajes.Mensaje_SUNOTA.getMensajes();
 }
}
