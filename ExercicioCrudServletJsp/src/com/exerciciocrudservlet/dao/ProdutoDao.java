package com.exerciciocrudservlet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.exerciciocrudservlet.model.Produto;

public class ProdutoDao {
	
	
	private static final String CREATE = "INSERT INTO PRODUTO(DESCRICAO, CODIGO, QUANTIDADE) VALUES(?, ?, ?);"; //create
	private static final String READ = "SELECT * FROM PRODUTO ORDER BY ID"; //remove
	private static final String UPDATE = "UPDATE PRODUTO SET DESCRICAO = ?, CODIGO = ?, QUANTIDADE = ? WHERE ID = ?"; //update
	private static final String DELETE = "DELETE FROM PRODUTO WHERE ID = ?"; //delete
	
	public void inserir(Produto produto) { // inserir
		
		try(Connection con = FabricaConexao.getConexao();
				PreparedStatement banco = con.prepareStatement(CREATE)){
			
			banco.setString(1, produto.getDescricao());
			banco.setInt(2, produto.getCodigo());
			banco.setInt(3, produto.getQuantidade());
			
			banco.execute();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public List<Produto> consultar() { // consultar
		
		List<Produto> produtos = new ArrayList<>();
		
		try(Connection con = FabricaConexao.getConexao();
				PreparedStatement banco = con.prepareStatement(READ)){
			
			ResultSet r = banco.executeQuery();
			
			while(r.next()) {
				Produto produto = new Produto();
				produto.setId(r.getInt("id"));
				produto.setDescricao(r.getString("descricao"));
				produto.setCodigo(r.getInt("codigo"));
				produto.setQuantidade(r.getInt("quantidade"));
				produtos.add(produto);
			}
			
			r.close();		
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return produtos;
		
	}
	
	
	public void atualizar(Produto produto) { // update
		
		try(Connection con = FabricaConexao.getConexao();
				PreparedStatement banco = con.prepareStatement(UPDATE)){
			
			banco.setString(1, produto.getDescricao());
			banco.setInt(2, produto.getCodigo());
			banco.setInt(3, produto.getQuantidade());
			banco.setInt(4, produto.getId());
			
			banco.execute();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void deletar(int id) { // deletar
		
		try(Connection con = FabricaConexao.getConexao();
				PreparedStatement banco = con.prepareStatement(DELETE)){
			
			banco.setInt(1, id);
			banco.execute();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
