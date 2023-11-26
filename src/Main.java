
public class Main {
    public static void main(String[] args) {
        
        Software n_gruposoft = new Software(" Atividade Final - Grupo 18 - Software House - v.1.0.1 ");
        System.out.println("****** " + n_gruposoft.getn_Software()+ "******" + "\n");
        System.out.println("<*****> Percentual de Contribuição por Profissional/Cargo no projeto Sofware House <*****>" + "\n");
        
        Funcionario programador = new Funcionario("Programador");
        Funcionario designer = new Funcionario("Designer");
        Funcionario administrativo = new Funcionario("Auxiliar Administrativo");
        Funcionario DBA = new Funcionario("Administrador de BD");
        Funcionario gerente = new Funcionario("Gerente");
        // Adicione outros funcionários conforme necessário
                

       System.out.println("Com o Total de " + Funcionario.contador + " Funcionarios, Fechamos 100% de participação sendo " + 100/Funcionario.contador + "% de contribuição de cada Cargo." + "\n");

        Ferramenta ide = new Ferramenta("VSCode");
        Ferramenta photoshop = new Ferramenta("AutoCad");
        Ferramenta MOffice = new Ferramenta("Excel");
        Ferramenta SGBDs = new Ferramenta("MySQL");
        Ferramenta totvs = new Ferramenta("Financeiro");

        // Adicione outras ferramentas conforme necessário

        Demanda   VSCode = new Demanda("Codificar");
        Demanda   AutoCad = new Demanda("Criar logo");
        Demanda   Excel = new Demanda("Criar Planilha");
        Demanda   MySQL = new Demanda("Criar Banco");
        Demanda   Financeiro = new Demanda("Gerenciar Contas");
        
        // Adicione outras ferramentas conforme necessário


        programador.escolherFerramenta(ide);
        designer.escolherFerramenta(photoshop);
        administrativo.escolherFerramenta(MOffice);
        DBA.escolherFerramenta(SGBDs);
        gerente.escolherFerramenta(totvs);

        // Cada funcionário escolhe sua ferramenta

        programador.reaizarDemanda(VSCode);
        designer.reaizarDemanda(AutoCad);
        administrativo.reaizarDemanda(Excel);
        DBA.reaizarDemanda(MySQL);
        gerente.reaizarDemanda(Financeiro);


        calcularPorcentagem(programador);
        calcularPorcentagem(designer);
        calcularPorcentagem(administrativo);
        calcularPorcentagem(DBA);
        calcularPorcentagem(gerente);


        // Calcular e exibir porcentagem para cada funcionário

              
    }

    public static void calcularPorcentagem(Funcionario funcionario) {
        if (funcionario.getFerramenta() != null) {
            System.out.println("Cargo: " + funcionario.getCargo() + " - Ferramenta Escolhida: " + funcionario.getFerramenta().getNome() 
            + " - Demanda: "+ funcionario.getDemanda().getNDemanda() + " - Ok");
            
        } else {
            System.out.println(funcionario.getCargo() + " ainda não escolheu uma ferramenta.");
        }
    }
    
    
}
