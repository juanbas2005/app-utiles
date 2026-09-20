package io.github.jan.supabase.auth.providers;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class b implements sv {
    public static final k25 Companion = new Object();

    public static Object login$suspendImpl(b bVar, j77 j77, gs2 gs2, String str, vr2 vr2, f61<? super vs7> f61) {
        jz0 jz0 = new jz0(24);
        if (vr2 != null) {
            vr2.y(jz0);
        }
        Object t = j45.t(rg3.t(j77), str, new s71(j77, bVar, jz0, (f61) null, 1), f61);
        if (t == p81.w) {
            return t;
        }
        return vs7.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0021  */
    public static Object signUp$suspendImpl(b bVar, j77 j77, gs2 gs2, String str, vr2 vr2, f61<? super vs7> f61) {
        l25 l25;
        int i;
        if (f61 instanceof l25) {
            l25 = (l25) f61;
            int i2 = l25.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l25.B = i2 - Integer.MIN_VALUE;
                l25 l252 = l25;
                Object obj = l252.z;
                i = l252.B;
                if (i != 0) {
                    o85.q(obj);
                    l252.B = 1;
                    Object login = bVar.login(j77, gs2, str, vr2, l252);
                    p81 p81 = p81.w;
                    if (login == p81) {
                        return p81;
                    }
                } else if (i == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7.a;
            }
        }
        l25 = new l25(bVar, f61);
        l25 l2522 = l25;
        Object obj2 = l2522.z;
        i = l2522.B;
        if (i != 0) {
        }
        return vs7.a;
    }

    public abstract String getName();

    public Object login(j77 j77, gs2 gs2, String str, vr2 vr2, f61<? super vs7> f61) {
        return login$suspendImpl(this, j77, gs2, str, vr2, f61);
    }

    public Object signUp(j77 j77, gs2 gs2, String str, vr2 vr2, f61<? super vs7> f61) {
        return signUp$suspendImpl(this, j77, gs2, str, vr2, f61);
    }
}
