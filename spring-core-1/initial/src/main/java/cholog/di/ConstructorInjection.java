package cholog.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConstructorInjection {
    private InjectionBean injectionBean;

    /*
    ConstructorInjection으로 InjectionBean 주입받기
     */
    @Autowired
    private ConstructorInjection(InjectionBean injectionBean) {
        this.injectionBean = injectionBean;
    }

    public String sayHello() {
        return injectionBean.hello();
    }
}
