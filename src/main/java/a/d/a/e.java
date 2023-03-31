package a.d.a;

import a.d.a.h;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: LinearSystem.java */
/* loaded from: classes.dex */
public class e {
    public static int p = 1000;
    public static f q;
    public a c;
    public int e;
    public b[] f;
    public boolean g;
    public boolean[] h;
    public int i;
    public int j;
    public int k;
    public final c l;
    public h[] m;
    public int n;
    public final a o;

    /* renamed from: a  reason: collision with root package name */
    public int f34a = 0;

    /* renamed from: b  reason: collision with root package name */
    public HashMap<String, h> f35b = null;
    public int d = 32;

    /* compiled from: LinearSystem.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(h hVar);
    }

    public e() {
        int i = this.d;
        this.e = i;
        this.f = null;
        this.g = false;
        this.h = new boolean[i];
        this.i = 1;
        this.j = 0;
        this.k = i;
        this.m = new h[p];
        this.n = 0;
        b[] bVarArr = new b[i];
        this.f = new b[i];
        e();
        this.l = new c();
        this.c = new d(this.l);
        this.o = new b(this.l);
    }

    public h a(Object obj) {
        h hVar = null;
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.e) {
            d();
        }
        if (obj instanceof a.d.a.i.c) {
            a.d.a.i.c cVar = (a.d.a.i.c) obj;
            hVar = cVar.i;
            if (hVar == null) {
                cVar.f();
                hVar = cVar.i;
            }
            int i = hVar.f39b;
            if (i == -1 || i > this.f34a || this.l.c[i] == null) {
                if (hVar.f39b != -1) {
                    hVar.a();
                }
                this.f34a++;
                this.i++;
                int i2 = this.f34a;
                hVar.f39b = i2;
                hVar.g = h.a.UNRESTRICTED;
                this.l.c[i2] = hVar;
            }
        }
        return hVar;
    }

    public b b() {
        b a2 = this.l.f32a.a();
        if (a2 == null) {
            a2 = new b(this.l);
        } else {
            a2.f30a = null;
            a2.d.a();
            a2.f31b = 0.0f;
            a2.e = false;
        }
        h.k++;
        return a2;
    }

    public h c() {
        if (this.i + 1 >= this.e) {
            d();
        }
        h a2 = a(h.a.SLACK, (String) null);
        this.f34a++;
        this.i++;
        int i = this.f34a;
        a2.f39b = i;
        this.l.c[i] = a2;
        return a2;
    }

    public final void d() {
        this.d *= 2;
        this.f = (b[]) Arrays.copyOf(this.f, this.d);
        c cVar = this.l;
        cVar.c = (h[]) Arrays.copyOf(cVar.c, this.d);
        int i = this.d;
        this.h = new boolean[i];
        this.e = i;
        this.k = i;
    }

    public final void e() {
        int i = 0;
        while (true) {
            b[] bVarArr = this.f;
            if (i >= bVarArr.length) {
                return;
            }
            b bVar = bVarArr[i];
            if (bVar != null) {
                this.l.f32a.a(bVar);
            }
            this.f[i] = null;
            i++;
        }
    }

    public void f() {
        c cVar;
        int i = 0;
        while (true) {
            cVar = this.l;
            h[] hVarArr = cVar.c;
            if (i >= hVarArr.length) {
                break;
            }
            h hVar = hVarArr[i];
            if (hVar != null) {
                hVar.a();
            }
            i++;
        }
        cVar.f33b.a(this.m, this.n);
        this.n = 0;
        Arrays.fill(this.l.c, (Object) null);
        HashMap<String, h> hashMap = this.f35b;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f34a = 0;
        b bVar = (b) this.c;
        bVar.d.a();
        bVar.f30a = null;
        bVar.f31b = 0.0f;
        this.i = 1;
        for (int i2 = 0; i2 < this.j; i2++) {
            this.f[i2].c = false;
        }
        e();
        this.j = 0;
    }

    public int b(Object obj) {
        h hVar = ((a.d.a.i.c) obj).i;
        if (hVar != null) {
            return (int) (hVar.e + 0.5f);
        }
        return 0;
    }

    public final void c(b bVar) {
        if (this.j > 0) {
            a.d.a.a aVar = bVar.d;
            b[] bVarArr = this.f;
            int i = aVar.i;
            loop0: while (true) {
                for (int i2 = 0; i != -1 && i2 < aVar.f28a; i2++) {
                    h hVar = aVar.c.c[aVar.f[i]];
                    if (hVar.c != -1) {
                        float f = aVar.h[i];
                        aVar.a(hVar, true);
                        b bVar2 = bVarArr[hVar.c];
                        if (!bVar2.e) {
                            a.d.a.a aVar2 = bVar2.d;
                            int i3 = aVar2.i;
                            for (int i4 = 0; i3 != -1 && i4 < aVar2.f28a; i4++) {
                                aVar.a(aVar.c.c[aVar2.f[i3]], aVar2.h[i3] * f, true);
                                i3 = aVar2.g[i3];
                            }
                        }
                        bVar.f31b = (bVar2.f31b * f) + bVar.f31b;
                        bVar2.f30a.b(bVar);
                        i = aVar.i;
                    } else {
                        i = aVar.g[i];
                    }
                }
            }
            if (bVar.d.f28a == 0) {
                bVar.e = true;
            }
        }
    }

    public final void b(b bVar) {
        b[] bVarArr = this.f;
        int i = this.j;
        if (bVarArr[i] != null) {
            this.l.f32a.a(bVarArr[i]);
        }
        b[] bVarArr2 = this.f;
        int i2 = this.j;
        bVarArr2[i2] = bVar;
        h hVar = bVar.f30a;
        hVar.c = i2;
        this.j = i2 + 1;
        hVar.c(bVar);
    }

    public h a(int i, String str) {
        if (this.i + 1 >= this.e) {
            d();
        }
        h a2 = a(h.a.ERROR, str);
        this.f34a++;
        this.i++;
        int i2 = this.f34a;
        a2.f39b = i2;
        a2.d = i;
        this.l.c[i2] = a2;
        this.c.a(a2);
        return a2;
    }

    public final int b(a aVar) {
        boolean z;
        for (int i = 0; i < this.i; i++) {
            this.h[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            i2++;
            if (i2 >= this.i * 2) {
                return i2;
            }
            b bVar = (b) aVar;
            h hVar = bVar.f30a;
            if (hVar != null) {
                this.h[hVar.f39b] = true;
            }
            h a2 = bVar.d.a(this.h, (h) null);
            if (a2 != null) {
                boolean[] zArr = this.h;
                int i3 = a2.f39b;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (a2 != null) {
                int i4 = -1;
                float f = Float.MAX_VALUE;
                for (int i5 = 0; i5 < this.j; i5++) {
                    b bVar2 = this.f[i5];
                    if (bVar2.f30a.g != h.a.UNRESTRICTED && !bVar2.e) {
                        a.d.a.a aVar2 = bVar2.d;
                        int i6 = aVar2.i;
                        if (i6 != -1) {
                            for (int i7 = 0; i6 != -1 && i7 < aVar2.f28a; i7++) {
                                if (aVar2.f[i6] == a2.f39b) {
                                    z = true;
                                    break;
                                }
                                i6 = aVar2.g[i6];
                            }
                        }
                        z = false;
                        if (z) {
                            float a3 = bVar2.d.a(a2);
                            if (a3 < 0.0f) {
                                float f2 = (-bVar2.f31b) / a3;
                                if (f2 < f) {
                                    i4 = i5;
                                    f = f2;
                                }
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    b bVar3 = this.f[i4];
                    bVar3.f30a.c = -1;
                    bVar3.b(a2);
                    h hVar2 = bVar3.f30a;
                    hVar2.c = i4;
                    hVar2.c(bVar3);
                }
            }
            z2 = true;
        }
        return i2;
    }

    public final h a(h.a aVar, String str) {
        h a2 = this.l.f33b.a();
        if (a2 == null) {
            a2 = new h(aVar);
            a2.g = aVar;
        } else {
            a2.a();
            a2.g = aVar;
        }
        int i = this.n;
        int i2 = p;
        if (i >= i2) {
            p = i2 * 2;
            this.m = (h[]) Arrays.copyOf(this.m, p);
        }
        h[] hVarArr = this.m;
        int i3 = this.n;
        this.n = i3 + 1;
        hVarArr[i3] = a2;
        return a2;
    }

    public void c(h hVar, h hVar2, int i, int i2) {
        b b2 = b();
        h c = c();
        c.d = 0;
        b2.b(hVar, hVar2, c, i);
        if (i2 != 6) {
            b2.d.a(a(i2, (String) null), (int) (b2.d.a(c) * (-1.0f)));
        }
        a(b2);
    }

    public void a(a aVar) {
        float f;
        boolean z;
        c((b) aVar);
        int i = 0;
        while (true) {
            f = 0.0f;
            if (i >= this.j) {
                z = false;
                break;
            }
            b[] bVarArr = this.f;
            if (bVarArr[i].f30a.g != h.a.UNRESTRICTED && bVarArr[i].f31b < 0.0f) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            boolean z2 = false;
            int i2 = 0;
            while (!z2) {
                i2++;
                int i3 = 0;
                int i4 = -1;
                int i5 = -1;
                int i6 = 0;
                float f2 = Float.MAX_VALUE;
                while (i3 < this.j) {
                    b bVar = this.f[i3];
                    if (bVar.f30a.g != h.a.UNRESTRICTED && !bVar.e && bVar.f31b < f) {
                        int i7 = i6;
                        int i8 = i5;
                        int i9 = i4;
                        int i10 = 1;
                        while (i10 < this.i) {
                            h hVar = this.l.c[i10];
                            float a2 = bVar.d.a(hVar);
                            if (a2 > f) {
                                int i11 = i7;
                                float f3 = f2;
                                int i12 = i8;
                                int i13 = i9;
                                for (int i14 = 0; i14 < 7; i14++) {
                                    float f4 = hVar.f[i14] / a2;
                                    if ((f4 < f3 && i14 == i11) || i14 > i11) {
                                        f3 = f4;
                                        i13 = i3;
                                        i12 = i10;
                                        i11 = i14;
                                    }
                                }
                                i9 = i13;
                                i8 = i12;
                                f2 = f3;
                                i7 = i11;
                            }
                            i10++;
                            f = 0.0f;
                        }
                        i4 = i9;
                        i5 = i8;
                        i6 = i7;
                    }
                    i3++;
                    f = 0.0f;
                }
                if (i4 != -1) {
                    b bVar2 = this.f[i4];
                    bVar2.f30a.c = -1;
                    bVar2.b(this.l.c[i5]);
                    h hVar2 = bVar2.f30a;
                    hVar2.c = i4;
                    hVar2.c(bVar2);
                } else {
                    z2 = true;
                }
                if (i2 > this.i / 2) {
                    z2 = true;
                }
                f = 0.0f;
            }
        }
        b(aVar);
        a();
    }

    public void b(h hVar, h hVar2, int i, int i2) {
        b b2 = b();
        h c = c();
        c.d = 0;
        b2.a(hVar, hVar2, c, i);
        if (i2 != 6) {
            b2.d.a(a(i2, (String) null), (int) (b2.d.a(c) * (-1.0f)));
        }
        a(b2);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(a.d.a.b r20) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.d.a.e.a(a.d.a.b):void");
    }

    public final void a() {
        for (int i = 0; i < this.j; i++) {
            b bVar = this.f[i];
            bVar.f30a.e = bVar.f31b;
        }
    }

    public void a(h hVar, h hVar2, int i, float f, h hVar3, h hVar4, int i2, int i3) {
        b b2 = b();
        if (hVar2 == hVar3) {
            b2.d.a(hVar, 1.0f);
            b2.d.a(hVar4, 1.0f);
            b2.d.a(hVar2, -2.0f);
        } else if (f == 0.5f) {
            b2.d.a(hVar, 1.0f);
            b2.d.a(hVar2, -1.0f);
            b2.d.a(hVar3, -1.0f);
            b2.d.a(hVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                b2.f31b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            b2.d.a(hVar, -1.0f);
            b2.d.a(hVar2, 1.0f);
            b2.f31b = i;
        } else if (f >= 1.0f) {
            b2.d.a(hVar3, -1.0f);
            b2.d.a(hVar4, 1.0f);
            b2.f31b = i2;
        } else {
            float f2 = 1.0f - f;
            b2.d.a(hVar, f2 * 1.0f);
            b2.d.a(hVar2, f2 * (-1.0f));
            b2.d.a(hVar3, (-1.0f) * f);
            b2.d.a(hVar4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                b2.f31b = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 6) {
            b2.a(this, i3);
        }
        a(b2);
    }

    public void a(h hVar, h hVar2, h hVar3, h hVar4, float f, int i) {
        b b2 = b();
        b2.a(hVar, hVar2, hVar3, hVar4, f);
        if (i != 6) {
            b2.a(this, i);
        }
        a(b2);
    }

    public b a(h hVar, h hVar2, int i, int i2) {
        b b2 = b();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            b2.f31b = i;
        }
        if (!z) {
            b2.d.a(hVar, -1.0f);
            b2.d.a(hVar2, 1.0f);
        } else {
            b2.d.a(hVar, 1.0f);
            b2.d.a(hVar2, -1.0f);
        }
        if (i2 != 6) {
            b2.a(this, i2);
        }
        a(b2);
        return b2;
    }

    public void a(h hVar, int i) {
        int i2 = hVar.c;
        if (i2 != -1) {
            b bVar = this.f[i2];
            if (bVar.e) {
                bVar.f31b = i;
                return;
            } else if (bVar.d.f28a == 0) {
                bVar.e = true;
                bVar.f31b = i;
                return;
            } else {
                b b2 = b();
                if (i < 0) {
                    b2.f31b = i * (-1);
                    b2.d.a(hVar, 1.0f);
                } else {
                    b2.f31b = i;
                    b2.d.a(hVar, -1.0f);
                }
                a(b2);
                return;
            }
        }
        b b3 = b();
        b3.f30a = hVar;
        float f = i;
        hVar.e = f;
        b3.f31b = f;
        b3.e = true;
        a(b3);
    }
}
