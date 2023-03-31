package a.d.b;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;

/* compiled from: Barrier.java */
/* loaded from: classes.dex */
public class a extends b {
    public int h;
    public int i;
    public a.d.a.i.a j;

    public a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // a.d.b.b
    public void a(AttributeSet attributeSet) {
        super.a(attributeSet);
        this.j = new a.d.a.i.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == h.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == h.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.j.o0 = obtainStyledAttributes.getBoolean(index, true);
                }
            }
        }
        this.e = this.j;
        c();
    }

    public int getType() {
        return this.h;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.j.o0 = z;
    }

    public void setType(int i) {
        this.h = i;
        this.i = i;
        if (Build.VERSION.SDK_INT < 17) {
            int i2 = this.h;
            if (i2 == 5) {
                this.i = 0;
            } else if (i2 == 6) {
                this.i = 1;
            }
        } else {
            if (1 == getResources().getConfiguration().getLayoutDirection()) {
                int i3 = this.h;
                if (i3 == 5) {
                    this.i = 1;
                } else if (i3 == 6) {
                    this.i = 0;
                }
            } else {
                int i4 = this.h;
                if (i4 == 5) {
                    this.i = 0;
                } else if (i4 == 6) {
                    this.i = 1;
                }
            }
        }
        this.j.m0 = this.i;
    }
}
