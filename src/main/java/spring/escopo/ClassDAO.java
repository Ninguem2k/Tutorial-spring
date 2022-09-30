package spring.escopo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ClassDAO {
    @Autowired
    Classjdba oClassjdba;

    public Classjdba getOClassjdba() {
        return this.oClassjdba;
    }

    public void setOClassjdba(Classjdba oClassjdba) {
        this.oClassjdba = oClassjdba;
    }

}
