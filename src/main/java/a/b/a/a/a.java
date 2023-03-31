package a.b.a.a;

import java.util.concurrent.Executor;

/* compiled from: ArchTaskExecutor.java */
/* loaded from: classes.dex */
public class a extends c {
    public static volatile a c;

    /* renamed from: b  reason: collision with root package name */
    public c f5b = new a.b.a.a.b();

    /* renamed from: a  reason: collision with root package name */
    public c f4a = this.f5b;

    /* compiled from: ArchTaskExecutor.java */
    /* renamed from: a.b.a.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class ExecutorC0001a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.b().b(runnable);
        }
    }

    /* compiled from: ArchTaskExecutor.java */
    /* loaded from: classes.dex */
    public static class b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.b().a(runnable);
        }
    }

    public static a b() {
        if (c != null) {
            return c;
        }
        synchronized (a.class) {
            if (c == null) {
                c = new a();
            }
        }
        return c;
    }

    @Override // a.b.a.a.c
    public void a(Runnable runnable) {
        this.f4a.a(runnable);
    }

    @Override // a.b.a.a.c
    public boolean a() {
        return this.f4a.a();
    }

    @Override // a.b.a.a.c
    public void b(Runnable runnable) {
        this.f4a.b(runnable);
    }
}
