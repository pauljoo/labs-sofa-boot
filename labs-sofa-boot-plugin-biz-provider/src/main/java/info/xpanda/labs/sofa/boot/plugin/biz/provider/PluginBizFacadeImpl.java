package info.xpanda.labs.sofa.boot.plugin.biz.provider;

import com.alipay.sofa.ark.spi.service.ArkInject;
import info.xpanda.labs.sofa.ark.plugin.apple.facade.AppleService;
import info.xpanda.labs.sofa.ark.plugin.banana.facade.BananaService;
import info.xpanda.labs.sofa.boot.plugin.biz.facade.PluginBizFacade;

/**
 * @author Paul Jiang
 * @since 20200204
 */
public class PluginBizFacadeImpl implements PluginBizFacade{
    @ArkInject
    private AppleService appleService;

    @ArkInject
    private BananaService bananaService;

    @Override
    public String message() {
        System.out.println(appleService.message());
        System.out.println(bananaService.message());
        return null;
    }
}
