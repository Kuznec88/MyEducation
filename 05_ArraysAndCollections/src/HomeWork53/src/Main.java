public class Main {
    private final static String COMMAND_ADD = "ADD"; // константа с командой
    private final static String COMMAND_LIST = "LIST";// константа с командой

    public static void main(String args[]) {
        EmailList emailList = new EmailList(); // создаем новый трисет
        for (; ; ) { // правильно понимаю что мы просто инициализируем цикл? без данных??

            String[] userInput = UserInput.getLine(); // получаем поделенный регуляркой массив строк

            if (userInput.length == 2 && userInput[0].equals(COMMAND_ADD)) { // если размер массива равен 2 и первый элемент массива соотвествует константе
                emailList.add(userInput[1]); // добавляем в трисет элемент с номером 1
            } else if (userInput.length == 1 && userInput[0].equals(COMMAND_LIST)) { // если команда соотвествует лист
                emailList.printList(); // печатаем список
            } else {
                System.out.println("неверная команда"); // в любых других случаях ничего не происходит
            }
        }
    }
}
