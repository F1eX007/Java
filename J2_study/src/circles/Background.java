package circles;

import java.awt.*;

public class Background {
    MainCanvas canvas;
    static float curTime = 0;

    public void SetBackground(float deltaTime) {
        curTime += deltaTime;
        if (curTime > 1) {
            Color color = new Color(
                    (int) (Math.random() * 255),
                    (int) (Math.random() * 255),
                    (int) (Math.random() * 255)
            );
            canvas.setBackground(color);
            curTime = 0;

        }
    }

}