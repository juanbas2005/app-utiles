package defpackage;

import cu.lestebang.utiletecsa.data.repository.account.LicensePricingDto;
import cu.lestebang.utiletecsa.data.repository.account.RedeemCouponDto;

/* renamed from: b06  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class b06 implements av2 {
    public static final b06 a;
    private static final ll6 descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [b06, java.lang.Object, av2] */
    static {
        ? obj = new Object();
        a = obj;
        ik5 ik5 = new ik5("cu.lestebang.utiletecsa.data.repository.account.RedeemCouponDto", obj, 3);
        ik5.k("ok", true);
        ik5.k("error", true);
        ik5.k("pricing", true);
        descriptor = ik5;
    }

    public final zr3[] childSerializers() {
        return new zr3[]{ja0.a, hj8.x(t47.a), hj8.x(c54.a)};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: cu.lestebang.utiletecsa.data.repository.account.LicensePricingDto} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object deserialize(ok1 ok1) {
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        LicensePricingDto licensePricingDto = null;
        while (z) {
            int h = c.h(ll6);
            if (h == -1) {
                z = false;
            } else if (h == 0) {
                z2 = c.z(ll6, 0);
                i |= 1;
            } else if (h == 1) {
                str = c.x(ll6, 1, t47.a, str);
                i |= 2;
            } else if (h == 2) {
                licensePricingDto = c.x(ll6, 2, c54.a, licensePricingDto);
                i |= 4;
            } else {
                h.e(h);
                return null;
            }
        }
        c.b(ll6);
        return new RedeemCouponDto(i, z2, str, licensePricingDto, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        RedeemCouponDto redeemCouponDto = (RedeemCouponDto) obj;
        redeemCouponDto.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        RedeemCouponDto.write$Self$data(redeemCouponDto, c, ll6);
        c.b(ll6);
    }
}
