package Aula4.laChiqui;

import java.util.ArrayList;
import java.util.List;

public class Evento {
    private List<Convidado> convidados;
    private List<FogosArtificio> fogosArtificios;
    private List<PacoteFogos> pacoteFogos;

    public Evento() {
        this.convidados = new ArrayList<>();
        this.fogosArtificios = new ArrayList<>();
        this.pacoteFogos = new ArrayList<>();
    }

    public Evento(List<Convidado> convidados, List<FogosArtificio> fogosArtificios, List<PacoteFogos> pacoteFogos) {
        this.convidados = convidados;
        this.fogosArtificios = fogosArtificios;
        this.pacoteFogos = pacoteFogos;
    }

    public List<Convidado> getConvidados() {
        return convidados;
    }

    public List<FogosArtificio> getFogosArtificios() {
        return fogosArtificios;
    }

    public List<PacoteFogos> getPacoteFogos() {
        return pacoteFogos;
    }

    public void adicionarConvidado(Convidado convidado) {
        this.convidados.add(convidado);
    }

    public void adicionarFogosIndividual(FogosArtificio fogosArtificio) {
        this.fogosArtificios.add(fogosArtificio);
    }

    public void adicionarFogosPacote(PacoteFogos pacoteFogos) {
        this.pacoteFogos.add(pacoteFogos);
    }

    public void comemorar() {
        System.out.println("Explodindo fogos de artificio...");
        for (FogosArtificio fogos :
            this.fogosArtificios) {
            System.out.println(fogos.getBarulho());
        }
        for (PacoteFogos fogos :
                this.pacoteFogos) {
            fogos.explodirFogos();
        }
        System.out.println("Comemoração dos convidados do MeLi...");
        for (Convidado convidado :
                this.convidados) {
            if (convidado.getConvite() == TipoConvite.MeLi)
                System.out.println(convidado.getNome() + " diz: 'Viva la Chiqui!!'");
        }
    }
}
