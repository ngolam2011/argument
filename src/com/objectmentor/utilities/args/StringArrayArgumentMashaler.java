package com.objectmentor.utilities.args;

import java.util.Iterator;

public class StringArrayArgumentMashaler implements ArgumentMarshaler {
	private String[] arrys;
	@Override
	public void set(Iterator<String> currentArgument) throws ArgsException {
		// TODO Auto-generated method stub

	}

	public static String[] getValue(ArgumentMarshaler am) {
		if (am != null && am instanceof StringArrayArgumentMashaler)
			return ((StringArrayArgumentMashaler) am).arrys;
		else
			return null;
	}
}
