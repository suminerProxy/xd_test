package a.a.l.a;

import a.a.k.w;
import a.a.o.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.util.Xml;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AppCompatResources.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f0a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap<Context, SparseArray<C0000a>> f1b = new WeakHashMap<>(0);
    public static final Object c = new Object();

    /* compiled from: AppCompatResources.java */
    /* renamed from: a.a.l.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0000a {

        /* renamed from: a  reason: collision with root package name */
        public final ColorStateList f2a;

        /* renamed from: b  reason: collision with root package name */
        public final Configuration f3b;

        public C0000a(ColorStateList colorStateList, Configuration configuration) {
            this.f2a = colorStateList;
            this.f3b = configuration;
        }
    }

    public static ColorStateList a(Context context, int i) {
        C0000a c0000a;
        synchronized (c) {
            SparseArray<C0000a> sparseArray = f1b.get(context);
            if (sparseArray != null && sparseArray.size() > 0 && (c0000a = sparseArray.get(i)) != null) {
                if (c0000a.f3b.equals(context.getResources().getConfiguration())) {
                    return c0000a.f2a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    public static ColorStateList b(Context context, int i) {
        int next;
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList a2 = a(context, i);
        if (a2 != null) {
            return a2;
        }
        Resources resources = context.getResources();
        TypedValue typedValue = f0a.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            f0a.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        ColorStateList colorStateList = null;
        if (!(i2 >= 28 && i2 <= 31)) {
            Resources resources2 = context.getResources();
            XmlResourceParser xml = resources2.getXml(i);
            try {
                Resources.Theme theme = context.getTheme();
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next == 2) {
                    colorStateList = w.a(resources2, xml, asAttributeSet, theme);
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception e) {
            }
        }
        if (colorStateList != null) {
            a(context, i, colorStateList);
            return colorStateList;
        }
        return a.e.e.a.a(context, i);
    }

    public static Drawable c(Context context, int i) {
        return j.a().c(context, i);
    }

    public static void a(Context context, int i, ColorStateList colorStateList) {
        synchronized (c) {
            SparseArray<C0000a> sparseArray = f1b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                f1b.put(context, sparseArray);
            }
            sparseArray.append(i, new C0000a(colorStateList, context.getResources().getConfiguration()));
        }
    }
}
