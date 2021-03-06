package com.micro.pmo.commons.config;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * wxpay pay properties
 *
 * @author Binary Wang
 */
@ConfigurationProperties(prefix = "wx.pay")
public class WxPayProperties {
	/**
	 * 设置微信公众号或者小程序等的appid
	 */
	private String jsapiAppId;

	/**
	 * APP appId
	 */
	private String appAppId;

	/**
	 * 微信公众号或者小程序的支付回调
	 */
	private String jsapiNotifyUrl;

	/**
	 * APP支付回调
	 */
	private String appNotifyUrl;

	/**
	 * 微信支付商户号
	 */
	private String mchId;

	/**
	 * 微信支付商户密钥
	 */
	private String mchKey;

	/**
	 * 服务商模式下的子商户公众账号ID，普通模式请不要配置，请在配置文件中将对应项删除
	 */
	private String subAppId;

	/**
	 * 服务商模式下的子商户号，普通模式请不要配置，最好是请在配置文件中将对应项删除
	 */
	private String subMchId;

	/**
	 * apiclient_cert.p12文件的绝对路径，或者如果放在项目中，请以classpath:开头指定
	 */
	private String keyPath;

	public String getJsapiAppId() {
		return jsapiAppId;
	}

	public void setJsapiAppId(String jsapiAppId) {
		this.jsapiAppId = jsapiAppId;
	}

	public String getAppAppId() {
		return appAppId;
	}

	public void setAppAppId(String appAppId) {
		this.appAppId = appAppId;
	}

	public String getJsapiNotifyUrl() {
		return jsapiNotifyUrl;
	}

	public void setJsapiNotifyUrl(String jsapiNotifyUrl) {
		this.jsapiNotifyUrl = jsapiNotifyUrl;
	}

	public String getAppNotifyUrl() {
		return appNotifyUrl;
	}

	public void setAppNotifyUrl(String appNotifyUrl) {
		this.appNotifyUrl = appNotifyUrl;
	}

	public String getMchId() {
		return mchId;
	}

	public void setMchId(String mchId) {
		this.mchId = mchId;
	}

	public String getMchKey() {
		return mchKey;
	}

	public void setMchKey(String mchKey) {
		this.mchKey = mchKey;
	}

	public String getSubAppId() {
		return subAppId;
	}

	public void setSubAppId(String subAppId) {
		this.subAppId = subAppId;
	}

	public String getSubMchId() {
		return subMchId;
	}

	public void setSubMchId(String subMchId) {
		this.subMchId = subMchId;
	}

	public String getKeyPath() {
		return this.keyPath;
	}

	public void setKeyPath(String keyPath) {
		this.keyPath = keyPath;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
}
