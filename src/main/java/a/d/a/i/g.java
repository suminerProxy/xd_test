package a.d.a.i;

import a.d.a.i.c;
import a.d.a.i.d;
import java.util.ArrayList;

/* compiled from: Guideline.java */
/* loaded from: classes.dex */
public class g extends d {
    public float k0 = -1.0f;
    public int l0 = -1;
    public int m0 = -1;
    public c n0 = this.t;
    public int o0 = 0;
    public boolean p0 = false;

    public g() {
        this.B.clear();
        this.B.add(this.n0);
        int length = this.A.length;
        for (int i = 0; i < length; i++) {
            this.A[i] = this.n0;
        }
    }

    @Override // a.d.a.i.d
    public c a(c.EnumC0004c enumC0004c) {
        switch (enumC0004c.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.o0 == 1) {
                    return this.n0;
                }
                break;
            case 2:
            case 4:
                if (this.o0 == 0) {
                    return this.n0;
                }
                break;
        }
        throw new AssertionError(enumC0004c.name());
    }

    @Override // a.d.a.i.d
    public boolean a() {
        return true;
    }

    @Override // a.d.a.i.d
    public ArrayList<c> b() {
        return this.B;
    }

    @Override // a.d.a.i.d
    public void c(a.d.a.e eVar) {
        if (this.D == null) {
            return;
        }
        int b2 = eVar.b(this.n0);
        if (this.o0 == 1) {
            this.I = b2;
            this.J = 0;
            e(this.D.c());
            f(0);
            return;
        }
        this.I = 0;
        this.J = b2;
        f(this.D.h());
        e(0);
    }

    public void g(int i) {
        if (this.o0 == i) {
            return;
        }
        this.o0 = i;
        this.B.clear();
        if (this.o0 == 1) {
            this.n0 = this.s;
        } else {
            this.n0 = this.t;
        }
        this.B.add(this.n0);
        int length = this.A.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.A[i2] = this.n0;
        }
    }

    @Override // a.d.a.i.d
    public void a(a.d.a.e eVar) {
        e eVar2 = (e) this.D;
        if (eVar2 == null) {
            return;
        }
        c a2 = eVar2.a(c.EnumC0004c.LEFT);
        c a3 = eVar2.a(c.EnumC0004c.RIGHT);
        d dVar = this.D;
        boolean z = dVar != null && dVar.C[0] == d.a.WRAP_CONTENT;
        if (this.o0 == 0) {
            a2 = eVar2.a(c.EnumC0004c.TOP);
            a3 = eVar2.a(c.EnumC0004c.BOTTOM);
            d dVar2 = this.D;
            z = dVar2 != null && dVar2.C[1] == d.a.WRAP_CONTENT;
        }
        if (this.l0 != -1) {
            a.d.a.h a4 = eVar.a(this.n0);
            eVar.a(a4, eVar.a(a2), this.l0, 6);
            if (z) {
                eVar.b(eVar.a(a3), a4, 0, 5);
            }
        } else if (this.m0 != -1) {
            a.d.a.h a5 = eVar.a(this.n0);
            a.d.a.h a6 = eVar.a(a3);
            eVar.a(a5, a6, -this.m0, 6);
            if (z) {
                eVar.b(a5, eVar.a(a2), 0, 5);
                eVar.b(a6, a5, 0, 5);
            }
        } else if (this.k0 != -1.0f) {
            a.d.a.h a7 = eVar.a(this.n0);
            a.d.a.h a8 = eVar.a(a2);
            a.d.a.h a9 = eVar.a(a3);
            float f = this.k0;
            boolean z2 = this.p0;
            a.d.a.b b2 = eVar.b();
            if (z2) {
                b2.a(eVar, 0);
            }
            b2.d.a(a7, -1.0f);
            b2.d.a(a8, 1.0f - f);
            b2.d.a(a9, f);
            eVar.a(b2);
        }
    }

    @Override // a.d.a.i.d
    public void a(int i) {
        d dVar = this.D;
        if (dVar == null) {
            return;
        }
        if (this.o0 == 1) {
            this.t.f43a.a(1, dVar.t.f43a, 0);
            this.v.f43a.a(1, dVar.t.f43a, 0);
            int i2 = this.l0;
            if (i2 != -1) {
                this.s.f43a.a(1, dVar.s.f43a, i2);
                this.u.f43a.a(1, dVar.s.f43a, this.l0);
                return;
            }
            int i3 = this.m0;
            if (i3 != -1) {
                this.s.f43a.a(1, dVar.u.f43a, -i3);
                this.u.f43a.a(1, dVar.u.f43a, -this.m0);
                return;
            } else if (this.k0 == -1.0f || dVar.d() != d.a.FIXED) {
                return;
            } else {
                int i4 = (int) (dVar.E * this.k0);
                this.s.f43a.a(1, dVar.s.f43a, i4);
                this.u.f43a.a(1, dVar.s.f43a, i4);
                return;
            }
        }
        this.s.f43a.a(1, dVar.s.f43a, 0);
        this.u.f43a.a(1, dVar.s.f43a, 0);
        int i5 = this.l0;
        if (i5 != -1) {
            this.t.f43a.a(1, dVar.t.f43a, i5);
            this.v.f43a.a(1, dVar.t.f43a, this.l0);
            return;
        }
        int i6 = this.m0;
        if (i6 != -1) {
            this.t.f43a.a(1, dVar.v.f43a, -i6);
            this.v.f43a.a(1, dVar.v.f43a, -this.m0);
        } else if (this.k0 == -1.0f || dVar.g() != d.a.FIXED) {
        } else {
            int i7 = (int) (dVar.F * this.k0);
            this.t.f43a.a(1, dVar.t.f43a, i7);
            this.v.f43a.a(1, dVar.t.f43a, i7);
        }
    }
}
