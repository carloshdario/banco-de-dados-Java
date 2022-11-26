package projeto_funcionarios;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ClasseInsertSQL {
public void salvarDados(ClasseFuncionarios funcionario) {
		String insert_sql = "INSERT INTO tabela_funcionarios VALUES(default, ?,?)";
		Connection acesso = null;
		PreparedStatement preparar = null;
		
		try {
			acesso = ClasseDadosConexao.criarConexao();
			preparar = acesso.prepareStatement(insert_sql);
			preparar.setString(1, funcionario.getNomeFuncionario());
			preparar.setDouble(2, funcionario.getRendaFuncionario());
			preparar.execute();
			
		}catch(Exception e) {
			System.out.println("Erro ao acessor o banco! "+ e);
			
		} finally {
			try {
				if(preparar != null) {
					preparar.close();
				}
				if(acesso != null) {
					acesso.close();
				}
			}catch(Exception e) {
				System.out.println();
			}
		}
	}
	


	


}
