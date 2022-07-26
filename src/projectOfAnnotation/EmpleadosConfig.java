package projectOfAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//con esta anotación le indicamos a Spring que esta clase va ser nuestro archivo de configuración
@ComponentScan("projectOfAnnotation")//aquí indicamos la carpeta donde va escanear
public class EmpleadosConfig {
    //Para poder proporcionar beans desde código Java

    //1. definir el bean para InformeFinancieroDtoCompras
    @Bean
    public CrearInformeFinanciero informeFinancieroCompras(){//será el id del bean inyectado
        return new InformeFinancietoDtoCompras();
    }
    //2. definir el bean para Director Fianaciero e inyectar dependencias
    @Bean
    public Empleado directorFinanciero(){
        return new DirectorFinanciero(informeFinancieroCompras());
    }
}
