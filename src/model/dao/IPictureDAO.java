package model.dao;

import java.sql.SQLException;
import java.util.List;

import com.sun.javafx.UnmodifiableArrayList;

import model.Picture;
import model.User;
public interface IPictureDAO {

	enum DataSource {
		DB, JSON, XML, CSV, PLC
	}

	List<Picture> getNewPictures() throws SQLException;
	
	//List<Picture> getPicturesByCategory(String category) throws SQLException;
	
	UnmodifiableArrayList<Picture> getAllUserPictures(User u) throws SQLException;
	
	List<Picture> getAllPictures() throws SQLException;
	

	static IPictureDAO getDAO(DataSource ds) {
		switch (ds) {
		case DB:
			return DBPictureDAO.getInstance();
		default:
			throw new IllegalArgumentException();
		}
	}
}
