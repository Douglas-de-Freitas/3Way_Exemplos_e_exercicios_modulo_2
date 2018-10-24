package com.exerciciocrudservlet.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con;
		try {
			con = FabricaConexao.getConexao();
			
			if (con != null) {
				System.out.println("Conexão Estabelecida");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
