package com.evan.wj.new_pojo;

import javax.persistence.*;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;

/**
 * @Description  
 * @Author  wwhh
 * @Date 2020-07-08 17:54:11 
 */

@Entity
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
@Table ( name ="jinchu")
public class Jinchu  implements Serializable {

	private static final long serialVersionUID =  2462676457776098069L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   	@Column(name = "id" )
	private int id;

   	@Column(name = "userAid" )
	private int userAid;

   	@Column(name = "userBid" )
	private int userBid;

   	@Column(name = "iotime" )
	private Date iotime;

   	@Column(name = "cabid" )
	private int cabid;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserAid() {
		return this.userAid;
	}

	public void setUserAid(int userAid) {
		this.userAid = userAid;
	}

	public int getUserBid() {
		return this.userBid;
	}

	public void setUserBid(int userBid) {
		this.userBid = userBid;
	}

	public Date getIotime() {
		return this.iotime;
	}

	public void setIotime(Date iotime) {
		this.iotime = iotime;
	}

	public int getCabid() {
		return this.cabid;
	}

	public void setCabid(int cabid) {
		this.cabid = cabid;
	}

	@Override
	public String toString() {
		return "{" +
					"id='" + id + '\'' +
					"userAid='" + userAid + '\'' +
					"userBid='" + userBid + '\'' +
					"iotime='" + iotime + '\'' +
					"cabid='" + cabid + '\'' +
				'}';
	}

}
