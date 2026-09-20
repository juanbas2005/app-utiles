package defpackage;

/* renamed from: pi8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pi8 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ String x;
    public final /* synthetic */ long y;
    public final /* synthetic */ ev8 z;

    public /* synthetic */ pi8(ev8 ev8, String str, long j, int i) {
        this.w = i;
        this.x = str;
        this.y = j;
        this.z = ev8;
    }

    public final void run() {
        int i = this.w;
        long j = this.y;
        String str = this.x;
        ev8 ev8 = this.z;
        switch (i) {
            case b85.b:
                ev8.b1();
                z65.h(str);
                js jsVar = ev8.y;
                if (jsVar.isEmpty()) {
                    ev8.z = j;
                }
                Integer num = (Integer) jsVar.get(str);
                if (num != null) {
                    jsVar.put(str, Integer.valueOf(num.intValue() + 1));
                    return;
                } else if (jsVar.y >= 100) {
                    pz8 pz8 = ((y19) ev8.w).B;
                    y19.g(pz8);
                    pz8.E.a("Too many ads visible");
                    return;
                } else {
                    jsVar.put(str, 1);
                    ev8.x.put(str, Long.valueOf(j));
                    return;
                }
            default:
                ev8.b1();
                z65.h(str);
                js jsVar2 = ev8.y;
                Integer num2 = (Integer) jsVar2.get(str);
                y19 y19 = (y19) ev8.w;
                if (num2 != null) {
                    l59 l59 = y19.H;
                    pz8 pz82 = y19.B;
                    y19.f(l59);
                    f59 g1 = l59.g1(false);
                    int intValue = num2.intValue() - 1;
                    if (intValue == 0) {
                        jsVar2.remove(str);
                        js jsVar3 = ev8.x;
                        Long l = (Long) jsVar3.get(str);
                        if (l == null) {
                            y19.g(pz82);
                            pz82.B.a("First ad unit exposure time was never set");
                        } else {
                            jsVar3.remove(str);
                            ev8.h1(str, j - l.longValue(), g1);
                        }
                        if (jsVar2.isEmpty()) {
                            long j2 = ev8.z;
                            if (j2 == 0) {
                                y19.g(pz82);
                                pz82.B.a("First ad exposure time was never set");
                                return;
                            }
                            ev8.g1(j - j2, g1);
                            ev8.z = 0;
                            return;
                        }
                        return;
                    }
                    jsVar2.put(str, Integer.valueOf(intValue));
                    return;
                }
                pz8 pz83 = y19.B;
                y19.g(pz83);
                pz83.B.b("Call to endAdUnitExposure for unknown ad unit id", str);
                return;
        }
    }
}
