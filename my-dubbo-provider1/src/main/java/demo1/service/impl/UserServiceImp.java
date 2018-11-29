package demo1.service.impl;

import java.util.Arrays;
import java.util.List;

import demo1.bean.UserAddress;
import demo1.service.UserService;

public class UserServiceImp implements UserService{

	public List<UserAddress> getAddress(int id) {
		
		UserAddress address1 = new UserAddress(1, "广东广州", "111111");
		UserAddress address2 = new UserAddress(2, "浙江杭州", "2222222");
		return Arrays.asList(address1,address2);
	}

}
