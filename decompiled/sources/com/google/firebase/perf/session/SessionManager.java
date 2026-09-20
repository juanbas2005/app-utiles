package com.google.firebase.perf.session;

import android.content.Context;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class SessionManager extends xq {
    private static final SessionManager instance = new SessionManager();
    private final wq appStateMonitor;
    private final Set<WeakReference<hm6>> clients;
    private final GaugeManager gaugeManager;
    private sf5 perfSession;
    private Future syncInitFuture;

    public SessionManager(GaugeManager gaugeManager2, sf5 sf5, wq wqVar) {
        super(wq.a());
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager2;
        this.perfSession = sf5;
        this.appStateMonitor = wqVar;
        registerForAppState();
    }

    public static SessionManager getInstance() {
        return instance;
    }

    /* access modifiers changed from: private */
    public void lambda$setApplicationContext$0(Context context, sf5 sf5) {
        this.gaugeManager.initializeGaugeMetadataManager(context);
        if (sf5.y) {
            this.gaugeManager.logGaugeMetadata(sf5.w, jr.y);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(jr jrVar) {
        sf5 sf5 = this.perfSession;
        if (sf5.y) {
            this.gaugeManager.logGaugeMetadata(sf5.w, jrVar);
        }
    }

    private void startOrStopCollectingGauges(jr jrVar) {
        sf5 sf5 = this.perfSession;
        boolean z = sf5.y;
        GaugeManager gaugeManager2 = this.gaugeManager;
        if (z) {
            gaugeManager2.startCollectingGauges(sf5, jrVar);
        } else {
            gaugeManager2.stopCollectingGauges();
        }
    }

    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        jr jrVar = jr.y;
        logGaugeMetadataIfCollectionEnabled(jrVar);
        startOrStopCollectingGauges(jrVar);
    }

    public void onUpdateAppState(jr jrVar) {
        super.onUpdateAppState(jrVar);
        if (!this.appStateMonitor.M) {
            if (jrVar == jr.y) {
                updatePerfSession(sf5.c(UUID.randomUUID().toString()));
            } else if (this.perfSession.d()) {
                updatePerfSession(sf5.c(UUID.randomUUID().toString()));
            } else {
                startOrStopCollectingGauges(jrVar);
            }
        }
    }

    public final sf5 perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<hm6> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(Context context) {
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new ti(this, context, this.perfSession, 9));
    }

    public void setPerfSession(sf5 sf5) {
        this.perfSession = sf5;
    }

    public void stopGaugeCollectionIfSessionRunningTooLong() {
        if (this.perfSession.d()) {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public void unregisterForSessionUpdates(WeakReference<hm6> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(sf5 sf5) {
        if (sf5.w != this.perfSession.w) {
            this.perfSession = sf5;
            synchronized (this.clients) {
                try {
                    Iterator<WeakReference<hm6>> it = this.clients.iterator();
                    while (it.hasNext()) {
                        hm6 hm6 = (hm6) it.next().get();
                        if (hm6 != null) {
                            hm6.a(sf5);
                        } else {
                            it.remove();
                        }
                    }
                } finally {
                    while (true) {
                    }
                }
            }
            logGaugeMetadataIfCollectionEnabled(this.appStateMonitor.K);
            startOrStopCollectingGauges(this.appStateMonitor.K);
        }
    }

    private SessionManager() {
        this(GaugeManager.getInstance(), sf5.c(UUID.randomUUID().toString()), wq.a());
    }
}
