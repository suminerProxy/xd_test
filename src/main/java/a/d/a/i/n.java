package a.d.a.i;

import java.util.ArrayList;

/* compiled from: WidgetContainer.java */
/* loaded from: classes.dex */
public class n extends d {
    public ArrayList<d> k0 = new ArrayList<>();

    public void a(d dVar) {
        this.k0.remove(dVar);
        dVar.D = null;
    }

    @Override // a.d.a.i.d
    public void b(int i, int i2) {
        this.O = i;
        this.P = i2;
        int size = this.k0.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.k0.get(i3).b(this.I + this.O, this.J + this.P);
        }
    }

    @Override // a.d.a.i.d
    public void k() {
        this.k0.clear();
        super.k();
    }

    @Override // a.d.a.i.d
    public void n() {
        super.n();
        ArrayList<d> arrayList = this.k0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            d dVar = this.k0.get(i);
            dVar.b(this.M + this.O, this.N + this.P);
            if (!(dVar instanceof e)) {
                dVar.n();
            }
        }
    }

    public void p() {
        n();
        ArrayList<d> arrayList = this.k0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            d dVar = this.k0.get(i);
            if (dVar instanceof n) {
                ((n) dVar).p();
            }
        }
    }

    @Override // a.d.a.i.d
    public void a(a.d.a.c cVar) {
        super.a(cVar);
        int size = this.k0.size();
        for (int i = 0; i < size; i++) {
            this.k0.get(i).a(cVar);
        }
    }
}
