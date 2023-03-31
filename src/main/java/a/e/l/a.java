package a.e.l;

import a.e.k.m;
import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ListView;

/* compiled from: AutoScrollHelper.java */
/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {
    public static final int s = ViewConfiguration.getTapTimeout();
    public final View d;
    public Runnable e;
    public int h;
    public int i;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;

    /* renamed from: b  reason: collision with root package name */
    public final C0005a f68b = new C0005a();
    public final Interpolator c = new AccelerateInterpolator();
    public float[] f = {0.0f, 0.0f};
    public float[] g = {Float.MAX_VALUE, Float.MAX_VALUE};
    public float[] j = {0.0f, 0.0f};
    public float[] k = {0.0f, 0.0f};
    public float[] l = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* compiled from: AutoScrollHelper.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View childAt;
            a aVar = a.this;
            if (aVar.p) {
                if (aVar.n) {
                    aVar.n = false;
                    aVar.f68b.b();
                }
                C0005a c0005a = a.this.f68b;
                if (!(c0005a.i > 0 && AnimationUtils.currentAnimationTimeMillis() > c0005a.i + ((long) c0005a.k)) && a.this.b()) {
                    a aVar2 = a.this;
                    if (aVar2.o) {
                        aVar2.o = false;
                        aVar2.a();
                    }
                    if (c0005a.f != 0) {
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        float a2 = c0005a.a(currentAnimationTimeMillis);
                        c0005a.f = currentAnimationTimeMillis;
                        float f = ((float) (currentAnimationTimeMillis - c0005a.f)) * ((a2 * 4.0f) + ((-4.0f) * a2 * a2));
                        c0005a.g = (int) (c0005a.c * f);
                        c0005a.h = (int) (f * c0005a.d);
                        int i = c0005a.g;
                        int i2 = c0005a.h;
                        ListView listView = ((c) a.this).t;
                        if (Build.VERSION.SDK_INT >= 19) {
                            listView.scrollListBy(i2);
                        } else {
                            int firstVisiblePosition = listView.getFirstVisiblePosition();
                            if (firstVisiblePosition != -1 && (childAt = listView.getChildAt(0)) != null) {
                                listView.setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i2);
                            }
                        }
                        m.a(a.this.d, this);
                        return;
                    }
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                a.this.p = false;
            }
        }
    }

    public a(View view) {
        this.d = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.l;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr[0] = f2;
        fArr[1] = f2;
        float[] fArr2 = this.k;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr2[0] = f3;
        fArr2[1] = f3;
        this.h = 1;
        float[] fArr3 = this.g;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.j;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.i = s;
        C0005a c0005a = this.f68b;
        c0005a.f69a = 500;
        c0005a.f70b = 500;
    }

    public static float a(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    public static int a(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    public a a(boolean z) {
        if (this.q && !z) {
            if (this.n) {
                this.p = false;
            } else {
                this.f68b.a();
            }
        }
        this.q = z;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b() {
        /*
            r9 = this;
            a.e.l.a$a r0 = r9.f68b
            float r1 = r0.d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.c
            float r2 = java.lang.Math.abs(r0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L53
            r4 = r9
            a.e.l.c r4 = (a.e.l.c) r4
            android.widget.ListView r4 = r4.t
            int r5 = r4.getCount()
            if (r5 != 0) goto L23
        L21:
            r1 = 0
            goto L51
        L23:
            int r6 = r4.getChildCount()
            int r7 = r4.getFirstVisiblePosition()
            int r8 = r7 + r6
            if (r1 <= 0) goto L41
            if (r8 < r5) goto L50
            int r6 = r6 - r2
            android.view.View r1 = r4.getChildAt(r6)
            int r1 = r1.getBottom()
            int r4 = r4.getHeight()
            if (r1 > r4) goto L50
            goto L21
        L41:
            if (r1 >= 0) goto L21
            if (r7 > 0) goto L50
            android.view.View r1 = r4.getChildAt(r3)
            int r1 = r1.getTop()
            if (r1 < 0) goto L50
            goto L21
        L50:
            r1 = 1
        L51:
            if (r1 != 0) goto L59
        L53:
            if (r0 == 0) goto L58
            r0 = r9
            a.e.l.c r0 = (a.e.l.c) r0
        L58:
            r2 = 0
        L59:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.l.a.b():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.q
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L23
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L27
            r6 = 3
            if (r0 == r6) goto L16
            goto L86
        L16:
            boolean r6 = r5.n
            if (r6 == 0) goto L1d
            r5.p = r1
            goto L86
        L1d:
            a.e.l.a$a r6 = r5.f68b
            r6.a()
            goto L86
        L23:
            r5.o = r2
            r5.m = r1
        L27:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.d
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.a(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.d
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.a(r2, r7, r6, r3)
            a.e.l.a$a r7 = r5.f68b
            r7.c = r0
            r7.d = r6
            boolean r6 = r5.p
            if (r6 != 0) goto L86
            boolean r6 = r5.b()
            if (r6 == 0) goto L86
            java.lang.Runnable r6 = r5.e
            if (r6 != 0) goto L6a
            a.e.l.a$b r6 = new a.e.l.a$b
            r6.<init>()
            r5.e = r6
        L6a:
            r5.p = r2
            r5.n = r2
            boolean r6 = r5.m
            if (r6 != 0) goto L7f
            int r6 = r5.i
            if (r6 <= 0) goto L7f
            android.view.View r7 = r5.d
            java.lang.Runnable r0 = r5.e
            long r3 = (long) r6
            a.e.k.m.a(r7, r0, r3)
            goto L84
        L7f:
            java.lang.Runnable r6 = r5.e
            r6.run()
        L84:
            r5.m = r2
        L86:
            boolean r6 = r5.r
            if (r6 == 0) goto L8f
            boolean r6 = r5.p
            if (r6 == 0) goto L8f
            r1 = 1
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.l.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* compiled from: AutoScrollHelper.java */
    /* renamed from: a.e.l.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0005a {

        /* renamed from: a  reason: collision with root package name */
        public int f69a;

        /* renamed from: b  reason: collision with root package name */
        public int f70b;
        public float c;
        public float d;
        public float j;
        public int k;
        public long e = Long.MIN_VALUE;
        public long i = -1;
        public long f = 0;
        public int g = 0;
        public int h = 0;

        public void a() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.k = a.a((int) (currentAnimationTimeMillis - this.e), 0, this.f70b);
            this.j = a(currentAnimationTimeMillis);
            this.i = currentAnimationTimeMillis;
        }

        public void b() {
            this.e = AnimationUtils.currentAnimationTimeMillis();
            this.i = -1L;
            this.f = this.e;
            this.j = 0.5f;
            this.g = 0;
            this.h = 0;
        }

        public final float a(long j) {
            if (j < this.e) {
                return 0.0f;
            }
            long j2 = this.i;
            if (j2 >= 0 && j >= j2) {
                long j3 = j - j2;
                float f = this.j;
                return (a.a(((float) j3) / this.k, 0.0f, 1.0f) * f) + (1.0f - f);
            }
            return a.a(((float) (j - this.e)) / this.f69a, 0.0f, 1.0f) * 0.5f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f
            r0 = r0[r4]
            float[] r1 = r3.g
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = a(r0, r2, r1)
            float r1 = r3.a(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.a(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 >= 0) goto L26
            android.view.animation.Interpolator r6 = r3.c
            float r5 = -r5
            float r5 = r6.getInterpolation(r5)
            float r5 = -r5
            goto L30
        L26:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L39
            android.view.animation.Interpolator r6 = r3.c
            float r5 = r6.getInterpolation(r5)
        L30:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = a(r5, r6, r0)
            goto L3a
        L39:
            r5 = 0
        L3a:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3f
            return r2
        L3f:
            float[] r6 = r3.j
            r6 = r6[r4]
            float[] r0 = r3.k
            r0 = r0[r4]
            float[] r1 = r3.l
            r4 = r1[r4]
            float r6 = r6 * r7
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 <= 0) goto L58
            float r5 = r5 * r6
            float r4 = a(r5, r0, r4)
            return r4
        L58:
            float r5 = -r5
            float r5 = r5 * r6
            float r4 = a(r5, r0, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.l.a.a(int, float, float, float):float");
    }

    public final float a(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.h;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.p && this.h == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    public void a() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.d.onTouchEvent(obtain);
        obtain.recycle();
    }
}
