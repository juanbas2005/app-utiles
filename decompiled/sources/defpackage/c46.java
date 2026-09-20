package defpackage;

import com.google.firebase.perf.config.RemoteConfigManager;

/* renamed from: c46  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class c46 implements k55, c55 {
    public final /* synthetic */ RemoteConfigManager w;

    public /* synthetic */ c46(RemoteConfigManager remoteConfigManager) {
        this.w = remoteConfigManager;
    }

    public void g(Object obj) {
        this.w.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0((Boolean) obj);
    }

    public void j(Exception exc) {
        this.w.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(exc);
    }
}
