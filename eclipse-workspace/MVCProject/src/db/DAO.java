package db;

import model.User;

public class DAO {

	static User userarr[];
	static int index;
	static {
		userarr = new User[3];
		index = 0;
	}

	public boolean register(User u1) {

		if (index < 3) {
			userarr[index] = u1;
			index++;

			//for (int i = 0; i < userarr.length; i++) {
				//System.out.println(userarr[i]);
		//	}

			return true;
		} 
		else {
			return false;
		}
	}

	public User Validate(User u1) {
		for (int i = 0; i < userarr.length; i++) {
			User dbuser = userarr[i];

			if (dbuser.getUsername().equals(u1.getUsername()) && dbuser.getPassword().equals(u1.getPassword())) {
				u1.setCity(dbuser.getCity());
				return u1;
			}
		}
		return null;
	}
}