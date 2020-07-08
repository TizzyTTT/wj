package com.evan.wj.new_pojo;

import javax.persistence.*;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @Description  
 * @Author  wwhh
 * @Date 2020-07-08 17:54:11 
 */

@Entity
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
@Table ( name ="cabinet")
public class Cabinet  implements Serializable {

	private static final long serialVersionUID =  8313715178068406069L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   	@Column(name = "id" )
	private int id;

   	@Column(name = "cabname" )
	private String cabname;

   	@Column(name = "cabno" )
	private String cabno;

   	@Column(name = "cabaddr" )
	private String cabaddr;

   	@Column(name = "cabremark" )
	private String cabremark;

   	@Column(name = "orgid" )
	private int orgid;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCabname() {
		return this.cabname;
	}

	public void setCabname(String cabname) {
		this.cabname = cabname;
	}

	public String getCabno() {
		return this.cabno;
	}

	public void setCabno(String cabno) {
		this.cabno = cabno;
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

	public int getOrgid() {
		return this.orgid;
	}

	public void setOrgid(int orgid) {
		this.orgid = orgid;
	}

	@Override
	public String toString() {
		return "{" +
					"id='" + id + '\'' +
					"cabname='" + cabname + '\'' +
					"cabno='" + cabno + '\'' +
					"cabaddr='" + cabaddr + '\'' +
					"cabremark='" + cabremark + '\'' +
					"orgid='" + orgid + '\'' +
				'}';
	}

}
