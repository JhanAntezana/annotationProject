package projectOfAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("comercialExp")
//@Scope("prototype")
public class ComercialExperimentado implements Empleado{
    //ejecución de código después de la creación del Bean
    //@PostConstruct
    public void ejecutaDespuesCreacion(){
        System.out.println("Ejecutado tras la creación del Bean");
    }
    //ejecución de código despues de apagado del contenedor de Spring
    //@PreDestroy
    public void ejecutaAntesDestrucción(){
        System.out.println("Ejecutando antes de la destrucción");
    }
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
