package a.d.b;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;

/* compiled from: ConstraintHelper.java */
/* loaded from: classes.dex */
public abstract class b extends View {

    /* renamed from: b  reason: collision with root package name */
    public int[] f60b;
    public int c;
    public Context d;
    public a.d.a.i.h e;
    public boolean f;
    public String g;

    public b(Context context) {
        super(context);
        this.f60b = new int[32];
        this.f = false;
        this.d = context;
        a((AttributeSet) null);
    }

    private void setIds(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                a(str.substring(i));
                return;
            } else {
                a(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void a() {
    }

    public void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == h.ConstraintLayout_Layout_constraint_referenced_ids) {
                    this.g = obtainStyledAttributes.getString(index);
                    setIds(this.g);
                }
            }
        }
    }

    public void b() {
    }

    public void c() {
        if (this.e == null) {
            return;
        }
        ConstraintLayout.a layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.a) {
            layoutParams.k0 = this.e;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f60b, this.c);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.c = 0;
        for (int i : iArr) {
            setTag(i, null);
        }
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        int i2 = this.c + 1;
        int[] iArr = this.f60b;
        if (i2 > iArr.length) {
            this.f60b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f60b;
        int i3 = this.c;
        iArr2[i3] = i;
        this.c = i3 + 1;
    }

    public final void a(String str) {
        int i;
        Object a2;
        if (str == null || this.d == null) {
            return;
        }
        String trim = str.trim();
        try {
            i = g.class.getField(trim).getInt(null);
        } catch (Exception unused) {
            i = 0;
        }
        if (i == 0) {
            i = this.d.getResources().getIdentifier(trim, "id", this.d.getPackageName());
        }
        if (i == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout) && (a2 = getParent().a(0, trim)) != null && (a2 instanceof Integer)) {
            i = ((Integer) a2).intValue();
        }
        if (i != 0) {
            setTag(i, null);
        }
    }

    public void a(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.g);
        }
        a.d.a.i.h hVar = this.e;
        if (hVar == null) {
            return;
        }
        hVar.l0 = 0;
        for (int i = 0; i < this.c; i++) {
            View b2 = constraintLayout.b(this.f60b[i]);
            if (b2 != null) {
                a.d.a.i.h hVar2 = this.e;
                a.d.a.i.d a2 = constraintLayout.a(b2);
                int i2 = hVar2.l0 + 1;
                a.d.a.i.d[] dVarArr = hVar2.k0;
                if (i2 > dVarArr.length) {
                    hVar2.k0 = (a.d.a.i.d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
                }
                a.d.a.i.d[] dVarArr2 = hVar2.k0;
                int i3 = hVar2.l0;
                dVarArr2[i3] = a2;
                hVar2.l0 = i3 + 1;
            }
        }
    }
}
