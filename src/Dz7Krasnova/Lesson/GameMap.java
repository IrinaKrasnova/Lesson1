package Dz7Krasnova.Lesson;

import javax.swing.*;
import java.awt.*;

public class GameMap extends JPanel {

    public static final int GM_HVH = 0;
    public static final int GM_HVA = 1;

    GameMap() {
        setBackground(Color.BLACK);

    }

    void startNewGame(int gameMode, int fieldSizeX, int fieldSizeY, int winLength) {
        System.out.println("mode= "+gameMode+
                "fieldsizeX = "+fieldSizeX+
                "fieldsizeY = "+fieldSizeY+
                "winlength = "+winLength);
    }


    }

