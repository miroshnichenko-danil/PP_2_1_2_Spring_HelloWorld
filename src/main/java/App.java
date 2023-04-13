import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("1 бин Hello - " + bean.getMessage());
        System.out.println("2 бин Hello - " + bean.getMessage());
        System.out.println("Это один и тот же бин? " + (bean == bean2));

        Cat catBean = (Cat) applicationContext.getBean("cat");
        Cat catBean2 = (Cat) applicationContext.getBean("cat");
        System.out.println("1 бин Cat - " + bean.getMessage());
        System.out.println("2 бин Cat - " + bean.getMessage());
        System.out.println("Это один и тот же бин? " + (catBean == catBean2));

    }
}