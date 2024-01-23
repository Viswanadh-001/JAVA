package Interface;

	class loginimply implements Login{

		   public void login() {
			System.out.println("LOGIN SUCCESSFULL");
			System.out.println("");
			}
			

			
			public void logout() {
				System.out.println("LOGOUT SUCCESSFULL");
			}
			
			public static void main(String[] args) {
				loginimply obj = new loginimply();
				obj.login();
				obj.logout();
				System.out.println("");
				System.out.println(loginimply.x);
			}
	
		}