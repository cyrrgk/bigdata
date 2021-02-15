package xyz.maxwells.bigdata.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.maxwells.bigdata.domain.RequestResult;
import xyz.maxwells.bigdata.service.ProductsService;

/**
 * Created by wuzusheng on 2018/3/17.
 */
@RestController
@RequestMapping("/product")
public class ProductsCtrl {
    @Autowired
    private ProductsService service;
    @RequestMapping("/findall")
    public RequestResult findAll(){
        return new RequestResult(service.findAll());
    }
}
