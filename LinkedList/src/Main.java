public class Main{
    public static void main(String[] args){
        LinkedList l1 = new LinkedList();
        l1.insert(10);
        l1.insert(20);
        l1.insert(30);
        l1.insert(40);
        l1.insert(50);
        l1.insert(60);
        l1.insert(70);
        l1.insert(80);
        l1.insert(90);
        l1.insert(100);
        l1.display();

        l1.insertSpecific(12,11);
        l1.insertSpecific(15,12);
        l1.insertSpecific(18,13);
        l1.display();

    }
}