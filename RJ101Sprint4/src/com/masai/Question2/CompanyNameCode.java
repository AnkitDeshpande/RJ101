package com.masai.Question2;

import java.util.HashMap;
import java.util.Map;

public class CompanyNameCode {
	final static Map<String, String> companyCode = new HashMap<>();

	static {
		companyCode.put("EKP", "Ekoplay");
		companyCode.put("EXP", "Explore");
		companyCode.put("FSK", "Funskool");
		companyCode.put("NKT", "Natkhat");
		companyCode.put("SLD", "Sunlord");
		companyCode.put("TZN", "ToyZone");
	}
}
