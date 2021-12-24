//package com.example.demo.fastdfs;
//
//import com.luhuiguo.fastdfs.domain.StorePath;
//import com.luhuiguo.fastdfs.service.FastFileStorageClient;
//import org.apache.commons.io.FilenameUtils;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.multipart.MultipartFile;
//
//import javax.annotation.Resource;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * @author clanand_sk
// * @version 1.0
// * @date 2020/3/5 2:34 PM
// */
//@RestController
//@RequestMapping("/upload")
//public class UploadController {
//
//    @Resource
//    private FastFileStorageClient storageClient;
//
//    private static Logger logger = LoggerFactory.getLogger(UploadController.class);
//
//    @GetMapping("/test")
//    public String test(){
//        logger.info("呵呵呵");
//        logger.error("我是错误的");
//        return "test";
//    }
//
//
//    // MultipartFile是用来接收上传的文件
//    // myFile的名字必须和上传的表单的名字一样
//    @PostMapping("/file")
//    public String upload(@RequestParam("image") MultipartFile image) throws IOException {
//
//
////        Thumbnails.of(image.getInputStream())
////                .size(200, 240)    //设置缩略后图片大小
////                .outputQuality(1f)    //设置缩略后图片的质量
////                .toFile(thumbnailImg);
//
//        // myFile.getOriginalFilename():取到文件的名字
//        // FilenameUtils.getExtension(""):取到一个文件的后缀名
//        String extension = FilenameUtils.getExtension(image.getOriginalFilename());
//
//        // group1:指storage服务器的组名
//        // myFile.getInputStream():指这个文件中的输入流
//        // myFile.getSize():文件的大小
//        // 这一行是通过storageClient将文件传到storage容器
//        StorePath uploadFile = storageClient.uploadFile("group1", image.getInputStream(), image.getSize(), extension);
//
//        // 上传数据库
////        String sql = "insert into file(filename,groupname,filepath) values(?,?,?)";
////        jdbcTemplate.update(sql, myFile.getOriginalFilename(), uploadFile.getGroup(), uploadFile.getPath());
//
//        // 返回它在storage容器的的路径
//        return uploadFile.getFullPath();
//    }
//
//
//    @GetMapping("/fdownload")
//    public void download(@RequestParam String filename, HttpServletResponse response) throws IOException {
//
////        List query = jdbcTemplate.query("select * from file where fileid=" + id, new ColumnMapRowMapper());
////        Map map = (Map) query.get(0);
////        String filename = URLEncoder.encode(map.get("filename").toString(), "utf-8"); // 解决中文文件名下载后乱码的问题
////        // 告诉浏览器 下载的文件名
//        response.setHeader("Content-Disposition", "attachment; filename=" + filename + "");
////        String groupName = map.get("groupName").toString();
////        String filepath = map.get("filepath").toString();
//        // 将文件的内容输出到浏览器 fastdfs
//        byte[] downloadFile = storageClient.downloadFile("group1", "M00/00/00/" + filename + ".png");
//        response.getOutputStream().write(downloadFile);
//    }
//
//
//}
