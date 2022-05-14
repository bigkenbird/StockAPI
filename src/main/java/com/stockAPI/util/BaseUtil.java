package com.stockAPI.util;

import java.util.ArrayList;
import java.util.List;

public class BaseUtil {
	
	public static <E> List<E> transArrayToList(E[] eArray){
		if(eArray==null) {
			return null;
		}
		List<E> returnList = new ArrayList<E>();
		for(E element:eArray) {
			returnList.add(element);
		}
		return returnList;
		
	}
	
	public static boolean checkArrayIsEmpty(Object[] source) {
		return (source==null||source.length==0);
	}
	
	 

}
