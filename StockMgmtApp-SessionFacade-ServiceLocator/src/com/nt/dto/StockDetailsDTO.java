package com.nt.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class StockDetailsDTO  implements Serializable {
	private long stockId;
	private  String stockName;
	private  long currentValue;
	private  List<Long> historyValues;
	private  List<Long> futureValues;
	

}
