public class TopManager extends Company implements Employee {

    int fixedTopManagerSalary = 100000; // фикс зп топа
    int upperTopManagerSalary = fixedTopManagerSalary + (int) (fixedTopManagerSalary * TOPMANAGERPERCENT); // + проценты

    @Override
    public double getMonthSalary() // возвращает занчения при разных условиях
    {
        if (companyMoney < 10000000)
        {
            return fixedTopManagerSalary;
        }
        if (companyMoney >= 10000000)
        {
            return upperTopManagerSalary;
        }
        return -1; // сюда почему то требовался еще 1 return я не понял почему так, но с ним все работает
    }

    @Override
    public double setCompanyMoney()
    {
        return companyMoney + fixedTopManagerSalary;// здесь та же история что просто с менеджером
    }
}