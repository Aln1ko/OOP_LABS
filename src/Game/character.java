package Game;

public class character
{
    private String Name;
    private int money;
    private int marks;
    private int moral_points;
    private String sex;

    public character(String name,String sex)
    {
        this.sex = sex;
        this.Name = name;
    }

    public void set_money(int money)
    {
        this.money = money;
    }

    public void set_marks(int marks)
    {
        this.marks = marks;
    }

    public void set_moral_points(int moral_points)
    {
        this.moral_points = moral_points;
    }

    public int get_money(){
        return money;
    }

    public int get_marks(){
        return marks;
    }

    public int get_moral_points(){
        return moral_points;
    }
}
