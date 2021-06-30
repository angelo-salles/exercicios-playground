package Aula4.laChiqui;

public class Convidado {
    private String nome;
    private TipoConvite convite;

    public Convidado(String nome, TipoConvite convite) {
        this.nome = nome;
        this.convite = convite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoConvite getConvite() {
        return convite;
    }

    public void setConvite(TipoConvite convite) {
        this.convite = convite;
    }
}
