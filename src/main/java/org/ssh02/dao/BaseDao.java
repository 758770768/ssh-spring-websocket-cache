package org.ssh02.dao;

import java.util.List;

public interface BaseDao<T> {

	List<T> selectAll(String hql);

	void delete(T t);

	void addOne(T t);

	void update(T t);

	List<T> selectAllBySql(String sql, T t);

}
