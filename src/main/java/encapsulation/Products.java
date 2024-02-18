package encapsulation;

public class Products {
    private String name;
    private int cost;

    public String getName() {
        return name;
    }

       public void setName(String name) {
                          if (!name.isEmpty()){
            this.name = name;
        }else {
            System.out.println("ERROR;not name");}}

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Products(String name, int cost) {
        setName(name);
        setCost(cost);
    }

    //public Products(String name, int cost){}



}
