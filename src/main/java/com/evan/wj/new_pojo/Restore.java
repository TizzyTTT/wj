package com.evan.wj.new_pojo;

import javax.persistence.*;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.math.BigDecimal;

/**
 * @Description  
 * @Author  wwhh
 * @Date 2020-07-08 17:54:11 
 */

@Entity
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
@Table ( name ="restore")
public class Restore  implements Serializable {

	private static final long serialVersionUID =  3385550175402387395L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   	@Column(name = "id" )
	private int id;

   	@Column(name = "epc" )
	private int epc;

   	@Column(name = "cabid" )
	private int cabid;

   	@Column(name = "chemicalid" )
	private int chemicalid;

   	@Column(name = "weight" )
	private BigDecimal weight;

   	@Column(name = "level" )
	private int level;

   	@Column(name = "danwei" )
	private String danwei;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEpc() {
		return this.epc;
	}

	public void setEpc(int epc) {
		this.epc = epc;
	}

	public int getCabid() {
		return this.cabid;
	}

	public void setCabid(int cabid) {
		this.cabid = cabid;
	}

	public int getChemicalid() {
		return this.chemicalid;
	}

	public void setChemicalid(int chemicalid) {
		this.chemicalid = chemicalid;
	}

	public BigDecimal getWeight() {
		return this.weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getDanwei() {
		return this.danwei;
	}

	public void setDanwei(String danwei) {
		this.danwei = danwei;
	}

	@Override
	public String toString() {
		return "{" +
					"id='" + id + '\'' +
					"epc='" + epc + '\'' +
					"cabid='" + cabid + '\'' +
					"chemicalid='" + chemicalid + '\'' +
					"weight='" + weight + '\'' +
					"level='" + level + '\'' +
					"danwei='" + danwei + '\'' +
				'}';
	}

}
