package a.d.a.i;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: ConstraintWidgetGroup.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public List<d> f51a;

    /* renamed from: b  reason: collision with root package name */
    public int f52b;
    public int c;
    public boolean d;
    public final int[] e;
    public List<d> f;
    public List<d> g;
    public HashSet<d> h;
    public HashSet<d> i;
    public List<d> j;
    public List<d> k;

    public f(List<d> list) {
        this.f52b = -1;
        this.c = -1;
        this.d = false;
        this.e = new int[]{this.f52b, this.c};
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new HashSet<>();
        this.i = new HashSet<>();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.f51a = list;
    }

    public List<d> a(int i) {
        if (i == 0) {
            return this.f;
        }
        if (i == 1) {
            return this.g;
        }
        return null;
    }

    public Set<d> b(int i) {
        if (i == 0) {
            return this.h;
        }
        if (i == 1) {
            return this.i;
        }
        return null;
    }

    public void a(d dVar, int i) {
        if (i == 0) {
            this.h.add(dVar);
        } else if (i == 1) {
            this.i.add(dVar);
        }
    }

    public final void a(ArrayList<d> arrayList, d dVar) {
        d dVar2;
        if (dVar.d0) {
            return;
        }
        arrayList.add(dVar);
        dVar.d0 = true;
        if (dVar.j()) {
            return;
        }
        if (dVar instanceof h) {
            h hVar = (h) dVar;
            int i = hVar.l0;
            for (int i2 = 0; i2 < i; i2++) {
                a(arrayList, hVar.k0[i2]);
            }
        }
        int length = dVar.A.length;
        for (int i3 = 0; i3 < length; i3++) {
            c cVar = dVar.A[i3].d;
            if (cVar != null && (dVar2 = cVar.f44b) != dVar.D) {
                a(arrayList, dVar2);
            }
        }
    }

    public f(List<d> list, boolean z) {
        this.f52b = -1;
        this.c = -1;
        this.d = false;
        this.e = new int[]{this.f52b, this.c};
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new HashSet<>();
        this.i = new HashSet<>();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.f51a = list;
        this.d = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(a.d.a.i.d r7) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.d.a.i.f.a(a.d.a.i.d):void");
    }
}
