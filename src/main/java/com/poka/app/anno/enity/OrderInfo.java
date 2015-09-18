package com.poka.app.anno.enity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.poka.app.enumtype.OrderType;
import com.poka.app.enumtype.StateType;

@Entity
@Table(name = "T_OrderInfo")
public class OrderInfo implements Serializable {

	private Integer id;
	private String orderId;
	private OrderType orderType;
	private Date insertDate;
	private StateType state;
	private Date finishDate;

	
	@Override
	public String toString() {
		return "OrderInfo [id=" + id + ", orderId=" + orderId + ", orderType="
				+ orderType + ", insertDate=" + insertDate + ", state=" + state
				+ ", finishDate=" + finishDate + "]";
	}

	@Id
	@Column(name = "FID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "OrderId", length = 50)
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	@Column(name = "OrderType")
	@Enumerated(EnumType.ORDINAL)
	public OrderType getOrderType() {
		return orderType;
	}

	public void setOrderType(OrderType orderType) {
		this.orderType = orderType;
	}

	@Column(name = "InsertDate")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	@Column(name = "State")
	@Enumerated(EnumType.ORDINAL)
	public StateType getState() {
		return state;
	}

	public void setState(StateType state) {
		this.state = state;
	}

	@Column(name = "FinishDate")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}

}
