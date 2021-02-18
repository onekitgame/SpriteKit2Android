package demo.spritekit;

import ios.iOSFile;
import ios.spritekit.*;

public class GameScene extends SKScene implements iOSFile {
    SKShapeNode _spinnyNode;
    SKLabelNode _label;

public void didMoveToView(SKView view) {
    // Setup your scene here

        // Get label node from scene and store it for use later
        _label = (SKLabelNode )this.childNodeWithName("//helloLabel");

        _label.setAlpha(0.0);
        _label.runAction(SKAction.fadeInWithDuration(2.0));

        float w = (this.getSize().getWidth() + this.getSize().getHeight()) * 0.05f;

        // Create shape node to use during mouse interaction
        _spinnyNode = SKShapeNode.shapeNodeWithRectOfSize(CGSizeMake(w, w),w * 0.3f);
        _spinnyNode.setLineWidth(2.5);

        _spinnyNode.runAction(SKAction.repeatActionForever(SKAction.rotateByAngle(M_PI,1]]];
        [_spinnyNode runAction:[SKAction sequence:@[
        [SKAction waitForDuration:0.5],
        [SKAction fadeOutWithDuration:0.5],
        [SKAction removeFromParent],
        ]]];
        }


        - (void)touchDownAtPoint:(CGPoint)pos {
        SKShapeNode *n = [_spinnyNode copy];
        n.position = pos;
        n.strokeColor = [SKColor greenColor];
        [self addChild:n];
        }

        - (void)touchMovedToPoint:(CGPoint)pos {
        SKShapeNode *n = [_spinnyNode copy];
        n.position = pos;
        n.strokeColor = [SKColor blueColor];
        [self addChild:n];
        }

        - (void)touchUpAtPoint:(CGPoint)pos {
        SKShapeNode *n = [_spinnyNode copy];
        n.position = pos;
        n.strokeColor = [SKColor redColor];
        [self addChild:n];
        }

        - (void)touchesBegan:(NSSet *)touches withEvent:(UIEvent *)event {
        // Run 'Pulse' action from 'Actions.sks'
        [_label runAction:[SKAction actionNamed:@"Pulse"] withKey:@"fadeInOut"];

        for (UITouch *t in touches) {[self touchDownAtPoint:[t locationInNode:self]];}
        }
        - (void)touchesMoved:(NSSet *)touches withEvent:(UIEvent *)event{
        for (UITouch *t in touches) {[self touchMovedToPoint:[t locationInNode:self]];}
        }
        - (void)touchesEnded:(NSSet *)touches withEvent:(UIEvent *)event {
        for (UITouch *t in touches) {[self touchUpAtPoint:[t locationInNode:self]];}
        }
        - (void)touchesCancelled:(NSSet *)touches withEvent:(UIEvent *)event {
        for (UITouch *t in touches) {[self touchUpAtPoint:[t locationInNode:self]];}
        }


        -(void)update:(CFTimeInterval)currentTime {
        // Called before each frame is rendered

}
}
