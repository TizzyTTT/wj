package com.evan.wj.new_pojo;

import javax.persistence.*;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @Description
 * @Author  wwhh
 * @Date 2020-07-16 14:54:50
 */

@Entity
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
@Table ( name ="cabinet")
public class Cabinet  implements Serializable {

	private static final long serialVersionUID =  2557557943119594483L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   	@Column(name = "id" )
	private int id;

   	@Column(name = "cabno" )
	private String cabno;

   	@Column(name = "cabname" )
	private String cabname;

   	@Column(name = "cabaddr" )
	private String cabaddr;

   	@Column(name = "cabremark" )
	private String cabremark;

   	@ManyToOne
   	@JoinColumn(name = "orgid" )
	private Org org;

   	@Column(name = "runstate" )
	private int runstate;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCabno() {
		return this.cabno;
	}

	public void setCabno(String cabno) {
		this.cabno = cabno;
	}

	public String getCabname() {
		return this.cabname;
	}

	public void setCabname(String cabname) {
		this.cabname = cabname;
	}

	public String getCabaddr() {
		return this.cabaddr;
	}

	public void setCabaddr(String cabaddr) {
		this.cabaddr = cabaddr;
	}

	public String getCabremark() {
		return this.cabremark;
	}

	public void setCabremark(String cabremark) {
		this.cabremark = cabremark;
	}

	public Org getOrg() {
		return org;
	}

	public void setOrg(Org org) {
		this.org = org;
	}

	public int getRunstate() {
		return this.runstate;
	}

	public void setRunstate(int runstate) {
		this.runstate = runstate;
	}

	@Override
	public String toString() {
		return "{" +
					"id='" + id + '\'' +
					"cabno='" + cabno + '\'' +
					"cabname='" + cabname + '\'' +
					"cabaddr='" + cabaddr + '\'' +
					"cabremark='" + cabremark + '\'' +
					"orgid='" + org.getId() + '\'' +
					"runstate='" + runstate + '\'' +
				'}';
	}

}
