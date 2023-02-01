package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import bean.Anime;
import connection.ConnectionClass;

public class Operations {

	public static boolean insertAnimeData(Anime anime) {
		boolean flag = false;
		try {
			Connection con = ConnectionClass.createConnection();

			String query = "insert into anime(name, famous_character, popularity, country) values(?,?,?,?)";

			PreparedStatement pstmnt = con.prepareStatement(query);

			pstmnt.setString(1, anime.getName());
			pstmnt.setString(2, anime.getFamousCharacter());
			pstmnt.setString(3, anime.getPopularity());
			pstmnt.setString(4, anime.getCountry());

			pstmnt.executeUpdate();
			flag = true;
			if (flag) {
				System.out.println("data added successfully!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public static void deleteAnimeFromDatabase(int id) {
		try {
			Connection con = ConnectionClass.createConnection();

			String query = "delete from anime where anime_id=?";

			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1, id);

			int rowsDeleted = statement.executeUpdate();
			if (rowsDeleted > 0) {
				System.out.println("A user was deleted successfully!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void fetchAllAnime() {
		try {
			Connection con = ConnectionClass.createConnection();

			String query = "select * from anime";

			Statement stmnt = con.createStatement();
			ResultSet result = stmnt.executeQuery(query);

			while (result.next()) {
				int anime_id = result.getInt(1);
				String name = result.getString(2);
				String character = result.getString(3);
				String popularity = result.getString(4);
				String country = result.getString(5);

				String str = "Anime #%d\t%s\t%s\t%s\t%s";
				System.out.println(String.format(str, anime_id, name, character, popularity, country));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void updateAnimeById(int id, Anime anime) {
		try {
			Connection con = ConnectionClass.createConnection();
			
			String sql="update anime set name=?, famous_character=?, popularity=?, country=? where anime_id=?";
			
			PreparedStatement stmnt=con.prepareStatement(sql);
			
			stmnt.setString(1, anime.getName());
			stmnt.setString(2, anime.getFamousCharacter());
			stmnt.setString(3, anime.getPopularity());
			stmnt.setString(4, anime.getCountry());
			stmnt.setInt(5, id);
			
			int rowsUpdated=stmnt.executeUpdate();
			if(rowsUpdated>0) System.out.println("Update sucessful!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
