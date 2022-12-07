public class superClassTest 
{
    private String str;

    superClass() 
    {
        setString();
    }

    superClass(String str) 
    {
        setString(str);
    }

    public void setString() 
    {
        this.str = "Not data";
    }

    public void setString(String str) 
    {
        this.str = str;
    }

    public String getString() 
    {
        return str;
    }

    public int strLength() 
    {
        return str.length();
    }

    public String toString() 
    {
        String superClassNameAndFieldValue = "superClassTest { " + "str1 = \"" + getString() + '\"' + " string.length = " + "\"" + strLength() + "\" }\n";
        System.out.println(superClassNameAndFieldValue);
        
        return superClassNameAndFieldValue;
    }
}