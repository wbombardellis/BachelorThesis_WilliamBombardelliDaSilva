package de.silvawb.utils;

import java.lang.annotation.Repeatable;

@Repeatable(Pres.class)
public @interface Pre {
	String constraint();
}
