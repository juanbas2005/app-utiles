package androidx.work.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/impl/WorkDatabase_Impl;", "Landroidx/work/impl/WorkDatabase;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class WorkDatabase_Impl extends WorkDatabase {
    public final z97 l = new z97(new fd8(this, 0));
    public final z97 m = new z97(new fd8(this, 1));
    public final z97 n = new z97(new fd8(this, 2));
    public final z97 o = new z97(new fd8(this, 3));
    public final z97 p = new z97(new fd8(this, 4));
    public final z97 q = new z97(new fd8(this, 5));
    public final z97 r = new z97(new fd8(this, 6));

    public WorkDatabase_Impl() {
        new z97(new wi7(26, this));
    }

    public final List c(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new wk4(13, 14, 10));
        arrayList.add(new ed8(0));
        arrayList.add(new wk4(16, 17, 11));
        arrayList.add(new wk4(17, 18, 12));
        arrayList.add(new wk4(18, 19, 13));
        arrayList.add(new ed8(1));
        arrayList.add(new wk4(20, 21, 14));
        arrayList.add(new wk4(22, 23, 15));
        arrayList.add(new wk4(23, 24, 16));
        return arrayList;
    }

    public final eh3 d() {
        return new eh3(this, new LinkedHashMap(), new LinkedHashMap(), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    public final t22 e() {
        return new zk3(this);
    }

    public final Set i() {
        return new LinkedHashSet();
    }

    public final LinkedHashMap j() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c26 c26 = b26.a;
        gq3 b = c26.b(fe8.class);
        a42 a42 = a42.w;
        linkedHashMap.put(b, a42);
        linkedHashMap.put(c26.b(cq1.class), a42);
        linkedHashMap.put(c26.b(he8.class), a42);
        linkedHashMap.put(c26.b(ja7.class), a42);
        linkedHashMap.put(c26.b(td8.class), a42);
        linkedHashMap.put(c26.b(ud8.class), a42);
        linkedHashMap.put(c26.b(en5.class), a42);
        linkedHashMap.put(c26.b(kw5.class), a42);
        return linkedHashMap;
    }

    public final cq1 r() {
        return (cq1) this.m.getValue();
    }

    public final en5 s() {
        return (en5) this.r.getValue();
    }

    public final ja7 t() {
        return (ja7) this.o.getValue();
    }

    public final td8 u() {
        return (td8) this.p.getValue();
    }

    public final ud8 v() {
        return (ud8) this.q.getValue();
    }

    public final fe8 w() {
        return (fe8) this.l.getValue();
    }

    public final he8 x() {
        return (he8) this.n.getValue();
    }
}
