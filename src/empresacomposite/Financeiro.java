package empresacomposite;
// Leaf (Folha) - Filho

public class Financeiro implements Departamento {

    private String nome;

    @Override
    public void exibeDepartamento() {

        System.out.println(this.nome);
    }

    public Financeiro() {

    }

    public Financeiro(String nome) {

        this.nome = nome;

    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

}
