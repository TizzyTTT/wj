package com.evan.wj.new_pojo;

import javax.persistence.*;
import java.io.Serializable;

import com.evan.wj.pojo.Category;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @Description
 * @Author  wwhh
 * @Date 2020-07-08 17:54:11
 */

@Entity
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
@Table ( name ="chemicals")
public class Chemicals  implements Serializable {

	private static final long serialVersionUID =  2427816377618505591L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   	@Column(name = "id" )
	private int id;


//   @Column(name = "cid" )
//	private int cid;

	@ManyToOne
	@JoinColumn(name="cid")
	private Chemicalcategory chemicalcategory;

   	@Column(name = "chemicalname" )
	private String chemicalname;

   	@Column(name = "danwei" )
	private String danwei;

   	@Column(name = "chemicalno" )
	private String chemicalno;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Chemicalcategory getChemicalcategory() {
		return this.chemicalcategory;
	}

	public void setCategory(Chemicalcategory chemicalcategory) {
		this.chemicalcategory = chemicalcategory;
	}

	public String getChemicalname() {
		return this.chemicalname;
	}

	public void setChemicalname(String chemicalname) {
		this.chemicalname = chemicalname;
	}

	public String getDanwei() {
		return this.danwei;
	}

	public void setDanwei(String danwei) {
		this.danwei = danwei;
	}

	public String getChemicalno() {
		return this.chemicalno;
	}

	public void setChemicalno(String chemicalno) {
		this.chemicalno = chemicalno;
	}


}
