package a.d.a.i;

import a.d.a.i.c;
import java.util.ArrayList;

/* compiled from: Snapshot.java */
/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    public int f56a;

    /* renamed from: b  reason: collision with root package name */
    public int f57b;
    public int c;
    public int d;
    public ArrayList<a> e = new ArrayList<>();

    /* compiled from: Snapshot.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public c f58a;

        /* renamed from: b  reason: collision with root package name */
        public c f59b;
        public int c;
        public c.b d;
        public int e;

        public a(c cVar) {
            this.f58a = cVar;
            this.f59b = cVar.d;
            this.c = cVar.b();
            this.d = cVar.g;
            this.e = cVar.h;
        }
    }

    public m(d dVar) {
        this.f56a = dVar.I;
        this.f57b = dVar.J;
        this.c = dVar.h();
        this.d = dVar.c();
        ArrayList<c> b2 = dVar.b();
        int size = b2.size();
        for (int i = 0; i < size; i++) {
            this.e.add(new a(b2.get(i)));
        }
    }

    public void a(d dVar) {
        this.f56a = dVar.I;
        this.f57b = dVar.J;
        this.c = dVar.h();
        this.d = dVar.c();
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            a aVar = this.e.get(i);
            aVar.f58a = dVar.a(aVar.f58a.c);
            c cVar = aVar.f58a;
            if (cVar != null) {
                aVar.f59b = cVar.d;
                aVar.c = cVar.b();
                aVar.d = aVar.f58a.c();
                aVar.e = aVar.f58a.a();
            } else {
                aVar.f59b = null;
                aVar.c = 0;
                aVar.d = c.b.STRONG;
                aVar.e = 0;
            }
        }
    }
}
