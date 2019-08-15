package com.github.zhangzw0505.commons.constants;

public class MimeType {
	
	public final static String TEXT_HTML = "text/html";
	
	public final static String TEXT_PLAIN = "text/plain";
	
	public final static String TEXT_CSS = "text/css";
	
	public final static String TEXT_XML = "text/xml";
	
	public final static String TEXT_MARKDOWN = "text/markdown";
	
	public final static String IMAGE_GIF = "image/gif";
	
	public final static String IMAGE_JPEG = "image/jpeg";
	
	public final static String IMAGE_JPG = "image/jpg";
	
	public final static String IMAGE_PNG = "image/png";
	
	public final static String APPLICATION_FORM_URLENCODED = "application/x-www-form-urlencoded";
	
	public final static String APPLICATION_JAVASCRIPT = "application/javascript";
	
	public final static String APPLICATION_JSON = "application/json";
	
	public final static String APPLICATION_XML = "application/xml";
	
	public final static String APPLICATION_PDF = "application/pdf";
	
	public final static String APPLICATION_OCTET_STREAM = "application/octet-stream";
	
	public final static String APPLICATION_MSWORD = "application/msword";
	
	public final static String MULTIPART_FORM_DATA = "multipart/form-data";
	
	public static String addUTF8(String mimeType) {
		return addCharset(mimeType, CharSets.STR_UTF_8);
	}
	
	public static String addCharset(String mimeType, String charsetName) {
		return mimeType + ";charset=" + charsetName;
	}
}
