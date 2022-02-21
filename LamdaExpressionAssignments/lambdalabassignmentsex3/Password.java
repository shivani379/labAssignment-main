package lambdalabassignmentsex3;


public class Password {

	public static void main(String[] args) {

		String name = "Shivani";
		String pass = "Shivani@2000";
		Authentication p = ((username, password) -> {
			if (username.equals(name) && password.equals(pass))
				return true;
			else
				return false;
		});
		System.out.println(p.checkIdentity("Shivani", "Shivani@2000"));
	}
}