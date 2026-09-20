package defpackage;

import android.content.Context;
import android.net.Uri;

/* renamed from: u49  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class u49 {
    public static final js a = new zt6(0);

    public static synchronized Uri a() {
        synchronized (u49.class) {
            js jsVar = a;
            Uri uri = (Uri) jsVar.get("com.google.android.gms.measurement");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
            jsVar.put("com.google.android.gms.measurement", parse);
            return parse;
        }
    }

    public static String b(Context context, String str) {
        if (!str.contains("#")) {
            String packageName = context.getPackageName();
            return f21.m(new StringBuilder(str.length() + 1 + String.valueOf(packageName).length()), str, "#", packageName);
        }
        h.q("The passed in package cannot already have a subpackage: ".concat(str));
        return null;
    }
}
