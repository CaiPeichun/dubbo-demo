package demo1.service;

import java.util.List;

import demo1.bean.UserAddress;

/**
 * �û�����
 * @author Administrator
 *
 */
public interface UserService {

	/**
	 * �����û�id�����û��ĵ�ַ
	 */
	public List<UserAddress> getAddress(int id);
}
