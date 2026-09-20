package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: ca5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class ca5 {
    public static final String a = bc4.p("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z) {
        int i;
        String str;
        String str2 = "disabled";
        String str3 = a;
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z2 = false;
            if (componentEnabledSetting != 0) {
                if (componentEnabledSetting == 1) {
                    z2 = true;
                }
            }
            if (z == z2) {
                bc4.k().e(str3, "Skipping component enablement for ".concat(cls.getName()));
                return;
            }
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, cls.getName());
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i, 1);
            bc4 k = bc4.k();
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            if (z) {
                str = "enabled";
            } else {
                str = str2;
            }
            sb.append(str);
            k.e(str3, sb.toString());
        } catch (Exception e) {
            bc4 k2 = bc4.k();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            if (z) {
                str2 = "enabled";
            }
            sb2.append(str2);
            k2.g(str3, sb2.toString(), e);
        }
    }
}
