package projectOfAnnotation;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroAnual implements CrearInformeFinanciero{
    @Override
    public String getInformeFinanciero() {
        return "informe financiero del año 2022";
    }
}
