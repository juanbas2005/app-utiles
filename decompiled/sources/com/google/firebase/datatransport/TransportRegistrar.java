package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public List<gv0> getComponents() {
        Class<cn7> cls = cn7.class;
        fv0 b = gv0.b(cls);
        b.a = LIBRARY_NAME;
        Class<Context> cls2 = Context.class;
        b.a(zp1.c(cls2));
        b.g = new kj6(17);
        gv0 b2 = b.b();
        fv0 a = gv0.a(new av5(w44.class, cls));
        a.a(zp1.c(cls2));
        a.g = new kj6(18);
        gv0 b3 = a.b();
        fv0 a2 = gv0.a(new av5(an7.class, cls));
        a2.a(zp1.c(cls2));
        a2.g = new kj6(19);
        return Arrays.asList(new gv0[]{b2, b3, a2.b(), gw8.q(LIBRARY_NAME, "19.0.0")});
    }
}
