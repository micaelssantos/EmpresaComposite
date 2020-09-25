package empresacomposite;

public class Cliente {

    public static void main(String[] args) {

        Departamento financeiro = new Financeiro("Financeiro");
        Departamento vendas = new Vendas("Vendas");
        Diretoria diretoria = new Diretoria();

        diretoria.adiciona(vendas);
        diretoria.adiciona(financeiro);
        diretoria.exibeDepartamento();

        Departamento financeiroFilial = new Financeiro("Financeiro Filial");
        Departamento vendasFilial = new Vendas("Vendas Filial");
        Filial filial = new Filial();
        filial.adiciona(vendasFilial);
        filial.adiciona(financeiroFilial);
        filial.exibeDepartamento();

        diretoria.adiciona(filial);

        diretoria.exibeDepartamento();

    }
}
