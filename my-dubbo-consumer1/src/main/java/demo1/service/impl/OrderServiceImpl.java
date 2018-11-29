package demo1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo1.bean.UserAddress;
import demo1.service.OrderService;
import demo1.service.UserService;

/**
 * 1.将服务提供者注册到注册中心
 * 		1）导入dubbo依赖和操作zookeeper的包
 * 2.让服务消费者去注册中心订阅服务
 * @author Administrator
 *
 */
@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	UserService userService;
	public void initOrder(int id) {
		System.out.println("调用者id："+id);
		List<UserAddress> addresseslist = userService.getAddress(1);
		for (UserAddress userAddress : addresseslist) {
			System.out.println(userAddress.getAddress());
		}
		
	}

}
