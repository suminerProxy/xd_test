package a.d.a.i;

import a.d.a.h;

/* compiled from: ConstraintAnchor.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    public final d f44b;
    public final EnumC0004c c;
    public c d;
    public int h;
    public a.d.a.h i;

    /* renamed from: a  reason: collision with root package name */
    public j f43a = new j(this);
    public int e = 0;
    public int f = -1;
    public b g = b.NONE;

    /* compiled from: ConstraintAnchor.java */
    /* loaded from: classes.dex */
    public enum a {
        RELAXED,
        STRICT
    }

    /* compiled from: ConstraintAnchor.java */
    /* loaded from: classes.dex */
    public enum b {
        NONE,
        STRONG,
        WEAK
    }

    /* compiled from: ConstraintAnchor.java */
    /* renamed from: a.d.a.i.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0004c {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public c(d dVar, EnumC0004c enumC0004c) {
        a aVar = a.RELAXED;
        this.h = 0;
        this.f44b = dVar;
        this.c = enumC0004c;
    }

    public int a() {
        return this.h;
    }

    public int b() {
        c cVar;
        if (this.f44b.Y == 8) {
            return 0;
        }
        int i = this.f;
        return (i <= -1 || (cVar = this.d) == null || cVar.f44b.Y != 8) ? this.e : i;
    }

    public b c() {
        return this.g;
    }

    public boolean d() {
        return this.d != null;
    }

    public void e() {
        this.d = null;
        this.e = 0;
        this.f = -1;
        this.g = b.STRONG;
        this.h = 0;
        a aVar = a.RELAXED;
        this.f43a.e();
    }

    public void f() {
        a.d.a.h hVar = this.i;
        if (hVar == null) {
            this.i = new a.d.a.h(h.a.UNRESTRICTED);
        } else {
            hVar.a();
        }
    }

    public String toString() {
        return this.f44b.Z + ":" + this.c.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
        if (r4.f44b.i() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006b, code lost:
        if (r10 != a.d.a.i.c.EnumC0004c.j) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0088, code lost:
        if (r10 != a.d.a.i.c.EnumC0004c.i) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(a.d.a.i.c r5, int r6, int r7, a.d.a.i.c.b r8, int r9, boolean r10) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            if (r5 != 0) goto L14
            r5 = 0
            r4.d = r5
            r4.e = r1
            r5 = -1
            r4.f = r5
            a.d.a.i.c$b r5 = a.d.a.i.c.b.NONE
            r4.g = r5
            r5 = 2
            r4.h = r5
            return r0
        L14:
            if (r10 != 0) goto L8e
            a.d.a.i.c$c r10 = r5.c
            a.d.a.i.c$c r2 = r4.c
            if (r10 != r2) goto L31
            a.d.a.i.c$c r10 = a.d.a.i.c.EnumC0004c.BASELINE
            if (r2 != r10) goto L70
            a.d.a.i.d r10 = r5.f44b
            boolean r10 = r10.i()
            if (r10 == 0) goto L6e
            a.d.a.i.d r10 = r4.f44b
            boolean r10 = r10.i()
            if (r10 != 0) goto L70
            goto L6e
        L31:
            int r2 = r2.ordinal()
            switch(r2) {
                case 0: goto L6e;
                case 1: goto L72;
                case 2: goto L55;
                case 3: goto L72;
                case 4: goto L55;
                case 5: goto L6e;
                case 6: goto L44;
                case 7: goto L6e;
                case 8: goto L6e;
                default: goto L38;
            }
        L38:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            a.d.a.i.c$c r6 = r4.c
            java.lang.String r6 = r6.name()
            r5.<init>(r6)
            throw r5
        L44:
            a.d.a.i.c$c r2 = a.d.a.i.c.EnumC0004c.BASELINE
            if (r10 == r2) goto L52
            a.d.a.i.c$c r2 = a.d.a.i.c.EnumC0004c.CENTER_X
            if (r10 == r2) goto L52
            a.d.a.i.c$c r2 = a.d.a.i.c.EnumC0004c.CENTER_Y
            if (r10 == r2) goto L52
            r10 = 1
            goto L53
        L52:
            r10 = 0
        L53:
            r2 = r10
            goto L8b
        L55:
            a.d.a.i.c$c r2 = a.d.a.i.c.EnumC0004c.TOP
            if (r10 == r2) goto L60
            a.d.a.i.c$c r2 = a.d.a.i.c.EnumC0004c.BOTTOM
            if (r10 != r2) goto L5e
            goto L60
        L5e:
            r2 = 0
            goto L61
        L60:
            r2 = 1
        L61:
            a.d.a.i.d r3 = r5.f44b
            boolean r3 = r3 instanceof a.d.a.i.g
            if (r3 == 0) goto L8b
            if (r2 != 0) goto L70
            a.d.a.i.c$c r2 = a.d.a.i.c.EnumC0004c.CENTER_Y
            if (r10 != r2) goto L6e
            goto L70
        L6e:
            r2 = 0
            goto L8b
        L70:
            r2 = 1
            goto L8b
        L72:
            a.d.a.i.c$c r2 = a.d.a.i.c.EnumC0004c.LEFT
            if (r10 == r2) goto L7d
            a.d.a.i.c$c r2 = a.d.a.i.c.EnumC0004c.RIGHT
            if (r10 != r2) goto L7b
            goto L7d
        L7b:
            r2 = 0
            goto L7e
        L7d:
            r2 = 1
        L7e:
            a.d.a.i.d r3 = r5.f44b
            boolean r3 = r3 instanceof a.d.a.i.g
            if (r3 == 0) goto L8b
            if (r2 != 0) goto L70
            a.d.a.i.c$c r2 = a.d.a.i.c.EnumC0004c.CENTER_X
            if (r10 != r2) goto L6e
            goto L70
        L8b:
            if (r2 != 0) goto L8e
            return r1
        L8e:
            r4.d = r5
            if (r6 <= 0) goto L95
            r4.e = r6
            goto L97
        L95:
            r4.e = r1
        L97:
            r4.f = r7
            r4.g = r8
            r4.h = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.d.a.i.c.a(a.d.a.i.c, int, int, a.d.a.i.c$b, int, boolean):boolean");
    }
}
