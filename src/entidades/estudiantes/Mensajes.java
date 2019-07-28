package entidades.estudiantes;

import entidades.estudiantes.operaciones.Promedio;

public enum Mensajes {

    MENSAJE_NOTA1("ingresa la primera nota con valor de 40%"),
    MENSAJE_NOTA2("ingresa la segunda nota con valor de 30%"),
    MENSAJE_NOTA3("ingresa la tercera nota con valor de 30%"),
    MENSAJE_EXCELENTE("Excelente, tu rendimiento ha sido el mejor."),
    MENSAJE_ACEPTABLE("Tu rendimiento es aceptable, pero finalizaste bien."),
    MENSAJE_DEFICIENTE("Te sugerimos comprometerte más con tu estudio."),
    MENSAJE_MALAS_NOTICIAS("Malas noticias, no cumpliste con el mínimo para avanzar."),
    MENSAJE_VUELVE_A_INICIAR("Nuevamente vuelve a iniciar tus estudios y dedícate."),
    Mensaje_SUNOTA("SU NOTA ES: ");

    private String mensaje;

    Mensajes(String s) {


        this.mensaje = s;

    }


    public String getMensajes() {
        return mensaje;

    }

    }