package projectOfAnnotation;

import org.springframework.stereotype.Component;

@Component//como no se le esta agregando un id, Spring asignará por defecto
//al id el nombre de la clase con la primera letra en minúcula
public class InformeFinancieroTrimestral implements CrearInformeFinanciero{
    @Override
    public String getInformeFinanciero() {
        return "Presentación de informe financiero del triemstre 1";
    }
}
