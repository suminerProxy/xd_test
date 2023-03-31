package a.d.a.i;

/* compiled from: ResolutionDimension.java */
/* loaded from: classes.dex */
public class k extends l {
    public float c = 0.0f;

    public void a(int i) {
        if (this.f55b == 0 || this.c != i) {
            this.c = i;
            if (this.f55b == 1) {
                b();
            }
            a();
        }
    }

    public void e() {
        this.f55b = 0;
        this.f54a.clear();
        this.c = 0.0f;
    }
}
