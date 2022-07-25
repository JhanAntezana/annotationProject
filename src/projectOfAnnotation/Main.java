package projectOfAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //1. leer el xml de configuración
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2. pedir un bean al contenedor
        Empleado jhan = context.getBean("comercialExp", Empleado.class);
        //3. usar el bean
        System.out.println(jhan.getInforme());
        //4. cerrar el contexto
        context.close();

    }
}
