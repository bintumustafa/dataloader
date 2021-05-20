package DataLoader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnection {
	private static String url = "jdbc:mysql://localhost:3306/";
	private static String nomUser = "root";
	private static String motDePasse ="";
	private static Connection connexion;
	static {
		try {//on verifie si la connexion à la bd est bien établie
			Class.forName ("com.mysql.jdbc.Driver");
			connexion = DriverManager.getConnection(url, nomUser, motDePasse);
			System.out.println("Connexion à la base de données réussie");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erreur lors de la connexion");
		    System.exit(0);
		}
		System.out.println("Connexion établie.");
	}
	public static Connection getConnexion() {
		return connexion;
	}
	
	
	

}

