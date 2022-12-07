public class superClassTest 
{
    int num;

    superClass(int num) 
    {
        setValue(num);
    }

    public superClass() 
    {
    }

    void setValue(int num) 
    {
        this.num = num;
    }

    int getInt() 
    {
        return num;
    }

    @Override
    public String toString() 
    {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue =
                "Name class: " + this.getClass().getSimpleName() + "\n" + " int 1 = " + this.getInt();

        return ClassNameAndFieldValue;
    }
}