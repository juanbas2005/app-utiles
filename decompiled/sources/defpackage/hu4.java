package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lhu4;", "Lnx4;", "Leu4;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@mx4("navigation")
/* renamed from: hu4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class hu4 extends nx4 {
    public final ox4 c;

    public hu4(ox4 ox4) {
        ox4.getClass();
        this.c = ox4;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, h06] */
    public final void d(List list, wu4 wu4) {
        qt4 qt4;
        Bundle bundle;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zs4 zs4 = (zs4) it.next();
            qt4 qt42 = zs4.x;
            qt42.getClass();
            eu4 eu4 = (eu4) qt42;
            ao aoVar = eu4.x;
            ? obj = new Object();
            obj.w = zs4.D.a();
            r14 r14 = eu4.B;
            int i = r14.w;
            String str = (String) r14.A;
            if (i == 0 && str == null) {
                aoVar.getClass();
                String valueOf = String.valueOf(aoVar.a);
                valueOf.getClass();
                if (((eu4) r14.x).x.a == 0) {
                    valueOf = "the root navigation";
                }
                ku4.g("no start destination defined via app:startDestination for ".concat(valueOf));
                return;
            }
            if (str != null) {
                qt4 = r14.b(str, false);
            } else {
                qt4 = (qt4) ((cz6) r14.y).c(i);
            }
            if (qt4 == null) {
                if (((String) r14.z) == null) {
                    String str2 = (String) r14.A;
                    if (str2 == null) {
                        str2 = String.valueOf(r14.w);
                    }
                    r14.z = str2;
                }
                String str3 = (String) r14.z;
                str3.getClass();
                h.q(f21.h("navigation destination ", str3, " is not a direct child of this NavGraph"));
                return;
            }
            ao aoVar2 = qt4.x;
            if (str != null) {
                if (!str.equals((String) aoVar2.e)) {
                    pt4 e = aoVar2.e(str);
                    if (e != null) {
                        bundle = e.x;
                    } else {
                        bundle = null;
                    }
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle j = tf4.j((yb5[]) Arrays.copyOf(new yb5[0], 0));
                        j.putAll(bundle);
                        Bundle bundle2 = (Bundle) obj.w;
                        if (bundle2 != null) {
                            j.putAll(bundle2);
                        }
                        obj.w = j;
                    }
                }
                if (!qt4.g().isEmpty()) {
                    ArrayList a0 = gl0.a0(qt4.g(), new mr0(1, obj));
                    if (!a0.isEmpty()) {
                        rf2.k("Cannot navigate to startDestination ", qt4, ". Missing required arguments [", a0, 93);
                        return;
                    }
                } else {
                    continue;
                }
            }
            this.c.b(qt4.w).d(sg3.D(b().b(qt4, qt4.f((Bundle) obj.w))), wu4);
        }
    }

    /* renamed from: g */
    public eu4 a() {
        return new eu4(this);
    }
}
