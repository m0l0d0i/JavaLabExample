public class example18_07_04
{
    public static void main(String[] args) 
    {
        superClassTest superClassTest = new superClassTest('B');
        System.out.println(superClassTest.toString());

        subOneClassTest subOneClassTest = new subOneClassTest('a',"Yes");
        System.out.println(subOneClassTest.toString());
        
        subTwoClassTest subTwoClassTest = new subTwoClassTest('C',"No",6);
        System.out.println(subTwoClassTest.toString());
    }
}