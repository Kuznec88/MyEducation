public class Operator extends Company implements Employee
{
    public int operatorSalary = 30000; // зп работяги

    @Override
    public double getMonthSalary() // возвращаем зп
    {
        return operatorSalary;
    }

    @Override
    public double setCompanyMoney()
    {
        return companyMoney + operatorSalary; // добавляю зп потому что раз компания может эти деньги выплачивать на кол-во экземпляров, значит она их заработала
    }
}
