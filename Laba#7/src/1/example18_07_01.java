public class example18_07_01 
{
    public static void main(String[] args) 
    {
        superClassTest superClassObject = new superClassTest("construct SuperClass");
        String className = superClassObject.toString();
        System.out.println(className);

        subClassTest subClassObject1 = new subClassTest("consruct SubClass");
        String subClassName = subClassObject1.toString();
        System.out.println(subClassName);

        subClassTest subClassObject2 = new subClassTest("consruct SubClass", "2 parametrs");
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);
    }
}