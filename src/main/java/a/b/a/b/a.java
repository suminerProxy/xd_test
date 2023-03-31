package a.b.a.b;

import a.b.a.b.b;
import java.util.HashMap;

/* compiled from: FastSafeIterableMap.java */
/* loaded from: classes.dex */
public class a<K, V> extends b<K, V> {
    public HashMap<K, b.c<K, V>> f = new HashMap<>();

    @Override // a.b.a.b.b
    public b.c<K, V> a(K k) {
        return this.f.get(k);
    }

    public boolean contains(K k) {
        return this.f.containsKey(k);
    }

    @Override // a.b.a.b.b
    public V remove(K k) {
        V v = (V) super.remove(k);
        this.f.remove(k);
        return v;
    }
}
