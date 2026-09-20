package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: wr6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wr6 {
    public final tc1 a;
    public final ym1 b;
    public final Context c;
    public final String d;
    public final z97 e;
    public final Set f;

    public wr6(Context context, String str, Set set, tc1 tc1, ym1 ym1) {
        Set set2;
        context.getClass();
        set.getClass();
        m20 m20 = new m20(context, str, 4);
        this.a = tc1;
        this.b = ym1;
        this.c = context;
        this.d = str;
        this.e = new z97(m20);
        if (set == yr6.a) {
            set2 = null;
        } else {
            set2 = dt0.f1(set);
        }
        this.f = set2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005f, code lost:
        if (r4.isEmpty() == false) goto L_0x0090;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object a(Object obj, h61 h61) {
        vr6 vr6;
        Object obj2;
        int i;
        if (h61 instanceof vr6) {
            vr6 = (vr6) h61;
            int i2 = vr6.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vr6.B = i2 - Integer.MIN_VALUE;
                obj2 = vr6.z;
                i = vr6.B;
                boolean z = true;
                if (i != 0) {
                    o85.q(obj2);
                    vr6.B = 1;
                    obj2 = this.a.H(obj, vr6);
                    p81 p81 = p81.w;
                    if (obj2 == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj2);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (((Boolean) obj2).booleanValue()) {
                    return Boolean.FALSE;
                }
                z97 z97 = this.e;
                Set set = this.f;
                if (set == null) {
                    Map<String, ?> all = ((SharedPreferences) z97.getValue()).getAll();
                    all.getClass();
                } else {
                    Iterable iterable = set;
                    SharedPreferences sharedPreferences = (SharedPreferences) z97.getValue();
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it = iterable.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (sharedPreferences.contains((String) it.next())) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            }
        }
        vr6 = new vr6(this, h61);
        obj2 = vr6.z;
        i = vr6.B;
        boolean z2 = true;
        if (i != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
    }
}
