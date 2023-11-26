class Funcionario {
    // contador dos o
    public static int contador = 0 ;

    private String cargo;
    private Ferramenta ferramenta;
    private Demanda demanda;

    public Funcionario(String cargo) {
        this.cargo = cargo;
        ++ contador;
    }
    	
    public void escolherFerramenta(Ferramenta ferramenta) {
        this.ferramenta = ferramenta;
    }

    public void reaizarDemanda(Demanda demanda) {
        this.demanda = demanda;

    }
    public Ferramenta getFerramenta() {
        return this.ferramenta;
    }

     public Demanda getDemanda() {
        return this.demanda;
    }
    public String getCargo() {
        return this.cargo;
    }
    
    @Override
	protected void finalize() throws Throwable {
		--contador;
    }
}