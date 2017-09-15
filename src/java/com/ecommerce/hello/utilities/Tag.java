/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.hello.utilities;

/**
 *
 * @author ananda
 */
public class Tag {
    
    public static String convertTag(String[] tempTag){
    String tag="";
    
    for(int i=0;i<tempTag.length;i++){
               tag=tempTag[i]+",  "+tag;

           }
       System.out.print("\b");
    return tag;
    }
    
}
