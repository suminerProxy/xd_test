package a.c;

import a.c.g;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Set;

/* compiled from: ArrayMap.java */
/* loaded from: classes.dex */
public class a<K, V> extends h<K, V> implements Map<K, V> {
    public g<K, V> i;

    /* compiled from: ArrayMap.java */
    /* renamed from: a.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0003a extends g<K, V> {
        public C0003a() {
        }

        @Override // a.c.g
        public Object a(int i, int i2) {
            return a.this.c[(i << 1) + i2];
        }

        @Override // a.c.g
        public int b(Object obj) {
            return a.this.b(obj);
        }

        @Override // a.c.g
        public int c() {
            return a.this.d;
        }

        @Override // a.c.g
        public int a(Object obj) {
            return a.this.a(obj);
        }

        @Override // a.c.g
        public Map<K, V> b() {
            return a.this;
        }

        @Override // a.c.g
        public void a(K k, V v) {
            a.this.put(k, v);
        }

        @Override // a.c.g
        public V a(int i, V v) {
            int i2 = (i << 1) + 1;
            Object[] objArr = a.this.c;
            V v2 = (V) objArr[i2];
            objArr[i2] = v;
            return v2;
        }

        @Override // a.c.g
        public void a(int i) {
            a.this.c(i);
        }

        @Override // a.c.g
        public void a() {
            a.this.clear();
        }
    }

    public a() {
    }

    public final g<K, V> b() {
        if (this.i == null) {
            this.i = new C0003a();
        }
        return this.i;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        g<K, V> b2 = b();
        if (b2.f19a == null) {
            b2.f19a = new g.b();
        }
        return b2.f19a;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        g<K, V> b2 = b();
        if (b2.f20b == null) {
            b2.f20b = new g.c();
        }
        return b2.f20b;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        int size = map.size() + this.d;
        int i = this.d;
        int[] iArr = this.f26b;
        if (iArr.length < size) {
            Object[] objArr = this.c;
            a(size);
            if (this.d > 0) {
                System.arraycopy(iArr, 0, this.f26b, 0, i);
                System.arraycopy(objArr, 0, this.c, 0, i << 1);
            }
            h.a(iArr, objArr, i);
        }
        if (this.d == i) {
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        g<K, V> b2 = b();
        if (b2.c == null) {
            b2.c = new g.e();
        }
        return b2.c;
    }

    public a(int i) {
        super(i);
    }
}
