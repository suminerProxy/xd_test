package a.e.j;

import java.io.Writer;

/* compiled from: LogWriter.java */
/* loaded from: classes.dex */
public class a extends Writer {

    /* renamed from: b  reason: collision with root package name */
    public final String f67b;
    public StringBuilder c = new StringBuilder(128);

    public a(String str) {
        this.f67b = str;
    }

    public final void a() {
        if (this.c.length() > 0) {
            String str = this.f67b;
            this.c.toString();
            StringBuilder sb = this.c;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                a();
            } else {
                this.c.append(c);
            }
        }
    }
}
