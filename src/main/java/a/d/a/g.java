package a.d.a;

/* compiled from: Pools.java */
/* loaded from: classes.dex */
public class g<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f36a;

    /* renamed from: b  reason: collision with root package name */
    public int f37b;

    public g(int i) {
        if (i > 0) {
            this.f36a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public T a() {
        int i = this.f37b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = this.f36a;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.f37b = i - 1;
            return t;
        }
        return null;
    }

    public boolean a(T t) {
        int i = this.f37b;
        Object[] objArr = this.f36a;
        if (i < objArr.length) {
            objArr[i] = t;
            this.f37b = i + 1;
            return true;
        }
        return false;
    }

    public void a(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.f37b;
            Object[] objArr = this.f36a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.f37b = i3 + 1;
            }
        }
    }
}
