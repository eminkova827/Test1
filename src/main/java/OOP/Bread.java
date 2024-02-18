package OOP;

public class Bread {
    private String name;
    private String characteristics;

    private String ilness;

    //set9+et


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.isEmpty()) {
        this.name = name;
    } else {
            System.out.println("ERROR: No name entered !!!");}
    }


    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        if(!name.isEmpty()) {
            this.characteristics = characteristics;
        } else {
            System.out.println("ERROR: No characteristics entered !!!");}

    }

    public String getIlness() {
        return ilness;
    }

    public void setIlness(String ilness) {
        if(!name.isEmpty()) {
            this.ilness = ilness;
        } else {
            System.out.println("ERROR: No illls!!!");}
            }

//constructor

    public Bread(String name, String characteristics, String ilness) {
        setName(name);
        setCharacteristics(characteristics);
        setIlness(ilness);
    }



            //end
}
