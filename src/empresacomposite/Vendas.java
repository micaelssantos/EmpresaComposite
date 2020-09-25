
package empresacomposite;

/**
 *
 * @author Micael
 */
public class Vendas implements Departamento{

    private String nome;
    
    @Override
    public void exibeDepartamento() {
        System.out.println(nome);
    }

    public Vendas(String nome) {
        this.nome = nome;
    }
    
    
    
    public Vendas(){
    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
