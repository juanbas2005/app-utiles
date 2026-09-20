package defpackage;

import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: s22  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class s22 extends sg3 {
    public final /* synthetic */ dc v;

    public s22(dc dcVar) {
        this.v = dcVar;
    }

    public final void J(Throwable th) {
        ((w22) this.v.a).f(th);
    }

    /* JADX INFO: finally extract failed */
    public final void L(am6 am6) {
        Set<int[]> set;
        dc dcVar = this.v;
        dcVar.c = am6;
        am6 am62 = (am6) dcVar.c;
        w22 w22 = (w22) dcVar.a;
        kw5 kw5 = w22.g;
        tl1 tl1 = w22.i;
        if (Build.VERSION.SDK_INT >= 34) {
            set = c32.a();
        } else {
            set = uq3.u();
        }
        dcVar.b = new wr0(am62, kw5, tl1, (Set) set);
        w22 w222 = (w22) dcVar.a;
        ArrayList arrayList = new ArrayList();
        w222.a.writeLock().lock();
        try {
            w222.c = 1;
            arrayList.addAll(w222.b);
            w222.b.clear();
            w222.a.writeLock().unlock();
            w222.d.post(new cj0((List) arrayList, w222.c, (Throwable) null));
        } catch (Throwable th) {
            w222.a.writeLock().unlock();
            throw th;
        }
    }
}
