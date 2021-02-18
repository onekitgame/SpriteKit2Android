package ios.spritekit;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.annotation.NonNull;

public class SKView extends SurfaceView implements SurfaceHolder.Callback,Runnable{

    public SKView(Context context) {
        super(context);
    }

    public SKView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SKView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void presentScene(SKScene scene) {

    }

    public void setShowsFPS(boolean showsFPS) {
    }

    public void setShowsNodeCount(boolean showsNodeCount) {
    }

    @Override
    public void run() {

    }

    @Override
    public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {

    }

    @Override
    public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {

    }
}
