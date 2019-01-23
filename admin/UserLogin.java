package admin;
/**
 * 
 * 项目名称：cars   
 * 类名称：UserLogin   
 * 类描述：  注册类 用于注册和登录   
 * 创建人： 饶蓓雷  
 * 创建时间：2019-1-20 上午9:03:38   
 * @version        
 */

	public interface UserLogin {
	/**
	 * 这是用户登录的功能
	 * 用户名  username
	 * 	密码	 password	
	 * 	返回登录是否成功
	 */
		public abstract boolean Login(String username,String password);
		
	/**
	 * 这是用户注册的功能
	 
	 *	user
	 * 	要注册的用户
	 */
		public abstract void regist(User user);


}
