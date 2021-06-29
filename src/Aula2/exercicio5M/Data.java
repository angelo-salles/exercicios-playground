package Aula2.exercicio5M;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Data {
    public GregorianCalendar date;

    public Data() {
        this.date = new GregorianCalendar();
    }

    public Data(int dia, int mes, int ano) {
        this.date = new GregorianCalendar(ano, mes, dia);
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public int getDay() {
        return date.get(Calendar.DATE);
    }

    public void addDia() {
        this.date.add(Calendar.DATE, 1);
    }

    @Override
    public String toString() {
        return date.get(Calendar.DATE) + "/" + date.get(Calendar.MONTH) + "/" + date.get(Calendar.YEAR);
    }

    public static void main(String[] args) {
        Data data = new Data();
        System.out.println(data);
    }
}
