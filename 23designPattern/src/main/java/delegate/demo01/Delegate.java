package delegate.demo01;

public class Delegate implements Rent {

    private Landlord landlord;

    public Delegate(Landlord landlord) {
        this.landlord = landlord;
    }


    public void rent() {
        seeHouse();
        landlord.rent();
        contract();
        fare();
    }

    public void seeHouse(){
        System.out.println("中介带看房");
    }

    public void contract(){
        System.out.println("签合同");
    }

    public void fare(){
        System.out.println("收中介费");
    }

}
