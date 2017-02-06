package eu.rd9.simpleandroid;

/**
 * Created by renne on 06.02.2017.
 */
import android.content.Context;

public abstract class Window extends WindowManager {

    public Window(Context context) {
        super(context);
        this.setupWindow();
    }

    public abstract void setupWindow();
}