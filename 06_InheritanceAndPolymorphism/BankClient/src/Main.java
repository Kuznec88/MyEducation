public class Main {
    public static void main(String[] args) {

        Client client = new NaturalPerson();
        Client client1 = new LegalPerson();
        Client client2 = new IndividualBusinessman();

        client.putMoney(2000);
        System.out.println(client.getBalance());
        client.inPutMoney(500);
        System.out.println(client.getBalance());

        client1.putMoney(200);
        System.out.println(client1.getBalance());
        client1.inPutMoney(200);
        System.out.println(client1.getBalance());

        client2.putMoney(1000);
        System.out.println(client2.getBalance());
        client2.inPutMoney(50);
        System.out.println(client2.getBalance());
    }
}
