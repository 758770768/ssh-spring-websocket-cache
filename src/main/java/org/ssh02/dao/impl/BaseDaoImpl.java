package org.ssh02.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.ssh02.dao.BaseDao;

public class BaseDaoImpl<T> implements BaseDao<T> {

	@Resource
	private SessionFactory sf;

	@Override
	public List<T> selectAll(String hql) {
		Session session = sf.getCurrentSession();
		Query query = session.createQuery(hql);
		List list = query.list();
		return list;
	}

	@Override
	public void delete(T t) {
		Session session = sf.getCurrentSession();
		session.delete(t);
	}

	@Override
	public void addOne(T t) {
		Session session = sf.getCurrentSession();
		session.save(t);

	}

	@Override
	public void update(T t) {
		Session session = sf.getCurrentSession();
		session.saveOrUpdate(t);

	}

	@Override
	public List<T> selectAllBySql(String sql, T t) {
		Session session = sf.getCurrentSession();
		SQLQuery sqlQuery = session.createSQLQuery(sql);
		sqlQuery.addEntity(t.getClass());
		List list = sqlQuery.list();
		return list;
	}

}
