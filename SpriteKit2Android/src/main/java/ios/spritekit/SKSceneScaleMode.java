package ios.spritekit;

public enum SKSceneScaleMode {
    Fill,           /* Scale the SKScene to fill the entire SKView. */
    AspectFill,     /* Scale the SKScene to fill the SKView while preserving the scene's aspect ratio. Some cropping may occur if the view has a different aspect ratio. */
    AspectFit,      /* Scale the SKScene to fit within the SKView while preserving the scene's aspect ratio. Some letterboxing may occur if the view has a different aspect ratio. */
    ResizeFill
}
