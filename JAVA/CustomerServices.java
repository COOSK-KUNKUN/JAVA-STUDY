public class CustomerServices{
	public void register(String name) throws  IllegalNameException{
		if(name.length() < 6){

				throw new IllegalNameException("用户名违法");

		}

		System.out.println("注册成功！");

	}
}