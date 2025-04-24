package com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy.anquanzhengshu;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy.DebvgRizhiLogsjfjlf;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.X509TrustManager;

/**
 * X509 证书验证库 用于验证体检宝服务器部署的 https 证书
 * 对SSL证书进行强校验(签名CA是否合法、证书是否是自签名、主机域名是否匹配、证书是否过期等)
 */
public class MiyaoX509Guanli implements X509TrustManager {

	private X509TrustManager x509TrustManager = null;

	private X509Certificate[] x509Certificates = null;

	private Certificate pojieCa = null;

	public MiyaoX509Guanli(KeyStore jiancunchu)
			throws NoSuchAlgorithmException, KeyStoreException,
			NoSuchProviderException {

//		if (null == keystore)
//			throw new NullPointerException("KeyStore can not be null");
//
//		rootCA = keystore.getCertificate("LeafCA");
//		TrustManagerFactory factory = TrustManagerFactory.getInstance("X509");
//		factory.init(keystore);
//		TrustManager[] trustmanagers = factory.getTrustManagers();
//
//		if (trustmanagers.length == 0)
//			throw new NoSuchAlgorithmException("no trust manager found");
//		this.standardTrustManager = (X509TrustManager) trustmanagers[0];
 
	}
	
	//该方法检查客户端的证书, 若不信任该证书则抛出异常
	@Override
	public void checkClientTrusted(X509Certificate[] chain, String authType)
			throws CertificateException {

	}

	//该方法检查服务器的证书，若不信任该证书同样抛出异常
	@Override
	public void checkServerTrusted(X509Certificate[] chain, String authType)
			throws CertificateException {
		CertificateException exception = null;
		if (null == chain || 0 == chain.length) {
			DebvgRizhiLogsjfjlf.e("Authentication type is invalid.");
			exception = new CertificateException("Certificate chain is invalid");
		} else if (null == authType || 0 == authType.length()) {
			exception = new CertificateException("Authentication type is invalid.");
			DebvgRizhiLogsjfjlf.e("Authentication type is invalid.");
		} else {
			DebvgRizhiLogsjfjlf.d("Chain includes " + chain.length + " certificates.");
			for (X509Certificate cert : chain) {
				DebvgRizhiLogsjfjlf.d("Server Certificate Details:");
				DebvgRizhiLogsjfjlf.d("############################");
				DebvgRizhiLogsjfjlf.d("IssuerDN: " + cert.getIssuerDN().toString());
				DebvgRizhiLogsjfjlf.d("SubjectDN: " + cert.getSubjectDN().toString());
				DebvgRizhiLogsjfjlf.d("Serial Number: " + cert.getSerialNumber());
				DebvgRizhiLogsjfjlf.d("Version: " + cert.getVersion());
				DebvgRizhiLogsjfjlf.d("Not before: " + cert.getNotBefore().toString());
				DebvgRizhiLogsjfjlf.d("Not after: " + cert.getNotAfter().toString());
				DebvgRizhiLogsjfjlf.d("############################");
				// Make sure that it hasn't expired.
				cert.checkValidity();
			}
		}
		if (null != exception)
			throw exception;
	}

	// 返回受信任的X509证书数组
	@Override
	public X509Certificate[] getAcceptedIssuers() {
//		return standardTrustManager.getAcceptedIssuers();
		return new X509Certificate[0];
	}

}
