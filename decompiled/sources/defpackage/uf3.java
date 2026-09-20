package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: uf3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uf3 extends ct0 {
    public final yu4 q;

    public uf3(Class cls) {
        super(true);
        this.q = new yu4(cls);
    }

    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        Object obj = bundle.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        return null;
    }

    public final String b() {
        return "List<" + this.q.r.getName() + "}>";
    }

    public final Object c(String str) {
        return sg3.D(this.q.g(str));
    }

    public final Object d(String str, Object obj) {
        List list = (List) obj;
        yu4 yu4 = this.q;
        if (list != null) {
            return dt0.M0(list, sg3.D(yu4.g(str)));
        }
        return sg3.D(yu4.g(str));
    }

    public final void e(Bundle bundle, String str, Object obj) {
        ArrayList arrayList;
        List list = (List) obj;
        str.getClass();
        if (list != null) {
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        bundle.putSerializable(str, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uf3)) {
            return false;
        }
        return sg3.e(this.q, ((uf3) obj).q);
    }

    public final /* bridge */ /* synthetic */ Object g() {
        return a42.w;
    }

    public final List h(Object obj) {
        List<Enum> list = (List) obj;
        if (list == null) {
            return a42.w;
        }
        ArrayList arrayList = new ArrayList(et0.e0(list, 10));
        for (Enum enumR : list) {
            arrayList.add(enumR.toString());
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.q.q.hashCode();
    }
}
