package Calificaciones;

public class Promedio {

    private float total;
    private String nota;

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public void promedio(float español, float matematicas, float ingles, float geografia, float programacion){

        total = (español + matematicas + ingles + geografia + programacion) / 5 ;
    }

    public void notas(){
        if (total >= 0 && total <= 50)
        {
            nota = "F";
        }
        else if (total >= 51 && total <= 60)
        {
            nota = "E";
        }
        else if (total >= 61 && total <= 70)
        {
            nota = "D";
        }
        else if (total >= 71 && total <= 80)
        {
            nota = "C";
        }
        else if (total >= 81 && total <= 90)
        {
            nota = "B";
        }
        else if (total >= 91 && total <= 100)
        {
            nota = "A";
        }

    }


    public void mostrar(){
        System.out.println("Promedio: " +total);
        System.out.println("Calificacion Final: " +nota);
    }
}
