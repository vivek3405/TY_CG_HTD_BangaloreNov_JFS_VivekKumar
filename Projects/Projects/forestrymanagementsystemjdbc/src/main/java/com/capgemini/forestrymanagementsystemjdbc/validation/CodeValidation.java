package com.capgemini.forestrymanagementsystemjdbc.validation;

public class CodeValidation {

	public static boolean email(String email) {
		if (email.contains(".com") && email.contains("@")) {
			if (((email.charAt(email.length() - 1) == 'm') && (email.charAt(email.length() - 2) == 'o')
					&& (email.charAt(email.length() - 3) == 'c') && (email.charAt(email.length() - 4) == '.'))
					|| ((email.charAt(email.length() - 1) == 'n') && (email.charAt(email.length() - 2) == 'i')
							&& (email.charAt(email.length() - 3) == '.'))) {
				return true;
			}
		}
		return false;
	}

	public static boolean mobile(String mobile) {
		if (mobile.length() == 10) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean date(String date) {
		if (date.charAt(0) == '2') {
			if (date.length() == 10) {
				int count = 0;
				for (int i = 0; i < date.length(); i++) {
					char d = date.charAt(i);
					count++;
					if (count >= 4 && d == '/') {
						count++;
						if (count >= 7 && d == '/') {
							return true;
						}

					}
				}
			}
		} else {
			System.out.println("Please enter current or future dates");
		}
		return false;
	}
}