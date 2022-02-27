package com.dsk.controller;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@CrossOrigin
@RestController
@RequestMapping("/a")
public class Test {
    private final static Logger logger = LoggerFactory.getLogger(Test.class);
    @GetMapping("/a")
    public void downloadFile(HttpServletResponse response) {
        InputStream is = null;
        OutputStream os = null;
        try {
                String contentType = "image/pdf";
                response.setContentType(contentType);
                File file = new File("D:\\code\\aa.pdf");
                response.addHeader("Content-Length", "" + file.length());
                is = new FileInputStream(file);
                os = response.getOutputStream();
                IOUtils.copy(is, os);
        } catch (Exception e) {
            logger.error("pdf预览错误");
        } finally {
            try {
                if (os != null) {
                    os.flush();os.close();
                }
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                logger.error("流关闭错误");
            }
        }
    }

    @GetMapping("/b")
    public void aaa(){
        int aa =  1/0;
    }

}