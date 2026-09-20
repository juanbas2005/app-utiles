package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: on3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class on3 {
    public static final up2 a;
    public static final up2 b;
    public static final up2 c;
    public static final up2 d = new up2("javax.annotation.meta.TypeQualifier");
    public static final up2 e = new up2("javax.annotation.meta.TypeQualifierNickname");
    public static final up2 f = new up2("javax.annotation.meta.TypeQualifierDefault");
    public static final up2 g;
    public static final up2 h = new up2("javax.annotation.ParametersAreNonnullByDefault");
    public static final up2 i = new up2("javax.annotation.ParametersAreNullableByDefault");
    public static final Set j;
    public static final Set k;
    public static final Set l;
    public static final Set m;
    public static final Set n = qs.r1(new up2[]{nn3.k, nn3.n, nn3.l, nn3.m});
    public static final Set o = qs.r1(new up2[]{nn3.j, nn3.o});
    public static final up2 p = new up2("kotlin.annotations.jvm.UnderMigration");

    static {
        up2 up2 = new up2("org.jspecify.nullness.Nullable");
        up2 up22 = new up2("org.jspecify.nullness.NullMarked");
        a = up22;
        up2 up23 = new up2("org.jspecify.nullness.NullnessUnspecified");
        up2 up24 = new up2("org.jspecify.annotations.NonNull");
        up2 up25 = new up2("org.jspecify.annotations.Nullable");
        up2 up26 = new up2("org.jspecify.annotations.NullMarked");
        b = up26;
        up2 up27 = new up2("org.jspecify.annotations.NullnessUnspecified");
        up2 up28 = new up2("org.jspecify.annotations.NullUnmarked");
        c = up28;
        up2 up29 = new up2("javax.annotation.Nonnull");
        g = up29;
        up2 up210 = new up2("javax.annotation.Nullable");
        up2 up211 = new up2("javax.annotation.CheckForNull");
        j = qs.r1(new up2[]{up29, up211});
        up2 up212 = up26;
        up2 up213 = nn3.h;
        up213.getClass();
        up2 up214 = up27;
        up2 up215 = up28;
        up2 up216 = up29;
        up2 up217 = up210;
        up2 up218 = up23;
        up2 up219 = up211;
        up2 up220 = up212;
        up2 up221 = up214;
        up2 up222 = up215;
        up2 up223 = up216;
        up2 up224 = up217;
        up2 up225 = up2;
        up2 up226 = up223;
        up2 up227 = up22;
        up2 up228 = up226;
        up2 up229 = up221;
        up2 up230 = up222;
        up2 up231 = up219;
        Set r1 = qs.r1(new up2[]{up213, up24, new up2("android.annotation.NonNull"), new up2("androidx.annotation.NonNull"), new up2("androidx.annotation.RecentlyNonNull"), new up2("android.support.annotation.NonNull"), new up2("com.android.annotations.NonNull"), new up2("org.checkerframework.checker.nullness.compatqual.NonNullDecl"), new up2("org.checkerframework.checker.nullness.qual.NonNull"), new up2("edu.umd.cs.findbugs.annotations.NonNull"), new up2("io.reactivex.annotations.NonNull"), new up2("io.reactivex.rxjava3.annotations.NonNull"), new up2("org.eclipse.jdt.annotation.NonNull"), new up2("lombok.NonNull"), new up2("jakarta.annotation.Nonnull")});
        k = r1;
        up2 up232 = up220;
        up2 up233 = nn3.i;
        up233.getClass();
        up2 up234 = new up2("android.annotation.Nullable");
        up2 up235 = new up2("androidx.annotation.Nullable");
        up2 up236 = new up2("androidx.annotation.RecentlyNullable");
        up2 up237 = new up2("android.support.annotation.Nullable");
        up2 up238 = new up2("com.android.annotations.Nullable");
        up2 up239 = new up2("org.checkerframework.checker.nullness.compatqual.NullableDecl");
        up2 up240 = new up2("org.checkerframework.checker.nullness.qual.Nullable");
        up2 up241 = new up2("edu.umd.cs.findbugs.annotations.Nullable");
        up2 up242 = new up2("edu.umd.cs.findbugs.annotations.PossiblyNull");
        up2 up243 = new up2("edu.umd.cs.findbugs.annotations.CheckForNull");
        up2 up244 = new up2("io.reactivex.annotations.Nullable");
        up2 up245 = new up2("io.reactivex.rxjava3.annotations.Nullable");
        up2 up246 = up228;
        up2 up247 = up232;
        up2 up248 = up218;
        up2 up249 = up245;
        up2 up250 = up231;
        up2 up251 = up233;
        up2 up252 = up244;
        up2 up253 = up224;
        Set r12 = qs.r1(new up2[]{up251, up225, up25, up253, up250, up234, up235, up236, up237, up238, up239, up240, up241, up242, up243, up252, up249, new up2("org.eclipse.jdt.annotation.Nullable"), new up2("jakarta.annotation.Nullable"), new up2("io.vertx.codegen.annotations.Nullable")});
        l = r12;
        m = qs.r1(new up2[]{up248, up229});
        wn6.p(wn6.p(wn6.p(wn6.p(wn6.o(wn6.o(new LinkedHashSet(), r1), r12), up246), up227), up247), up230);
        sf4.V(new yb5(nn3.c, m27.t), new yb5(nn3.d, m27.w), new yb5(nn3.e, m27.m), new yb5(nn3.f, m27.x));
    }
}
