package a.d.a.i;

import a.d.a.i.c;
import java.util.ArrayList;

/* compiled from: ConstraintWidget.java */
/* loaded from: classes.dex */
public class d {
    public static float j0 = 0.5f;
    public a[] C;
    public d D;
    public int E;
    public int F;
    public float G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public float V;
    public float W;
    public Object X;
    public int Y;
    public String Z;
    public String a0;
    public boolean b0;
    public k c;
    public boolean c0;
    public k d;
    public boolean d0;
    public int e0;
    public int f0;
    public float[] g0;
    public d[] h0;
    public d[] i0;

    /* renamed from: a  reason: collision with root package name */
    public int f48a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f49b = -1;
    public int e = 0;
    public int f = 0;
    public int[] g = new int[2];
    public int h = 0;
    public int i = 0;
    public float j = 1.0f;
    public int k = 0;
    public int l = 0;
    public float m = 1.0f;
    public int n = -1;
    public float o = 1.0f;
    public f p = null;
    public int[] q = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public float r = 0.0f;
    public c s = new c(this, c.EnumC0004c.LEFT);
    public c t = new c(this, c.EnumC0004c.TOP);
    public c u = new c(this, c.EnumC0004c.RIGHT);
    public c v = new c(this, c.EnumC0004c.BOTTOM);
    public c w = new c(this, c.EnumC0004c.BASELINE);
    public c x = new c(this, c.EnumC0004c.CENTER_X);
    public c y = new c(this, c.EnumC0004c.CENTER_Y);
    public c z = new c(this, c.EnumC0004c.CENTER);
    public c[] A = {this.s, this.u, this.t, this.v, this.w, this.z};
    public ArrayList<c> B = new ArrayList<>();

    /* compiled from: ConstraintWidget.java */
    /* loaded from: classes.dex */
    public enum a {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public d() {
        a aVar = a.FIXED;
        this.C = new a[]{aVar, aVar};
        this.D = null;
        this.E = 0;
        this.F = 0;
        this.G = 0.0f;
        this.H = -1;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        float f = j0;
        this.V = f;
        this.W = f;
        this.Y = 0;
        this.Z = null;
        this.a0 = null;
        this.b0 = false;
        this.c0 = false;
        this.d0 = false;
        this.e0 = 0;
        this.f0 = 0;
        this.g0 = new float[]{-1.0f, -1.0f};
        this.h0 = new d[]{null, null};
        this.i0 = new d[]{null, null};
        this.B.add(this.s);
        this.B.add(this.t);
        this.B.add(this.u);
        this.B.add(this.v);
        this.B.add(this.x);
        this.B.add(this.y);
        this.B.add(this.z);
        this.B.add(this.w);
    }

    public void a(int i) {
        i.a(i, this);
    }

    public void b(a.d.a.e eVar) {
        eVar.a(this.s);
        eVar.a(this.t);
        eVar.a(this.u);
        eVar.a(this.v);
        if (this.Q > 0) {
            eVar.a(this.w);
        }
    }

    public int c() {
        if (this.Y == 8) {
            return 0;
        }
        return this.F;
    }

    public a d() {
        return this.C[0];
    }

    public k e() {
        if (this.d == null) {
            this.d = new k();
        }
        return this.d;
    }

    public k f() {
        if (this.c == null) {
            this.c = new k();
        }
        return this.c;
    }

    public a g() {
        return this.C[1];
    }

    public int h() {
        if (this.Y == 8) {
            return 0;
        }
        return this.E;
    }

    public boolean i() {
        return this.Q > 0;
    }

    public boolean j() {
        return this.s.f43a.f55b == 1 && this.u.f43a.f55b == 1 && this.t.f43a.f55b == 1 && this.v.f43a.f55b == 1;
    }

