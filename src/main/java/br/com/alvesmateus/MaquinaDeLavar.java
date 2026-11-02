package br.com.alvesmateus;

public class MaquinaDeLavar {
    private Lavagem lavagem;

    public MaquinaDeLavar(Lavagem lavagem) {
        this.lavagem = lavagem;
    }

    public void setEstrategia(Lavagem lavagem) {
        this.lavagem = lavagem;
    }

    public String iniciar() {
        return this.lavagem.executarLavagem();
    }
}
