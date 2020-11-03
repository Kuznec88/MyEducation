public class Main {
    public static void main(String[] args) {

        Client client = new NaturalPerson();
        Client client1 = new LegalPerson();
        Client client2 = new IndividualBusinessman();

        client.putMoney(2000);
        System.out.println(client.getBalance() + "\n");
        client.inPutMoney(500);
        System.out.println(client.getBalance() + "\n");
        System.out.println(client.getInfo());

        client1.putMoney(200);
        System.out.println(client1.getBalance() + "\n");
        client1.inPutMoney(10);
        System.out.println(client1.getBalance() + "\n");
        System.out.println(client1.getInfo());

        client2.putMoney(1000);
        System.out.println(client2.getBalance() + "\n");
        client2.inPutMoney(50);
        System.out.println(client2.getBalance() + "\n");
        System.out.println(client2.getInfo());
    }
}