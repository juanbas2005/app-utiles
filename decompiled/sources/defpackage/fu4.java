package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: fu4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fu4 extends rt4 {
    public final ox4 g;
    public final gq3 h;
    public final Object i;
    public final ArrayList j = new ArrayList();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fu4(ox4 ox4, gq3 gq3, Map map) {
        super(ox4.b(tf4.A(hu4.class)), (gq3) null, map);
        ox4.getClass();
        gq3.getClass();
        map.getClass();
        this.g = ox4;
        this.h = gq3;
    }

    /* renamed from: i */
    public final eu4 a() {
        eu4 eu4 = (eu4) super.a();
        ArrayList arrayList = this.j;
        arrayList.getClass();
        r14 r14 = eu4.B;
        r14.getClass();
        eu4 eu42 = (eu4) r14.x;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qt4 qt4 = (qt4) it.next();
            if (qt4 != null) {
                cz6 cz6 = (cz6) r14.y;
                ao aoVar = eu42.x;
                ao aoVar2 = qt4.x;
                int i2 = aoVar2.a;
                String str = (String) aoVar2.e;
                if (i2 == 0 && str == null) {
                    h.q("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                    return null;
                }
                String str2 = (String) aoVar.e;
                if (str2 != null && sg3.e(str, str2)) {
                    ku4.y("Destination ", qt4, " cannot have the same route as graph ", eu42);
                    return null;
                } else if (i2 != aoVar.a) {
                    qt4 qt42 = (qt4) cz6.c(i2);
                    if (qt42 == qt4) {
                        continue;
                    } else if (qt4.y == null) {
                        if (qt42 != null) {
                            qt42.y = null;
                        }
                        qt4.y = eu42;
                        cz6.e(aoVar2.a, qt4);
                    } else {
                        h.s("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                        return null;
                    }
                } else {
                    ku4.y("Destination ", qt4, " cannot have the same id as graph ", eu42);
                    return null;
                }
            }
        }
        Object obj = this.i;
        gq3 gq3 = this.h;
        if (gq3 == null && obj == null) {
            if (this.a != null) {
                h.s("You must set a start destination route");
                return null;
            }
            h.s("You must set a start destination id");
            return null;
        } else if (gq3 != null) {
            zr3 D = i95.D(gq3);
            int m = b35.m(D);
            qt4 a = r14.a(m);
            if (a != null) {
                String str3 = (String) a.x.e;
                str3.getClass();
                r14.f(str3);
                r14.w = m;
                return eu4;
            }
            h.p(D.getDescriptor().a(), " from NavGraph. Ensure the starting NavDestination was added with route from KClass.", "Cannot find startDestination ");
            return null;
        } else if (obj != null) {
            zr3 D2 = i95.D(b26.a.b(obj.getClass()));
            g34 g34 = new g34(1, obj);
            int m2 = b35.m(D2);
            qt4 a2 = r14.a(m2);
            if (a2 != null) {
                r14.f((String) g34.y(a2));
                r14.w = m2;
            } else {
                h.p(D2.getDescriptor().a(), " from NavGraph. Ensure the starting NavDestination was added with route from KClass.", "Cannot find startDestination ");
            }
            return eu4;
        } else if (eu42.x.a != 0) {
            if (((String) r14.A) != null) {
                r14.f((String) null);
            }
            r14.w = 0;
            r14.z = null;
            return eu4;
        } else {
            rf2.j("Start destination 0 cannot use the same id as the graph ", eu42);
            return null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fu4(ox4 ox4, Object obj, gq3 gq3) {
        super(ox4.b(tf4.A(hu4.class)), gq3, b42.w);
        ox4.getClass();
        obj.getClass();
        this.g = ox4;
        this.i = obj;
    }
}
