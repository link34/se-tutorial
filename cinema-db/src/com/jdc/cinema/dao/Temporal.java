package com.jdc.cinema.dao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Temporal {
	enum Type {DATE, TIMESTAMP, TIME}
	
	Type value() default Type.DATE;
}