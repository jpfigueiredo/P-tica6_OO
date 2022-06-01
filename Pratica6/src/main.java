import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		private static final String QUERY = "select * from autor where id_autor =?";
		
		private static final String SELECT_ALL_QUERY = "select * from autor";
		
		public void getAllUsers() {
		// Step 1: Establishing a Connection
		
			try {
		// Step 2:Create a statement using connection object
		
				PreparedStatement preparedStatement = conn.prepareStatement(SELECT_ALL_QUERY);
		
				System.out.println(preparedStatement);
		// Step 3: Execute the query or update query
		
				ResultSet rs = preparedStatement.executeQuery();
		// Step 4: Process the ResultSet object.
		
				while (rs.next()) {
		
					int id = rs.getInt("id_autor");
		
					String name_autor = rs.getString("nm_autor");
		
					System.out.println(id + " - " + name_autor);
		}
		} 
			catch (SQLException e) {
		printSQLException(e);
		}
		}
	}
		
		
	


