package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* renamed from: df6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class df6 implements gf6 {
    public final kg5 a;
    public boolean b;
    public Bundle c;
    public final z97 d;

    public df6(kg5 kg5, a68 a68) {
        kg5.getClass();
        this.a = kg5;
        this.d = new z97(new hx4(17, a68));
    }

    public final Bundle a() {
        Bundle j = tf4.j((yb5[]) Arrays.copyOf(new yb5[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            j.putAll(bundle);
        }
        for (Map.Entry entry : ((ef6) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a2 = ((lv0) ((ye6) entry.getValue()).b.B).a();
            if (!a2.isEmpty()) {
                str.getClass();
                j.putBundle(str, a2);
            }
        }
        this.b = false;
        return j;
    }

    public final void b() {
        if (!this.b) {
            Bundle i = this.a.i("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle j = tf4.j((yb5[]) Arrays.copyOf(new yb5[0], 0));
            Bundle bundle = this.c;
            if (bundle != null) {
                j.putAll(bundle);
            }
            if (i != null) {
                j.putAll(i);
            }
            this.c = j;
            this.b = true;
            ef6 ef6 = (ef6) this.d.getValue();
        }
    }
}
