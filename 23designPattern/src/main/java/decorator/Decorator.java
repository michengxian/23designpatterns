package decorator;

public class Decorator extends Drink {

    private Drink Obj;
    public Decorator(Drink Obj) {
        this.Obj = Obj;
    };

    public float cost() {
        // TODO Auto-generated method stub
        return super.getPrice() + Obj.cost();
    }

    public String getDescription() {
        return super.description + "-" + super.getPrice() + "&&" + Obj.getDescription();
    }


}
