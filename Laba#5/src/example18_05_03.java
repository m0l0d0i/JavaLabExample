public class example18_05_03
{
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 15;
        Ex myEx = new Ex();
        Ex myEx1 = new Ex(n1);
        Ex myEx2 = new Ex(n1,n2);
    }
    static class Ex {
        private int n1;
        private int n2;

        Ex(){
            System.out.println("1)");
        }
        Ex(int n1){
            this.n1 = n1;
            System.out.println("2)"+"n1: " + n1);
        }

        Ex(int n1, int n2){
            this.n1 = n1;
            this.n2 = n2;
            System.out.println("3)"+"n1*n2:"+n1*n2);
        }
    }
}