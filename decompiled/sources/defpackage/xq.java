package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: xq  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class xq implements vq {
    private final WeakReference<vq> appStateCallback;
    private final wq appStateMonitor;
    private jr currentAppState = jr.x;
    private boolean isRegisteredForAppState = false;

    public xq(wq wqVar) {
        this.appStateMonitor = wqVar;
        this.appStateCallback = new WeakReference<>(this);
    }

    public jr getAppState() {
        return this.currentAppState;
    }

    public WeakReference<vq> getAppStateCallback() {
        return this.appStateCallback;
    }

    public void incrementTsnsCount(int i) {
        this.appStateMonitor.D.addAndGet(i);
    }

    public void onUpdateAppState(jr jrVar) {
        jr jrVar2 = this.currentAppState;
        jr jrVar3 = jr.x;
        if (jrVar2 == jrVar3) {
            this.currentAppState = jrVar;
        } else if (jrVar2 != jrVar && jrVar != jrVar3) {
            this.currentAppState = jr.A;
        }
    }

    public void registerForAppState() {
        if (!this.isRegisteredForAppState) {
            wq wqVar = this.appStateMonitor;
            this.currentAppState = wqVar.K;
            WeakReference<vq> weakReference = this.appStateCallback;
            synchronized (wqVar.B) {
                wqVar.B.add(weakReference);
            }
            this.isRegisteredForAppState = true;
        }
    }

    public void unregisterForAppState() {
        if (this.isRegisteredForAppState) {
            wq wqVar = this.appStateMonitor;
            WeakReference<vq> weakReference = this.appStateCallback;
            synchronized (wqVar.B) {
                wqVar.B.remove(weakReference);
            }
            this.isRegisteredForAppState = false;
        }
    }
}
