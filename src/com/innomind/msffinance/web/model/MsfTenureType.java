package com.innomind.msffinance.web.model;
// Generated Jul 31, 2016 12:24:15 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MsfTenureType generated by hbm2java
 */
@Entity
@Table(name = "msf_tenure_type", catalog = "msf_finance")
public class MsfTenureType implements java.io.Serializable {

	private Integer tenureTypeId;
	private String tenureTypeName;
	/*private Set<MsfClient> msfClients = new HashSet<MsfClient>(0);*/

	public MsfTenureType() {
	}

	public MsfTenureType(String tenureTypeName) {
		this.tenureTypeName = tenureTypeName;
	}

	/*public MsfTenureType(String tenureTypeName, Set<MsfClient> msfClients) {
		this.tenureTypeName = tenureTypeName;
		this.msfClients = msfClients;
	}*/

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "tenure_type_id", unique = true, nullable = false)
	public Integer getTenureTypeId() {
		return this.tenureTypeId;
	}

	public void setTenureTypeId(Integer tenureTypeId) {
		this.tenureTypeId = tenureTypeId;
	}

	@Column(name = "tenure_type_name", nullable = false, length = 10)
	public String getTenureTypeName() {
		return this.tenureTypeName;
	}

	public void setTenureTypeName(String tenureTypeName) {
		this.tenureTypeName = tenureTypeName;
	}

	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "msfTenureType")
	public Set<MsfClient> getMsfClients() {
		return this.msfClients;
	}

	public void setMsfClients(Set<MsfClient> msfClients) {
		this.msfClients = msfClients;
	}*/

}
