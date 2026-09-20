package defpackage;

import java.util.List;

/* renamed from: w71  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class w71 implements vr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ x71 x;

    public /* synthetic */ w71(x71 x71, ok6 ok6) {
        this.w = 3;
        this.x = x71;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final Object y(Object obj) {
        int i = this.w;
        CharSequence charSequence = null;
        boolean z = true;
        x71 x71 = this.x;
        switch (i) {
            case b85.b:
                ag agVar = (ag) obj;
                ed5 ed5 = x71.O.t;
                Boolean bool = Boolean.TRUE;
                ed5.setValue(bool);
                x71.O.s.setValue(bool);
                u44 u44 = x71.O;
                if (agVar.a.isText()) {
                    charSequence = agVar.a.getTextValue();
                }
                charSequence.getClass();
                x71.Y0(u44, (String) charSequence, x71.P, x71.Q);
                return bool;
            case 1:
                List list = (List) obj;
                if (x71.O.d() != null) {
                    cg7 d = x71.O.d();
                    d.getClass();
                    list.add(d.a);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                x71.Y0(x71.O, ((vl) obj).x, x71.P, x71.Q);
                return Boolean.TRUE;
            default:
                vl vlVar = (vl) obj;
                if (x71.P || !x71.Q) {
                    z = false;
                } else {
                    vf7 vf7 = x71.O.e;
                    if (vf7 != null) {
                        List E = sg3.E(new Object(), new ou0(vlVar, 1));
                        u44 u442 = x71.O;
                        jz0 jz0 = u442.d;
                        j71 j71 = u442.v;
                        hf7 h = jz0.h(E);
                        vf7.a((hf7) null, h);
                        j71.y(h);
                    } else {
                        hf7 hf7 = x71.N;
                        String str = hf7.a.x;
                        long j = hf7.b;
                        int i2 = lg7.c;
                        int i3 = (int) (j >> 32);
                        int i4 = (int) (j & 4294967295L);
                        str.getClass();
                        vlVar.getClass();
                        if (i4 >= i3) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str, 0, i3);
                            sb.append(vlVar);
                            sb.append(str, i4, str.length());
                            charSequence = sb;
                        } else {
                            h.l(pb4.k("End index (", i4, ") is less than start index (", i3, ")."));
                        }
                        String obj2 = charSequence.toString();
                        int length = vlVar.x.length() + ((int) (x71.N.b >> 32));
                        x71.O.v.y(new hf7(4, i95.a(length, length), obj2));
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ w71(x71 x71, int i) {
        this.w = i;
        this.x = x71;
    }
}
