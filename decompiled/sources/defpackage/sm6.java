package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;

/* renamed from: sm6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class sm6 {
    public static final sm6 a = new Object();
    public static final ji8 b;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, sm6] */
    static {
        am3 am3 = new am3();
        am3.a(rm6.class, ty.a);
        am3.a(ym6.class, uy.a);
        am3.a(ke1.class, ry.a);
        am3.a(hr.class, qy.a);
        am3.a(jd.class, py.a);
        am3.a(ep5.class, sy.a);
        am3.d = true;
        b = new ji8(27, (Object) am3);
    }

    public static hr a(oe2 oe2) {
        String valueOf;
        oe2.a();
        Context context = oe2.a;
        context.getClass();
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            valueOf = String.valueOf(packageInfo.getLongVersionCode());
        } else {
            valueOf = String.valueOf(packageInfo.versionCode);
        }
        String str = valueOf;
        oe2.a();
        String str2 = oe2.c.b;
        str2.getClass();
        Build.MODEL.getClass();
        Build.VERSION.RELEASE.getClass();
        packageName.getClass();
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = str;
        }
        Build.MANUFACTURER.getClass();
        oe2.a();
        ep5 h = o85.h(context);
        oe2.a();
        return new hr(str2, new jd(packageName, str3, str, h, o85.g(context)));
    }
}
