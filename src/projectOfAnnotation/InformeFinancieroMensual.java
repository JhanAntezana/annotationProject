package projectOfAnnotation;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroMensual implements CrearInformeFinanciero{
    @Override
    public String getInformeFinanciero() {
        return "Informe financiero del mes de julio";
    }
}
