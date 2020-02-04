package info.xpanda.labs.sofa.boot.plugin.api.controller;

import com.alipay.sofa.ark.spi.service.ArkInject;
import info.xpanda.labs.sofa.ark.plugin.apple.facade.AppleService;
import info.xpanda.labs.sofa.boot.plugin.biz.facade.PluginBizFacade;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Paul Jiang
 * @since 20200203
 */
@RestController
public class PluginController {
    @ArkInject
    private PluginBizFacade pluginBizFacade;

    @RequestMapping("/plugin")
    public String plugin(){
        System.out.println(pluginBizFacade.message());
        return "plugin";
    }
}
