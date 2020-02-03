package info.xpanda.labs.sofa.boot.biz.provider;


import info.xpanda.labs.sofa.boot.biz.facade.BizFacade;

public class BizFacadeImpl implements BizFacade {
    @Override
    public String message() {
        return "biz";
    }
}
