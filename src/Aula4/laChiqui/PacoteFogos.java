package Aula4.laChiqui;

import java.util.List;

public class PacoteFogos {
    private List<FogosArtificio> fogos;

    public PacoteFogos(List<FogosArtificio> fogos) {
        this.fogos = fogos;
    }

    public List<FogosArtificio> getFogos() {
        return fogos;
    }

    public void adicionarFogos(FogosArtificio fogos) {
        this.fogos.add(fogos);
    }

    public void adicionarFogos(PacoteFogos fogos) {
        fogos.fogos.forEach(fogo -> this.fogos.add(fogo));
    }

    public void explodirFogos() {
        for (FogosArtificio fogos :
                this.fogos) {
            System.out.println(fogos.getBarulho());
        }
    }
}
