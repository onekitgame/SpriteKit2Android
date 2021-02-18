package demo.spritekit;
import ios.iOSFile;
import ios.spritekit.*;
import ios.uikit.UIDevice;
import ios.uikit.UIInterfaceOrientationMask;
import ios.uikit.UIUserInterfaceIdiom;
import ios.uikit.UIViewController;

public class GameViewController extends UIViewController implements iOSFile {
    public void viewDidLoad() {
        super.viewDidLoad();

        // Load the SKScene from 'GameScene.sks'
        GameScene scene = SKScene.nodeWithFileNamed("GameScene");

        // Set the scale mode to scale to fit the window
        scene.setScaleMode(SKSceneScaleMode.AspectFill);

        SKView skView = (SKView) this.getView();

        // Present the scene
        skView.presentScene(scene);

        skView.setShowsFPS(true);
        skView.setShowsNodeCount(true);
    }

    public boolean shouldAutorotate() {
        return true;
    }

    public int supportedInterfaceOrientations()

    {
        if (UIDevice.getCurrentDevice().getUserInterfaceIdiom() == UIUserInterfaceIdiom.Phone) {
            return UIInterfaceOrientationMask.AllButUpsideDown;
        } else {
            return UIInterfaceOrientationMask.All;
        }
    }

    public boolean prefersStatusBarHidden() {
        return true;
    }
}
