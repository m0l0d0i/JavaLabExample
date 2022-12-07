class superClassTest 
{
    final String str;

    public superClassTest(String str)
    {
        this.str = str;
    }

    String getStr ()
    {
        return str;
    }

    public String toString() 
    {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue =
                "Name class: " + this.getClass().getSimpleName() + "\n" +
                        "- string: " + this.getStr();
        System.out.println(ClassNameAndFieldValue);

        return super.toString() + ClassNameAndFieldValue;
    }
}