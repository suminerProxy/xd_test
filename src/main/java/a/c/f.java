package a.c;

import java.util.LinkedHashMap;
import java.util.Locale;

/* compiled from: LruCache.java */
/* loaded from: classes.dex */
public class f<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap<K, V> f17a;

    /* renamed from: b  reason: collision with root package name */
    public int f18b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public f(int i) {
        if (i > 0) {
            this.c = i;
            this.f17a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final V a(K k) {
        if (k != null) {
            synchronized (this) {
                V v = this.f17a.get(k);
                if (v != null) {
                    this.f++;
                    return v;
                }
                this.g++;
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    public final synchronized String toString() {
        int i;
        i = this.f + this.g;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.c), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(i != 0 ? (this.f * 100) / i : 0));
    }

    public final V a(K k, V v) {
        V put;
        if (k != null && v != null) {
            synchronized (this) {
                this.d++;
                this.f18b++;
                put = this.f17a.put(k, v);
                if (put != null) {
                    this.f18b--;
                }
            }
            a(this.c);
            return put;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(int r3) {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            int r0 = r2.f18b     // Catch: java.lang.Throwable -> L69
            if (r0 < 0) goto L4a
            java.util.LinkedHashMap<K, V> r0 = r2.f17a     // Catch: java.lang.Throwable -> L69
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L11
            int r0 = r2.f18b     // Catch: java.lang.Throwable -> L69
            if (r0 != 0) goto L4a
        L11:
            int r0 = r2.f18b     // Catch: java.lang.Throwable -> L69
            if (r0 <= r3) goto L48
            java.util.LinkedHashMap<K, V> r0 = r2.f17a     // Catch: java.lang.Throwable -> L69
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L1e
            goto L48
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r2.f17a     // Catch: java.lang.Throwable -> L69
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L69
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L69
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L69
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L69
            r0.getValue()     // Catch: java.lang.Throwable -> L69
            java.util.LinkedHashMap<K, V> r0 = r2.f17a     // Catch: java.lang.Throwable -> L69
            r0.remove(r1)     // Catch: java.lang.Throwable -> L69
            int r0 = r2.f18b     // Catch: java.lang.Throwable -> L69
            int r0 = r0 + (-1)
            r2.f18b = r0     // Catch: java.lang.Throwable -> L69
            int r0 = r2.e     // Catch: java.lang.Throwable -> L69
            int r0 = r0 + 1
            r2.e = r0     // Catch: java.lang.Throwable -> L69
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L69
            goto L0
        L48:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L69
            return
        L4a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r0.<init>()     // Catch: java.lang.Throwable -> L69
            java.lang.Class r1 = r2.getClass()     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L69
            r0.append(r1)     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L69
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L69
            throw r3     // Catch: java.lang.Throwable -> L69
        L69:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L69
            goto L6d
        L6c:
            throw r3
        L6d:
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: a.c.f.a(int):void");
    }
}
