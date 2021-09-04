package java.al.group.brightideas.util;

public class Utils {

	public static Boolean isNotEmptyString(String str) {
		return str != null && !str.trim().isEmpty();
	}
	
	public static Boolean isNotNullObject(Object obj) {
		return obj != null;
	}
	
}
