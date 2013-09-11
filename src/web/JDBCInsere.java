package web;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;


public class JDBCInsere {

	public static void main(String[] args)throws SQLException {
	
		try(Connection con = new ConnectionFactory().getConnection()){
			
		
		
		String sql = "insert into contatos" + "(nome,email,endereco,dataNascimento)" + "values (?,?,?,?)";
		
		PreparedStatement stmt = con.prepareStatement(sql);
		
		stmt.setString(1, "caelum");
		stmt.setString(2, "contato@caelum.com.br");
		stmt.setString(3, "R.vergueiro 3185 cj57");
		stmt.setDate(4,new java.sql.Date(Calendar.getInstance().getTimeInMillis()));
		
		stmt.execute();
		stmt.close();
		System.out.println("gravado!");}
		
		catch (SQLException e) {
			System.out.println(e);
		}
		
		}
	}


