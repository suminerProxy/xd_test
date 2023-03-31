package a.d.a;

import a.d.a.h;
import java.util.Arrays;

/* compiled from: ArrayLinkedVariables.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: b  reason: collision with root package name */
    public final b f29b;
    public final c c;
    public int[] f;
    public int[] g;
    public float[] h;
    public int i;
    public int j;
    public boolean k;

    /* renamed from: a  reason: collision with root package name */
    public int f28a = 0;
    public int d = 8;
    public h e = null;

    public a(b bVar, c cVar) {
        int i = this.d;
        this.f = new int[i];
        this.g = new int[i];
        this.h = new float[i];
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.f29b = bVar;
        this.c = cVar;
    }

    public final void a(h hVar, float f) {
        if (f == 0.0f) {
            a(hVar, true);
            return;
        }
        int i = this.i;
        if (i == -1) {
            this.i = 0;
            float[] fArr = this.h;
            int i2 = this.i;
            fArr[i2] = f;
            this.f[i2] = hVar.f39b;
            this.g[i2] = -1;
            hVar.j++;
            hVar.a(this.f29b);
            this.f28a++;
            if (this.k) {
                return;
            }
            this.j++;
            int i3 = this.j;
            int[] iArr = this.f;
            if (i3 >= iArr.length) {
                this.k = true;
                this.j = iArr.length - 1;
                return;
            }
            return;
        }
        int i4 = -1;
        for (int i5 = 0; i != -1 && i5 < this.f28a; i5++) {
            int[] iArr2 = this.f;
            int i6 = iArr2[i];
            int i7 = hVar.f39b;
            if (i6 == i7) {
                this.h[i] = f;
                return;
            }
            if (iArr2[i] < i7) {
                i4 = i;
            }
            i = this.g[i];
        }
        int i8 = this.j;
        int i9 = i8 + 1;
        if (this.k) {
            int[] iArr3 = this.f;
            if (iArr3[i8] != -1) {
                i8 = iArr3.length;
            }
        } else {
            i8 = i9;
        }
        int[] iArr4 = this.f;
        if (i8 >= iArr4.length && this.f28a < iArr4.length) {
            int i10 = 0;
            while (true) {
                int[] iArr5 = this.f;
                if (i10 >= iArr5.length) {
                    break;
                } else if (iArr5[i10] == -1) {
                    i8 = i10;
                    break;
                } else {
                    i10++;
                }
            }
        }
        int[] iArr6 = this.f;
        if (i8 >= iArr6.length) {
            i8 = iArr6.length;
            this.d *= 2;
            this.k = false;
            this.j = i8 - 1;
            this.h = Arrays.copyOf(this.h, this.d);
            this.f = Arrays.copyOf(this.f, this.d);
            this.g = Arrays.copyOf(this.g, this.d);
        }
        this.f[i8] = hVar.f39b;
        this.h[i8] = f;
        if (i4 != -1) {
            int[] iArr7 = this.g;
            iArr7[i8] = iArr7[i4];
            iArr7[i4] = i8;
        } else {
            this.g[i8] = this.i;
            this.i = i8;
        }
        hVar.j++;
        hVar.a(this.f29b);
        this.f28a++;
        if (!this.k) {
            this.j++;
        }
        if (this.f28a >= this.f.length) {
            this.k = true;
        }
        int i11 = this.j;
        int[] iArr8 = this.f;
        if (i11 >= iArr8.length) {
            this.k = true;
            this.j = iArr8.length - 1;
        }
    }

    public final boolean b(h hVar) {
        return hVar.j <= 1;
    }

    public String toString() {
        int i = this.i;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f28a; i2++) {
            StringBuilder a2 = b.a.a.a.a.a(b.a.a.a.a.a(str, " -> "));
            a2.append(this.h[i]);
            a2.append(" : ");
            StringBuilder a3 = b.a.a.a.a.a(a2.toString());
            a3.append(this.c.c[this.f[i]]);
            str = a3.toString();
            i = this.g[i];
        }
        return str;
    }

    public final float b(int i) {
        int i2 = this.i;
        for (int i3 = 0; i2 != -1 && i3 < this.f28a; i3++) {
            if (i3 == i) {
                return this.h[i2];
            }
            i2 = this.g[i2];
        }
        return 0.0f;
    }

    public final void a(h hVar, float f, boolean z) {
        if (f == 0.0f) {
            return;
        }
        int i = this.i;
        if (i == -1) {
            this.i = 0;
            float[] fArr = this.h;
            int i2 = this.i;
            fArr[i2] = f;
            this.f[i2] = hVar.f39b;
            this.g[i2] = -1;
            hVar.j++;
            hVar.a(this.f29b);
            this.f28a++;
            if (this.k) {
                return;
            }
            this.j++;
            int i3 = this.j;
            int[] iArr = this.f;
            if (i3 >= iArr.length) {
                this.k = true;
                this.j = iArr.length - 1;
                return;
            }
            return;
        }
        int i4 = -1;
        for (int i5 = 0; i != -1 && i5 < this.f28a; i5++) {
            int[] iArr2 = this.f;
            int i6 = iArr2[i];
            int i7 = hVar.f39b;
            if (i6 == i7) {
                float[] fArr2 = this.h;
                fArr2[i] = fArr2[i] + f;
                if (fArr2[i] == 0.0f) {
                    if (i == this.i) {
                        this.i = this.g[i];
                    } else {
                        int[] iArr3 = this.g;
                        iArr3[i4] = iArr3[i];
                    }
                    if (z) {
                        hVar.b(this.f29b);
                    }
                    if (this.k) {
                        this.j = i;
                    }
                    hVar.j--;
                    this.f28a--;
                    return;
                }
                return;
            }
            if (iArr2[i] < i7) {
                i4 = i;
            }
            i = this.g[i];
        }
        int i8 = this.j;
        int i9 = i8 + 1;
        if (this.k) {
            int[] iArr4 = this.f;
            if (iArr4[i8] != -1) {
                i8 = iArr4.length;
            }
        } else {
            i8 = i9;
        }
        int[] iArr5 = this.f;
        if (i8 >= iArr5.length && this.f28a < iArr5.length) {
            int i10 = 0;
            while (true) {
                int[] iArr6 = this.f;
                if (i10 >= iArr6.length) {
                    break;
                } else if (iArr6[i10] == -1) {
                    i8 = i10;
                    break;
                } else {
                    i10++;
                }
            }
        }
        int[] iArr7 = this.f;
        if (i8 >= iArr7.length) {
            i8 = iArr7.length;
            this.d *= 2;
            this.k = false;
            this.j = i8 - 1;
            this.h = Arrays.copyOf(this.h, this.d);
            this.f = Arrays.copyOf(this.f, this.d);
            this.g = Arrays.copyOf(this.g, this.d);
        }
        this.f[i8] = hVar.f39b;
        this.h[i8] = f;
        if (i4 != -1) {
            int[] iArr8 = this.g;
            iArr8[i8] = iArr8[i4];
            iArr8[i4] = i8;
        } else {
            this.g[i8] = this.i;
            this.i = i8;
        }
        hVar.j++;
        hVar.a(this.f29b);
        this.f28a++;
        if (!this.k) {
            this.j++;
        }
        int i11 = this.j;
        int[] iArr9 = this.f;
        if (i11 >= iArr9.length) {
            this.k = true;
            this.j = iArr9.length - 1;
        }
    }

    public final float a(h hVar, boolean z) {
        if (this.e == hVar) {
            this.e = null;
        }
        int i = this.i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f28a) {
            if (this.f[i] == hVar.f39b) {
                if (i == this.i) {
                    this.i = this.g[i];
                } else {
                    int[] iArr = this.g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    hVar.b(this.f29b);
                }
                hVar.j--;
                this.f28a--;
                this.f[i] = -1;
                if (this.k) {
                    this.j = i;
                }
                return this.h[i];
            }
            i2++;
            i3 = i;
            i = this.g[i];
        }
        return 0.0f;
    }

    public final void a() {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.f28a; i2++) {
            h hVar = this.c.c[this.f[i]];
            if (hVar != null) {
                hVar.b(this.f29b);
            }
            i = this.g[i];
        }
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.f28a = 0;
    }

    public h a(boolean[] zArr, h hVar) {
        h.a aVar;
        int i = this.i;
        h hVar2 = null;
        float f = 0.0f;
        for (int i2 = 0; i != -1 && i2 < this.f28a; i2++) {
            if (this.h[i] < 0.0f) {
                h hVar3 = this.c.c[this.f[i]];
                if ((zArr == null || !zArr[hVar3.f39b]) && hVar3 != hVar && ((aVar = hVar3.g) == h.a.SLACK || aVar == h.a.ERROR)) {
                    float f2 = this.h[i];
                    if (f2 < f) {
                        hVar2 = hVar3;
                        f = f2;
                    }
                }
            }
            i = this.g[i];
        }
        return hVar2;
    }

    public final h a(int i) {
        int i2 = this.i;
        for (int i3 = 0; i2 != -1 && i3 < this.f28a; i3++) {
            if (i3 == i) {
                return this.c.c[this.f[i2]];
            }
            i2 = this.g[i2];
        }
        return null;
    }

    public final float a(h hVar) {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.f28a; i2++) {
            if (this.f[i] == hVar.f39b) {
                return this.h[i];
            }
            i = this.g[i];
        }
        return 0.0f;
    }
}
