public class superClassTest 
{
    char ch;

    superClass (char ch)
    {
        setCh (ch);
    }

    public superClass() 
    {
    }

    void setCh(char ch)
    {
        this.ch = ch;
    }

    char getCh ()
    {
        return ch;
    }

    @Override
    public String toString() 
    {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue =
                "Name class: " + this.getClass().getSimpleName() + "\n" +
                        " char: " + this.getCh();
                        
        return ClassNameAndFieldValue;
    }
}