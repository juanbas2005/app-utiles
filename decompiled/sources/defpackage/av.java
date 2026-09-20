package defpackage;

import io.github.jan.supabase.auth.a;

/* renamed from: av  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class av extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ a C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ av(a aVar, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = aVar;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b /*0*/:
                return ((av) o(f61, o81)).s(vs7);
            case 1:
                return ((av) o(f61, o81)).s(vs7);
            default:
                return ((av) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        a aVar = this.C;
        switch (i) {
            case b85.b /*0*/:
                return new av(aVar, f61, 0);
            case 1:
                return new av(aVar, f61, 1);
            default:
                return new av(aVar, f61, 2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009b  */
    public final Object s(Object obj) {
        int i = this.A;
        a aVar = this.C;
        p81 p81 = p81.w;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b /*0*/:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    cf4 cf4 = aVar.d;
                    ms3 ms3 = (ms3) cf4.z;
                    String str = (String) cf4.y;
                    ub4 ub4 = ub4.z;
                    if (ms3.a(ub4)) {
                        ms3.b(ub4, str, (Throwable) null, "Received session not found api error. Clearing session...");
                    }
                    this.B = 1;
                    if (aVar.n(this) == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7;
            case 1:
                wu wuVar = aVar.c;
                cf4 cf42 = aVar.d;
                int i3 = this.B;
                ub4 ub42 = ub4.x;
                if (i3 == 0) {
                    o85.q(obj);
                    ms3 ms32 = (ms3) cf42.z;
                    String str2 = (String) cf42.y;
                    if (ms32.a(ub42)) {
                        ms32.b(ub42, str2, (Throwable) null, "Loading session from storage...");
                    }
                    this.B = 1;
                    obj = aVar.p(wuVar.v, true, this);
                    if (obj == p81) {
                        return p81;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                    }
                    if (wuVar.B) {
                    }
                } else if (i3 == 1) {
                    o85.q(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        ms3 ms33 = (ms3) cf42.z;
                        String str3 = (String) cf42.y;
                        if (ms33.a(ub42)) {
                            ms33.b(ub42, str3, (Throwable) null, "Successfully loaded session from storage!");
                        }
                    } else {
                        ms3 ms34 = (ms3) cf42.z;
                        String str4 = (String) cf42.y;
                        if (ms34.a(ub42)) {
                            ms34.b(ub42, str4, (Throwable) null, "No session found in storage.");
                        }
                    }
                    if (wuVar.B) {
                        this.B = 2;
                        b35.x(aVar);
                        if (vs7 == p81) {
                            return p81;
                        }
                    }
                } else if (i3 == 2) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7;
            default:
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    b35.x(aVar);
                    if (vs7 == p81) {
                        return p81;
                    }
                } else if (i4 == 1) {
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return vs7;
        }
    }
}
