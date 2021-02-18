package cn.onekit.game.spritekit;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class SKView extends SurfaceView {

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
}
