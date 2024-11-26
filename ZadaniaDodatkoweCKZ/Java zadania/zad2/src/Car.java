public class Car {
    public String make;
    public String plate;
    public Color color;
    public static int licznik=0;

    public Car(String make, String plate, Color color){
        this.make=make;
        this.plate=plate;
        this.color=color;
        licznik++;
    }
    public Car (String make, String plate){
        this(make,plate,Color.Unknown);
    }
    public String info(){
        return "Make: "+make+", Plate: "+plate+", Color: "+color;
    }

    public String getMake() {
        return make;
    }

    private void setMake(String make) {
        this.make = make;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static int getCounter() {
        return licznik;
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            licznik--; // intelj podkresla finalize, ale nie daltego ze nie działa, tylko dlatego ze nie powinno sie korzystac z finalize
        } finally {
            super.finalize();
        }
    }
}