package a.d.a.i;

import a.a.k.w;
import a.d.a.i.c;
import a.d.a.i.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: ConstraintWidgetContainer.java */
/* loaded from: classes.dex */
public class e extends n {
    public m n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public boolean l0 = false;
    public a.d.a.e m0 = new a.d.a.e();
    public int s0 = 0;
    public int t0 = 0;
    public b[] u0 = new b[4];
    public b[] v0 = new b[4];
    public List<f> w0 = new ArrayList();
    public boolean x0 = false;
    public boolean y0 = false;
    public boolean z0 = false;
    public int A0 = 0;
    public int B0 = 0;
    public int C0 = 7;
    public boolean D0 = false;
    public boolean E0 = false;
    public boolean F0 = false;

    @Override // a.d.a.i.d
    public void a(int i) {
        super.a(i);
        int size = this.k0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.k0.get(i2).a(i);
        }
    }

    public boolean d(a.d.a.e eVar) {
        a(eVar);
        int size = this.k0.size();
        for (int i = 0; i < size; i++) {
            d dVar = this.k0.get(i);
            if (dVar instanceof e) {
                d.a[] aVarArr = dVar.C;
                d.a aVar = aVarArr[0];
                d.a aVar2 = aVarArr[1];
                if (aVar == d.a.WRAP_CONTENT) {
                    dVar.a(d.a.FIXED);
                }
                if (aVar2 == d.a.WRAP_CONTENT) {
                    dVar.b(d.a.FIXED);
                }
                dVar.a(eVar);
                if (aVar == d.a.WRAP_CONTENT) {
                    dVar.a(aVar);
                }
                if (aVar2 == d.a.WRAP_CONTENT) {
                    dVar.b(aVar2);
                }
            } else {
                i.a(this, eVar, dVar);
                dVar.a(eVar);
            }
        }
        if (this.s0 > 0) {
            w.a(this, eVar, 0);
        }
        if (this.t0 > 0) {
            w.a(this, eVar, 1);
        }
        return true;
    }

    public boolean g(int i) {
        return (this.C0 & i) == i;
    }

    @Override // a.d.a.i.n, a.d.a.i.d
    public void k() {
        this.m0.f();
        this.o0 = 0;
        this.q0 = 0;
        this.p0 = 0;
        this.r0 = 0;
        this.w0.clear();
        this.D0 = false;
        super.k();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0362  */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v17 */
    @Override // a.d.a.i.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p() {
        /*
            Method dump skipped, instructions count: 1159
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.d.a.i.e.p():void");
    }

    public void q() {
        int size = this.k0.size();
        l();
        for (int i = 0; i < size; i++) {
            this.k0.get(i).l();
        }
    }

    public final void r() {
        this.s0 = 0;
        this.t0 = 0;
    }

    public void s() {
        j jVar = a(c.EnumC0004c.LEFT).f43a;
        j jVar2 = a(c.EnumC0004c.TOP).f43a;
        jVar.a((j) null, 0.0f);
        jVar2.a((j) null, 0.0f);
    }

    public void a(d dVar, int i) {
        if (i == 0) {
            int i2 = this.s0 + 1;
            b[] bVarArr = this.v0;
            if (i2 >= bVarArr.length) {
                this.v0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            this.v0[this.s0] = new b(dVar, 0, this.l0);
            this.s0++;
        } else if (i == 1) {
            int i3 = this.t0 + 1;
            b[] bVarArr2 = this.u0;
            if (i3 >= bVarArr2.length) {
                this.u0 = (b[]) Arrays.copyOf(bVarArr2, bVarArr2.length * 2);
            }
            this.u0[this.t0] = new b(dVar, 1, this.l0);
            this.t0++;
        }
    }
}
