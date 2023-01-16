import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Loader loader = new Loader();
        LoaderCallback callback = new LoaderCallback() {
            @Override
            public boolean updateStatus() {
                return loader.getBusiness();
            }
            @Override
            public void unload(Fura fura) {
                loader.unload(fura);
            }
        };
        FuraFactory factory = new FuraFactory(callback);
        factory.initFactory();

    }
}