package questao2;

public class Main {
    public static void main(String[] args) {
        ImageManager manager = new ImageManager();
        manager.setRender(new TVRender());
        manager.show();
        manager.setRender(new SmartphoneRender());
        manager.show();
        manager.setRender(new LaptopRender());
        manager.show();
    }
}
