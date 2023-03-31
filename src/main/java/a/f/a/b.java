package a.f.a;

import a.a.o.p0;
import android.database.Cursor;
import android.widget.Filter;

/* compiled from: CursorFilter.java */
/* loaded from: classes.dex */
public class b extends Filter {

    /* renamed from: a  reason: collision with root package name */
    public a f78a;

    /* compiled from: CursorFilter.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public b(a aVar) {
        this.f78a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f78a.b((Cursor) obj);
    }

    @Override // android.widget.Filter
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor a2 = this.f78a.a(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (a2 != null) {
            filterResults.count = a2.getCount();
            filterResults.values = a2;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        p0 p0Var = this.f78a;
        Cursor cursor = ((a.f.a.a) p0Var).d;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        p0Var.a((Cursor) obj);
    }
}
