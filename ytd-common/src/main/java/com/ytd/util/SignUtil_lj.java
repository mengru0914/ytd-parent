package com.ytd.util;

import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import com.ytd.jxsign.RSAHelper;
import com.ytd.jxsign.RSAKeyUtil;
import pppig.api.common.consts.CommonDef;



/**
 * 签名工具类
 */
public class SignUtil_lj {
	
	//***************************************SIT***********************************
//	private static String keys = CommonDef.JX_SECRET_KEY +"pangpangzhu_sit2.p12";//私钥文件
//	private static String pass = "pangpangzhu_sit@2016"; //私钥密码
//	private static String  crt = CommonDef.JX_SECRET_KEY +"fdep2.crt"; 
	
	//***************************************UAT***********************************
	private static String keys = CommonDef.JX_SECRET_KEY +"pangpangzhu_uat.p12";//私钥文件
	private static String pass = "pangpangzhu_uat@2016"; //私钥密码
	private static String  crt = CommonDef.JX_SECRET_KEY+"fdep.crt";
	
	//***************************************生产***********************************
//	public final static String keys = CommonDef.JX_SECRET_KEY + "pangpangzhu.p12";//私钥文件
//	public final static String pass = "pangpangzhu@2016"; //私钥密码
//	public final static String crt = CommonDef.JX_SECRET_KEY + "cs_jx.crt";
	
	/**
	 * 签名算法
	 */
	public SignUtil_lj() {

	}

	/**
	 * 获取签名
	 * 
	 * @param signStr  待签名字符串
	 * @return
	 * @throws Exception
	 */
	public static String sign(String signStr){
//		System.out.println((new StringBuilder()).append("(P2P-->即信端)待签名字符串：").append(signStr).toString());
		String sign = null;
		RSAHelper signer = null;
		try {
			//Signature sig = Signature.getInstance(SIGN_ALGORITHMS);
			
//			System.out.println("(P2P-->即信端)获取签名私钥:"+keys);
			RSAKeyUtil rsaKey = new RSAKeyUtil(new File(keys), pass);
			signer = new RSAHelper(rsaKey.getPrivateKey());
			
		    sign = signer.sign(signStr);
		} catch (Exception e) {
			System.out.println("签名校验异常"+e.getMessage());
		}
//		System.out.println((new StringBuilder()).append("(P2P-->即信端)签名:").append(sign).toString());
		return sign;
	}
	
	/**
	 *  签名校验
	 * @param signText  待验的签名
	 * @param dataText  待签名字符串
	 * @return
	 */
	public static boolean verify(String signText,String dataText){
		signText = signText.replaceAll("[\\t\\n\\r]", "");
//		System.out.println((new StringBuilder()).append("(即信端-->P2P)待签名字符串：").append(dataText).toString());
//		System.out.println((new StringBuilder()).append("(即信端-->P2P)签名：").append(signText).toString());

		boolean b = false;
		try {
			RSAKeyUtil ru = new RSAKeyUtil(new File(crt)); 
			RSAHelper signHelper = new RSAHelper(ru.getPublicKey()); 
			b = signHelper.verify(dataText , signText);
		} catch (Exception e) {
			System.out.println("签名校验异常"+e.getMessage());
		}
		
		return b;
	}

	/**
	 * 拼接字符串
	 * @param map
	 * @return
	 */
	@SuppressWarnings({ "rawtypes" })
	public static String mergeMap(Map map) {
		map = new TreeMap(map);
		String requestMerged = "";
		StringBuffer buff = new StringBuffer();
		Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
		Map.Entry<String, String> entry;
		while (iter.hasNext()) {
			entry = iter.next();
			if (!"SIGN".equalsIgnoreCase(entry.getKey())) {
				if(entry.getValue()==null){
					entry.setValue("");
					buff.append("");
				}else{
						buff.append(String.valueOf(entry.getValue()));
				}
			}
		}
		requestMerged = buff.toString();
		return requestMerged;
	}
}
