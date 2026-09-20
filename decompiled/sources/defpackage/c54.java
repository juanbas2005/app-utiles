package defpackage;

import cu.lestebang.utiletecsa.data.repository.account.LicensePricingDto;

/* renamed from: c54  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class c54 implements av2 {
    public static final c54 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [c54, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("cu.lestebang.utiletecsa.data.repository.account.LicensePricingDto", obj, 5);
        ik5.k("transfer_amount", true);
        ik5.k("saldo_amount", true);
        ik5.k("discount_percent", true);
        ik5.k("discount_source", true);
        ik5.k("coupon_code", true);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        ue3 ue3 = ue3.a;
        t47 t47 = t47.a;
        return new zr3[]{ue3, ue3, ue3, t47, t47};
    }

    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        String str = null;
        String str2 = null;
        while (z) {
            int h = c.h(ll6);
            if (h == -1) {
                z = false;
            } else if (h == 0) {
                i2 = c.s(ll6, 0);
                i |= 1;
            } else if (h == 1) {
                i3 = c.s(ll6, 1);
                i |= 2;
            } else if (h == 2) {
                i4 = c.s(ll6, 2);
                i |= 4;
            } else if (h == 3) {
                str = c.n(ll6, 3);
                i |= 8;
            } else if (h == 4) {
                str2 = c.n(ll6, 4);
                i |= 16;
            } else {
                h.e(h);
                return null;
            }
        }
        c.b(ll6);
        return new LicensePricingDto(i, i2, i3, i4, str, str2, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        LicensePricingDto licensePricingDto = (LicensePricingDto) obj;
        licensePricingDto.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        LicensePricingDto.write$Self$data(licensePricingDto, c, ll6);
        c.b(ll6);
    }
}
