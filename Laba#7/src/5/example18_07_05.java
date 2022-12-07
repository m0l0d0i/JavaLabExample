public class example18_07_05
{
    public static void main(String[] args) 
    {
        superClassTest superClassTest = new superClassTest("Test superClassTest");
        superClassTest.toString();
        
        subOneClassTest subOneClassTest = new subOneClassTest("Test #1 subClass", 4);
        subOneClassTest.toString();

        subTwoClassTest subTwoClassTest = new subTwoClassTest("Test #2 subClass", 'V');
        subTwoClassTest.toString();
    }
}