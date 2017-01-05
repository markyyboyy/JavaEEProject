package com.qac.row5project.helpers;

import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class HasingPassword {
	
	final static byte[] salt = {12,34,32,65,76,122,124,-34,-76,-128,23};
	
	
	public static String hashPassword(final char[] password) {

		try {

			SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512");
			PBEKeySpec spec = new PBEKeySpec(password, salt, 1, 250);
			SecretKey key = skf.generateSecret(spec);
			byte[] res = key.getEncoded();

			return res.toString();

		} catch (Exception e) {

			return null;

		}

	}
	
	

	
	
	
	
	
	
	
}
