package application;

import java.sql.Connection;
import java.sql.PreparedStatement;

import db.DbIntegrityException;

public class Program {

	public static void main(String[] args) {
		
		
		Connection conn = null;
		PreparedStatement st = null;
		try {
			
		}catch(Exception e) {
			throw new DbIntegrityException(e.getMessage());
		}
			
	}
}