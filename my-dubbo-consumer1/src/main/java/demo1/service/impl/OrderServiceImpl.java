package demo1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo1.bean.UserAddress;
import demo1.service.OrderService;
import demo1.service.UserService;

/**
 * 1.�������ṩ��ע�ᵽע������
 * 		1������dubbo�����Ͳ���zookeeper�İ�
 * 2.�÷���������ȥע�����Ķ��ķ���
 * @author Administrator
 *
 */
@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	UserService userService;
	public void initOrder(int id) {
		System.out.println("������id��"+id);
		List<UserAddress> addresseslist = userService.getAddress(1);
		for (UserAddress userAddress : addresseslist) {
			System.out.println(userAddress.getAddress());
		}
		
	}

}
