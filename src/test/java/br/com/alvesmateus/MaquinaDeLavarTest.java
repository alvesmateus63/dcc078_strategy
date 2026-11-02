package br.com.alvesmateus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaquinaDeLavarTest {
    @Test
    public void deveExecutarLavagemPadrao() {
        MaquinaDeLavar maquina = new MaquinaDeLavar(new LavagemPadrao());
        String resultado = maquina.iniciar();

        assertEquals("Lavagem Padrão: Água fria, centrifugação média, 45 minutos.", resultado);
    }

    @Test
    public void deveExecutarLavagemPesada() {
        MaquinaDeLavar maquina = new MaquinaDeLavar(new LavagemPesada());
        String resultado = maquina.iniciar();

        assertEquals("Lavagem Pesada: Água quente, centrifugação dupla, 90 minutos.", resultado);
    }

    @Test
    public void deveTrocarEstrategiaEmTempoDeExecucao() {
        MaquinaDeLavar maquina = new MaquinaDeLavar(new LavagemDelicada());
        assertEquals("Lavagem Delicada: Água fria, sem centrifugação, 30 minutos.", maquina.iniciar());

        maquina.setEstrategia(new LavagemPadrao());
        assertEquals("Lavagem Padrão: Água fria, centrifugação média, 45 minutos.", maquina.iniciar());
    }
}
