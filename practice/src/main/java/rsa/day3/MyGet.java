package rsa.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Author xiaodi.gou
 * @Create 2022/4/18 00:19
 */
public class MyGet {
    public static void main(String[] args) {
        HttpURLConnection conn = null;
        InputStream inputStream = null;
        BufferedReader bufferedReader = null;

        try {
            URL url = new URL("http://www.xxx.com/xxx/check?orgCode=321300&waybillNo=773011197999686");
            conn = (HttpURLConnection)url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);

            //设置请求头（如果没有请求头信息，则不需要写这一项）
            conn.setRequestProperty("appId", "app_service");

            conn.connect();

            inputStream = conn.getInputStream();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));

            //拼接返回参数
            StringBuilder sb = new StringBuilder();
            String responseMsg = null;
            while ((responseMsg = bufferedReader.readLine()) != null){
                sb.append(responseMsg);
            }

            System.out.println(sb.toString());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if(bufferedReader != null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(conn != null){
                conn.disconnect();
            }
        }
    }
}
