package com.showstartfans.activity;

import android.content.Context;
import android.os.Process;
import com.wrapper.proxyapplication.Util;
import com.wrapper.proxyapplication.WrapperProxyApplication;
import java.io.IOException;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public class MyWrapperProxyApplication extends WrapperProxyApplication {
    @Override // com.wrapper.proxyapplication.WrapperProxyApplication, android.app.Application
    public void onCreate() {
        super.onCreate();
    }

    @Override // com.wrapper.proxyapplication.WrapperProxyApplication
    protected void initProxyApplication(Context ctx) {
        String apkdir = ctx.getApplicationInfo().sourceDir;
        ZipFile apkzf = null;
        try {
            ZipFile apkzf2 = new ZipFile(apkdir);
            apkzf = apkzf2;
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (apkzf == null) {
            Process.killProcess(Process.myPid());
            System.exit(0);
        }
        Util.PrepareSecurefiles(ctx, apkzf);
        try {
            apkzf.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        System.loadLibrary(Util.libname);
    }
}
