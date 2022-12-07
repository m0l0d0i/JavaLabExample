public class example18_07_03 
{
    public static void main(String[] args) 
    {
        superClassTest superClassTest = new superClassTest(2);
        System.out.println(superClassTest.toString());

        subOneClassTest subOneClassTest = new subOneClassTest('a', 3);
        System.out.println(subOneClassTest.toString());

        subTwoClassTest subTwoClassTest = new subTwoClassTest('b', 4, "c");
        System.out.println(subTwoClassTest.toString());
    }
}