package empresacomposite;

import java.util.ArrayList;
import java.util.List;

//Composite
public class Diretoria implements Departamento {

    private List<Departamento> childDepartamento = new ArrayList<>();

    public Diretoria() {

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
