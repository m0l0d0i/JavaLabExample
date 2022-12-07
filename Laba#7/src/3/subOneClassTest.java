class subOneClassTest extends superClassTest 
{
    public char ch;
    subOneClass (char ch, int num) 
    {
        setValue(ch,num);
    }

    subOneClass() 
    {
    }

    void setValue (char ch, int num) 
    {
        this.ch = ch;
        super.setValue(num);
    }

    char getCh () 
    {
        return ch;
    }

    public String toString() 
    {
        String ThirdFieldValue =
                "\n str 2: " + this.getCh();

        return super.toString()+ThirdFieldValue;
    }
}