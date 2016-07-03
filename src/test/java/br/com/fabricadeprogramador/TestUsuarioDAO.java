package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {

		testExcluir();
		
	}
	
	
	public static void testCadastrar(){
		
		Usuario usu = new Usuario();
		//Criando o usuario
		usu.setNome("Manoel Luiz Lopes");
		usu.setLogin("MLL");
		usu.setSenha("321");
		
		//UsuarioDAO Leva o Usuario usu para BD
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);
		
	}
	
	public static void testAlterar(){
		
		Usuario usu = new Usuario();
		usu.setId(4);
		usu.setNome("Joaquim Assis Campos");
		usu.setLogin("JAC");
		usu.setSenha("371");
		
		//UsuarioDAO Leva o Usuario usu para BD
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);
		
	}

	public static void testExcluir(){
		
		Usuario usu = new Usuario();
		usu.setId(4);
		
		//UsuarioDAO Leva o Usuario usu para BD
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);
		
	}
	
}
