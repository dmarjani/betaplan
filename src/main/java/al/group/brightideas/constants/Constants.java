package main.java.al.group.brightideas.constants;

import java.util.regex.Pattern;

public class Constants {

	// roles
	public static final String ROLE_ADMIN = "ADMIN";
	public static final String ROLE_SIMPLE = "SIMPLE";
	
	//regex email under HTML specification
	public static Pattern EMAIL_REGEX= Pattern.compile("^[a-zA-Z0-9.!#$%&'*+\\/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$");

	// packages
	public static final String PCKG_NAME_BASIC = "Basic";
}
