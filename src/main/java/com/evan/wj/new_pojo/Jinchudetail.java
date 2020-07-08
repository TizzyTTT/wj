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
@Table ( name ="jinchudetail")
public class Jinchudetail  implements Serializable {

	private static final long serialVersionUID =  1661508632608171079L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   	@Column(name = "id" )
	private int id;

   	@Column(name = "chemicalid" )
	private int chemicalid;

   	@Column(name = "optype" )
	private int optype;

   	@Column(name = "weight" )
	private BigDecimal weight;

   	@Column(name = "jinchuid" )
	private int jinchuid;

   	@Column(name = "epc" )
	private String epc;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getChemicalid() {
		return this.chemicalid;
	}

	public void setChemicalid(int chemicalid) {
		this.chemicalid = chemicalid;
	}

	public int getOptype() {
		return this.optype;
	}

	public void setOptype(int optype) {
		this.optype = optype;
	}

	public BigDecimal getWeight() {
		return this.weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public int getJinchuid() {
		return this.jinchuid;
	}

	public void setJinchuid(int jinchuid) {
		this.jinchuid = jinchuid;
	}

	public String getEpc() {
		return this.epc;
	}

	public void setEpc(String epc) {
		this.epc = epc;
	}

	@Override
	public String toString() {
		return "{" +
					"id='" + id + '\'' +
					"chemicalid='" + chemicalid + '\'' +
					"optype='" + optype + '\'' +
					"weight='" + weight + '\'' +
					"jinchuid='" + jinchuid + '\'' +
					"epc='" + epc + '\'' +
				'}';
	}

}
