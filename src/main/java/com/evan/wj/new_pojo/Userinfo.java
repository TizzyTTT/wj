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
@Table ( name ="userinfo")
public class Userinfo  implements Serializable {

	private static final long serialVersionUID =  1365400816460005338L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   	@Column(name = "id" )
	private int id;

   	@Column(name = "username" )
	private String username;

   	@Column(name = "password" )
	private String password;

   	@Column(name = "orgid" )
	private int orgid;

   	@Column(name = "realname" )
	private String realname;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getOrgid() {
		return this.orgid;
	}

	public void setOrgid(int orgid) {
		this.orgid = orgid;
	}

	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	@Override
	public String toString() {
		return "{" +
					"id='" + id + '\'' +
					"username='" + username + '\'' +
					"password='" + password + '\'' +
					"orgid='" + orgid + '\'' +
					"realname='" + realname + '\'' +
				'}';
	}

}
