class Funcionario {
    private String cargo;
    private Ferramenta ferramenta;

    public Funcionario(String cargo) {
        this.cargo = cargo;
    }

    public void escolherFerramenta(Ferramenta ferramenta) {
        this.ferramenta = ferramenta;
    }

    public Ferramenta getFerramenta() {
        return this.ferramenta;
    }

    public String getCargo() {
        return this.cargo;
    }
}