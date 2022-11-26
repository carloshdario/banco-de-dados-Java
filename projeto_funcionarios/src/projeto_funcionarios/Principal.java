package projeto_funcionarios;

public class Principal {

	public static void main(String[] args) {
		ClasseFuncionarios carlos = new ClasseFuncionarios();
		carlos.setIdFuncionario(1);
		carlos.setNomeFuncionario("Andreias Pereira");
		carlos.setRendaFuncionario(3000.30);
		
		ClasseInsertSQL sql = new ClasseInsertSQL();
		sql.salvarDados(carlos);
	}

}
