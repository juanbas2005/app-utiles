package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashSet;

/* renamed from: wn  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wn implements gf6 {
    public final /* synthetic */ int a;
    public final Object b;

    public wn(kg5 kg5) {
        this.a = 1;
        this.b = new LinkedHashSet();
        kg5.K("androidx.savedstate.Restarter", this);
    }

    public final Bundle a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case b85.b:
                Bundle bundle = new Bundle();
                ((yn) obj).r().getClass();
                return bundle;
            default:
                Bundle j = tf4.j((yb5[]) Arrays.copyOf(new yb5[0], 0));
                w95.i(j, "classes_to_restore", dt0.b1((LinkedHashSet) obj));
                return j;
        }
    }

    public wn(yn ynVar) {
        this.a = 0;
        this.b = ynVar;
    }
}
