package org.ssh02.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {

	@Id
	private Integer eid;
	private String ename;

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

}
