package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: w07  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w07 extends a97 implements gs2 {
    public d17 A;
    public String B;
    public String C;
    public int D;
    public final /* synthetic */ d17 E;
    public final /* synthetic */ String F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w07(d17 d17, String str, f61 f61) {
        super(2, f61);
        this.E = d17;
        this.F = str;
    }

    public final Object H(Object obj, Object obj2) {
        return ((w07) o((f61) obj2, (o81) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        return new w07(this.E, this.F, f61);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b8, code lost:
        if (r14.a(r6, r0, r7, r13) != r5) goto L_0x00bb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a0 A[Catch:{ CancellationException -> 0x00cb, Exception -> 0x00be }] */
    public final Object s(Object obj) {
        Object obj2;
        d17 d17;
        String str;
        String str2;
        boolean booleanValue;
        String str3;
        int i = this.D;
        p81 p81 = p81.w;
        if (i == 0) {
            o85.q(obj);
            d17 d172 = this.E;
            str3 = this.F;
            this.A = d172;
            this.B = str3;
            this.D = 1;
            Object a = d17.a(d172, this);
            if (a == p81) {
                return p81;
            }
            Object obj3 = a;
            d17 = d172;
            obj = obj3;
        } else if (i == 1) {
            str3 = this.B;
            d17 = this.A;
            o85.q(obj);
        } else if (i == 2) {
            str2 = this.C;
            str = this.B;
            d17 = this.A;
            o85.q(obj);
            booleanValue = ((Boolean) obj).booleanValue();
            hm5 i2 = f55.i(d17.a, "connection_spots");
            gm5 gm5 = i2.a;
            String str4 = i2.c;
            ku4 ku4 = gm5.c.v;
            mp1 mp1 = new mp1(str4, ku4, 0);
            mp1.e(i53.f);
            zc9 zc9 = new zc9(ku4, mp1.f, 4);
            str.getClass();
            xd2 xd2 = xd2.EQ;
            zc9.a("id", xd2, str);
            if (!booleanValue) {
                str2.getClass();
                zc9.a("device_id", xd2, str2);
            }
            h66 h66 = h66.a;
            String str5 = i2.b;
            this.A = null;
            this.B = null;
            this.C = null;
            this.D = 3;
        } else if (i == 3) {
            w07 w07 = (w07) this.C;
            f61 f61 = (f61) this.A;
            try {
                o85.q(obj);
                obj2 = vs7.a;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                obj2 = new m66(e2);
            }
            return new o66(obj2);
        } else {
            h.s("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        String str6 = (String) obj;
        this.A = d17;
        this.B = str3;
        this.C = str6;
        this.D = 2;
        Object e0 = ar7.e0(d17.c, new k05((Object) d17, (f61) null, 21), this);
        if (e0 == p81) {
            return p81;
        }
        String str7 = str3;
        str2 = str6;
        obj = e0;
        str = str7;
        booleanValue = ((Boolean) obj).booleanValue();
        hm5 i22 = f55.i(d17.a, "connection_spots");
        gm5 gm52 = i22.a;
        String str42 = i22.c;
        ku4 ku42 = gm52.c.v;
        mp1 mp12 = new mp1(str42, ku42, 0);
        mp12.e(i53.f);
        zc9 zc92 = new zc9(ku42, mp12.f, 4);
        str.getClass();
        xd2 xd22 = xd2.EQ;
        zc92.a("id", xd22, str);
        if (!booleanValue) {
        }
        h66 h662 = h66.a;
        String str52 = i22.b;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = 3;
    }
}
