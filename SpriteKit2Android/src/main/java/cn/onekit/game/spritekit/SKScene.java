package cn.onekit.game.spritekit;

import android.util.Log;

public class SKScene<T> extends SKNode{

    public static<T> T nodeWithFileNamed(String gameScene) {

        StackTraceElement[] elements = (new Throwable()).getStackTrace();
        for (StackTraceElement ele : elements) {
            try {
                if (Class.forName(ele.getClassName()).getSuperclass() == SKScene.class) {
                    Log.e("===========",ele.getClassName() + "调用了method方法");
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    private SKSceneScaleMode scaleMode;

    public void setScaleMode(SKSceneScaleMode scaleMode) {
        this.scaleMode = scaleMode;
    }
}
