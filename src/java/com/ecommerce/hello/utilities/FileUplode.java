/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.hello.utilities;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author ananda
 */
public class FileUplode {

    public static boolean uploadImage(HttpServletRequest httpServletRequest) {
        try {
            String saveLocation = httpServletRequest.getServletContext().getRealPath("/product_image");
            MultipartRequest mr = new MultipartRequest(httpServletRequest, saveLocation, 1000000, new DefaultFileRenamePolicy());
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}

