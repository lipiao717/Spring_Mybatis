package cn.itcast.ssm.dao;

import cn.itcast.ssm.po.User;

/**
 * dao接口
 * @author Administrator
 *
 */
public interface UserDao {
	//根据id查询用户信息
	public User findUserById(int id) throws Exception;
	
}
