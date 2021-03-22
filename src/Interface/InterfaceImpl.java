package Interface;

interface printable
{
    public void print();
}
class test implements printable
{

    public void print() {
        System.out.println("Interface Implements Sucessfully");
    }


}
class Main {

    public static void main(String args[])
    {
        test obj = new test();
        obj.print();
    }
}
