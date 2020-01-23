package Calculator;

public class Dispatcher {
    public static void main(String args[]){
        Controller c = new Controller();
        View v = new View();
        Model m = new Model();

        m.x = 50;
        m.y = 55;

        int summa = c.sum(m.x,m.y);
        double devide = c.Devide(m.x, m.y);

        v.displayInteger(summa);
        v.displayDouble(devide);
    }
}

