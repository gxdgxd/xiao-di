package com.xiaodi.qa.common;

import org.springframework.context.annotation.Bean;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbStoreHelper {

    private String insert_sql;
    private String charset;
    private boolean debug;

    private String connectStr;
    private String username;
    private String password;
    private String select_sql;


    public DbStoreHelper() {
        connectStr = "jdbc:mysql://10.6.6.49:3306/wpt_shop";
        // connectStr += "?useServerPrepStmts=false&rewriteBatchedStatements=true";
        select_sql = "select  id from t_postage_template where shop_id = '8610024' and template_type = 4 or template_type = 5";
        insert_sql = "INSERT INTO `wpt_shop`.`t_postage_template_config`(`biz_id`, `template_id`, `charge_type`, `province_name`, `province_code`, `province_simple_name`, `firstly`, `firstly_cost`, `continuation`, `continuation_cost`, `create_time`, `update_time`, `modify_time`) VALUES (2105, 1, 680, 3, '山西省', '14', '山西', 1, 5.00, 1, 2.00, 1634091089, 1634091089, '2021-10-13 10:11:29'),\n" +
                "(`biz_id`, `template_id`, `charge_type`, `province_name`, `province_code`, `province_simple_name`, `firstly`, `firstly_cost`, `continuation`, `continuation_cost`, `create_time`, `update_time`, `modify_time`) VALUES (2106, 1, 680, 3, '重庆市', '50', '重庆', 1, 5.00, 1, 2.00, 1634091089, 1634091089, '2021-10-13 10:11:29'),\n" +
                "(`biz_id`, `template_id`, `charge_type`, `province_name`, `province_code`, `province_simple_name`, `firstly`, `firstly_cost`, `continuation`, `continuation_cost`, `create_time`, `update_time`, `modify_time`) VALUES (2107, 1, 680, 3, '安徽省', '34', '安徽', 1, 5.00, 1, 2.00, 1634091089, 1634091089, '2021-10-13 10:11:29'),\n" +
                "(`biz_id`, `template_id`, `charge_type`, `province_name`, `province_code`, `province_simple_name`, `firstly`, `firstly_cost`, `continuation`, `continuation_cost`, `create_time`, `update_time`, `modify_time`) VALUES (2108, 1, 680, 3, '上海市', '31', '上海', 1, 5.00, 1, 2.00, 1634091089, 1634091089, '2021-10-13 10:11:29'),\n" +
                "(`biz_id`, `template_id`, `charge_type`, `province_name`, `province_code`, `province_simple_name`, `firstly`, `firstly_cost`, `continuation`, `continuation_cost`, `create_time`, `update_time`, `modify_time`) VALUES (2109, 1, 680, 3, '河南省', '41', '河南', 1, 5.00, 1, 2.00, 1634091089, 1634091089, '2021-10-13 10:11:29'),\n" +
                "(`biz_id`, `template_id`, `charge_type`, `province_name`, `province_code`, `province_simple_name`, `firstly`, `firstly_cost`, `continuation`, `continuation_cost`, `create_time`, `update_time`, `modify_time`) VALUES (2110, 1, 680, 3, '北京市', '11', '北京', 1, 5.00, 1, 2.00, 1634091089, 1634091089, '2021-10-13 10:11:29'),\n" +
                "(`biz_id`, `template_id`, `charge_type`, `province_name`, `province_code`, `province_simple_name`, `firstly`, `firstly_cost`, `continuation`, `continuation_cost`, `create_time`, `update_time`, `modify_time`) VALUES (2111, 1, 680, 3, '海南省', '46', '海南', 1, 5.00, 1, 2.00, 1634091089, 1634091089, '2021-10-13 10:11:29'),\n" +
                "(`biz_id`, `template_id`, `charge_type`, `province_name`, `province_code`, `province_simple_name`, `firstly`, `firstly_cost`, `continuation`, `continuation_cost`, `create_time`, `update_time`, `modify_time`) VALUES (2112, 1, 680, 3, '黑龙江省', '23', '黑龙江', 1, 5.00, 1, 2.00, 1634091089, 1634091089, '2021-10-13 10:11:29'),\n" +
                "(`biz_id`, `template_id`, `charge_type`, `province_name`, `province_code`, `province_simple_name`, `firstly`, `firstly_cost`, `continuation`, `continuation_cost`, `create_time`, `update_time`, `modify_time`) VALUES (2113, 1, 680, 3, '浙江省', '33', '浙江', 1, 5.00, 1, 2.00, 1634091089, 1634091089, '2021-10-13 10:11:29'),\n" +
                "(`biz_id`, `template_id`, `charge_type`, `province_name`, `province_code`, `province_simple_name`, `firstly`, `firstly_cost`, `continuation`, `continuation_cost`, `create_time`, `update_time`, `modify_time`) VALUES (2114, 1, 680, 3, '江西省', '36', '江西', 1, 5.00, 1, 2.00, 1634091089, 1634091089, '2021-10-13 10:11:29'),\n" +
                "(`biz_id`, `template_id`, `charge_type`, `province_name`, `province_code`, `province_simple_name`, `firstly`, `firstly_cost`, `continuation`, `continuation_cost`, `create_time`, `update_time`, `modify_time`) VALUES (2115, 1, 680, 3, '甘肃省', '62', '甘肃', 1, 5.00, 1, 2.00, 1634091089, 1634091089, '2021-10-13 10:11:29'),\n" +
                "(`biz_id`, `template_id`, `charge_type`, `province_name`, `province_code`, `province_simple_name`, `firstly`, `firstly_cost`, `continuation`, `continuation_cost`, `create_time`, `update_time`, `modify_time`) VALUES (2116, 1, 680, 3, '内蒙古自治区', '15', '内蒙古', 1, 5.00, 1, 2.00, 1634091089, 1634091089, '2021-10-13 10:11:29'),\n" +
                "(`biz_id`, `template_id`, `charge_type`, `province_name`, `province_code`, `province_simple_name`, `firstly`, `firstly_cost`, `continuation`, `continuation_cost`, `create_time`, `update_time`, `modify_time`) VALUES (2117, 1, 680, 3, '宁夏回族自治区', '64', '宁夏', 1, 5.00, 1, 2.00, 1634091089, 1634091089, '2021-10-13 10:11:29'),\n" +
                "(`biz_id`, `template_id`, `charge_type`, `province_name`, `province_code`, `province_simple_name`, `firstly`, `firstly_cost`, `continuation`, `continuation_cost`, `create_time`, `update_time`, `modify_time`) VALUES (2118, 1, 680, 3, '吉林省', '22', '吉林', 1, 5.00, 1, 2.00, 1634091089, 1634091089, '2021-10-13 10:11:29'),\n" +
                "(`biz_id`, `template_id`, `charge_type`, `province_name`, `province_code`, `province_simple_name`, `firstly`, `firstly_cost`, `continuation`, `continuation_cost`, `create_time`, `update_time`, `modify_time`) VALUES (2119, 1, 680, 3, '湖北省', '42', '湖北', 1, 5.00, 1, 2.00, 1634091089, 1634091089, '2021-10-13 10:11:29'),\n" +
                "(`biz_id`, `template_id`, `charge_type`, `province_name`, `province_code`, `province_simple_name`, `firstly`, `firstly_cost`, `continuation`, `continuation_cost`, `create_time`, `update_time`, `modify_time`) VALUES (2120, 1, 680, 3, '江苏省', '32', '江苏', 1, 5.00, 1, 2.00, 1634091089, 1634091089, '2021-10-13 10:11:29'),\n" +
                "(`biz_id`, `template_id`, `charge_type`, `province_name`, `province_code`, `province_simple_name`, `firstly`, `firstly_cost`, `continuation`, `continuation_cost`, `create_time`, `update_time`, `modify_time`) VALUES (2121, 1, 680, 3, '福建省', '35', '福建', 1, 5.00, 1, 2.00, 1634091089, 1634091089, '2021-10-13 10:11:29'),\n" +
                "(`biz_id`, `template_id`, `charge_type`, `province_name`, `province_code`, `province_simple_name`, `firstly`, `firstly_cost`, `continuation`, `continuation_cost`, `create_time`, `update_time`, `modify_time`) VALUES (2122, 1, 680, 3, '山东省', '37', '山东', 1, 5.00, 1, 2.00, 1634091089, 1634091089, '2021-10-13 10:11:29'),\n" +
                "(`biz_id`, `template_id`, `charge_type`, `province_name`, `province_code`, `province_simple_name`, `firstly`, `firstly_cost`, `continuation`, `continuation_cost`, `create_time`, `update_time`, `modify_time`) VALUES (2123, 1, 680, 3, '天津市', '12', '天津', 1, 5.00, 1, 2.00, 1634091089, 1634091089, '2021-10-13 10:11:29'),\n" +
                "(`biz_id`, `template_id`, `charge_type`, `province_name`, `province_code`, `province_simple_name`, `firstly`, `firstly_cost`, `continuation`, `continuation_cost`, `create_time`, `update_time`, `modify_time`) VALUES (2124, 1, 680, 3, '四川省', '51', '四川', 1, 5.00, 1, 2.00, 1634091089, 1634091089, '2021-10-13 10:11:29'),\n" +
                "(`biz_id`, `template_id`, `charge_type`, `province_name`, `province_code`, `province_simple_name`, `firstly`, `firstly_cost`, `continuation`, `continuation_cost`, `create_time`, `update_time`, `modify_time`) VALUES (2125, 1, 680, 3, '云南省', '53', '云南', 1, 5.00, 1, 2.00, 1634091089, 1634091089, '2021-10-13 10:11:29'),\n" +
                "(`biz_id`, `template_id`, `charge_type`, `province_name`, `province_code`, `province_simple_name`, `firstly`, `firstly_cost`, `continuation`, `continuation_cost`, `create_time`, `update_time`, `modify_time`) VALUES (2126, 1, 680, 3, '香港特别行政区', '81', '香港', 1, 5.00, 1, 2.00, 1634091089, 1634091089, '2021-10-13 10:11:29'),\n" +
                "(`biz_id`, `template_id`, `charge_type`, `province_name`, `province_code`, `province_simple_name`, `firstly`, `firstly_cost`, `continuation`, `continuation_cost`, `create_time`, `update_time`, `modify_time`) VALUES (2127, 1, 680, 3, '台湾省', '83', '台湾', 1, 5.00, 1, 2.00, 1634091089, 1634091089, '2021-10-13 10:11:29'),\n" +
                "(`biz_id`, `template_id`, `charge_type`, `province_name`, `province_code`, `province_simple_name`, `firstly`, `firstly_cost`, `continuation`, `continuation_cost`, `create_time`, `update_time`, `modify_time`) VALUES (2128, 1, 680, 3, '澳门特别行政区', '82', '澳门', 1, 5.00, 1, 2.00, 1634091089, 1634091089, '2021-10-13 10:11:29'),\n" +
                "(`biz_id`, `template_id`, `charge_type`, `province_name`, `province_code`, `province_simple_name`, `firstly`, `firstly_cost`, `continuation`, `continuation_cost`, `create_time`, `update_time`, `modify_time`) VALUES (2129, 1, 680, 3, '青海省', '63', '青海', 1, 5.00, 1, 2.00, 1634091089, 1634091089, '2021-10-13 10:11:29'),\n" +
                "(`biz_id`, `template_id`, `charge_type`, `province_name`, `province_code`, `province_simple_name`, `firstly`, `firstly_cost`, `continuation`, `continuation_cost`, `create_time`, `update_time`, `modify_time`) VALUES (2130, 1, 680, 3, '广东省', '44', '广东', 1, 5.00, 1, 2.00, 1634091089, 1634091089, '2021-10-13 10:11:29'),\n" +
                "(`biz_id`, `template_id`, `charge_type`, `province_name`, `province_code`, `province_simple_name`, `firstly`, `firstly_cost`, `continuation`, `continuation_cost`, `create_time`, `update_time`, `modify_time`) VALUES (2131, 1, 680, 3, '陕西省', '61', '陕西', 1, 5.00, 1, 2.00, 1634091089, 1634091089, '2021-10-13 10:11:29'),\n" +
                "(`biz_id`, `template_id`, `charge_type`, `province_name`, `province_code`, `province_simple_name`, `firstly`, `firstly_cost`, `continuation`, `continuation_cost`, `create_time`, `update_time`, `modify_time`) VALUES (2132, 1, 680, 3, '河北省', '13', '河北', 1, 5.00, 1, 2.00, 1634091089, 1634091089, '2021-10-13 10:11:29'),\n" +
                "(`biz_id`, `template_id`, `charge_type`, `province_name`, `province_code`, `province_simple_name`, `firstly`, `firstly_cost`, `continuation`, `continuation_cost`, `create_time`, `update_time`, `modify_time`) VALUES (2133, 1, 680, 3, '辽宁省', '21', '辽宁', 1, 5.00, 1, 2.00, 1634091089, 1634091089, '2021-10-13 10:11:29'),\n" +
                "(`biz_id`, `template_id`, `charge_type`, `province_name`, `province_code`, `province_simple_name`, `firstly`, `firstly_cost`, `continuation`, `continuation_cost`, `create_time`, `update_time`, `modify_time`) VALUES (2134, 1, 680, 3, '新疆维吾尔自治区', '65', '新疆', 1, 5.00, 1, 2.00, 1634091089, 1634091089, '2021-10-13 10:11:29'),\n" +
                "(`biz_id`, `template_id`, `charge_type`, `province_name`, `province_code`, `province_simple_name`, `firstly`, `firstly_cost`, `continuation`, `continuation_cost`, `create_time`, `update_time`, `modify_time`) VALUES (2135, 1, 680, 3, '广西壮族自治区', '45', '广西', 1, 5.00, 1, 2.00, 1634091089, 1634091089, '2021-10-13 10:11:29'),\n" +
                "(`biz_id`, `template_id`, `charge_type`, `province_name`, `province_code`, `province_simple_name`, `firstly`, `firstly_cost`, `continuation`, `continuation_cost`, `create_time`, `update_time`, `modify_time`) VALUES (2136, 1, 680, 3, '贵州省', '52', '贵州', 1, 5.00, 1, 2.00, 1634091089, 1634091089, '2021-10-13 10:11:29'),\n" +
                "(`biz_id`, `template_id`, `charge_type`, `province_name`, `province_code`, `province_simple_name`, `firstly`, `firstly_cost`, `continuation`, `continuation_cost`, `create_time`, `update_time`, `modify_time`) VALUES (2137, 1, 680, 3, '湖南省', '43', '湖南', 1, 5.00, 1, 2.00, 1634091089, 1634091089, '2021-10-13 10:11:29'),\n" +
                "(`biz_id`, `template_id`, `charge_type`, `province_name`, `province_code`, `province_simple_name`, `firstly`, `firstly_cost`, `continuation`, `continuation_cost`, `create_time`, `update_time`, `modify_time`) VALUES (2138, 1, 680, 3, '西藏自治区', '54', '西藏', 1, 5.00, 1, 2.00, 1634091089, 1634091089, '2021-10-13 10:11:29');";
        charset = "utf-8";
        debug = true;
        username = "wpt_test";
        password = "hWhG4tjxFV*49ROY";
    }

    public void storeToDb(String srcFile) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(new FileInputStream(srcFile), charset));
        try {
            doStore(bfr);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bfr.close();
        }
    }

    private void doStore(BufferedReader bfr) throws ClassNotFoundException, SQLException, IOException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(connectStr, username,password);
        conn.setAutoCommit(false); // 设置手动提交
        int count = 0;
        PreparedStatement psts = conn.prepareStatement(insert_sql);
        String line = null;
        while (null != (line = bfr.readLine())) {
            String[] infos = line.split(";");
            if (infos.length < 5)   continue;
            if (debug) {
                System.out.println(line);
            }
            psts.setLong(1, Long.valueOf(infos[0]));
            psts.setLong(2, Long.valueOf(infos[1]));
            psts.setString(3, infos[2]);
            psts.setString(4, infos[3]);
            psts.setString(5, infos[4]);
            psts.addBatch();          // 加入批量处理
            count++;
        }
        psts.executeBatch(); // 执行批量处理
        conn.commit();  // 提交
        System.out.println("All down : " + count);
        conn.close();
    }


}