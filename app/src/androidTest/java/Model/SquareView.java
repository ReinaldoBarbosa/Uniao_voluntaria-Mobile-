package Model;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class SquareView extends View {
    private Paint paint;

    public SquareView(Context context) {
        super(context);
        init();
    }

    public SquareView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SquareView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        paint = new Paint();
        paint.setColor(0xff000000); // Cor preta
        paint.setStyle(Paint.Style.FILL);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // Desenhar um quadrado
        int size = Math.min(getWidth(), getHeight());
        canvas.drawRect(0, 0, size, size, paint);
    }
}
