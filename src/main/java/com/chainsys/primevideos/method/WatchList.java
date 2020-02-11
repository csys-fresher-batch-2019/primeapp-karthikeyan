package com.chainsys.primevideos.method;

import java.time.LocalDate;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class WatchList {
	private int userId;
	private int primeId;
	private String status = "watching";
	private int likes = 0;
	private LocalDate startedon;
	private int viewerrating;


}
