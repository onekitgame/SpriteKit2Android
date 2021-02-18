package cn.onekit.game;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;

import cn.onekit.game.spritekit.SKScene;

public class Bundle {
    private final Context _context;

    public Bundle(Context context) {
        this._context = context;
    }

    public String readText(String path) {
        try {
            InputStream is = _context.getAssets().open(path);
            int lenght = is.available();
            byte[] buffer = new byte[lenght];
            is.read(buffer);
            return new String(buffer, "utf8");
        } catch (IOException e) {
            e.printStackTrace();
            throw new Error(e);
        }
    }
}