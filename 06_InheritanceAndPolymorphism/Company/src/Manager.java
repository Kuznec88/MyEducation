public class Manager extends Company implements Employee // надеюсь тут все правильно сделал?)
{

    double moneyForCompany = 115000 + (int) (Math.random() * 140000); // переменная считает рандом значение для менеджера
    double fixedManagerSalary = 50000; // фикс зп менеджеар

    public int managerSalary = (int) (fixedManagerSalary + (moneyForCompany * MANAGERPERCENT)); // зп с %

    @Override
    public double getMonthSalary() // переопределяем метод из интерфейса
    {
        return managerSalary;
    }
    @Override
    public double setCompanyMoney()
    {
        return getIncome() + moneyForCompany;
    }
    /*
     вот тут я запутался поидее при создании экземпляра менеджера деньги должны добавляться в копилку
     Так же я пробовал сделать метод статическим но все ломается, где я не туда свернул?
     */
}