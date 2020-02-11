package com.chainsys.primevideos.method;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class AdminInterface {
	private String adminId;
	private String adminName;
	private String loginKey;
	private String password;
	private int status;
}
