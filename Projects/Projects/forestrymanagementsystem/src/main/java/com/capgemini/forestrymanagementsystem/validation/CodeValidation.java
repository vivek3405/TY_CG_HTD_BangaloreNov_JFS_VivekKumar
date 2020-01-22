package com.capgemini.forestrymanagementsystem.validation;

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

	public static boolean mobile(long mobile) {
		
		long tempMobile = mobile;
		for (int i = 0; i < tempMobile; i++) {
			tempMobile = tempMobile / 10;
			if (tempMobile > 5) {
				int count = 0;
				while (count<10) {
					mobile = mobile / 10;
					count++;
				}
				if (count == 10) {
					return true;
				}
			}
		}

		return false;
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
	public static boolean name(String name) {
		int temp=0;
		int nameCount=name.length();
		for(int i=0; i<nameCount;i++) {
			char ch=name.charAt(i);
			if((ch >= 'a' && ch <='z')||(ch >= 'A' && ch <='Z')||(ch==' ')) {
				continue;
			}else {
				temp++;
			}
		}
		if(temp==0) {
			return true;
		}
		return false;
	}
}