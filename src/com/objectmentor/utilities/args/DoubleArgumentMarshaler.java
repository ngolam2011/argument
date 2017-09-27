package com.objectmentor.utilities.args;

import java.util.Iterator;

public class DoubleArgumentMarshaler implements ArgumentMarshaler {

	private Double doubleValue = 0.0;

	@Override
	public void set(Iterator<String> currentArgument) throws ArgsException {
		// TODO Auto-generated method stub

	}

	public static Double getValue(ArgumentMarshaler am) {
		if (am != null && am instanceof DoubleArgumentMarshaler)
			return ((DoubleArgumentMarshaler) am).doubleValue;
		else
			return 0.0;
	}

}
