package ios.uikit;

public interface   UIDeviceOrientation {
    int Unknown = 0;
    int Portrait = 1;            // Device oriented vertically, home button on the bottom
    int PortraitUpsideDown = 2;  // Device oriented vertically, home button on the top
    int LandscapeLeft = 3;       // Device oriented horizontally, home button on the right
    int LandscapeRight = 4;      // Device oriented horizontally, home button on the left
    int FaceUp = 5;              // Device oriented flat, face up
    int FaceDown = 6;             // Device oriented flat, face down
}
