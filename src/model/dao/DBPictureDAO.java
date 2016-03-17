package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sun.javafx.UnmodifiableArrayList;

import model.Picture;
import model.User;
import model.db.DBManager;

public class DBPictureDAO implements IPictureDAO{
	private static DBPictureDAO instance;
	private DBManager manager;
	
	private DBPictureDAO() {
		manager = DBManager.getInstance();
	}
	

	public static IPictureDAO getInstance() {
		if(instance == null)
			instance = new DBPictureDAO();
		return instance;
	}

	@Override
	public List<Picture> getNewPictures() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public List<Picture> getPicturesByCategory(String category) throws SQLException {
//		
//	}

	@Override
	public UnmodifiableArrayList<Picture> getAllUserPictures(User u) throws SQLException {
		String query = "SELECT pic_id FROM user_pictures WHERE user = "+ u.getUsername() ;
		List<Picture> pics = new ArrayList<>();
		Statement st = manager.getConnection().createStatement();
		ResultSet result = st.executeQuery(query);
		System.out.println("result = " + result);
		if(result == null){
			return (UnmodifiableArrayList<Picture>) pics;
		}
		while(result.next()){
			for(Picture p: allPics){
				if(dbCategories.charAt(i) == ';'){
					categories.add(dbCategories.substring(lastColum, i));
					lastColum = i+1;
				}
			}
			pics.add(p);
		}
		st.close();
		System.out.println(pics.size());
		return (UnmodifiableArrayList<Picture>) pics;
	}


	@Override
	public List<Picture> getAllPictures() throws SQLException {
		String query = "SELECT url, price, timesBought, categories FROM pictures";
		List<Picture> pics = new ArrayList<>();
		Statement st = manager.getConnection().createStatement();
		ResultSet result = st.executeQuery(query);
		System.out.println("result = " + result);
		if(result == null){
			return pics;
		}
		while(result.next()){
			System.out.println("row taken");
			ArrayList<String> categories = new ArrayList<>();
			String dbCategories = result.getString(4);

			int lastColum = 0;
			for(int i =0; i < dbCategories.length(); i++){
				if(dbCategories.charAt(i) == ';'){
					categories.add(dbCategories.substring(lastColum, i));
					lastColum = i+1;
				}
			}
			Picture p = new Picture(categories,
							  result.getString(1),
					          result.getDouble(2),
					          result.getInt(4));
			System.out.println("picture added");
			pics.add(p);
		}
		st.close();
		System.out.println(pics.size());
		return pics;
	}

}
