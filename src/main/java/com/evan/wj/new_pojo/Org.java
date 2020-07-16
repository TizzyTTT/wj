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
@Table ( name ="org")
public class Org  implements Serializable {

	private static final long serialVersionUID =  5178084753661259272L;

	/**
	 * 组织id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   	@Column(name = "id" )
	private int id;

	/**
	 * 父组织id
	 */
   	@Column(name = "pid" )
	private int pid;

   	@Column(name = "orgno" )
	private String orgno;

	/**
	 * 组织英文名称
	 */
   	@Column(name = "orgname" )
	private String orgname;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPid() {
		return this.pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getOrgno() {
		return this.orgno;
	}

	public void setOrgno(String orgno) {
		this.orgno = orgno;
	}

	public String getOrgname() {
		return this.orgname;
	}

	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}

	@Override
	public String toString() {
		return "{" +
					"id='" + id + '\'' +
					"pid='" + pid + '\'' +
					"orgno='" + orgno + '\'' +
					"orgname='" + orgname + '\'' +
				'}';
	}

}
