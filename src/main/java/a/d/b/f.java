package a.d.b;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: Placeholder.java */
/* loaded from: classes.dex */
public class f extends View {

    /* renamed from: b  reason: collision with root package name */
    public int f66b;
    public View c;
    public int d;

    public void a(ConstraintLayout constraintLayout) {
        if (this.f66b == -1 && !isInEditMode()) {
            setVisibility(this.d);
        }
        this.c = constraintLayout.findViewById(this.f66b);
        View view = this.c;
        if (view != null) {
            view.getLayoutParams().Z = true;
            this.c.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.c;
    }

    public int getEmptyVisibility() {
        return this.d;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (height / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f66b == i) {
            return;
        }
        View view = this.c;
        if (view != null) {
            view.setVisibility(0);
            this.c.getLayoutParams().Z = false;
            this.c = null;
        }
        this.f66b = i;
        if (i == -1 || (findViewById = ((View) getParent()).findViewById(i)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i) {
        this.d = i;
    }

    public void a() {
        if (this.c == null) {
            return;
        }
        ConstraintLayout.a layoutParams = getLayoutParams();
        ConstraintLayout.a layoutParams2 = this.c.getLayoutParams();
        a.d.a.i.d dVar = layoutParams2.k0;
        dVar.Y = 0;
        layoutParams.k0.f(dVar.h());
        layoutParams.k0.e(layoutParams2.k0.c());
        layoutParams2.k0.Y = 8;
    }
}
