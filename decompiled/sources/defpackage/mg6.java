package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;

/* renamed from: mg6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class mg6 {
    public static final String a = bc4.p("Schedulers");

    public static void a(fe8 fe8, z53 z53, List list) {
        if (list.size() > 0) {
            z53.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                fe8.g(currentTimeMillis, ((be8) it.next()).a);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public static void b(f01 f01, WorkDatabase workDatabase, List list) {
        if (list != null && list.size() != 0) {
            fe8 w = workDatabase.w();
            workDatabase.b();
            try {
                a96 a96 = w.a;
                a96 a962 = w.a;
                List list2 = (List) sg3.O(a96, true, false, new rb8(5));
                a(w, f01.d, list2);
                List list3 = (List) sg3.O(a962, true, false, new ah1(f01.k, 2));
                a(w, f01.d, list3);
                list3.addAll(list2);
                List list4 = (List) sg3.O(a962, true, false, new rb8(8));
                workDatabase.p();
                workDatabase.f();
                if (list3.size() > 0) {
                    be8[] be8Arr = (be8[]) list3.toArray(new be8[list3.size()]);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        jg6 jg6 = (jg6) it.next();
                        if (jg6.c()) {
                            jg6.e(be8Arr);
                        }
                    }
                }
                if (list4.size() > 0) {
                    be8[] be8Arr2 = (be8[]) list4.toArray(new be8[list4.size()]);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        jg6 jg62 = (jg6) it2.next();
                        if (!jg62.c()) {
                            jg62.e(be8Arr2);
                        }
                    }
                }
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
    }
}