    public void k() {
        this.s.e();
        this.t.e();
        this.u.e();
        this.v.e();
        this.w.e();
        this.x.e();
        this.y.e();
        this.z.e();
        this.D = null;
        this.r = 0.0f;
        this.E = 0;
        this.F = 0;
        this.G = 0.0f;
        this.H = -1;
        this.I = 0;
        this.J = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        float f = j0;
        this.V = f;
        this.W = f;
        a[] aVarArr = this.C;
        a aVar = a.FIXED;
        aVarArr[0] = aVar;
        aVarArr[1] = aVar;
        this.X = null;
        this.Y = 0;
        this.a0 = null;
        this.e0 = 0;
        this.f0 = 0;
        float[] fArr = this.g0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f48a = -1;
        this.f49b = -1;
        int[] iArr = this.q;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.e = 0;
        this.f = 0;
        this.j = 1.0f;
        this.m = 1.0f;
        this.i = Integer.MAX_VALUE;
        this.l = Integer.MAX_VALUE;
        this.h = 0;
        this.k = 0;
        this.n = -1;
        this.o = 1.0f;
        k kVar = this.c;
        if (kVar != null) {
            kVar.e();
        }
        k kVar2 = this.d;
        if (kVar2 != null) {
            kVar2.e();
        }
        this.p = null;
        this.b0 = false;
        this.c0 = false;
        this.d0 = false;
    }

    public void l() {
        for (int i = 0; i < 6; i++) {
            this.A[i].f43a.e();
        }
    }

    public void m() {
    }

    public void n() {
        int i = this.I;
        int i2 = this.J;
        this.M = i;
        this.N = i2;
    }

    public void o() {
        for (int i = 0; i < 6; i++) {
            j jVar = this.A[i].f43a;
            c cVar = jVar.c;
            c cVar2 = cVar.d;
            if (cVar2 != null) {
                if (cVar2.d == cVar) {
                    jVar.h = 4;
                    cVar2.f43a.h = 4;
                }
                int b2 = jVar.c.b();
                c.EnumC0004c enumC0004c = jVar.c.c;
                if (enumC0004c == c.EnumC0004c.RIGHT || enumC0004c == c.EnumC0004c.BOTTOM) {
                    b2 = -b2;
                }
                jVar.a(cVar2.f43a, b2);
            }
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.a0 != null) {
            StringBuilder a2 = b.a.a.a.a.a("type: ");
            a2.append(this.a0);
            a2.append(" ");
            str = a2.toString();
        } else {
            str = "";
        }
        sb.append(str);
        if (this.Z != null) {
            StringBuilder a3 = b.a.a.a.a.a("id: ");
            a3.append(this.Z);
            a3.append(" ");
            str2 = a3.toString();
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.I);
        sb.append(", ");
        sb.append(this.J);
        sb.append(") - (");
        sb.append(this.E);
        sb.append(" x ");
        sb.append(this.F);
        sb.append(") wrap: (");
        sb.append(this.T);
        sb.append(" x ");
        sb.append(this.U);
        sb.append(")");
        return sb.toString();
    }

    public void a(a.d.a.c cVar) {
        this.s.f();
        this.t.f();
        this.u.f();
        this.v.f();
        this.w.f();
        this.z.f();
        this.x.f();
        this.y.f();
    }

    public final boolean d(int i) {
        int i2 = i * 2;
        c[] cVarArr = this.A;
        if (cVarArr[i2].d != null && cVarArr[i2].d.d != cVarArr[i2]) {
            int i3 = i2 + 1;
            if (cVarArr[i3].d != null && cVarArr[i3].d.d == cVarArr[i3]) {
                return true;
            }
        }
        return false;
    }

    public int c(int i) {
        if (i == 0) {
            return h();
        }
        if (i == 1) {
            return c();
        }
        return 0;
    }

    public void e(int i) {
        this.F = i;
        int i2 = this.F;
        int i3 = this.S;
        if (i2 < i3) {
            this.F = i3;
        }
    }

    public void f(int i) {
        this.E = i;
        int i2 = this.E;
        int i3 = this.R;
        if (i2 < i3) {
            this.E = i3;
        }
    }

    public void c(int i, int i2) {
        this.J = i;
        this.F = i2 - i;
        int i3 = this.F;
        int i4 = this.S;
        if (i3 < i4) {
            this.F = i4;
        }
    }

