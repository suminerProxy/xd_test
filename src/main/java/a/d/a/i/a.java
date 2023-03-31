package a.d.a.i;

import a.d.a.i.d;
import java.util.ArrayList;

/* compiled from: Barrier.java */
/* loaded from: classes.dex */
public class a extends h {
    public int m0 = 0;
    public ArrayList<j> n0 = new ArrayList<>(4);
    public boolean o0 = true;

    @Override // a.d.a.i.d
    public void a(int i) {
        j jVar;
        j jVar2;
        d dVar = this.D;
        if (dVar != null && ((e) dVar).g(2)) {
            int i2 = this.m0;
            if (i2 == 0) {
                jVar = this.s.f43a;
            } else if (i2 == 1) {
                jVar = this.u.f43a;
            } else if (i2 == 2) {
                jVar = this.t.f43a;
            } else if (i2 != 3) {
                return;
            } else {
                jVar = this.v.f43a;
            }
            jVar.h = 5;
            int i3 = this.m0;
            if (i3 != 0 && i3 != 1) {
                this.s.f43a.a((j) null, 0.0f);
                this.u.f43a.a((j) null, 0.0f);
            } else {
                this.t.f43a.a((j) null, 0.0f);
                this.v.f43a.a((j) null, 0.0f);
            }
            this.n0.clear();
            for (int i4 = 0; i4 < this.l0; i4++) {
                d dVar2 = this.k0[i4];
                if (this.o0 || dVar2.a()) {
                    int i5 = this.m0;
                    if (i5 == 0) {
                        jVar2 = dVar2.s.f43a;
                    } else if (i5 == 1) {
                        jVar2 = dVar2.u.f43a;
                    } else if (i5 != 2) {
                        jVar2 = i5 != 3 ? null : dVar2.v.f43a;
                    } else {
                        jVar2 = dVar2.t.f43a;
                    }
                    if (jVar2 != null) {
                        this.n0.add(jVar2);
                        jVar2.f54a.add(jVar);
                    }
                }
            }
        }
    }

    @Override // a.d.a.i.d
    public boolean a() {
        return true;
    }

    @Override // a.d.a.i.d
    public void l() {
        super.l();
        this.n0.clear();
    }

    @Override // a.d.a.i.d
    public void m() {
        j jVar;
        float f;
        j jVar2;
        int i = this.m0;
        float f2 = Float.MAX_VALUE;
        if (i != 0) {
            if (i == 1) {
                jVar = this.u.f43a;
            } else if (i == 2) {
                jVar = this.t.f43a;
            } else if (i != 3) {
                return;
            } else {
                jVar = this.v.f43a;
            }
            f2 = 0.0f;
        } else {
            jVar = this.s.f43a;
        }
        int size = this.n0.size();
        j jVar3 = null;
        for (int i2 = 0; i2 < size; i2++) {
            j jVar4 = this.n0.get(i2);
            if (jVar4.f55b != 1) {
                return;
            }
            int i3 = this.m0;
            if (i3 != 0 && i3 != 2) {
                f = jVar4.g;
                if (f > f2) {
                    jVar2 = jVar4.f;
                    jVar3 = jVar2;
                    f2 = f;
                }
            } else {
                f = jVar4.g;
                if (f < f2) {
                    jVar2 = jVar4.f;
                    jVar3 = jVar2;
                    f2 = f;
                }
            }
        }
        jVar.f = jVar3;
        jVar.g = f2;
        jVar.a();
        int i4 = this.m0;
        if (i4 == 0) {
            this.u.f43a.a(jVar3, f2);
        } else if (i4 == 1) {
            this.s.f43a.a(jVar3, f2);
        } else if (i4 == 2) {
            this.v.f43a.a(jVar3, f2);
        } else if (i4 == 3) {
            this.t.f43a.a(jVar3, f2);
        }
    }

    @Override // a.d.a.i.d
    public void a(a.d.a.e eVar) {
        Object[] objArr;
        boolean z;
        int i;
        int i2;
        c[] cVarArr = this.A;
        cVarArr[0] = this.s;
        cVarArr[2] = this.t;
        cVarArr[1] = this.u;
        cVarArr[3] = this.v;
        int i3 = 0;
        while (true) {
            objArr = this.A;
            if (i3 >= objArr.length) {
                break;
            }
            objArr[i3].i = eVar.a(objArr[i3]);
            i3++;
        }
        int i4 = this.m0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        c cVar = objArr[i4];
        for (int i5 = 0; i5 < this.l0; i5++) {
            d dVar = this.k0[i5];
            if ((this.o0 || dVar.a()) && ((((i = this.m0) == 0 || i == 1) && dVar.d() == d.a.MATCH_CONSTRAINT) || (((i2 = this.m0) == 2 || i2 == 3) && dVar.g() == d.a.MATCH_CONSTRAINT))) {
                z = true;
                break;
            }
        }
        z = false;
        int i6 = this.m0;
        if (i6 == 0 || i6 == 1 ? this.D.d() == d.a.WRAP_CONTENT : this.D.g() == d.a.WRAP_CONTENT) {
            z = false;
        }
        for (int i7 = 0; i7 < this.l0; i7++) {
            d dVar2 = this.k0[i7];
            if (this.o0 || dVar2.a()) {
                a.d.a.h a2 = eVar.a(dVar2.A[this.m0]);
                c[] cVarArr2 = dVar2.A;
                int i8 = this.m0;
                cVarArr2[i8].i = a2;
                if (i8 != 0 && i8 != 2) {
                    a.d.a.h hVar = cVar.i;
                    a.d.a.b b2 = eVar.b();
                    a.d.a.h c = eVar.c();
                    c.d = 0;
                    b2.a(hVar, a2, c, 0);
                    if (z) {
                        b2.d.a(eVar.a(1, (String) null), (int) (b2.d.a(c) * (-1.0f)));
                    }
                    eVar.a(b2);
                } else {
                    a.d.a.h hVar2 = cVar.i;
                    a.d.a.b b3 = eVar.b();
                    a.d.a.h c2 = eVar.c();
                    c2.d = 0;
                    b3.b(hVar2, a2, c2, 0);
                    if (z) {
                        b3.d.a(eVar.a(1, (String) null), (int) (b3.d.a(c2) * (-1.0f)));
                    }
                    eVar.a(b3);
                }
            }
        }
        int i9 = this.m0;
        if (i9 == 0) {
            eVar.a(this.u.i, this.s.i, 0, 6);
            if (z) {
                return;
            }
            eVar.a(this.s.i, this.D.u.i, 0, 5);
        } else if (i9 == 1) {
            eVar.a(this.s.i, this.u.i, 0, 6);
            if (z) {
                return;
            }
            eVar.a(this.s.i, this.D.s.i, 0, 5);
        } else if (i9 == 2) {
            eVar.a(this.v.i, this.t.i, 0, 6);
            if (z) {
                return;
            }
            eVar.a(this.t.i, this.D.v.i, 0, 5);
        } else if (i9 == 3) {
            eVar.a(this.t.i, this.v.i, 0, 6);
            if (z) {
                return;
            }
            eVar.a(this.t.i, this.D.t.i, 0, 5);
        }
    }
}
