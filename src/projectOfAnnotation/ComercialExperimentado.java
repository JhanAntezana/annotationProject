package projectOfAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("comercialExp")
@Scope("prototype")
public class ComercialExperimentado implements Empleado{
    @Autowired
    @Qualifier("informeFinancieroAnual")
    private CrearInformeFinanciero informeFinanciero;
    public ComercialExperimentado(){}
    //@Autowired
    public ComercialExperimentado(CrearInformeFinanciero informeFinanciero) {
        this.informeFinanciero = informeFinanciero;
    }
    //@Autowired
    public void setInformeFinanciero(CrearInformeFinanciero informeFinanciero) {
        this.informeFinanciero = informeFinanciero;
    }

    @Override
    public String getTarea() {
        return "Vender, vende y vender más!";
    }
    @Override
    public String getInforme() {
        return informeFinanciero.getInformeFinanciero();
    }
}
