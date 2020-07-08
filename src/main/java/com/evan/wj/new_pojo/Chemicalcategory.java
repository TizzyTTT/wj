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
@Table ( name ="chemicalcategory")
public class Chemicalcategory  implements Serializable {

	private static final long serialVersionUID =  6529901575202633004L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   	@Column(name = "id" )
	private int id;

   	@Column(name = "cname" )
	private String cname;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "{" +
					"id='" + id + '\'' +
					"cname='" + cname + '\'' +
				'}';
	}

}
