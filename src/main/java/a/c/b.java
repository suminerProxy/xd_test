package a.c;

import java.util.Map;

/* compiled from: ArraySet.java */
/* loaded from: classes.dex */
public class b extends g<E, E> {
    public final /* synthetic */ c d;

    public b(c cVar) {
        this.d = cVar;
    }

    @Override // a.c.g
    public Object a(int i, int i2) {
        return this.d.c[i];
    }

    @Override // a.c.g
    public int b(Object obj) {
        return this.d.a(obj);
    }

    @Override // a.c.g
    public int c() {
        return this.d.d;
    }

    @Override // a.c.g
    public int a(Object obj) {
        return this.d.a(obj);
    }

    @Override // a.c.g
    public Map<E, E> b() {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // a.c.g
    public void a(E e, E e2) {
        this.d.add(e);
    }

    @Override // a.c.g
    public E a(int i, E e) {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // a.c.g
    public void a(int i) {
        this.d.b(i);
    }

    @Override // a.c.g
    public void a() {
        this.d.clear();
    }
}
