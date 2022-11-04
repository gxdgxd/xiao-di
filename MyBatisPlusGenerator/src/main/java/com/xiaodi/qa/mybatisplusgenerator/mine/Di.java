package com.xiaodi.qa.mybatisplusgenerator.mine;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.zip.GZIPInputStream;

public class Di {
    public static void main(String[] args) {

        String a = "eJxdkctOwzAQRff+ivkAktjJAlqURVVAYleV1wKxGBK3sZrYlR9U/XtmklLReuHH5J6rmRshgNfyzZoIGSwg8SXqEI3dwsbjoA/O72DjPCxJ8K59MM5Cmausmtguxv28KBom8+CSbzSptzq3OhZCZFkGH2gmP3IJbtBw8CZqD9HBgLHpIM9zUdc1rNJ3b0LH2kNnehJek15jSyQD7LzsdLNjQYsRx+qi70+iQFSy7T00zpJJYhlG+FTyRpVfo6WSEjyLwuj24KwG3HBrSioIOgYhxDpZeEnDgP4454Ffj3tNu4vY83ONFlYYgm7hCannFp4tNtH86Cmf8wqJhg58U1U1lRRvtsDpJU/Fqrwixx8ykrcX5PmQf0J5SXJbnkk1u5vJ6+MfST0I8djjnseIhoKux6/5rKwoB0qQIvoFKJ2W6A==";
        System.out.println(decodeBase64AndGZip(a));
        ;
    }

    public static String decodeBase64AndGZip(String input) {
        byte[] bytes;
        String out = input;

        try (ByteArrayInputStream bis = new ByteArrayInputStream(Base64.getDecoder().decode(input));
             GZIPInputStream gzip = new GZIPInputStream(bis);
             ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            byte[] buf = new byte[1024];
            int num;
            while ((num = gzip.read(buf, 0, buf.length)) != -1) {
                bos.write(buf, 0, num);
            }
            bytes = bos.toByteArray();
            out = new String(bytes, StandardCharsets.UTF_8);
            bos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return out;
    }
}
