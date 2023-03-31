package a.b.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: SafeIterableMap.java */
/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: b  reason: collision with root package name */
    public c<K, V> f9b;
    public c<K, V> c;
    public WeakHashMap<f<K, V>, Boolean> d = new WeakHashMap<>();
    public int e = 0;

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // a.b.a.b.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.e;
        }

        @Override // a.b.a.b.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.d;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: a.b.a.b.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0002b<K, V> extends e<K, V> {
        public C0002b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // a.b.a.b.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.d;
        }

        @Override // a.b.a.b.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.e;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: b  reason: collision with root package name */
        public final K f10b;
        public final V c;
        public c<K, V> d;
        public c<K, V> e;

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.f10b.equals(cVar.f10b) && this.c.equals(cVar.c);
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f10b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f10b.hashCode() ^ this.c.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f10b + "=" + this.c;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b  reason: collision with root package name */
        public c<K, V> f11b;
        public boolean c = true;

        public d() {
        }

        @Override // a.b.a.b.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f11b;
            if (cVar == cVar2) {
                this.f11b = cVar2.e;
                this.c = this.f11b == null;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.c) {
                return b.this.f9b != null;
            }
            c<K, V> cVar = this.f11b;
            return (cVar == null || cVar.d == null) ? false : true;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.c) {
                this.c = false;
                this.f11b = b.this.f9b;
            } else {
                c<K, V> cVar = this.f11b;
                this.f11b = cVar != null ? cVar.d : null;
            }
            return this.f11b;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public c<K, V> a(K k) {
        c<K, V> cVar = this.f9b;
        while (cVar != null && !cVar.f10b.equals(k)) {
            cVar = cVar.d;
        }
        return cVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.e != bVar.e) {
                return false;
            }
            Iterator<Map.Entry<K, V>> it = iterator();
            Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
            while (it.hasNext() && it2.hasNext()) {
                Map.Entry<K, V> next = it.next();
                Map.Entry<K, V> next2 = it2.next();
                if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                    return false;
                }
            }
            return (it.hasNext() || it2.hasNext()) ? false : true;
        }
        return false;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f9b, this.c);
        this.d.put(aVar, false);
        return aVar;
    }

    public V remove(K k) {
        c<K, V> a2 = a(k);
        if (a2 == null) {
            return null;
        }
        this.e--;
        if (!this.d.isEmpty()) {
            for (f<K, V> fVar : this.d.keySet()) {
                fVar.a(a2);
            }
        }
        c<K, V> cVar = a2.e;
        if (cVar != null) {
            cVar.d = a2.d;
        } else {
            this.f9b = a2.d;
        }
        c<K, V> cVar2 = a2.d;
        if (cVar2 != null) {
            cVar2.e = a2.e;
        } else {
            this.c = a2.e;
        }
        a2.d = null;
        a2.e = null;
        return a2.c;
    }

    public String toString() {
        StringBuilder a2 = b.a.a.a.a.a("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            a2.append(it.next().toString());
            if (it.hasNext()) {
                a2.append(", ");
            }
        }
        a2.append("]");
        return a2.toString();
    }

    public b<K, V>.d a() {
        b<K, V>.d dVar = new d();
        this.d.put(dVar, false);
        return dVar;
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b  reason: collision with root package name */
        public c<K, V> f12b;
        public c<K, V> c;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f12b = cVar2;
            this.c = cVar;
        }

        @Override // a.b.a.b.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = null;
            if (this.f12b == cVar && cVar == this.c) {
                this.c = null;
                this.f12b = null;
            }
            c<K, V> cVar3 = this.f12b;
            if (cVar3 == cVar) {
                this.f12b = b(cVar3);
            }
            c<K, V> cVar4 = this.c;
            if (cVar4 == cVar) {
                c<K, V> cVar5 = this.f12b;
                if (cVar4 != cVar5 && cVar5 != null) {
                    cVar2 = c(cVar4);
                }
                this.c = cVar2;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.c != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            c<K, V> cVar = this.c;
            this.c = a();
            return cVar;
        }

        public final c<K, V> a() {
            c<K, V> cVar = this.c;
            c<K, V> cVar2 = this.f12b;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }
    }
}