    public ArrayList<c> b() {
        return this.B;
    }

    public void b(int i, int i2) {
        this.O = i;
        this.P = i2;
    }

    public void c(a.d.a.e eVar) {
        int i;
        int i2;
        int b2 = eVar.b(this.s);
        int b3 = eVar.b(this.t);
        int b4 = eVar.b(this.u);
        int b5 = eVar.b(this.v);
        int i3 = b5 - b3;
        if (b4 - b2 < 0 || i3 < 0 || b2 == Integer.MIN_VALUE || b2 == Integer.MAX_VALUE || b3 == Integer.MIN_VALUE || b3 == Integer.MAX_VALUE || b4 == Integer.MIN_VALUE || b4 == Integer.MAX_VALUE || b5 == Integer.MIN_VALUE || b5 == Integer.MAX_VALUE) {
            b5 = 0;
            b2 = 0;
            b3 = 0;
            b4 = 0;
        }
        int i4 = b4 - b2;
        int i5 = b5 - b3;
        this.I = b2;
        this.J = b3;
        if (this.Y == 8) {
            this.E = 0;
            this.F = 0;
            return;
        }
        if (this.C[0] != a.FIXED || i4 >= (i = this.E)) {
            i = i4;
        }
        if (this.C[1] == a.FIXED && i5 < (i2 = this.F)) {
            i5 = i2;
        }
        this.E = i;
        this.F = i5;
        int i6 = this.F;
        int i7 = this.S;
        if (i6 < i7) {
            this.F = i7;
        }
        int i8 = this.E;
        int i9 = this.R;
        if (i8 < i9) {
            this.E = i9;
        }
        this.c0 = true;
    }

    public void a(int i, int i2, int i3) {
        if (i3 == 0) {
            a(i, i2);
        } else if (i3 == 1) {
            c(i, i2);
        }
        this.c0 = true;
    }

    public a b(int i) {
        if (i == 0) {
            return d();
        }
        if (i == 1) {
            return g();
        }
        return null;
    }

    public void b(a aVar) {
        this.C[1] = aVar;
        if (aVar == a.WRAP_CONTENT) {
            e(this.U);
        }
    }

    public void a(int i, int i2) {
        this.I = i;
        this.E = i2 - i;
        int i3 = this.E;
        int i4 = this.R;
        if (i3 < i4) {
            this.E = i4;
        }
    }

    public boolean a() {
        return this.Y != 8;
    }

    public void a(c.EnumC0004c enumC0004c, d dVar, c.EnumC0004c enumC0004c2, int i, int i2) {
        a(enumC0004c).a(dVar.a(enumC0004c2), i, i2, c.b.STRONG, 0, true);
    }

    public c a(c.EnumC0004c enumC0004c) {
        switch (enumC0004c.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.s;
            case 2:
                return this.t;
            case 3:
                return this.u;
            case 4:
                return this.v;
            case 5:
                return this.w;
            case 6:
                return this.z;
            case 7:
                return this.x;
            case 8:
                return this.y;
            default:
                throw new AssertionError(enumC0004c.name());
        }
    }

    public void a(a aVar) {
        this.C[0] = aVar;
        if (aVar == a.WRAP_CONTENT) {
            f(this.T);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:185:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0348 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:255:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(a.d.a.e r39) {
        /*
            Method dump skipped, instructions count: 1220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.d.a.i.d.a(a.d.a.e):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0311 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(a.d.a.e r29, boolean r30, a.d.a.h r31, a.d.a.h r32, a.d.a.i.d.a r33, boolean r34, a.d.a.i.c r35, a.d.a.i.c r36, int r37, int r38, int r39, int r40, float r41, boolean r42, boolean r43, int r44, int r45, int r46, float r47, boolean r48) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.d.a.i.d.a(a.d.a.e, boolean, a.d.a.h, a.d.a.h, a.d.a.i.d$a, boolean, a.d.a.i.c, a.d.a.i.c, int, int, int, int, float, boolean, boolean, int, int, int, float, boolean):void");
    }
}
