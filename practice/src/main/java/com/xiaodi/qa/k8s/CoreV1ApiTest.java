package com.xiaodi.qa.k8s;

import com.xiaodi.qa.config.Config;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodList;
import org.joda.time.DateTime;

import java.io.IOException;

/**
 * @Author xiaodi.gou
 * @create 2021/12/20 9:24 下午
 */
public class CoreV1ApiTest {

    public static void main(String[] args) throws IOException, ApiException {
        listPod();
    }
    public static void listPod() throws IOException, ApiException {
        ApiClient client = Config.defaultClient();
        Configuration.setDefaultApiClient(client);
        CoreV1Api api = new CoreV1Api(client);
        //打印所有的pod
        V1PodList list = api.listNamespacedPod("release", null, null, null, null, null, null, null, null, null);
        for (V1Pod item : list.getItems()) {
            String pod_name = item.getMetadata().getName(); //获取 pod name
            String pod_ip = item.getStatus().getPodIP(); //获取 pod ip
            String host_ip = item.getStatus().getHostIP(); //获取 host ip,pod所属节点的ip
            String which_namespace = item.getMetadata().getNamespace(); //获取namespace名称
            DateTime pod_creatime = item.getMetadata().getCreationTimestamp();
            //List<V1ContainerStatus> container_status = item.getStatus().getContainerStatuses(); //获取容器状态
            //V1ContainerStatus container_id = container_status.get(1);

            System.out.println(pod_name);
            System.out.println(pod_ip);
            System.out.println(host_ip);
            System.out.println(which_namespace);
            System.out.println(pod_creatime);
            //System.out.println(container_status);

        }

    }
}
