package com.wrapper.proxyapplication;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class WrapperProxyApplication extends Application {
    static Context baseContext = null;
    static String className = "com.showstartfans.activity.XiudongApplication";
    static ClassLoader mLoader = null;
    static Application shellApp = null;
    static String tinkerApp = "tinker not support";

    native void Ooo0ooO0oO();

    protected abstract void initProxyApplication(Context context);

    static Context getWrapperProxyAppBaseContext() {
        return baseContext;
    }

    private synchronized boolean Fixappname() {
        if (className.startsWith(".")) {
            className = super.getPackageName() + className;
        } else if (className.indexOf(".") < 0) {
            className = super.getPackageName() + "." + className;
        }
        return true;
    }

    public static void fixAndroid(Context context, Application application) {
        if (Build.VERSION.SDK_INT == 28) {
            try {
                mLoader = AndroidNClassLoader.inject(context.getClassLoader(), application);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private static String getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "0";
        }
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        baseContext = getBaseContext();
        if (shellApp == null) {
            shellApp = this;
        }
        Fixappname();
        initProxyApplication(context);
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        Ooo0ooO0oO();
    }
}
