package questao2;

public class ImageManager {
    private ImageRender render;

    public void setRender(ImageRender render) {
        this.render = render;
    }

    public void show() {
        render.showImageRender();
    }
}
