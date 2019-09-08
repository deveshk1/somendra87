package java8.intefacestaticmethod;


public class EmployeeDto
{
    private String name;
    private Integer salary;
    private boolean isHavingGirlfrind;

    public EmployeeDto()
    {
    }

    public EmployeeDto(String name, Integer salary, boolean isHavingGirlfrind)
    {
        this.name = name;
        this.salary = salary;
        this.isHavingGirlfrind = isHavingGirlfrind;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getSalary()
    {
        return salary;
    }

    public void setSalary(Integer salary)
    {
        this.salary = salary;
    }

    public boolean isHavingGirlfrind()
    {
        return isHavingGirlfrind;
    }

    public void setHavingGirlfrind(boolean havingGirlfrind)
    {
        isHavingGirlfrind = havingGirlfrind;
    }

    @Override
    public String toString()
    {
        return "EmployeeDto{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", isHavingGirlfrind=" + isHavingGirlfrind +
                '}';
    }
}
