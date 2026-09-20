package cu.lestebang.utiletecsa.core.room.data;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcu/lestebang/utiletecsa/core/room/data/JetpackDatabase_Impl;", "Lcu/lestebang/utiletecsa/core/room/data/JetpackDatabase;", "<init>", "()V", "room"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class JetpackDatabase_Impl extends JetpackDatabase {
    public final z97 l = new z97(new yk3(this, 0));
    public final z97 m = new z97(new yk3(this, 1));
    public final z97 n = new z97(new yk3(this, 2));
    public final z97 o = new z97(new yk3(this, 3));
    public final z97 p = new z97(new yk3(this, 4));

    public final List c(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    public final eh3 d() {
        return new eh3(this, new LinkedHashMap(), new LinkedHashMap(), "jetpacks", "ussd_codes", "ussd_responses", "transfer_recipients", "nauta_accounts");
    }

    public final t22 e() {
        return new zk3(this);
    }

    public final Set i() {
        return new LinkedHashSet();
    }

    public final LinkedHashMap j() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c26 c26 = b26.a;
        gq3 b = c26.b(xk3.class);
        a42 a42 = a42.w;
        linkedHashMap.put(b, a42);
        linkedHashMap.put(c26.b(xy7.class), a42);
        linkedHashMap.put(c26.b(oz7.class), a42);
        linkedHashMap.put(c26.b(ml7.class), a42);
        linkedHashMap.put(c26.b(fr4.class), a42);
        return linkedHashMap;
    }

    public final xk3 r() {
        return (xk3) this.l.getValue();
    }

    public final fr4 s() {
        return (fr4) this.p.getValue();
    }

    public final ml7 t() {
        return (ml7) this.o.getValue();
    }

    public final xy7 u() {
        return (xy7) this.m.getValue();
    }

    public final oz7 v() {
        return (oz7) this.n.getValue();
    }
}
