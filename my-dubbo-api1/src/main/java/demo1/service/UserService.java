package demo1.service;

import java.util.List;

import demo1.bean.UserAddress;

/**
 * 用户服务
 * @author Administrator
 *
 */
public interface UserService {

	/**
	 * 按照用户id返回用户的地址
	 */
	public List<UserAddress> getAddress(int id);
}
