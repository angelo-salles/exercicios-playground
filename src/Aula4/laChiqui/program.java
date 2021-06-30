package Aula4.laChiqui;

import java.util.ArrayList;
import java.util.List;

public class program {
    public static void main(String[] args) {
        Convidado convidado1 = new Convidado("Angelo", TipoConvite.MeLi);
        Convidado convidado2 = new Convidado("Luciano", TipoConvite.Standard);
        Convidado convidado3 = new Convidado("Priscila", TipoConvite.Standard);
        Convidado convidado4 = new Convidado("Adrian", TipoConvite.MeLi);
        Convidado convidado5 = new Convidado("Paulo", TipoConvite.MeLi);
        List<Convidado> listaConvidados = new ArrayList<>();
        listaConvidados.add(convidado1);
        listaConvidados.add(convidado2);
        listaConvidados.add(convidado3);
        listaConvidados.add(convidado4);
        listaConvidados.add(convidado5);
        FogosArtificio fogosArtificio1 = new FogosArtificio("pah");
        FogosArtificio fogosArtificio2 = new FogosArtificio("bum");
        FogosArtificio fogosArtificio3 = new FogosArtificio("alahu akhbar");
        List<FogosArtificio> listaFogosArtificios = new ArrayList<>();
        listaFogosArtificios.add(fogosArtificio1);
        listaFogosArtificios.add(fogosArtificio2);
        listaFogosArtificios.add(fogosArtificio3);
        PacoteFogos pacoteFogos1 = new PacoteFogos(listaFogosArtificios);
        List<PacoteFogos> listaPacoteFogos = new ArrayList<>();
        listaPacoteFogos.add(pacoteFogos1);

        Evento laChiqui = new Evento(listaConvidados, listaFogosArtificios, listaPacoteFogos);
        laChiqui.comemorar();

    }
}
