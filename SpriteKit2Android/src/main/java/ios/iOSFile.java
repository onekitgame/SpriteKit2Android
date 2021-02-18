package ios;

import ios.uikit.CGSize;

public interface iOSFile {
    public default  CGSize CGSizeMake(float width, float height) {
        return null;
    }
}
