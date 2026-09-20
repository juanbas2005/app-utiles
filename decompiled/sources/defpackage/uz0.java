package defpackage;

import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.firebase.FirebaseException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: uz0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class uz0 implements g61, c55 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ uz0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.w = obj;
        this.x = obj2;
        this.y = obj3;
        this.z = obj4;
        this.A = obj5;
    }

    public Object c(yb9 yb9) {
        wz0 wz0 = (wz0) this.w;
        yb9 yb92 = (yb9) this.x;
        yb9 yb93 = (yb9) this.y;
        Date date = (Date) this.z;
        HashMap hashMap = (HashMap) this.A;
        if (!yb92.k()) {
            return b35.k(new FirebaseException("Firebase Installations failed to get installation ID for fetch.", yb92.h()));
        }
        if (!yb93.k()) {
            return b35.k(new FirebaseException("Firebase Installations failed to get installation auth token for fetch.", yb93.h()));
        }
        try {
            vz0 a = wz0.a((String) yb92.i(), ((x00) yb93.i()).a, date, hashMap);
            if (a.a != 0) {
                return b35.l(a);
            }
            qz0 qz0 = (qz0) wz0.e;
            sz0 sz0 = a.b;
            Executor executor = qz0.a;
            return b35.d(executor, new pz0(0, qz0, sz0)).l(executor, new yv0(1, (Object) qz0, (Object) sz0)).l((Executor) wz0.c, new c9(2, a));
        } catch (FirebaseRemoteConfigException e) {
            return b35.k(e);
        }
    }

    public void j(Exception exc) {
        nv2 nv2 = (nv2) this.w;
        mv2 mv2 = (mv2) this.x;
        lb1 lb1 = (lb1) this.y;
        Executor executor = (Executor) this.z;
        CancellationSignal cancellationSignal = (CancellationSignal) this.A;
        CredentialProviderPlayServicesImpl.Companion.getClass();
        nv2.getClass();
        for (pv2 pv2 : nv2.a) {
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new rb1(mv2.c).e(nv2, cancellationSignal, executor, lb1);
    }
}
