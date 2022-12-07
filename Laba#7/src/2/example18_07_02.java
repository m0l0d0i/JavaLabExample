public class example18_07_02 
{
    public static void main(String[] args) 
    {
        superClassTest sClass = new superClassTest();
        sClass.toString();

        superClassTest sClass1 = new superClassTest("Test superClassTest ");
        sClass1.toString();

        subClassTest subClassTest1 = new subClassTest();
        subClassTest1.toString();

        subClassTest subClassTest2 = new subClassTest("Test subClassTest № 1 ");
        subClassTest2.toString();

        subClassTest subClassTest3 = new subClassTest(1);
        subClassTest3.toString();

        subClassTest subClassTest4 = new subClassTest("Test subClassTest № 2", 1);
        subClassTest4.toString();
    }
}