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


        //TRABAJANDO CON LOS PATRONES PROTOTYPE Y SINGLETON
        //USANDO PROTOTYPE (Java utiliza por defecto el patron Singleton)
        //1. leer el xml de configuración
        ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2. pedir un bean al contenedor
        Empleado Pedro = context2.getBean("comercialExp", Empleado.class);
        Empleado Lucia = context2.getBean("comercialExp", Empleado.class);
            //¿comprobando si apuntan a la misma dirección de memoria (java por defecto usa el patron Singleton)
            if (Pedro == Lucia) {
                System.out.println("Apuntan a la misma dirección de memoria");
                System.out.println(Pedro+"\n"+Lucia);
            } else {
                System.out.println("No apuntan a la misma dirección de memoria");
                System.out.println(Pedro+"\n"+Lucia);
            }
        //3. usar el bean
        System.out.println(jhan.getInforme());
        //4. cerrar el contexto
        context.close();

    }
}
