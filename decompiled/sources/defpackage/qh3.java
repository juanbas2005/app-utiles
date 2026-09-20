package defpackage;

import cu.lestebang.utiletecsa.core.preferences.model.DarkThemeConfigPreferences;
import cu.lestebang.utiletecsa.core.preferences.model.UserDataPreferences;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: qh3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qh3 extends a97 implements hs2 {
    public final /* synthetic */ int A;
    public /* synthetic */ Throwable B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qh3(int i, f61 f61, int i2) {
        super(i, f61);
        this.A = i2;
    }

    public final Object s(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        Throwable th = this.B;
        switch (i) {
            case b85.b:
                o85.q(obj);
                UUID.randomUUID().toString().getClass();
                new AtomicBoolean(false);
                th.getClass();
                new AtomicBoolean(false);
                return vs7;
            case 1:
                o85.q(obj);
                new UserDataPreferences((String) null, (String) null, (String) null, (DarkThemeConfigPreferences) null, false, false, 0, false, (List) null, (String) null, false, false, false, false, false, false, false, false, false, false, false, false, (List) null, (String) null, (String) null, (String) null, (List) null, (String) null, false, (String) null, (List) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, 0, 0, 0, 0, (String) null, (String) null, false, false, false, false, false, false, false, false, 0, (String) null, (String) null, (String) null, (String) null, (String) null, -1, -1, (hl1) null);
                th.getClass();
                new AtomicBoolean(false);
                return vs7;
            default:
                o85.q(obj);
                th.getClass();
                new AtomicBoolean(false);
                return vs7;
        }
    }

    public final Object u(Object obj, Object obj2, Object obj3) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        fi2 fi2 = (fi2) obj;
        Throwable th = (Throwable) obj2;
        f61 f61 = (f61) obj3;
        switch (i) {
            case b85.b:
                qh3 qh3 = new qh3(3, f61, 0);
                qh3.B = th;
                qh3.s(vs7);
                return vs7;
            case 1:
                qh3 qh32 = new qh3(3, f61, 1);
                qh32.B = th;
                qh32.s(vs7);
                return vs7;
            default:
                qh3 qh33 = new qh3(3, f61, 2);
                qh33.B = th;
                qh33.s(vs7);
                return vs7;
        }
    }
}
