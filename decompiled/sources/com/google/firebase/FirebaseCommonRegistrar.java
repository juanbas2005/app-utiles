package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        Class<ho1> cls = ho1.class;
        fv0 b = gv0.b(cls);
        b.a(new zp1(2, 0, y00.class));
        b.g = new ta1(6);
        arrayList.add(b.b());
        av5 av5 = new av5(t30.class, Executor.class);
        fv0 fv0 = new fv0(wl1.class, new Class[]{iz2.class, jz2.class});
        fv0.a(zp1.c(Context.class));
        fv0.a(zp1.c(oe2.class));
        fv0.a(new zp1(2, 0, hz2.class));
        fv0.a(new zp1(1, 1, (Class) cls));
        fv0.a(new zp1(av5, 1, 0));
        fv0.g = new ul1(av5, 0);
        arrayList.add(fv0.b());
        arrayList.add(gw8.q("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(gw8.q("fire-core", "22.1.0"));
        arrayList.add(gw8.q("device-name", a(Build.PRODUCT)));
        arrayList.add(gw8.q("device-model", a(Build.DEVICE)));
        arrayList.add(gw8.q("device-brand", a(Build.BRAND)));
        arrayList.add(gw8.v("android-target-sdk", new ta1(21)));
        arrayList.add(gw8.v("android-min-sdk", new ta1(22)));
        arrayList.add(gw8.v("android-platform", new ta1(23)));
        arrayList.add(gw8.v("android-installer", new ta1(24)));
        try {
            str = cx3.z.toString();
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(gw8.q("kotlin", str));
        }
        return arrayList;
    }
}
