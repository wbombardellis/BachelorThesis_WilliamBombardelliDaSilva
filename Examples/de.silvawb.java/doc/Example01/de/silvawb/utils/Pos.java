package de.silvawb.utils;

import java.lang.annotation.Repeatable;

@Repeatable(Poss.class)
public @interface Pos {
	String constraint();
}
