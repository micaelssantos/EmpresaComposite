
package empresacomposite;

//Composite

import java.util.ArrayList;
import java.util.List;

public class Filial extends Diretoria{
 
    private List<Departamento> childDepartamento = new ArrayList<>();

    public Filial() {

    }

    @Override
    public void exibeDepartamento() {

        for (Departamento dp : childDepartamento) {
            dp.exibeDepartamento();
        }
    }

    public void adiciona(Departamento dp) {
        childDepartamento.add(dp);
    }

    public void remove(Departamento dp) {
        childDepartamento.add(dp);
    }
    
    
}
