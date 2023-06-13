public class Main {
    public static void main(String[] args) {
        BasicStructure audi = new BasicStructure();
        audi.model = "A3";
        audi.color = "Black";
        audi.power = "5000cc";

        Engine x = new Engine();
        x.cylinders="8";
        x.weight="300kg";
        x.size="1234cc";

        Color col = new Color();
        col.colorWindows ="True";
        col.colorTyres ="False";
        col.colorLights ="True";
    }
}
