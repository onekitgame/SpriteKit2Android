package cn.onekit.game;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class UIViewController extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewDidLoad();
    }

    public void viewDidLoad(){

    }

    protected <T extends View> View getView() {
        return getWindow().getDecorView();
    }
}
