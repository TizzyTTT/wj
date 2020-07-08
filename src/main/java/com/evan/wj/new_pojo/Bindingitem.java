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
@Table ( name ="bindingitem")
public class Bindingitem  implements Serializable {

	private static final long serialVersionUID =  4623191212892130557L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   	@Column(name = "id" )
	private int id;

   	@Column(name = "weight" )
	private BigDecimal weight;

   	@Column(name = "epc" )
	private String epc;

   	@Column(name = "chemicalid" )
	private String chemicalid;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getWeight() {
		return this.weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public String getEpc() {
		return this.epc;
	}

	public void setEpc(String epc) {
		this.epc = epc;
	}

	public String getChemicalid() {
		return this.chemicalid;
	}

	public void setChemicalid(String chemicalid) {
		this.chemicalid = chemicalid;
	}

	@Override
	public String toString() {
		return "{" +
					"id='" + id + '\'' +
					"weight='" + weight + '\'' +
					"epc='" + epc + '\'' +
					"chemicalid='" + chemicalid + '\'' +
				'}';
	}

}
