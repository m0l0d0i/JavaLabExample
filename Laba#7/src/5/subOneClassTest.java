public class subOneClassTest extends superClassTest
{
    final int num;

    public subOneClass(String str, int num) 
    {
        super(str);
        this.num = num;
    }

    int getInt()
    {
        return num;
    }

    public String toString() 
    {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue =
                "Name class: " + this.getClass().getSimpleName() + "\n" +
                        "- string: " + getStr() + "\n" +
                        "- Number: " + getInt();
        System.out.println(ClassNameAndFieldValue);

        return super.toString() + ClassNameAndFieldValue;
    }
}