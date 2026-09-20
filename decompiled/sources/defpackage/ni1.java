package defpackage;

import kotlinx.datetime.YearMonth;

/* renamed from: ni1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ni1 extends d1 {
    public final /* synthetic */ int a;
    public final lh0 b;

    public /* synthetic */ ni1(lh0 lh0, int i) {
        this.a = i;
        this.b = lh0;
    }

    public final lh0 a() {
        int i = this.a;
        return this.b;
    }

    public final d71 b() {
        switch (this.a) {
            case b85.b:
                return pi1.a;
            default:
                return rf8.a;
        }
    }

    public final Object d(d71 d71) {
        switch (this.a) {
            case b85.b:
                li1 li1 = (li1) d71;
                li1.getClass();
                return new ki1(li1);
            default:
                ga3 ga3 = (ga3) d71;
                ga3.getClass();
                Integer num = ga3.a;
                rf8.a("year", num);
                int intValue = num.intValue();
                Integer num2 = ga3.b;
                rf8.a("monthNumber", num2);
                return new YearMonth(intValue, num2.intValue());
        }
    }
}
