package MultipleInheritenceWithTwoInterfaces;


interface Printable{
    void print();
}
interface Showable{
    void show();
}
class Test implements Printable,Showable{
    public void print(){System.out.println("Hello");}
    public void show(){System.out.println("Welcome");}

    public static void main(String args[]){
        Test obj = new Test();
        obj.print();
        obj.show();
    }
}  