package org.ssh02.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.ssh02.dao.EmpDao;
import org.ssh02.pojo.Emp;
import org.ssh02.service.EmpService;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {

	@Resource
	private EmpDao ed;

	@Override
	public List<Emp> selectAll(String sql, Emp emp) {

		List<Emp> el = ed.selectAllBySql(sql, emp);
		return el;
	}

}
