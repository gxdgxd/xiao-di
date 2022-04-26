package rsa.day3;

import com.alibaba.fastjson.JSON;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Author xiaodi.gou
 * @Create 2022/4/18 00:17
 */
public class MyPost {
    public static void main(String[] args) {
        HttpURLConnection conn = null;
        InputStream inputStream = null;
        BufferedReader bufferedReader = null;

        try {
            URL url = new URL("http://www.xxx.com/xxx/xxxxxx/xxxxxxxxxxxxx");
            conn = (HttpURLConnection) url.openConnection();//通过openConnection创建对象
            conn.setRequestMethod("POST");
            //设置请求体格式，这里设置的是json格式
            conn.setRequestProperty("Content-Type", "application/json; charset=utf-8;");
            //连接服务器超时时间ms
            conn.setConnectTimeout(5000);
            //读取服务器返回超时时间ms
            conn.setReadTimeout(5000);

            //设置请求头
            conn.setRequestProperty("appId", "app_service");

            //设置请求体
            /*ParamDto paramDto = new ParamDto();
            paramDto.setOrgCode("222001");
            paramDto.setDataType("INTERCEPT");
            paramDto.setPdaCode("JSYG22200110001");
            paramDto.setVersionNo("1573360821238");*/
            String body = JSON.toJSONString("paramDto");

            //设置成true，向远程服务器写数据
            conn.setDoOutput(true);//默认是false，无法写入body
            OutputStream outputStream = conn.getOutputStream();
            outputStream.write(body.getBytes());
            outputStream.flush();
            outputStream.close();

            inputStream = conn.getInputStream();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
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
