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
@Table ( name ="chemicals")
public class Chemicals  implements Serializable {

	private static final long serialVersionUID =  3067937288254670587L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   	@Column(name = "id" )
	private int id;

   	@Column(name = "chemicalno" )
	private String chemicalno;

   	@Column(name = "chemicalname" )
	private String chemicalname;

   	@ManyToOne
   	@JoinColumn(name = "cid" )
	private Chemicalcategory chemicalcategory;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getChemicalno() {
		return this.chemicalno;
	}

	public void setChemicalno(String chemicalno) {
		this.chemicalno = chemicalno;
	}

	public String getChemicalname() {
		return this.chemicalname;
	}

	public void setChemicalname(String chemicalname) {
		this.chemicalname = chemicalname;
	}

	public Chemicalcategory getChemicalcategory() {
		return chemicalcategory;
	}

	public void setChemicalcategory(Chemicalcategory chemicalcategory) {
		this.chemicalcategory = chemicalcategory;
	}

	@Override
	public String toString() {
		return "{" +
					"id='" + id + '\'' +
					"chemicalno='" + chemicalno + '\'' +
					"chemicalname='" + chemicalname + '\'' +
					"cid='" + chemicalcategory.getId() + '\'' +
				'}';
	}

}
