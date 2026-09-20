package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: db9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class db9 implements dt {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ l99 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int d;

    public /* synthetic */ db9(l99 l99, int i, ArrayList arrayList) {
        this.b = l99;
        this.d = i;
        this.c = arrayList;
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [java.lang.Object, java.util.concurrent.Callable] */
    public final ListenableFuture apply(Object obj) {
        int i = this.a;
        int i2 = 0;
        int i3 = this.d;
        ArrayList arrayList = this.c;
        l99 l99 = this.b;
        switch (i) {
            case b85.b:
                ArrayList arrayList2 = new ArrayList(i3);
                while (i2 < i3) {
                    if (!((Boolean) pt2.b((Future) arrayList.get(i2))).booleanValue()) {
                        i2++;
                    } else {
                        ((List) l99.b).get(i2).getClass();
                        ku4.a();
                        return null;
                    }
                }
                q93 s = q93.s(arrayList2);
                ? obj2 = new Object();
                lu0 lu0 = new lu0(s, true);
                lu0.J = new ku0(lu0, (Callable) obj2);
                lu0.s();
                return lu0;
            default:
                lu0 lu02 = new lu0(q93.s(arrayList), false);
                lu02.J = new ku0(lu02, mc9.a(new kb9(l99, (pk8) obj, i3, arrayList)), (Executor) l99.c);
                lu02.s();
                return lu02;
        }
    }

    public /* synthetic */ db9(l99 l99, ArrayList arrayList, int i) {
        this.b = l99;
        this.c = arrayList;
        this.d = i;
    }
}
