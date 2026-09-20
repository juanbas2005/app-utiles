package defpackage;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.concurrent.Executor;

/* renamed from: ul1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class ul1 implements xv0 {
    public final /* synthetic */ int w;
    public final /* synthetic */ av5 x;

    public /* synthetic */ ul1(av5 av5, int i) {
        this.w = i;
        this.x = av5;
    }

    public final Object d(kd6 kd6) {
        int i = this.w;
        av5 av5 = this.x;
        switch (i) {
            case b85.b:
                return new wl1((Context) kd6.a(Context.class), ((oe2) kd6.a(oe2.class)).d(), kd6.d(av5.a(hz2.class)), kd6.h(ho1.class), (Executor) kd6.s(av5));
            case 1:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(av5, kd6);
            case 2:
                return FirebasePerfRegistrar.lambda$getComponents$0(av5, kd6);
            default:
                return RemoteConfigRegistrar.lambda$getComponents$0(av5, kd6);
        }
    }
}
