package com.bt;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Test {

	public static void main(String[] args) {
		BCryptPasswordEncoder bcpe=new BCryptPasswordEncoder();
		String bn=bcpe.encode("balaji");   //$2a$10$MoJLSQWBcIKsTQczZHnP.eLH.GCi7hF1NgwJlR8MuUoDL1xCfHlMC
		String bp=bcpe.encode("deepika");  //UCLguhji$2a$10$Ab3SwerMvPlxlqs/BuClNe6HFRWhJvJ9tSsGO7fstKTcD
		System.out.println(bn);
		System.out.println(bp);
	}

}
