package com.objectmentor.utilities.args;

import java.util.Iterator;
import java.util.NoSuchElementException;

import com.objectmentor.utilities.args.ArgsException.ErrorCode;

public class StringArgumentMarshaler implements ArgumentMarshaler {
	private String stringArray = "";
	@Override
	public void set(Iterator<String> currentArgument) throws ArgsException {
		try {
			stringArray = currentArgument.next();
		} catch (NoSuchElementException e) {
			throw new ArgsException(ErrorCode.MISSING_STRING);
		}
	}

	public static String getValue(ArgumentMarshaler am) {
		if (am != null && am instanceof StringArgumentMarshaler)
			return ((StringArgumentMarshaler) am).stringArray;
		else
			return null;
	}

}
