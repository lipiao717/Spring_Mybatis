package cn.itcast.ssm.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.itcast.ssm.po.User;

public class UserDaoImp extends SqlSessionDaoSupport implements UserDao {

	@Override
	public User findUserById(int id) throws Exception {
		//继承SqlSessionDaoSupport通过this.getSqlSession()得到sqlSession
		SqlSession sqlSession = this.getSqlSession();
		User user = sqlSession.selectOne("test.findUserById", id);
		return user;
	}

}
