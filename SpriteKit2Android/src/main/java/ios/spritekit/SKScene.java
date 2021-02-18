package ios.spritekit;

public class SKScene extends SKNode{

    public static<T extends SKScene> T nodeWithFileNamed(String fileName) {

        try {
            StackTraceElement[] elements = (new Throwable()).getStackTrace();
            Class clazz = Class.forName(elements[1].getClassName());
            return (T) Class.forName(String.format("%s.%s",clazz.getPackage().getName(),fileName)).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    private SKSceneScaleMode scaleMode;

    public void setScaleMode(SKSceneScaleMode scaleMode) {
        this.scaleMode = scaleMode;
    }
}
