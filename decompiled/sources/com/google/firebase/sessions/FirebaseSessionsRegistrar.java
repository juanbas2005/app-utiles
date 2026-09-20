package com.google.firebase.sessions;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\b\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lgv0;", "", "kotlin.jvm.PlatformType", "getComponents", "()Ljava/util/List;", "Companion", "ag2", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final ag2 Companion = new Object();
    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    /* access modifiers changed from: private */
    public static final av5 appContext = av5.a(Context.class);
    /* access modifiers changed from: private */
    public static final av5 backgroundDispatcher;
    /* access modifiers changed from: private */
    public static final av5 blockingDispatcher;
    /* access modifiers changed from: private */
    public static final av5 firebaseApp = av5.a(oe2.class);
    /* access modifiers changed from: private */
    public static final av5 firebaseInstallationsApi = av5.a(we2.class);
    /* access modifiers changed from: private */
    public static final av5 firebaseSessionsComponent = av5.a(tf2.class);
    /* access modifiers changed from: private */
    public static final av5 transportFactory = av5.a(cn7.class);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, ag2] */
    static {
        Class<h81> cls = h81.class;
        backgroundDispatcher = new av5(t30.class, cls);
        blockingDispatcher = new av5(x90.class, cls);
    }

    /* access modifiers changed from: private */
    public static final sf2 getComponents$lambda$0(tv0 tv0) {
        return (sf2) ((yd1) ((tf2) tv0.s(firebaseSessionsComponent))).p.get();
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [tf2, yd1, java.lang.Object] */
    /* access modifiers changed from: private */
    public static final tf2 getComponents$lambda$1(tv0 tv0) {
        Object s = tv0.s(appContext);
        s.getClass();
        Object s2 = tv0.s(backgroundDispatcher);
        s2.getClass();
        Object s3 = tv0.s(blockingDispatcher);
        s3.getClass();
        Object s4 = tv0.s(firebaseApp);
        s4.getClass();
        Object s5 = tv0.s(firebaseInstallationsApi);
        s5.getClass();
        nu5 r = tv0.r(transportFactory);
        r.getClass();
        ? obj = new Object();
        obj.a = om6.a((oe2) s4);
        om6 a = om6.a((Context) s);
        obj.b = a;
        obj.c = bx1.a(new d72(a, 2));
        obj.d = bx1.a(rd3.i);
        obj.e = om6.a((we2) s5);
        obj.f = bx1.a(new d72(obj.a, 1));
        om6 a2 = om6.a((e81) s3);
        obj.g = a2;
        obj.h = bx1.a(new uf2(obj.f, a2));
        obj.i = om6.a((e81) s2);
        obj.j = bx1.a(new xm6(obj.c, bx1.a(new h46(obj.d, (ku5) obj.e, obj.f, obj.h, bx1.a(new vf2((ku5) obj.i, obj.d, bx1.a(new uf2(obj.b, obj.g, 0)))))), 1));
        ku5 a3 = bx1.a(rg3.f);
        obj.k = a3;
        obj.l = bx1.a(new xm6(obj.d, a3, 0));
        obj.m = bx1.a(new h46(obj.a, (ku5) obj.e, obj.j, bx1.a(new d72(om6.a(r), 0)), (ku5) obj.i));
        obj.n = bx1.a(new vf2(obj.b, (ku5) obj.g, bx1.a(new om6(0, obj.l))));
        ku5 a4 = bx1.a(new fs6(obj.j, obj.l, obj.m, obj.d, obj.n, bx1.a(new uf2(obj.b, obj.k, 1)), obj.i));
        obj.o = a4;
        obj.p = bx1.a(new bg2(obj.a, obj.j, obj.i, bx1.a(new om6(1, a4))));
        return obj;
    }

    public List<gv0> getComponents() {
        fv0 b = gv0.b(sf2.class);
        b.a = LIBRARY_NAME;
        b.a(zp1.b(firebaseSessionsComponent));
        b.g = new rf2(1);
        b.c(2);
        gv0 b2 = b.b();
        fv0 b3 = gv0.b(tf2.class);
        b3.a = "fire-sessions-component";
        b3.a(zp1.b(appContext));
        b3.a(zp1.b(backgroundDispatcher));
        b3.a(zp1.b(blockingDispatcher));
        b3.a(zp1.b(firebaseApp));
        b3.a(zp1.b(firebaseInstallationsApi));
        b3.a(new zp1(transportFactory, 1, 1));
        b3.g = new rf2(2);
        return sg3.E(b2, b3.b(), gw8.q(LIBRARY_NAME, "3.0.6"));
    }
}
