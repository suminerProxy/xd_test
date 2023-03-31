package a.d.a.i;

import a.d.a.i.c;

/* compiled from: ResolutionAnchor.java */
/* loaded from: classes.dex */
public class j extends l {
    public c c;
    public j d;
    public float e;
    public j f;
    public float g;
    public j i;
    public int h = 0;
    public k j = null;
    public int k = 1;
    public k l = null;
    public int m = 1;

    public j(c cVar) {
        this.c = cVar;
    }

    public String a(int i) {
        return i == 1 ? "DIRECT" : i == 2 ? "CENTER" : i == 3 ? "MATCH" : i == 4 ? "CHAIN" : i == 5 ? "BARRIER" : "UNCONNECTED";
    }

    public void a(j jVar, float f) {
        if (this.f55b == 0 || !(this.f == jVar || this.g == f)) {
            this.f = jVar;
            this.g = f;
            if (this.f55b == 1) {
                b();
            }
            a();
        }
    }

    @Override // a.d.a.i.l
    public void d() {
        j jVar;
        j jVar2;
        j jVar3;
        j jVar4;
        j jVar5;
        j jVar6;
        float f;
        float f2;
        c cVar;
        float h;
        float f3;
        j jVar7;
        boolean z = true;
        if (this.f55b == 1 || this.h == 4) {
            return;
        }
        k kVar = this.j;
        if (kVar != null) {
            if (kVar.f55b != 1) {
                return;
            }
            this.e = this.k * kVar.c;
        }
        k kVar2 = this.l;
        if (kVar2 != null) {
            if (kVar2.f55b != 1) {
                return;
            }
            float f4 = kVar2.c;
        }
        if (this.h == 1 && ((jVar7 = this.d) == null || jVar7.f55b == 1)) {
            j jVar8 = this.d;
            if (jVar8 == null) {
                this.f = this;
                this.g = this.e;
            } else {
                this.f = jVar8.f;
                this.g = jVar8.g + this.e;
            }
            a();
        } else if (this.h == 2 && (jVar4 = this.d) != null && jVar4.f55b == 1 && (jVar5 = this.i) != null && (jVar6 = jVar5.d) != null && jVar6.f55b == 1) {
            this.f = jVar4.f;
            jVar5.f = jVar6.f;
            c.EnumC0004c enumC0004c = this.c.c;
            int i = 0;
            if (enumC0004c != c.EnumC0004c.RIGHT && enumC0004c != c.EnumC0004c.BOTTOM) {
                z = false;
            }
            if (z) {
                f = this.d.g;
                f2 = this.i.d.g;
            } else {
                f = this.i.d.g;
                f2 = this.d.g;
            }
            float f5 = f - f2;
            c.EnumC0004c enumC0004c2 = this.c.c;
            if (enumC0004c2 != c.EnumC0004c.LEFT && enumC0004c2 != c.EnumC0004c.RIGHT) {
                h = f5 - cVar.f44b.c();
                f3 = this.c.f44b.W;
            } else {
                h = f5 - this.c.f44b.h();
                f3 = this.c.f44b.V;
            }
            int b2 = this.c.b();
            int b3 = this.i.c.b();
            if (this.c.d == this.i.c.d) {
                f3 = 0.5f;
                b3 = 0;
            } else {
                i = b2;
            }
            float f6 = i;
            float f7 = b3;
            float f8 = (h - f6) - f7;
            if (z) {
                j jVar9 = this.i;
                jVar9.g = (f8 * f3) + jVar9.d.g + f7;
                this.g = (this.d.g - f6) - ((1.0f - f3) * f8);
            } else {
                this.g = (f8 * f3) + this.d.g + f6;
                j jVar10 = this.i;
                jVar10.g = (jVar10.d.g - f7) - ((1.0f - f3) * f8);
            }
            a();
            this.i.a();
        } else if (this.h == 3 && (jVar = this.d) != null && jVar.f55b == 1 && (jVar2 = this.i) != null && (jVar3 = jVar2.d) != null && jVar3.f55b == 1) {
            this.f = jVar.f;
            jVar2.f = jVar3.f;
            this.g = jVar.g + this.e;
            jVar2.g = jVar3.g + jVar2.e;
            a();
            this.i.a();
        } else if (this.h == 5) {
            this.c.f44b.m();
        }
    }

    public void e() {
        this.f55b = 0;
        this.f54a.clear();
        this.d = null;
        this.e = 0.0f;
        this.j = null;
        this.k = 1;
        this.l = null;
        this.m = 1;
        this.f = null;
        this.g = 0.0f;
        this.i = null;
        this.h = 0;
    }

    public String toString() {
        if (this.f55b == 1) {
            if (this.f == this) {
                StringBuilder a2 = b.a.a.a.a.a("[");
                a2.append(this.c);
                a2.append(", RESOLVED: ");
                a2.append(this.g);
                a2.append("]  type: ");
                a2.append(a(this.h));
                return a2.toString();
            }
            StringBuilder a3 = b.a.a.a.a.a("[");
            a3.append(this.c);
            a3.append(", RESOLVED: ");
            a3.append(this.f);
            a3.append(":");
            a3.append(this.g);
            a3.append("] type: ");
            a3.append(a(this.h));
            return a3.toString();
        }
        StringBuilder a4 = b.a.a.a.a.a("{ ");
        a4.append(this.c);
        a4.append(" UNRESOLVED} type: ");
        a4.append(a(this.h));
        return a4.toString();
    }

    public void a(int i, j jVar, int i2) {
        this.h = i;
        this.d = jVar;
        this.e = i2;
        this.d.f54a.add(this);
    }

    public void a(j jVar, int i) {
        this.d = jVar;
        this.e = i;
        this.d.f54a.add(this);
    }

    public void a(j jVar, int i, k kVar) {
        this.d = jVar;
        this.d.f54a.add(this);
        this.j = kVar;
        this.k = i;
        this.j.f54a.add(this);
    }

    public void a(a.d.a.e eVar) {
        a.d.a.h hVar = this.c.i;
        j jVar = this.f;
        if (jVar == null) {
            eVar.a(hVar, (int) (this.g + 0.5f));
        } else {
            eVar.a(hVar, eVar.a(jVar.c), (int) (this.g + 0.5f), 6);
        }
    }
}
