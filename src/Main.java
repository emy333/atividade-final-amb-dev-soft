
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

        Ferramenta ide = new Ferramenta("IDE");
        Ferramenta photoshop = new Ferramenta("Photoshop");
        Ferramenta excel = new Ferramenta("Excel");
        Ferramenta SGBDs = new Ferramenta("MySQL");
        Ferramenta totvs = new Ferramenta("TOTVS");

        // Adicione outras ferramentas conforme necessário

        programador.escolherFerramenta(ide);
        designer.escolherFerramenta(photoshop);
        administrativo.escolherFerramenta(excel);
        DBA.escolherFerramenta(SGBDs);
        gerente.escolherFerramenta(totvs);

        // Cada funcionário escolhe sua ferramenta

        calcularPorcentagem(programador);
        calcularPorcentagem(designer);
        calcularPorcentagem(administrativo);
        calcularPorcentagem(DBA);
        calcularPorcentagem(gerente);
        // Calcular e exibir porcentagem para cada funcionário
    }

    public static void calcularPorcentagem(Funcionario funcionario) {
        if (funcionario.getFerramenta() != null) {
            System.out.println("Cargo: " + funcionario.getCargo() + " - Ferramenta Escolhida: " + funcionario.getFerramenta().getNome()+ " - Ok");
            
        } else {
            System.out.println(funcionario.getCargo() + " ainda não escolheu uma ferramenta.");
        }
    }
    
}
