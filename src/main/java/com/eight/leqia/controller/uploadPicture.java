package com.eight.leqia.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class uploadPicture {
    @RequestMapping(value = "upload/uploadPic", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public String uploadPicture(HttpServletRequest request, HttpServletResponse response) throws IOException {

        MultipartHttpServletRequest req = (MultipartHttpServletRequest) request;

        //对应前端的upload的name参数"file"
        MultipartFile multipartFile = req.getFile("file");


        //realPath填写电脑文件夹路径
        String realPath = "E:\\S3Down\\S3Project\\miniprogram-7\\images\\comment";

        //格式化时间戳
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        String nowTime = sdf.format(new Date().getTime());

        //裁剪图片名字
        String originalFirstName = multipartFile.getOriginalFilename();

        String [] strs = originalFirstName.split("[.]");
        String tpName=strs[2];


        //取得图片的格式后缀
        String originalLastName = multipartFile.getOriginalFilename();
        String picLastName = originalLastName.substring(originalLastName.lastIndexOf("."));

        //拼接：名字+时间戳+后缀
        String picName = tpName + "." + nowTime + picLastName;

        try {
            File dir = new File(realPath);
            //如果文件目录不存在，创建文件目录
            if (!dir.exists()) {
                dir.mkdir();
                System.out.println("创建文件目录成功：" + realPath);
            }
            File file = new File(realPath, picName);
            multipartFile.transferTo(file);
            System.out.println(realPath);
            System.out.println("添加图片成功！");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        return picName;
    }


}
