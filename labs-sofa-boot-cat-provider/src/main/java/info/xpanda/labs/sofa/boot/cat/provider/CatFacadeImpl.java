package info.xpanda.labs.sofa.boot.cat.provider;


import info.xpanda.labs.sofa.boot.cat.facade.CatFacade;

public class CatFacadeImpl implements CatFacade {

//    @Autowired
//    private BizFacade bizFacade;

    @Override
    public String message() {
        return "cat";
    }
}
