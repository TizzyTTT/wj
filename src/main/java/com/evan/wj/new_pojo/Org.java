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
@Table ( name ="org")
public class Org  implements Serializable {

	private static final long serialVersionUID =  5083287281622800811L;

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

	/**
	 * 组织英文名称
	 */
   	@Column(name = "orgname" )
	private String orgname;

	/**
	 * 组织中文名称
	 */
   	@Column(name = "orgname_zh" )
	private String orgnameZh;

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

	public String getOrgname() {
		return this.orgname;
	}

	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}

	public String getOrgnameZh() {
		return this.orgnameZh;
	}

	public void setOrgnameZh(String orgnameZh) {
		this.orgnameZh = orgnameZh;
	}

	@Override
	public String toString() {
		return "{" +
					"id='" + id + '\'' +
					"pid='" + pid + '\'' +
					"orgname='" + orgname + '\'' +
					"orgnameZh='" + orgnameZh + '\'' +
				'}';
	}

}
