package ios.uikit;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class UIViewController extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getResources().getIdentifier(String.format("activity_%s", this.getClass().getSimpleName().toLowerCase()), "layout", this.getPackageName()));
        viewDidLoad();
    }

     public void viewDidLoad(){

     }

    protected <T extends View> View getView() {
        View root = findViewById(android.R.id.content);
        return ((ViewGroup) root).getChildAt(0);
    }
}