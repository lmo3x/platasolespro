package com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy.anquanzhengshu;

import android.text.TextUtils;

import com.yape.fpay.bcp.platinka.prestamo.plus.caja.voliwawayyy.QingqPeizhisSsf;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/**
 * han 2023.5.11
 */
public class MiyaoSSlGongchang extends SSLSocketFactory{

    protected SSLContext zhengshuChiyouzhe;

    public MiyaoSSlGongchang(KeyStore jiancunchu){
        try {
            zhengshuChiyouzhe = SSLContext.getInstance("TLS");
            zhengshuChiyouzhe.init(null, new TrustManager[] { new MiyaoX509Guanli(jiancunchu) }, null);

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        } catch (KeyStoreException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override
    public String[] getSupportedCipherSuites() {
        return new String[0];
    }

    @Override
    public Socket createSocket(Socket s, String host, int port, boolean autoClose) throws IOException {
        boolean trust = false;
        if(!TextUtils.isEmpty(host) && QingqPeizhisSsf.getPeichiInst().getHost().size() > 0){
            for(String mHost: QingqPeizhisSsf.getPeichiInst().getHost()){
                if(host.equals(mHost)){
                    trust = true;
                }
            }
        }
        else {
            trust = true;
        }
        if(!trust){
            s.close();
            throw new IOException("this hostname is untrusted, you can add this hostUrl in the setRequestHost() method of the \"IkUrl.java\" file");
        }
        Socket sslSocket = zhengshuChiyouzhe.getSocketFactory().createSocket(s, host, port, autoClose);
        return sslSocket;
    }

    @Override
    public Socket createSocket(String host, int port) throws IOException, UnknownHostException {
        return null;
    }

    @Override
    public Socket createSocket(String host, int port, InetAddress localHost, int localPort) throws IOException, UnknownHostException {
        return null;
    }

    @Override
    public Socket createSocket(InetAddress host, int port) throws IOException {
        return null;
    }

    @Override
    public Socket createSocket(InetAddress address, int port, InetAddress localAddress, int localPort) throws IOException {
        return null;
    }
}
