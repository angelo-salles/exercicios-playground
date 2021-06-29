package Aula4;

import java.util.*;

public class GuardaRoupa {
    public Map<Integer, List<Vestuario>> dicionario = new HashMap<Integer, List<Vestuario>>();

    public Integer guardarVestuarios(List<Vestuario> listaDeVestuario) {
        this.dicionario.put(this.dicionario.size(), listaDeVestuario);
        return this.dicionario.size() - 1;
    }

    public void mostrarVestuarios() {
        Collection<List<Vestuario>> values = this.dicionario.values();
        for (int i = 0; i < values.size(); i++) {
            System.out.print("Chave " + i + " - Registros:");
            dicionario.get(i).stream().forEach(e -> System.out.println(" " + e));
            System.out.println();
        }
    }

    public List<Vestuario> devolverVestuarios(Integer id) {
        List<Vestuario> roupas = this.dicionario.get(id);
        return roupas;
    }

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
