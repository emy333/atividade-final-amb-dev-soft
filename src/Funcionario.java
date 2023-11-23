class Funcionario {
    // contador de objetos
    public static int contador = 0 ;

    private String cargo;
    private Ferramenta ferramenta;

    public Funcionario(String cargo) {
        this.cargo = cargo;
        ++ contador;
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
    
    @Override
	protected void finalize() throws Throwable {
		--contador;
    }
}