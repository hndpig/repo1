package com.hnd.hotel.entity;

import java.io.Serializable;
import java.math.BigDecimal;



public class Room implements Serializable{
	Integer rid;
	String loc;
	String rphone;
	Integer type;
	BigDecimal price ;
	Integer rdeposit;
	Integer status;//0Ϊ���У�1Ϊ����
	
}
