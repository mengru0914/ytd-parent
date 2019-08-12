package com.ytd.jxsign;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class SignMapUtil {
	@SuppressWarnings("rawtypes")
	public static String mergeMap(TreeMap treeMap) {
		Map<String, String> reqMap = new TreeMap<String, String>(treeMap);
		StringBuffer buff = new StringBuffer();
		Iterator<Map.Entry<String, String>> iter = reqMap.entrySet().iterator();
		Map.Entry<String, String> entry;
		while (iter.hasNext()) {
			entry = iter.next();
			if (!"sign".equals(entry.getKey())) {
				if (entry.getValue() == null) {
					entry.setValue("");
					buff.append("");
				} else {
					buff.append(String.valueOf(entry.getValue()));
				}
			}
		}
		String requestMerged = buff.toString();
		return requestMerged;
	}

}
