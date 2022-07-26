package projectOfAnnotation;

public class DirectorFinanciero implements Empleado{
    private CrearInformeFinanciero informeFinanciero;

    public DirectorFinanciero(CrearInformeFinanciero informeFinanciero) {
        this.informeFinanciero = informeFinanciero;
    }

    @Override
    public String getTarea() {
        return "Gestión y direccion de las operaciones financiero de la empresa";
    }

    @Override
    public String getInforme() {
        return informeFinanciero.getInformeFinanciero();
    }
}
