package org.ssh02.service;

import java.util.List;

import org.ssh02.pojo.Emp;

public interface EmpService {

	List<Emp> selectAll(String sql, Emp emp);

}
