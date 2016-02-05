package de.silvawb.utils;

import java.lang.annotation.Repeatable;

@Repeatable(Invs.class)
public @interface Inv {
	String constraint();
}
