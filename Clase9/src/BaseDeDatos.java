import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDeDatos {

	public static void main(String[] args)
	{
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		String url = "jdbc:sqlserver://localhost:1433;dataBaseName=master";
		String usuario = "Juan";
		String password = "juanantonio";
		
		try (Connection conn = DriverManager.getConnection(url, usuario, password);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT DISTINCT * FROM USUARIOS"))
		{
			System.out.println("Te conectaste de manera satisfactoria");
			while (rs.next())
			{
				String nombre = rs.getString("Nombre");
				String apellido = rs.getString("Apellido");
				String ciudad = rs.getString("Ciudad");
				String NOMBRE_USUARIO = rs.getString("NOMBRE_USUARIO");
				String Email = rs.getString("Email");
				
				System.out.println(nombre + " " + apellido + " " + ciudad);
				System.out.println("El usuario es: " + NOMBRE_USUARIO);
				System.out.println("El email es: " + Email);
			}
		} catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
