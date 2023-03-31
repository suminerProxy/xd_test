package a.d.b;

import a.d.b.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintSet.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f61b = {0, 4, 8};
    public static SparseIntArray c = new SparseIntArray();

    /* renamed from: a  reason: collision with root package name */
    public HashMap<Integer, a> f62a = new HashMap<>();

    static {
        c.append(h.ConstraintSet_layout_constraintLeft_toLeftOf, 25);
        c.append(h.ConstraintSet_layout_constraintLeft_toRightOf, 26);
        c.append(h.ConstraintSet_layout_constraintRight_toLeftOf, 29);
        c.append(h.ConstraintSet_layout_constraintRight_toRightOf, 30);
        c.append(h.ConstraintSet_layout_constraintTop_toTopOf, 36);
        c.append(h.ConstraintSet_layout_constraintTop_toBottomOf, 35);
        c.append(h.ConstraintSet_layout_constraintBottom_toTopOf, 4);
        c.append(h.ConstraintSet_layout_constraintBottom_toBottomOf, 3);
        c.append(h.ConstraintSet_layout_constraintBaseline_toBaselineOf, 1);
        c.append(h.ConstraintSet_layout_editor_absoluteX, 6);
        c.append(h.ConstraintSet_layout_editor_absoluteY, 7);
        c.append(h.ConstraintSet_layout_constraintGuide_begin, 17);
        c.append(h.ConstraintSet_layout_constraintGuide_end, 18);
        c.append(h.ConstraintSet_layout_constraintGuide_percent, 19);
        c.append(h.ConstraintSet_android_orientation, 27);
        c.append(h.ConstraintSet_layout_constraintStart_toEndOf, 32);
        c.append(h.ConstraintSet_layout_constraintStart_toStartOf, 33);
        c.append(h.ConstraintSet_layout_constraintEnd_toStartOf, 10);
        c.append(h.ConstraintSet_layout_constraintEnd_toEndOf, 9);
        c.append(h.ConstraintSet_layout_goneMarginLeft, 13);
        c.append(h.ConstraintSet_layout_goneMarginTop, 16);
        c.append(h.ConstraintSet_layout_goneMarginRight, 14);
        c.append(h.ConstraintSet_layout_goneMarginBottom, 11);
        c.append(h.ConstraintSet_layout_goneMarginStart, 15);
        c.append(h.ConstraintSet_layout_goneMarginEnd, 12);
        c.append(h.ConstraintSet_layout_constraintVertical_weight, 40);
        c.append(h.ConstraintSet_layout_constraintHorizontal_weight, 39);
        c.append(h.ConstraintSet_layout_constraintHorizontal_chainStyle, 41);
        c.append(h.ConstraintSet_layout_constraintVertical_chainStyle, 42);
        c.append(h.ConstraintSet_layout_constraintHorizontal_bias, 20);
        c.append(h.ConstraintSet_layout_constraintVertical_bias, 37);
        c.append(h.ConstraintSet_layout_constraintDimensionRatio, 5);
        c.append(h.ConstraintSet_layout_constraintLeft_creator, 75);
        c.append(h.ConstraintSet_layout_constraintTop_creator, 75);
        c.append(h.ConstraintSet_layout_constraintRight_creator, 75);
        c.append(h.ConstraintSet_layout_constraintBottom_creator, 75);
        c.append(h.ConstraintSet_layout_constraintBaseline_creator, 75);
        c.append(h.ConstraintSet_android_layout_marginLeft, 24);
        c.append(h.ConstraintSet_android_layout_marginRight, 28);
        c.append(h.ConstraintSet_android_layout_marginStart, 31);
        c.append(h.ConstraintSet_android_layout_marginEnd, 8);
        c.append(h.ConstraintSet_android_layout_marginTop, 34);
        c.append(h.ConstraintSet_android_layout_marginBottom, 2);
        c.append(h.ConstraintSet_android_layout_width, 23);
        c.append(h.ConstraintSet_android_layout_height, 21);
        c.append(h.ConstraintSet_android_visibility, 22);
        c.append(h.ConstraintSet_android_alpha, 43);
        c.append(h.ConstraintSet_android_elevation, 44);
        c.append(h.ConstraintSet_android_rotationX, 45);
        c.append(h.ConstraintSet_android_rotationY, 46);
        c.append(h.ConstraintSet_android_rotation, 60);
        c.append(h.ConstraintSet_android_scaleX, 47);
        c.append(h.ConstraintSet_android_scaleY, 48);
        c.append(h.ConstraintSet_android_transformPivotX, 49);
        c.append(h.ConstraintSet_android_transformPivotY, 50);
        c.append(h.ConstraintSet_android_translationX, 51);
        c.append(h.ConstraintSet_android_translationY, 52);
        c.append(h.ConstraintSet_android_translationZ, 53);
        c.append(h.ConstraintSet_layout_constraintWidth_default, 54);
        c.append(h.ConstraintSet_layout_constraintHeight_default, 55);
        c.append(h.ConstraintSet_layout_constraintWidth_max, 56);
        c.append(h.ConstraintSet_layout_constraintHeight_max, 57);
        c.append(h.ConstraintSet_layout_constraintWidth_min, 58);
        c.append(h.ConstraintSet_layout_constraintHeight_min, 59);
        c.append(h.ConstraintSet_layout_constraintCircle, 61);
        c.append(h.ConstraintSet_layout_constraintCircleRadius, 62);
        c.append(h.ConstraintSet_layout_constraintCircleAngle, 63);
        c.append(h.ConstraintSet_android_id, 38);
        c.append(h.ConstraintSet_layout_constraintWidth_percent, 69);
        c.append(h.ConstraintSet_layout_constraintHeight_percent, 70);
        c.append(h.ConstraintSet_chainUseRtl, 71);
        c.append(h.ConstraintSet_barrierDirection, 72);
        c.append(h.ConstraintSet_constraint_referenced_ids, 73);
        c.append(h.ConstraintSet_barrierAllowsGoneWidgets, 74);
    }

    public void a(d dVar) {
        int childCount = dVar.getChildCount();
        this.f62a.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = dVar.getChildAt(i);
            d.a aVar = (d.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                if (!this.f62a.containsKey(Integer.valueOf(id))) {
                    this.f62a.put(Integer.valueOf(id), new a());
                }
                a aVar2 = this.f62a.get(Integer.valueOf(id));
                if (childAt instanceof b) {
                    b bVar = (b) childAt;
                    aVar2.a(id, aVar);
                    if (bVar instanceof a.d.b.a) {
                        aVar2.t0 = 1;
                        a.d.b.a aVar3 = (a.d.b.a) bVar;
                        aVar2.s0 = aVar3.getType();
                        aVar2.u0 = aVar3.getReferencedIds();
                    }
                }
                aVar2.a(id, aVar);
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f62a.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (id != -1) {
                if (this.f62a.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    a aVar = this.f62a.get(Integer.valueOf(id));
                    if (childAt instanceof a.d.b.a) {
                        aVar.t0 = 1;
                    }
                    int i2 = aVar.t0;
                    if (i2 != -1 && i2 == 1) {
                        a.d.b.a aVar2 = (a.d.b.a) childAt;
                        aVar2.setId(id);
                        aVar2.setType(aVar.s0);
                        aVar2.setAllowsGoneWidget(aVar.r0);
                        int[] iArr = aVar.u0;
                        if (iArr != null) {
                            aVar2.setReferencedIds(iArr);
                        } else {
                            String str = aVar.v0;
                            if (str != null) {
                                aVar.u0 = a(aVar2, str);
                                aVar2.setReferencedIds(aVar.u0);
                            }
                        }
                    }
                    ViewGroup.LayoutParams layoutParams = (ConstraintLayout.a) childAt.getLayoutParams();
                    aVar.a(layoutParams);
                    childAt.setLayoutParams(layoutParams);
                    childAt.setVisibility(aVar.J);
                    if (Build.VERSION.SDK_INT >= 17) {
                        childAt.setAlpha(aVar.U);
                        childAt.setRotation(aVar.X);
                        childAt.setRotationX(aVar.Y);
                        childAt.setRotationY(aVar.Z);
                        childAt.setScaleX(aVar.a0);
                        childAt.setScaleY(aVar.b0);
                        if (!Float.isNaN(aVar.c0)) {
                            childAt.setPivotX(aVar.c0);
                        }
                        if (!Float.isNaN(aVar.d0)) {
                            childAt.setPivotY(aVar.d0);
                        }
                        childAt.setTranslationX(aVar.e0);
                        childAt.setTranslationY(aVar.f0);
                        if (Build.VERSION.SDK_INT >= 21) {
                            childAt.setTranslationZ(aVar.g0);
                            if (aVar.V) {
                                childAt.setElevation(aVar.W);
                            }
                        }
                    }
                }
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar3 = this.f62a.get(num);
            int i3 = aVar3.t0;
            if (i3 != -1 && i3 == 1) {
                a.d.b.a aVar4 = new a.d.b.a(constraintLayout.getContext());
                aVar4.setId(num.intValue());
                int[] iArr2 = aVar3.u0;
                if (iArr2 != null) {
                    aVar4.setReferencedIds(iArr2);
                } else {
                    String str2 = aVar3.v0;
                    if (str2 != null) {
                        aVar3.u0 = a(aVar4, str2);
                        aVar4.setReferencedIds(aVar3.u0);
                    }
                }
                aVar4.setType(aVar3.s0);
                ViewGroup.LayoutParams generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                aVar4.c();
                aVar3.a(generateDefaultLayoutParams);
                constraintLayout.addView(aVar4, generateDefaultLayoutParams);
            }
            if (aVar3.f63a) {
                View eVar = new e(constraintLayout.getContext());
                eVar.setId(num.intValue());
                ViewGroup.LayoutParams generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                aVar3.a(generateDefaultLayoutParams2);
                constraintLayout.addView(eVar, generateDefaultLayoutParams2);
            }
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: b  reason: collision with root package name */
        public int f64b;
        public int c;
        public int d;
        public int[] u0;
        public String v0;

        /* renamed from: a  reason: collision with root package name */
        public boolean f63a = false;
        public int e = -1;
        public int f = -1;
        public float g = -1.0f;
        public int h = -1;
        public int i = -1;
        public int j = -1;
        public int k = -1;
        public int l = -1;
        public int m = -1;
        public int n = -1;
        public int o = -1;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public float u = 0.5f;
        public float v = 0.5f;
        public String w = null;
        public int x = -1;
        public int y = 0;
        public float z = 0.0f;
        public int A = -1;
        public int B = -1;
        public int C = -1;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = -1;
        public int I = -1;
        public int J = 0;
        public int K = -1;
        public int L = -1;
        public int M = -1;
        public int N = -1;
        public int O = -1;
        public int P = -1;
        public float Q = 0.0f;
        public float R = 0.0f;
        public int S = 0;
        public int T = 0;
        public float U = 1.0f;
        public boolean V = false;
        public float W = 0.0f;
        public float X = 0.0f;
        public float Y = 0.0f;
        public float Z = 0.0f;
        public float a0 = 1.0f;
        public float b0 = 1.0f;
        public float c0 = Float.NaN;
        public float d0 = Float.NaN;
        public float e0 = 0.0f;
        public float f0 = 0.0f;
        public float g0 = 0.0f;
        public boolean h0 = false;
        public boolean i0 = false;
        public int j0 = 0;
        public int k0 = 0;
        public int l0 = -1;
        public int m0 = -1;
        public int n0 = -1;
        public int o0 = -1;
        public float p0 = 1.0f;
        public float q0 = 1.0f;
        public boolean r0 = false;
        public int s0 = -1;
        public int t0 = -1;

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(int i, d.a aVar) {
            this.d = i;
            this.h = ((ConstraintLayout.a) aVar).d;
            this.i = ((ConstraintLayout.a) aVar).e;
            this.j = ((ConstraintLayout.a) aVar).f;
            this.k = ((ConstraintLayout.a) aVar).g;
            this.l = ((ConstraintLayout.a) aVar).h;
            this.m = ((ConstraintLayout.a) aVar).i;
            this.n = ((ConstraintLayout.a) aVar).j;
            this.o = ((ConstraintLayout.a) aVar).k;
            this.p = ((ConstraintLayout.a) aVar).l;
            this.q = ((ConstraintLayout.a) aVar).p;
            this.r = ((ConstraintLayout.a) aVar).q;
            this.s = ((ConstraintLayout.a) aVar).r;
            this.t = ((ConstraintLayout.a) aVar).s;
            this.u = ((ConstraintLayout.a) aVar).z;
            this.v = ((ConstraintLayout.a) aVar).A;
            this.w = ((ConstraintLayout.a) aVar).B;
            this.x = ((ConstraintLayout.a) aVar).m;
            this.y = ((ConstraintLayout.a) aVar).n;
            this.z = ((ConstraintLayout.a) aVar).o;
            this.A = ((ConstraintLayout.a) aVar).P;
            this.B = ((ConstraintLayout.a) aVar).Q;
            this.C = ((ConstraintLayout.a) aVar).R;
            this.g = ((ConstraintLayout.a) aVar).c;
            this.e = ((ConstraintLayout.a) aVar).a;
            this.f = ((ConstraintLayout.a) aVar).b;
            this.f64b = ((ViewGroup.MarginLayoutParams) aVar).width;
            this.c = ((ViewGroup.MarginLayoutParams) aVar).height;
            this.D = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
            this.E = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
            this.F = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
            this.G = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
            this.Q = ((ConstraintLayout.a) aVar).E;
            this.R = ((ConstraintLayout.a) aVar).D;
            this.T = ((ConstraintLayout.a) aVar).G;
            this.S = ((ConstraintLayout.a) aVar).F;
            boolean z = ((ConstraintLayout.a) aVar).S;
            this.h0 = z;
            this.i0 = ((ConstraintLayout.a) aVar).T;
            this.j0 = ((ConstraintLayout.a) aVar).H;
            this.k0 = ((ConstraintLayout.a) aVar).I;
            this.h0 = z;
            this.l0 = ((ConstraintLayout.a) aVar).L;
            this.m0 = ((ConstraintLayout.a) aVar).M;
            this.n0 = ((ConstraintLayout.a) aVar).J;
            this.o0 = ((ConstraintLayout.a) aVar).K;
            this.p0 = ((ConstraintLayout.a) aVar).N;
            this.q0 = ((ConstraintLayout.a) aVar).O;
            if (Build.VERSION.SDK_INT >= 17) {
                this.H = aVar.getMarginEnd();
                this.I = aVar.getMarginStart();
            }
            this.U = aVar.m0;
            this.X = aVar.p0;
            this.Y = aVar.q0;
            this.Z = aVar.r0;
            this.a0 = aVar.s0;
            this.b0 = aVar.t0;
            this.c0 = aVar.u0;
            this.d0 = aVar.v0;
            this.e0 = aVar.w0;
            this.f0 = aVar.x0;
            this.g0 = aVar.y0;
            this.W = aVar.o0;
            this.V = aVar.n0;
        }

        public Object clone() {
            a aVar = new a();
            aVar.f63a = this.f63a;
            aVar.f64b = this.f64b;
            aVar.c = this.c;
            aVar.e = this.e;
            aVar.f = this.f;
            aVar.g = this.g;
            aVar.h = this.h;
            aVar.i = this.i;
            aVar.j = this.j;
            aVar.k = this.k;
            aVar.l = this.l;
            aVar.m = this.m;
            aVar.n = this.n;
            aVar.o = this.o;
            aVar.p = this.p;
            aVar.q = this.q;
            aVar.r = this.r;
            aVar.s = this.s;
            aVar.t = this.t;
            aVar.u = this.u;
            aVar.v = this.v;
            aVar.w = this.w;
            aVar.A = this.A;
            aVar.B = this.B;
            aVar.u = this.u;
            aVar.u = this.u;
            aVar.u = this.u;
            aVar.u = this.u;
            aVar.u = this.u;
            aVar.C = this.C;
            aVar.D = this.D;
            aVar.E = this.E;
            aVar.F = this.F;
            aVar.G = this.G;
            aVar.H = this.H;
            aVar.I = this.I;
            aVar.J = this.J;
            aVar.K = this.K;
            aVar.L = this.L;
            aVar.M = this.M;
            aVar.N = this.N;
            aVar.O = this.O;
            aVar.P = this.P;
            aVar.Q = this.Q;
            aVar.R = this.R;
            aVar.S = this.S;
            aVar.T = this.T;
            aVar.U = this.U;
            aVar.V = this.V;
            aVar.W = this.W;
            aVar.X = this.X;
            aVar.Y = this.Y;
            aVar.Z = this.Z;
            aVar.a0 = this.a0;
            aVar.b0 = this.b0;
            aVar.c0 = this.c0;
            aVar.d0 = this.d0;
            aVar.e0 = this.e0;
            aVar.f0 = this.f0;
            aVar.g0 = this.g0;
            aVar.h0 = this.h0;
            aVar.i0 = this.i0;
            aVar.j0 = this.j0;
            aVar.k0 = this.k0;
            aVar.l0 = this.l0;
            aVar.m0 = this.m0;
            aVar.n0 = this.n0;
            aVar.o0 = this.o0;
            aVar.p0 = this.p0;
            aVar.q0 = this.q0;
            aVar.s0 = this.s0;
            aVar.t0 = this.t0;
            int[] iArr = this.u0;
            if (iArr != null) {
                aVar.u0 = Arrays.copyOf(iArr, iArr.length);
            }
            aVar.x = this.x;
            aVar.y = this.y;
            aVar.z = this.z;
            aVar.r0 = this.r0;
            return aVar;
        }

        public void a(ConstraintLayout.a aVar) {
            aVar.d = this.h;
            aVar.e = this.i;
            aVar.f = this.j;
            aVar.g = this.k;
            aVar.h = this.l;
            aVar.i = this.m;
            aVar.j = this.n;
            aVar.k = this.o;
            aVar.l = this.p;
            aVar.p = this.q;
            aVar.q = this.r;
            aVar.r = this.s;
            aVar.s = this.t;
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = this.D;
            ((ViewGroup.MarginLayoutParams) aVar).rightMargin = this.E;
            ((ViewGroup.MarginLayoutParams) aVar).topMargin = this.F;
            ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = this.G;
            aVar.x = this.P;
            aVar.y = this.O;
            aVar.z = this.u;
            aVar.A = this.v;
            aVar.m = this.x;
            aVar.n = this.y;
            aVar.o = this.z;
            aVar.B = this.w;
            aVar.P = this.A;
            aVar.Q = this.B;
            aVar.E = this.Q;
            aVar.D = this.R;
            aVar.G = this.T;
            aVar.F = this.S;
            aVar.S = this.h0;
            aVar.T = this.i0;
            aVar.H = this.j0;
            aVar.I = this.k0;
            aVar.L = this.l0;
            aVar.M = this.m0;
            aVar.J = this.n0;
            aVar.K = this.o0;
            aVar.N = this.p0;
            aVar.O = this.q0;
            aVar.R = this.C;
            aVar.c = this.g;
            aVar.a = this.e;
            aVar.b = this.f;
            ((ViewGroup.MarginLayoutParams) aVar).width = this.f64b;
            ((ViewGroup.MarginLayoutParams) aVar).height = this.c;
            if (Build.VERSION.SDK_INT >= 17) {
                aVar.setMarginStart(this.I);
                aVar.setMarginEnd(this.H);
            }
            aVar.a();
        }
    }

    public void a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    a a2 = a(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        a2.f63a = true;
                    }
                    this.f62a.put(Integer.valueOf(a2.d), a2);
                    continue;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    public final a a(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.ConstraintSet);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = c.get(index);
            switch (i2) {
                case 1:
                    int resourceId = obtainStyledAttributes.getResourceId(index, aVar.p);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.p = resourceId;
                    break;
                case 2:
                    aVar.G = obtainStyledAttributes.getDimensionPixelSize(index, aVar.G);
                    break;
                case 3:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, aVar.o);
                    if (resourceId2 == -1) {
                        resourceId2 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.o = resourceId2;
                    break;
                case 4:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, aVar.n);
                    if (resourceId3 == -1) {
                        resourceId3 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.n = resourceId3;
                    break;
                case 5:
                    aVar.w = obtainStyledAttributes.getString(index);
                    break;
                case 6:
                    aVar.A = obtainStyledAttributes.getDimensionPixelOffset(index, aVar.A);
                    break;
                case 7:
                    aVar.B = obtainStyledAttributes.getDimensionPixelOffset(index, aVar.B);
                    break;
                case 8:
                    aVar.H = obtainStyledAttributes.getDimensionPixelSize(index, aVar.H);
                    break;
                case 9:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, aVar.t);
                    if (resourceId4 == -1) {
                        resourceId4 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.t = resourceId4;
                    break;
                case 10:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, aVar.s);
                    if (resourceId5 == -1) {
                        resourceId5 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.s = resourceId5;
                    break;
                case 11:
                    aVar.N = obtainStyledAttributes.getDimensionPixelSize(index, aVar.N);
                    break;
                case 12:
                    aVar.O = obtainStyledAttributes.getDimensionPixelSize(index, aVar.O);
                    break;
                case 13:
                    aVar.K = obtainStyledAttributes.getDimensionPixelSize(index, aVar.K);
                    break;
                case 14:
                    aVar.M = obtainStyledAttributes.getDimensionPixelSize(index, aVar.M);
                    break;
                case 15:
                    aVar.P = obtainStyledAttributes.getDimensionPixelSize(index, aVar.P);
                    break;
                case 16:
                    aVar.L = obtainStyledAttributes.getDimensionPixelSize(index, aVar.L);
                    break;
                case 17:
                    aVar.e = obtainStyledAttributes.getDimensionPixelOffset(index, aVar.e);
                    break;
                case 18:
                    aVar.f = obtainStyledAttributes.getDimensionPixelOffset(index, aVar.f);
                    break;
                case 19:
                    aVar.g = obtainStyledAttributes.getFloat(index, aVar.g);
                    break;
                case 20:
                    aVar.u = obtainStyledAttributes.getFloat(index, aVar.u);
                    break;
                case 21:
                    aVar.c = obtainStyledAttributes.getLayoutDimension(index, aVar.c);
                    break;
                case 22:
                    aVar.J = obtainStyledAttributes.getInt(index, aVar.J);
                    aVar.J = f61b[aVar.J];
                    break;
                case 23:
                    aVar.f64b = obtainStyledAttributes.getLayoutDimension(index, aVar.f64b);
                    break;
                case 24:
                    aVar.D = obtainStyledAttributes.getDimensionPixelSize(index, aVar.D);
                    break;
                case 25:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, aVar.h);
                    if (resourceId6 == -1) {
                        resourceId6 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.h = resourceId6;
                    break;
                case 26:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, aVar.i);
                    if (resourceId7 == -1) {
                        resourceId7 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.i = resourceId7;
                    break;
                case 27:
                    aVar.C = obtainStyledAttributes.getInt(index, aVar.C);
                    break;
                case 28:
                    aVar.E = obtainStyledAttributes.getDimensionPixelSize(index, aVar.E);
                    break;
                case 29:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, aVar.j);
                    if (resourceId8 == -1) {
                        resourceId8 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.j = resourceId8;
                    break;
                case 30:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, aVar.k);
                    if (resourceId9 == -1) {
                        resourceId9 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.k = resourceId9;
                    break;
                case 31:
                    aVar.I = obtainStyledAttributes.getDimensionPixelSize(index, aVar.I);
                    break;
                case 32:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, aVar.q);
                    if (resourceId10 == -1) {
                        resourceId10 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.q = resourceId10;
                    break;
                case 33:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, aVar.r);
                    if (resourceId11 == -1) {
                        resourceId11 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.r = resourceId11;
                    break;
                case 34:
                    aVar.F = obtainStyledAttributes.getDimensionPixelSize(index, aVar.F);
                    break;
                case 35:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, aVar.m);
                    if (resourceId12 == -1) {
                        resourceId12 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.m = resourceId12;
                    break;
                case 36:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, aVar.l);
                    if (resourceId13 == -1) {
                        resourceId13 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.l = resourceId13;
                    break;
                case 37:
                    aVar.v = obtainStyledAttributes.getFloat(index, aVar.v);
                    break;
                case 38:
                    aVar.d = obtainStyledAttributes.getResourceId(index, aVar.d);
                    break;
                case 39:
                    aVar.R = obtainStyledAttributes.getFloat(index, aVar.R);
                    break;
                case 40:
                    aVar.Q = obtainStyledAttributes.getFloat(index, aVar.Q);
                    break;
                case 41:
                    aVar.S = obtainStyledAttributes.getInt(index, aVar.S);
                    break;
                case 42:
                    aVar.T = obtainStyledAttributes.getInt(index, aVar.T);
                    break;
                case 43:
                    aVar.U = obtainStyledAttributes.getFloat(index, aVar.U);
                    break;
                case 44:
                    aVar.V = true;
                    aVar.W = obtainStyledAttributes.getDimension(index, aVar.W);
                    break;
                case 45:
                    aVar.Y = obtainStyledAttributes.getFloat(index, aVar.Y);
                    break;
                case 46:
                    aVar.Z = obtainStyledAttributes.getFloat(index, aVar.Z);
                    break;
                case 47:
                    aVar.a0 = obtainStyledAttributes.getFloat(index, aVar.a0);
                    break;
                case 48:
                    aVar.b0 = obtainStyledAttributes.getFloat(index, aVar.b0);
                    break;
                case 49:
                    aVar.c0 = obtainStyledAttributes.getFloat(index, aVar.c0);
                    break;
                case 50:
                    aVar.d0 = obtainStyledAttributes.getFloat(index, aVar.d0);
                    break;
                case 51:
                    aVar.e0 = obtainStyledAttributes.getDimension(index, aVar.e0);
                    break;
                case 52:
                    aVar.f0 = obtainStyledAttributes.getDimension(index, aVar.f0);
                    break;
                case 53:
                    aVar.g0 = obtainStyledAttributes.getDimension(index, aVar.g0);
                    break;
                default:
                    switch (i2) {
                        case 60:
                            aVar.X = obtainStyledAttributes.getFloat(index, aVar.X);
                            continue;
                        case 61:
                            int resourceId14 = obtainStyledAttributes.getResourceId(index, aVar.x);
                            if (resourceId14 == -1) {
                                resourceId14 = obtainStyledAttributes.getInt(index, -1);
                            }
                            aVar.x = resourceId14;
                            continue;
                        case 62:
                            aVar.y = obtainStyledAttributes.getDimensionPixelSize(index, aVar.y);
                            continue;
                        case 63:
                            aVar.z = obtainStyledAttributes.getFloat(index, aVar.z);
                            continue;
                        default:
                            switch (i2) {
                                case 69:
                                    aVar.p0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                    continue;
                                    continue;
                                case 70:
                                    aVar.q0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                    continue;
                                case 72:
                                    aVar.s0 = obtainStyledAttributes.getInt(index, aVar.s0);
                                    continue;
                                case 73:
                                    aVar.v0 = obtainStyledAttributes.getString(index);
                                    continue;
                                case 74:
                                    aVar.r0 = obtainStyledAttributes.getBoolean(index, aVar.r0);
                                    continue;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public final int[] a(View view, String str) {
        int i;
        Object a2;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = g.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (a2 = view.getParent().a(0, trim)) != null && (a2 instanceof Integer)) {
                i = ((Integer) a2).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }
}
