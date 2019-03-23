public class Teat{
		public static void main(String[] args) {
			

			String username = "jack";

			CustomerServices cs = new CustomerServices();

			try{

					cs.register(username);

			}catch(IllegalNameException e){
				System.out.println(e.getMessage());
			}
		}
}