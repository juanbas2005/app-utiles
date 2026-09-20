package defpackage;

import dev.whyoleg.cryptography.serialization.asn1.modules.EcParameters;

/* renamed from: yk1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class yk1 extends ct2 implements vr2 {
    public static final yk1 D = new ct2(1, k12.class, "<init>", "<init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", 0);

    public final Object y(Object obj) {
        String str;
        EcParameters ecParameters = (EcParameters) obj;
        if (ecParameters != null) {
            str = ecParameters.m34unboximpl();
        } else {
            str = null;
        }
        return new k12(str);
    }
}
