package a.d.a;

import a.d.a.e;

/* compiled from: ArrayRow.java */
/* loaded from: classes.dex */
public class b implements e.a {
    public boolean c;
    public final a d;

    /* renamed from: a  reason: collision with root package name */
    public h f30a = null;

    /* renamed from: b  reason: collision with root package name */
    public float f31b = 0.0f;
    public boolean e = false;

    public b(c cVar) {
        this.d = new a(this, cVar);
    }

    public b a(h hVar, h hVar2, h hVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f31b = i;
        }
        if (!z) {
            this.d.a(hVar, -1.0f);
            this.d.a(hVar2, 1.0f);
            this.d.a(hVar3, 1.0f);
        } else {
            this.d.a(hVar, 1.0f);
            this.d.a(hVar2, -1.0f);
            this.d.a(hVar3, -1.0f);
        }
        return this;
    }

    public b b(h hVar, h hVar2, h hVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f31b = i;
        }
        if (!z) {
            this.d.a(hVar, -1.0f);
            this.d.a(hVar2, 1.0f);
            this.d.a(hVar3, -1.0f);
        } else {
            this.d.a(hVar, 1.0f);
            this.d.a(hVar2, -1.0f);
            this.d.a(hVar3, 1.0f);
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r8 = this;
            a.d.a.h r0 = r8.f30a
            java.lang.String r1 = ""
            if (r0 != 0) goto Ld
            java.lang.String r0 = "0"
            java.lang.String r0 = b.a.a.a.a.a(r1, r0)
            goto L1a
        Ld:
            java.lang.StringBuilder r0 = b.a.a.a.a.a(r1)
            a.d.a.h r1 = r8.f30a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L1a:
            java.lang.String r1 = " = "
            java.lang.String r0 = b.a.a.a.a.a(r0, r1)
            float r1 = r8.f31b
            r2 = 0
            r3 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L37
            java.lang.StringBuilder r0 = b.a.a.a.a.a(r0)
            float r1 = r8.f31b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 1
            goto L38
        L37:
            r1 = 0
        L38:
            a.d.a.a r4 = r8.d
            int r4 = r4.f28a
        L3c:
            if (r3 >= r4) goto L9e
            a.d.a.a r5 = r8.d
            a.d.a.h r5 = r5.a(r3)
            if (r5 != 0) goto L47
            goto L9b
        L47:
            a.d.a.a r6 = r8.d
            float r6 = r6.b(r3)
            int r7 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r7 != 0) goto L52
            goto L9b
        L52:
            java.lang.String r5 = r5.toString()
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L65
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 >= 0) goto L78
            java.lang.String r1 = "- "
            java.lang.String r0 = b.a.a.a.a.a(r0, r1)
            goto L76
        L65:
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 <= 0) goto L70
            java.lang.String r1 = " + "
            java.lang.String r0 = b.a.a.a.a.a(r0, r1)
            goto L78
        L70:
            java.lang.String r1 = " - "
            java.lang.String r0 = b.a.a.a.a.a(r0, r1)
        L76:
            float r6 = r6 * r7
        L78:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 != 0) goto L83
            java.lang.String r0 = b.a.a.a.a.a(r0, r5)
            goto L9a
        L83:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
        L9a:
            r1 = 1
        L9b:
            int r3 = r3 + 1
            goto L3c
        L9e:
            if (r1 != 0) goto La6
            java.lang.String r1 = "0.0"
            java.lang.String r0 = b.a.a.a.a.a(r0, r1)
        La6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.d.a.b.toString():java.lang.String");
    }

    public b a(e eVar, int i) {
        this.d.a(eVar.a(i, "ep"), 1.0f);
        this.d.a(eVar.a(i, "em"), -1.0f);
        return this;
    }

    public b b(h hVar, h hVar2, h hVar3, h hVar4, float f) {
        this.d.a(hVar3, 0.5f);
        this.d.a(hVar4, 0.5f);
        this.d.a(hVar, -0.5f);
        this.d.a(hVar2, -0.5f);
        this.f31b = -f;
        return this;
    }

    public b a(h hVar, h hVar2, h hVar3, h hVar4, float f) {
        this.d.a(hVar, -1.0f);
        this.d.a(hVar2, 1.0f);
        this.d.a(hVar3, f);
        this.d.a(hVar4, -f);
        return this;
    }

    public void b(h hVar) {
        h hVar2 = this.f30a;
        if (hVar2 != null) {
            this.d.a(hVar2, -1.0f);
            this.f30a = null;
        }
        float a2 = this.d.a(hVar, true) * (-1.0f);
        this.f30a = hVar;
        if (a2 == 1.0f) {
            return;
        }
        this.f31b /= a2;
        a aVar = this.d;
        int i = aVar.i;
        for (int i2 = 0; i != -1 && i2 < aVar.f28a; i2++) {
            float[] fArr = aVar.h;
            fArr[i] = fArr[i] / a2;
            i = aVar.g[i];
        }
    }

    public void a(e.a aVar) {
        if (!(aVar instanceof b)) {
            return;
        }
        b bVar = (b) aVar;
        this.f30a = null;
        this.d.a();
        int i = 0;
        while (true) {
            a aVar2 = bVar.d;
            if (i >= aVar2.f28a) {
                return;
            }
            this.d.a(aVar2.a(i), bVar.d.b(i), true);
            i++;
        }
    }

    @Override // a.d.a.e.a
    public void a(h hVar) {
        int i = hVar.d;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.d.a(hVar, f);
    }
}
