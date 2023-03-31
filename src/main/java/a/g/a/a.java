package a.g.a;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: AbsSavedState.java */
/* loaded from: classes.dex */
public abstract class a implements Parcelable {

    /* renamed from: b  reason: collision with root package name */
    public final Parcelable f79b;
    public static final a c = new C0007a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* compiled from: AbsSavedState.java */
    /* renamed from: a.g.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0007a extends a {
        public C0007a() {
            super((C0007a) null);
        }
    }

    public /* synthetic */ a(C0007a c0007a) {
        this.f79b = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f79b, i);
    }

    /* compiled from: AbsSavedState.java */
    /* loaded from: classes.dex */
    public static class b implements Parcelable.ClassLoaderCreator<a> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.c;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new a[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.c;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }
    }

    public a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f79b = parcelable == c ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f79b = readParcelable == null ? c : readParcelable;
    }
}
