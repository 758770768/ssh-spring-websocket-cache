package org.ssh02.pojo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class DDD {

	@Id
	private Integer ddid;
	private String ddname;
	@OneToMany
	@JoinColumn(name = "ddid")
	private List<Emp> es;

	public Integer getDdid() {
		return ddid;
	}

	public void setDdid(Integer ddid) {
		this.ddid = ddid;
	}

	public String getDdname() {
		return ddname;
	}

	public void setDdname(String ddname) {
		this.ddname = ddname;
	}

	public List<Emp> getEs() {
		return es;
	}

	public void setEs(List<Emp> es) {
		this.es = es;
	}

}
