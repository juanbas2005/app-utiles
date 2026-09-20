package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: r83  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class r83 {
    public final Context a;
    public bn1 b;
    public Object c;
    public tb7 d;
    public qm5 e;
    public mk1 f;
    public final List g;
    public cm7 h;
    public final zy2 i;
    public final LinkedHashMap j;
    public final boolean k;
    public final boolean l;
    public final be1 m;
    public av6 n;
    public wf6 o;
    public in8 p;
    public av6 q;
    public wf6 r;

    public r83(s83 s83, Context context) {
        this.a = context;
        this.b = s83.A;
        this.c = s83.b;
        this.d = s83.c;
        po1 po1 = s83.z;
        this.e = po1.d;
        this.f = s83.f;
        this.g = s83.g;
        this.h = po1.c;
        this.i = s83.i.k();
        Map map = s83.j.a;
        map.getClass();
        this.j = new LinkedHashMap(map);
        this.k = s83.k;
        this.l = s83.n;
        this.m = new be1(s83.y);
        this.n = po1.a;
        this.o = po1.b;
        if (s83.a == context) {
            this.p = s83.v;
            this.q = s83.w;
            this.r = s83.x;
            return;
        }
        this.p = null;
        this.q = null;
        this.r = null;
    }

    public final s83 a() {
        bz2 bz2;
        hb7 hb7;
        av6 av6;
        vc5 vc5;
        g68 g68;
        Object obj = this.c;
        if (obj == null) {
            obj = me6.H;
        }
        Object obj2 = obj;
        tb7 tb7 = this.d;
        bn1 bn1 = this.b;
        Bitmap.Config config = bn1.g;
        qm5 qm5 = this.e;
        if (qm5 == null) {
            qm5 = bn1.f;
        }
        qm5 qm52 = qm5;
        mk1 mk1 = this.f;
        cm7 cm7 = this.h;
        if (cm7 == null) {
            cm7 = bn1.e;
        }
        cm7 cm72 = cm7;
        zy2 zy2 = this.i;
        if (zy2 != null) {
            bz2 = zy2.a();
        } else {
            bz2 = null;
        }
        if (bz2 == null) {
            bz2 = i.c;
        } else {
            Bitmap.Config[] configArr = i.a;
        }
        bz2 bz22 = bz2;
        LinkedHashMap linkedHashMap = this.j;
        if (linkedHashMap != null) {
            hb7 = new hb7(tf4.Q(linkedHashMap));
        } else {
            hb7 = null;
        }
        if (hb7 == null) {
            hb7 = hb7.b;
        }
        hb7 hb72 = hb7;
        bn1 bn12 = this.b;
        boolean z = bn12.h;
        bn12.getClass();
        bn1 bn13 = this.b;
        eh0 eh0 = bn13.i;
        eh0 eh02 = bn13.j;
        eh0 eh03 = bn13.k;
        h81 h81 = bn13.a;
        h81 h812 = bn13.b;
        h81 h813 = bn13.c;
        h81 h814 = bn13.d;
        h81 h815 = h813;
        in8 in8 = this.p;
        eh0 eh04 = eh0;
        Context context = this.a;
        h81 h816 = h814;
        if (in8 == null) {
            Context context2 = context;
            while (true) {
                if (context2 instanceof t54) {
                    in8 = ((t54) context2).k();
                    break;
                } else if (!(context2 instanceof ContextWrapper)) {
                    in8 = null;
                    break;
                } else {
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            if (in8 == null) {
                in8 = yv2.x;
            }
        }
        in8 in82 = in8;
        av6 av62 = this.n;
        if (av62 == null) {
            av6 av63 = this.q;
            if (av63 == null) {
                av63 = new fw1(context);
            }
            av6 = av63;
        } else {
            av6 = av62;
        }
        wf6 wf6 = this.o;
        if (wf6 == null && (wf6 = this.r) == null) {
            if (av62 instanceof g68) {
                g68 = (g68) av62;
            } else {
                g68 = null;
            }
            if (g68 == null) {
                wf6 = wf6.x;
            } else {
                throw null;
            }
        }
        wf6 wf62 = wf6;
        be1 be1 = this.m;
        if (be1 != null) {
            vc5 = new vc5(tf4.Q(be1.a));
        } else {
            vc5 = null;
        }
        if (vc5 == null) {
            vc5 = vc5.x;
        }
        return new s83(context, obj2, tb7, config, qm52, mk1, this.g, cm72, bz22, hb72, this.k, z, false, this.l, eh04, eh02, eh03, h81, h812, h815, h816, in82, av6, wf62, vc5, new po1(this.n, this.o, this.h, this.e), this.b);
    }

    public r83(Context context) {
        this.a = context;
        this.b = g.a;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = a42.w;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = true;
        this.l = true;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
    }
}
