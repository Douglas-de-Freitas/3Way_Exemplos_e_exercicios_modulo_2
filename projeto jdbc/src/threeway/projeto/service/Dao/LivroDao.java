package threeway.projeto.service.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import threeway.projeto.service.modelo.Livro;

public class LivroDao {
	
	private static final String CONSULTAR_SQL = "SELECT * FROM LIVRO WHERE TITULO LIKE ?";
	private static final String CONSULTAR_SQL_ID = "SELECT * FROM LIVRO WHERE COD_LIVRO = ?";
	private static final String EXCLUIR_ID = "DELETE FROM LIVRO WHERE COD_LIVRO = ?";
	private static final String UPDATE_TITULO = "UPDATE LIVRO SET TITULO = ? WHERE COD_LIVRO = ?";
	private static final String UPDATE_TITULO_AUTOR = "UPDATE LIVRO SET TITULO = ?, AUTOR = ? WHERE COD_LIVRO = ?";
	private static final String SALVAR = "INSERT INTO LIVRO(TITULO, AUTOR, PRECO, IMAGEM) VALUES (?, ?, ?, ?)";
	
	public List<Livro> consultarTitulo (String titulo){
		
		ArrayList<Livro> lista = new ArrayList<Livro>();
		
		try(
				Connection conexao = FabricaConexao.getConexao(); 
				PreparedStatement consulta = conexao.prepareStatement(CONSULTAR_SQL); ) {
			
			consulta.setString(1, "%" + titulo.toUpperCase() + "%");
			
			ResultSet resultado = consulta.executeQuery();
			
			while(resultado.next()) {
				Livro livro = new Livro();
				livro.setAutor(resultado.getString("AUTOR"));
				livro.setCodigo(resultado.getInt("COD_LIVRO"));
				livro.setImagem(resultado.getString("IMAGEM"));
				livro.setPreco(resultado.getDouble("PRECO"));
				livro.setTitulo(resultado.getString("TITULO"));
				livro.setDescricao(resultado.getString("DESCRICAO"));
				lista.add(livro);
			}
			
			resultado.close();			
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
	// parece mais complexo mais só parece porque não foi utilizado um try com recurso
	// que ficaria muito mais simples e com bem menos código
	public Livro consultarId(int codigo) {
		
		Livro livro = null;
		
		Connection con = null;
		PreparedStatement consulta = null;
		
		try{
			
			con = FabricaConexao.getConexao();
			consulta = con.prepareStatement(CONSULTAR_SQL_ID);
			
			consulta.setInt(1, codigo);
			
			ResultSet resultado = consulta.executeQuery();
			
			if(resultado.next()) {
				livro = new Livro();
				livro.setAutor(resultado.getString("AUTOR"));
				livro.setCodigo(resultado.getInt("COD_LIVRO"));
				livro.setImagem(resultado.getString("IMAGEM"));
				livro.setPreco(resultado.getDouble("PRECO"));
				livro.setTitulo(resultado.getString("TITULO"));
				livro.setDescricao(resultado.getString("DESCRICAO"));
			}
			
			resultado.close();
			
		}catch (Exception e) {
			e.printStackTrace();

		}finally{ //exemplo de como fecha as conexões quando não se utiliza um try com recurso
			
			try {
				if(consulta != null) {
					consulta.close();
				}
				
				if(con != null) {
					con.close();
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return livro;
		
	}
	
	public void removeById(int id) {
		
		try(
				Connection con = FabricaConexao.getConexao();
				PreparedStatement consulta = con.prepareStatement(EXCLUIR_ID)) {
			
			consulta.setInt(1, id);
			
			consulta.execute();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public void updateTitulo(Livro livro) {
		
		try(
				Connection con = FabricaConexao.getConexao();
				PreparedStatement consulta = con.prepareStatement(UPDATE_TITULO)){
			
			consulta.setString(1, livro.getTitulo());
			consulta.setInt(2, livro.getCodigo());
			
			consulta.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateTituloAutor(Livro livro) {
		
		try(
				Connection con = FabricaConexao.getConexao();
				PreparedStatement consulta = con.prepareStatement(UPDATE_TITULO_AUTOR)){
			
			consulta.setString(1, livro.getTitulo());
			consulta.setString(2, livro.getAutor());
			consulta.setInt(3, livro.getCodigo());
			
			consulta.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void salvarLivro(Livro livro) {
		
		try(
				Connection con = FabricaConexao.getConexao();
				PreparedStatement consulta = con.prepareStatement(SALVAR);){
			
			//INSERT INTO LIVRO( TITULO, AUTOR, PRECO, IMAGEM)
			consulta.setString(1, livro.getTitulo());
			consulta.setString(2, livro.getAutor());
			consulta.setDouble(3, livro.getPreco());
			consulta.setString(4, livro.getImagem());
			
			consulta.execute();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
}
