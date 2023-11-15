
public class Main {
    public static void main(String[] args) {
        Funcionario programador = new Funcionario("Programador");
        Funcionario designer = new Funcionario("Designer");
        Funcionario administrativo = new Funcionario("Auxiliar Administrativo");
        // Adicione outros funcionários conforme necessário

        Ferramenta ide = new Ferramenta("IDE");
        Ferramenta photoshop = new Ferramenta("Photoshop");
        Ferramenta excel = new Ferramenta("Excel");

        // Adicione outras ferramentas conforme necessário

        programador.escolherFerramenta(ide);
        designer.escolherFerramenta(photoshop);
        administrativo.escolherFerramenta(excel);
        // Cada funcionário escolhe sua ferramenta

        calcularPorcentagem(programador);
        calcularPorcentagem(designer);
        calcularPorcentagem(administrativo);
        // Calcular e exibir porcentagem para cada funcionário
    }

    public static void calcularPorcentagem(Funcionario funcionario) {
        if (funcionario.getFerramenta() != null) {
            System.out.println(funcionario.getCargo() + " escolheu a ferramenta " + funcionario.getFerramenta().getNome());
        } else {
            System.out.println(funcionario.getCargo() + " ainda não escolheu uma ferramenta.");
        }
    }
}