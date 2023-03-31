package a.d.a;

import java.util.Arrays;

/* compiled from: SolverVariable.java */
/* loaded from: classes.dex */
public class h {
    public static int k = 1;

    /* renamed from: a  reason: collision with root package name */
    public String f38a;
    public float e;
    public a g;

    /* renamed from: b  reason: collision with root package name */
    public int f39b = -1;
    public int c = -1;
    public int d = 0;
    public float[] f = new float[7];
    public b[] h = new b[8];
    public int i = 0;
    public int j = 0;

    /* compiled from: SolverVariable.java */
    /* loaded from: classes.dex */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public h(a aVar) {
        this.g = aVar;
    }

    public final void a(b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.i;
            if (i < i2) {
                if (this.h[i] == bVar) {
                    return;
                }
                i++;
            } else {
                b[] bVarArr = this.h;
                if (i2 >= bVarArr.length) {
                    this.h = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.h;
                int i3 = this.i;
                bVarArr2[i3] = bVar;
                this.i = i3 + 1;
                return;
            }
        }
    }

    public final void b(b bVar) {
        int i = this.i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.h[i2] == bVar) {
                for (int i3 = 0; i3 < (i - i2) - 1; i3++) {
                    b[] bVarArr = this.h;
                    int i4 = i2 + i3;
                    bVarArr[i4] = bVarArr[i4 + 1];
                }
                this.i--;
                return;
            }
        }
    }

    public final void c(b bVar) {
        int i = this.i;
        for (int i2 = 0; i2 < i; i2++) {
            b[] bVarArr = this.h;
            a.d.a.a aVar = bVarArr[i2].d;
            b bVar2 = bVarArr[i2];
            int i3 = aVar.i;
            while (true) {
                for (int i4 = 0; i3 != -1 && i4 < aVar.f28a; i4++) {
                    int i5 = aVar.f[i3];
                    h hVar = bVar.f30a;
                    if (i5 == hVar.f39b) {
                        float f = aVar.h[i3];
                        aVar.a(hVar, false);
                        a.d.a.a aVar2 = bVar.d;
                        int i6 = aVar2.i;
                        for (int i7 = 0; i6 != -1 && i7 < aVar2.f28a; i7++) {
                            aVar.a(aVar.c.c[aVar2.f[i6]], aVar2.h[i6] * f, false);
                            i6 = aVar2.g[i6];
                        }
                        bVar2.f31b = (bVar.f31b * f) + bVar2.f31b;
                        i3 = aVar.i;
                    } else {
                        i3 = aVar.g[i3];
                    }
                }
            }
        }
        this.i = 0;
    }

    public String toString() {
        StringBuilder a2 = b.a.a.a.a.a("");
        a2.append(this.f38a);
        return a2.toString();
    }

    public void a() {
        this.f38a = null;
        this.g = a.UNKNOWN;
        this.d = 0;
        this.f39b = -1;
        this.c = -1;
        this.e = 0.0f;
        this.i = 0;
        this.j = 0;
    }
}
