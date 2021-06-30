package Aula6.saveTheRopa;

import java.util.ArrayList;
import java.util.List;

public class program {
    public static void main(String[] args) {
        ArrayList<Vestuario> objects = new ArrayList<Vestuario>();
        objects.add(new Vestuario("Zara", "Camisa"));
        objects.add(new Vestuario("Outfit", "Muito caro"));
        objects.add(new Vestuario("Adidas", "Tenis"));
        objects.add(new Vestuario("Nike", "Chuteira"));
        objects.add(new Vestuario("Polo", "Camisa"));
        GuardaRoupa guardaRoupa = new GuardaRoupa();
        int a = guardaRoupa.guardarVestuarios(objects);
        guardaRoupa.mostrarVestuarios();
        List<Vestuario> b = guardaRoupa.devolverVestuarios(a);
        System.out.println(b);
    }
}
