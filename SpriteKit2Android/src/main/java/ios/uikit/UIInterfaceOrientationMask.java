package ios.uikit;

public interface UIInterfaceOrientationMask {

    int Portrait = (1 << UIInterfaceOrientation.Portrait);
    int LandscapeLeft = (1 << UIInterfaceOrientation.LandscapeLeft);
    int LandscapeRight = (1 << UIInterfaceOrientation.LandscapeRight);
    int PortraitUpsideDown = (1 << UIInterfaceOrientation.PortraitUpsideDown);
    int Landscape = (UIInterfaceOrientationMask.LandscapeLeft | UIInterfaceOrientationMask.LandscapeRight);
    int All = (UIInterfaceOrientationMask.Portrait | UIInterfaceOrientationMask.LandscapeLeft | UIInterfaceOrientationMask.LandscapeRight | UIInterfaceOrientationMask.PortraitUpsideDown);
    int AllButUpsideDown = (UIInterfaceOrientationMask.Portrait | UIInterfaceOrientationMask.LandscapeLeft | UIInterfaceOrientationMask.LandscapeRight);
}
