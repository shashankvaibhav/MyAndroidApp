package cube.funfact;

import android.graphics.Color;

import java.util.Random;

public class ColorWheel {
    String[] mColor = {
            "#39add1",
            "#3079ab",
            "#c25975",
            "#e15258",
            "#4D4DB8",
            "#838cc7",
            "#7d669e",
            "#53bbb4",
            "#51b46d",
            "#e0ab18",
            "#637a91",
            "#f092b0",
            "#b7c0c7"
    };
    public int getColor(){

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColor.length);
        String color = mColor[randomNumber];
        int colorAsInt;
        colorAsInt = Color.parseColor(color);
        return colorAsInt;
    };
}
