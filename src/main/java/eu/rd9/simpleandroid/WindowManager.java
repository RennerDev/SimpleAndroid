package eu.rd9.simpleandroid;

/**
 * Created by renne on 06.02.2017.
 */
import android.content.Context;
import android.view.ViewGroup;

public class WindowManager extends ViewGroup {

    private static WindowManager windowManager = null;

    public static WindowManager getInstance(Context context)
    {
        if (windowManager == null)
            windowManager = new WindowManager(context);

        return windowManager;
    }

    public WindowManager(Context context) {
        super(context);
        windowManager = this;
    }

    public void showWindow(Window window)
    {
        this.removeAllViews();
        this.addView(window);
    }

    public void hideWindow(Window window)
    {
        this.removeView(window);
    }

    @Override
    protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
        // TODO Auto-generated method stub

    }

}