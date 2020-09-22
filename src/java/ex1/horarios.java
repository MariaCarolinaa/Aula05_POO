package ex1;
/*Atributos: horas, minutos e segundos -- V
Construtor parametrizado -- V
Método de retorno do horário formatado como String -- V
Página para mostrar horário atual e horário do intervalo*/
public class horarios {
    int horas;
    int minutos;
    int segundos;

    public horarios(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
    public String getHorario(){
        String horario = this.horas + ":" + this.minutos + ":" + this.segundos;
        return horario;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
    
}
