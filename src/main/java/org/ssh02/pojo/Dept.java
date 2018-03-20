package org.ssh02.pojo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Dept {

	@Id
	private Integer did;
	private String dname;
	@OneToMany
	@JoinColumn(name = "did")
	private List<Emp> es;

	public Integer getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public List<Emp> getEs() {
		return es;
	}

	public void setEs(List<Emp> es) {
		this.es = es;
	}

}
