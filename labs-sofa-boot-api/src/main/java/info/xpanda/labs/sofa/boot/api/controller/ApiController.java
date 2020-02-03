package info.xpanda.labs.sofa.boot.api.controller;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import info.xpanda.labs.sofa.boot.biz.facade.BizFacade;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @SofaReference
    private BizFacade bizFacade;

    @SofaReference
    private CatFacade catFacade;

    @RequestMapping("/api")
    public String api(){
        System.out.println(bizFacade.message());
        System.out.println(catFacade.message());
        return "api";
    }
}
