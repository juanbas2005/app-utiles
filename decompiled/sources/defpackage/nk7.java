package defpackage;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.regex.Pattern;

/* renamed from: nk7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nk7 {
    public static WeakReference b;
    public o9 a;

    public final synchronized mk7 a() {
        String str;
        mk7 mk7;
        o9 o9Var = this.a;
        synchronized (((ArrayDeque) o9Var.A)) {
            str = (String) ((ArrayDeque) o9Var.A).peek();
        }
        Pattern pattern = mk7.d;
        mk7 = null;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("!", -1);
            if (split.length == 2) {
                mk7 = new mk7(split[0], split[1]);
            }
        }
        return mk7;
    }
}
