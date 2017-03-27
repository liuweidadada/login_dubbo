package com.service.daoImp;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.service.pojo.UserInfo;

@Repository("loginStateRecordDao")
public class LoginStateRecordDaoImpl implements com.service.dao.LoginStateRecordDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession(){
		return this.sessionFactory.getCurrentSession();
	}
	
	

	@Override
	public void flush() {
		this.getCurrentSession().flush();

	}



	@Override
	public UserInfo load(String id) {
		// TODO Auto-generated method stub
		return (UserInfo) this.getCurrentSession().load(UserInfo.class, id);
	}



	@Override
	public UserInfo get(String id) {
		// TODO Auto-generated method stub
		return (UserInfo) this.getCurrentSession().get(UserInfo.class, id);
	}



	@Override
	public List<UserInfo> findAll() {
		// TODO Auto-generated method stub
		List<UserInfo> acctUsers = this.getCurrentSession().createQuery("from UserInfo").list();
		return acctUsers;
	}


	@Override
	public void persist(UserInfo entity) {
		// TODO Auto-generated method stub
		this.getCurrentSession().persist(entity);
	}



	@Override
	public String save(UserInfo entity) {
		// TODO Auto-generated method stub
		return (String) this.getCurrentSession().save(entity);
	}



	@Override
	public void saveOrUpdate(UserInfo entity) {
		// TODO Auto-generated method stub
		this.getCurrentSession().saveOrUpdate(entity);
	}
	
	@Override
	public void close() {
		// TODO Auto-generated method stub
		this.getCurrentSession().close();
	}



	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		this.getCurrentSession().delete(id);
	}



	@Override
	public List<UserInfo> checkUserInfo(String username, String passwd) {
		// TODO Auto-generated method stub
		List<UserInfo> acctUsers = this.getCurrentSession().createQuery("from UserInfo where psn_account='"+username+"' and PSN_PWD='"+passwd+"'").list();
		return acctUsers;
		
		
//		String sql="SELECT a.id AS applyid,a.createtime AS applytime,a.bugid,b.iconimage AS bugicon,b.houseid AS roomid,b.createtime AS bugcreatetime,b.typeid AS bugtypeid,b.lstatus AS bugstatus,b.askdate AS bugaskdate ,a.adesc AS applydesc,b.roomdesc,b.bugtypedesc FROM bug_delayrecord a,bug_main b WHERE a.bugid=b.id AND a.personcheck=? AND a.pstatus=0 ORDER BY a.createtime DESC ";
//		Session session = sessionFactory.getCurrentSession();
//		Query query = session.createSQLQuery(sql);
//		query.setString(0, account);
//		query.setResultTransformer(CriteriaSpecification.ALIAS_TO_ENTITY_MAP );
//		return query.list();
	}
	
	@Override
	public List<UserInfo> checkWebUserInfo(String username, String passwd) {
		// TODO Auto-generated method stub
		List<UserInfo> acctUsers = this.getCurrentSession().createQuery("from UserInfo where psn_account='"+username+"' and PSN_PWD='"+passwd+"' and TENANT_ORG_SERVICE_ID='1'").list();
		return acctUsers;
		
		
//		String sql="SELECT a.id AS applyid,a.createtime AS applytime,a.bugid,b.iconimage AS bugicon,b.houseid AS roomid,b.createtime AS bugcreatetime,b.typeid AS bugtypeid,b.lstatus AS bugstatus,b.askdate AS bugaskdate ,a.adesc AS applydesc,b.roomdesc,b.bugtypedesc FROM bug_delayrecord a,bug_main b WHERE a.bugid=b.id AND a.personcheck=? AND a.pstatus=0 ORDER BY a.createtime DESC ";
//		Session session = sessionFactory.getCurrentSession();
//		Query query = session.createSQLQuery(sql);
//		query.setString(0, account);
//		query.setResultTransformer(CriteriaSpecification.ALIAS_TO_ENTITY_MAP );
//		return query.list();
	}

}
