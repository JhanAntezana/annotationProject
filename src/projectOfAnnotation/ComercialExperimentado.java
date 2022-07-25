package projectOfAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("comercialExp")
public class ComercialExperimentado implements Empleado{
    private CrearInformeFinanciero informeFinanciero;
    @Autowired
    public ComercialExperimentado(CrearInformeFinanciero informeFinanciero) {
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
