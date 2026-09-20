package defpackage;

/* renamed from: mj3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class mj3 {
    public static final up2 a;
    public static final up2[] b;
    public static final hv2 c;
    public static final nj3 d;

    static {
        up2 up2 = new up2("org.jspecify.nullness");
        up2 up22 = new up2("org.jspecify.annotations");
        a = up22;
        up2 up23 = new up2("io.reactivex.rxjava3.annotations");
        up2 up24 = new up2("org.checkerframework.checker.nullness.compatqual");
        String str = up23.a.a;
        b = new up2[]{new up2(b81.n(str, ".Nullable")), new up2(b81.n(str, ".NonNull"))};
        up2 up25 = new up2("org.jetbrains.annotations");
        nj3 nj3 = nj3.d;
        yb5 yb5 = new yb5(up25, nj3);
        yb5 yb52 = new yb5(new up2("kotlin.annotations.jvm"), nj3);
        yb5 yb53 = new yb5(new up2("androidx.annotation"), nj3);
        yb5 yb54 = new yb5(new up2("android.support.annotation"), nj3);
        yb5 yb55 = new yb5(new up2("android.annotation"), nj3);
        yb5 yb56 = new yb5(new up2("com.android.annotations"), nj3);
        yb5 yb57 = new yb5(new up2("org.eclipse.jdt.annotation"), nj3);
        yb5 yb58 = new yb5(new up2("org.checkerframework.checker.nullness.qual"), nj3);
        yb5 yb59 = new yb5(up24, nj3);
        yb5 yb510 = new yb5(new up2("javax.annotation"), nj3);
        yb5 yb511 = new yb5(new up2("edu.umd.cs.findbugs.annotations"), nj3);
        yb5 yb512 = new yb5(new up2("io.reactivex.annotations"), nj3);
        up2 up26 = new up2("androidx.annotation.RecentlyNullable");
        x46 x46 = x46.WARN;
        yb5 yb513 = yb5;
        yb5 yb514 = new yb5(up26, new nj3(x46, 4));
        yb5 yb515 = new yb5(new up2("androidx.annotation.RecentlyNonNull"), new nj3(x46, 4));
        yb5 yb516 = new yb5(new up2("lombok"), nj3);
        yb5 yb517 = yb515;
        cx3 cx3 = new cx3(2, 1, 0);
        x46 x462 = x46.STRICT;
        yb5 yb518 = new yb5(up2, new nj3(x46, cx3, x462));
        yb5 yb519 = new yb5(up22, new nj3(x46, new cx3(2, 1, 0), x462));
        yb5 yb520 = new yb5(up23, new nj3(x46, new cx3(1, 8, 0), x462));
        yb5 yb521 = new yb5(new up2("jakarta.annotation"), new nj3(x46, new cx3(2, 4, 0), x462));
        yb5 yb522 = new yb5(nn3.l, new nj3(x46, new cx3(2, 5, 0), x462));
        yb5 yb523 = yb521;
        yb5 yb524 = yb518;
        yb5 yb525 = yb522;
        yb5 yb526 = yb52;
        yb5 yb527 = yb520;
        yb5 yb528 = yb517;
        yb5 yb529 = yb519;
        yb5 yb530 = new yb5(nn3.m, new nj3(x46, new cx3(2, 5, 0), x462));
        c = new hv2(sf4.V(yb513, yb526, yb53, yb54, yb55, yb56, yb57, yb58, yb59, yb510, yb511, yb512, yb514, yb528, yb516, yb524, yb529, yb527, yb523, yb525, yb530, new yb5(new up2("io.vertx.codegen.annotations"), new nj3(x46, new cx3(2, 5, 0), x462))));
        d = new nj3(x46, 4);
    }
}
