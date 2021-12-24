package com.xiaodi.qa.config;

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.KubeConfig;
import lombok.extern.slf4j.Slf4j;

import java.io.FileReader;
import java.io.IOException;

/**
 * @Author xiaodi.gou
 * @create 2021/12/21 2:52 下午
 */
@Slf4j
public class Config {

    public static void main(String[] args) throws IOException {
        defaultClient();
    }

    // 返回client,默认使用这个方法
    public static ApiClient defaultClient() throws IOException {
        String kubeConfigPath = Config.class.getClassLoader().getResource("config").getPath();
        log.info("kubeConfigPath = " + kubeConfigPath);
        ApiClient client =
                ClientBuilder.kubeconfig(KubeConfig.loadKubeConfig(new FileReader(kubeConfigPath))).build();
        return client;
    }

}
