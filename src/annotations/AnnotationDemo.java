package annotations;


import java.lang.annotation.*;

/**
 * Anntotation which does not has any value in it is called MARKER ANNOTATION
 * SINGLE VALUE ANNOTATION - IF IT HAS ONLY ONE VALUE
 * MULTI VALUE ANNOTATION  - IF IT HAS MORE THAN ON VALUE
 */
@Documented
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone
{
    String os() default "symbian";

    int version() default 1;
}

@SmartPhone(os = "android", version = 6)
class NokiaASeries
{
    String model;
    int size;

    public NokiaASeries(String model, int size)
    {
        this.model = model;
        this.size = size;
    }
}

@SmartPhone(os = "IOS" , version = 8)
class NokiaNASeries4 extends NokiaASeries
{

    public NokiaNASeries4(String model, int size)
    {
        super(model, size);
    }
}
public class AnnotationDemo
{
    public static void main(String[] args)
    {
        NokiaASeries nokiaASeries = new NokiaASeries("Fire", 5);
        System.out.println(nokiaASeries.model);
        System.out.println(nokiaASeries.size);

        //to fetch the value of annotation
        Class c = nokiaASeries.getClass();
        Annotation annotation = c.getAnnotation(SmartPhone.class);
        SmartPhone smartPhone = (SmartPhone) annotation;
        System.out.println("NokiaASeries details:");
        System.out.println("OS is :" + smartPhone.os());
        System.out.println("Version is : " + smartPhone.version());
        System.out.println("------------------------------------");
        NokiaNASeries4 nokiaNASeries4 = new NokiaNASeries4("Nokial 6",8);
        Class cc = nokiaNASeries4.getClass();
        annotation = cc.getAnnotation(SmartPhone.class);
        SmartPhone ss = (SmartPhone) annotation;
        System.out.println("Details for NokiaNaSeries4 details : ");
        System.out.println(ss.os());
        System.out.println(ss.version());
        System.out.println("-------------------------------------");

    }
}
