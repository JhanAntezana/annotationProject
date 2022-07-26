package projectOfAnnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//con esta anotación le indicamos a Spring que esta clase va ser nuestro archivo de configuración
@ComponentScan("projectOfAnnotation")//aquí indicamos la carpeta donde va escanear
public class EmpleadosConfig {
}
