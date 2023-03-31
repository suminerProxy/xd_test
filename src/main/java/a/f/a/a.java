package a.f.a;

import a.f.a.b;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* compiled from: CursorAdapter.java */
/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements b.a, Filterable {

    /* renamed from: b  reason: collision with root package name */
    public boolean f75b;
    public boolean c;
    public Cursor d;
    public Context e;
    public int f;
    public C0006a g;
    public DataSetObserver h;
    public a.f.a.b i;

    /* compiled from: CursorAdapter.java */
    /* renamed from: a.f.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0006a extends ContentObserver {
        public C0006a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            Cursor cursor;
            a aVar = a.this;
            if (!aVar.c || (cursor = aVar.d) == null || cursor.isClosed()) {
                return;
            }
            aVar.f75b = aVar.d.requery();
        }
    }

    /* compiled from: CursorAdapter.java */
    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f75b = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f75b = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z) {
        int i = z ? 1 : 2;
        if ((i & 1) == 1) {
            i |= 2;
            this.c = true;
        } else {
            this.c = false;
        }
        boolean z2 = cursor != null;
        this.d = cursor;
        this.f75b = z2;
        this.e = context;
        this.f = z2 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.g = new C0006a();
            this.h = new b();
        } else {
            this.g = null;
            this.h = null;
        }
        if (z2) {
            C0006a c0006a = this.g;
            if (c0006a != null) {
                cursor.registerContentObserver(c0006a);
            }
            DataSetObserver dataSetObserver = this.h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View a(Context context, Cursor cursor, ViewGroup viewGroup);

    public void a(Cursor cursor) {
        Cursor cursor2 = this.d;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0006a c0006a = this.g;
                if (c0006a != null) {
                    cursor2.unregisterContentObserver(c0006a);
                }
                DataSetObserver dataSetObserver = this.h;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.d = cursor;
            if (cursor != null) {
                C0006a c0006a2 = this.g;
                if (c0006a2 != null) {
                    cursor.registerContentObserver(c0006a2);
                }
                DataSetObserver dataSetObserver2 = this.h;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.f = cursor.getColumnIndexOrThrow("_id");
                this.f75b = true;
                notifyDataSetChanged();
            } else {
                this.f = -1;
                this.f75b = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract void a(View view, Context context, Cursor cursor);

    public abstract CharSequence b(Cursor cursor);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f75b || (cursor = this.d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.f75b) {
            this.d.moveToPosition(i);
            if (view == null) {
                c cVar = (c) this;
                view = cVar.l.inflate(cVar.k, viewGroup, false);
            }
            a(view, this.e, this.d);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.i == null) {
            this.i = new a.f.a.b(this);
        }
        return this.i;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f75b || (cursor = this.d) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.d;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (this.f75b && (cursor = this.d) != null && cursor.moveToPosition(i)) {
            return this.d.getLong(this.f);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.f75b) {
            if (this.d.moveToPosition(i)) {
                if (view == null) {
                    view = a(this.e, this.d, viewGroup);
                }
                a(view, this.e, this.d);
                return view;
            }
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
