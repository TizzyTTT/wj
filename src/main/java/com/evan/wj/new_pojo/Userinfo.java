package com.evan.wj.new_pojo;

import javax.persistence.*;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;

/**
 * @Description
 * @Author  wwhh
 * @Date 2020-07-16 14:54:50
 */

@Entity
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
@Table ( name ="userinfo")
public class Userinfo  implements Serializable {

	private static final long serialVersionUID =  4031837938595467665L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   	@Column(name = "id" )
	private int id;

   	@Column(name = "userno" )
	private String userno;

   	@Column(name = "username" )
	private String username;

   	@Column(name = "password" )
	private String password;

   	@Column(name = "realname" )
	private String realname;

   	@ManyToOne
   	@JoinColumn(name = "orgid" )
	private Org org;

   	@Column(name = "createtime" )
	private Date createtime;

   	@Column(name = "userrole" )
	private int userrole;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserno() {
		return this.userno;
	}

	public void setUserno(String userno) {
		this.userno = userno;
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

	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public Org getOrg() {
		return org;
	}

	public void setOrg(Org org) {
		this.org = org;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public int getUserrole() {
		return this.userrole;
	}

	public void setUserrole(int userrole) {
		this.userrole = userrole;
	}

	@Override
	public String toString() {
		return "{" +
					"id='" + id + '\'' +
					"userno='" + userno + '\'' +
					"username='" + username + '\'' +
					"password='" + password + '\'' +
					"realname='" + realname + '\'' +
					"orgid='" + org.getId() + '\'' +
					"createtime='" + createtime + '\'' +
					"userrole='" + userrole + '\'' +
				'}';
	}

}
