package admin;
import admin.UserLogin;
import admin.User;
/**
 * 
 * 项目名称：cars   
 * 类名称：UserLoginImpl   
 * 类描述： 初始化  
 * 创建人： 饶蓓雷  
 * 创建时间：2019-1-20 上午9:05:22   
 * @version        
 */
public class UserLoginImpl implements UserLogin {
	    // 定义成员变量数组
		private static User[] users = new User[5];
		private static int index = 0;
	 
		// User users = new User();
	 
		@Override
		public boolean Login(String username, String password) {
			/*
			 * 遍历数组，获取到每一个对象， 然后再拿着对象的用户名和密码 和传递过来的用户名和密码进行比较
			 */
			boolean flag = false;
			for (int i = 0; i < users.length; i++) {
				User user = users[i];
				// 判断是否为null
				if (user != null) {
					if (user.getUsername().equals(username)
							&& user.getPassword().equals(password)) {
						flag = true;
						break;
					}
				}
			}
			return flag;
		}
	 
		@Override
		// 注册
		public void regist(User user) {
			users[index++] = user;
		}



}
