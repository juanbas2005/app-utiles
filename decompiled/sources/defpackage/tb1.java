package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: tb1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class tb1 implements v22 {
    public final Context a;

    public tb1(Context context, int i) {
        switch (i) {
            case 1:
                this.a = context.getApplicationContext();
                return;
            default:
                context.getClass();
                this.a = context;
                return;
        }
    }

    public void a(sg3 sg3) {
        cz0 cz0 = new cz0("EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), cz0);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new ti(this, sg3, threadPoolExecutor, 5));
    }

    public ApplicationInfo b(int i, String str) {
        return this.a.getPackageManager().getApplicationInfo(str, i);
    }

    public PackageInfo c(int i, String str) {
        return this.a.getPackageManager().getPackageInfo(str, i);
    }

    public boolean d() {
        String nameForUid;
        int callingUid = Binder.getCallingUid();
        int myUid = Process.myUid();
        Context context = this.a;
        if (callingUid == myUid) {
            return rd3.B(context);
        }
        if (!za5.w() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return context.getPackageManager().isInstantApp(nameForUid);
    }

    public ob1 e() {
        String string;
        Context context = this.a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (!(bundle == null || (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) == null)) {
                    arrayList.add(string);
                }
            }
        }
        List<String> b1 = dt0.b1(arrayList);
        if (b1.isEmpty()) {
            return null;
        }
        ob1 ob1 = null;
        for (String cls : b1) {
            try {
                Object newInstance = Class.forName(cls).getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
                newInstance.getClass();
                ob1 ob12 = (ob1) newInstance;
                if (!ob12.isAvailableOnDevice()) {
                    continue;
                } else if (ob1 != null) {
                    Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                    return null;
                } else {
                    ob1 = ob12;
                }
            } catch (Throwable unused) {
            }
        }
        return ob1;
    }

    public /* synthetic */ tb1(Context context, byte b) {
        this.a = context;
    }
}
