package a.d.a.i;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: ResolutionNode.java */
/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    public HashSet<l> f54a = new HashSet<>(2);

    /* renamed from: b  reason: collision with root package name */
    public int f55b = 0;

    public void a() {
        this.f55b = 1;
        Iterator<l> it = this.f54a.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    public void b() {
        this.f55b = 0;
        Iterator<l> it = this.f54a.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public boolean c() {
        return this.f55b == 1;
    }

    public void d() {
    }
}
