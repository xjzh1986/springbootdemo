package com.example.demo.Controller;

import com.example.demo.entity.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.support.StringMultipartFileEditor;

/**
 * Created by Administrator on 2019/9/17.
 */
@RestController
public class ProductController {
    @RequestMapping(value = "getProduct")
    public String getProduct(){
        Product product = new Product();
        return "dsssdsd";
    }
}
