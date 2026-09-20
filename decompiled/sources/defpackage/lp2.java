package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: lp2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lp2 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ np2 C;
    public final /* synthetic */ String D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lp2(np2 np2, String str, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = np2;
        this.D = str;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((lp2) o(f61, o81)).s(vs7);
            default:
                return ((lp2) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        String str = this.D;
        np2 np2 = this.C;
        switch (i) {
            case b85.b:
                return new lp2(np2, str, f61, 0);
            default:
                return new lp2(np2, str, f61, 1);
        }
    }

    public final Object s(Object obj) {
        Object obj2;
        Object value;
        is7 is7;
        mo2 mo2;
        LinkedHashMap linkedHashMap;
        int i = this.A;
        vs7 vs7 = vs7.a;
        String str = this.D;
        np2 np2 = this.C;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    sn2 sn2 = np2.b;
                    this.B = 1;
                    obj2 = ((lo2) sn2).o(str, this);
                    if (obj2 == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    o85.q(obj);
                    obj2 = ((o66) obj).w;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (!(obj2 instanceof m66)) {
                    np2.h(new bg1(str, (String) obj2, 1));
                }
                if (o66.a(obj2) == null) {
                    return vs7;
                }
                d37 d37 = np2.e;
                do {
                    value = d37.getValue();
                    is7 = (is7) value;
                    mo2 = (mo2) is7.a;
                    Map map = mo2.l;
                    map.getClass();
                    boolean isEmpty = map.isEmpty();
                    xl5 xl5 = xl5.a;
                    if (isEmpty) {
                        Map singletonMap = Collections.singletonMap(str, xl5);
                        singletonMap.getClass();
                        linkedHashMap = singletonMap;
                    } else {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
                        linkedHashMap2.put(str, xl5);
                        linkedHashMap = linkedHashMap2;
                    }
                } while (!d37.i(value, is7.a(is7, mo2.a(mo2, (ArrayList) null, (List) null, (String) null, (String) null, false, false, (hv2) null, (String) null, (List) null, false, (Boolean) null, linkedHashMap, false, false, 14335), false, (hv2) null, 6)));
                return vs7;
            default:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    if (np2.e(np2, str, this) == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i3 == 1) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
        }
    }
}
