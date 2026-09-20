package com.google.firebase.perf.config;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_CONFIG_FETCH_DELAY_MS = 25000;
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = 43200000;
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final rg logger = rg.d();
    private final ConcurrentHashMap<String, pf2> allRcConfigMap;
    private final zt1 cache;
    private final Executor executor;
    private nf2 firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private nu5 firebaseRemoteConfigProvider;
    private final long rcmInitTimestamp;
    private final long remoteConfigFetchDelayInMs;

    private RemoteConfigManager() {
        this(zt1.b(), new ThreadPoolExecutor(0, 1, FETCH_NEVER_HAPPENED_TIMESTAMP_MS, TimeUnit.SECONDS, new LinkedBlockingQueue()), (nf2) null, ((long) new Random().nextInt(RANDOM_CONFIG_FETCH_DELAY_MS)) + MIN_CONFIG_FETCH_DELAY_MS);
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private pf2 getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (!isFirebaseRemoteConfigAvailable() || !this.allRcConfigMap.containsKey(str)) {
            return null;
        }
        pf2 pf2 = this.allRcConfigMap.get(str);
        if (((qf2) pf2).b != 2) {
            return null;
        }
        logger.b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", ((qf2) pf2).d(), str);
        return pf2;
    }

    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasLastFetchBecomeStale(long j) {
        if (j - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS) {
            return true;
        }
        return false;
    }

    private boolean hasRemoteConfigFetchDelayElapsed(long j) {
        if (j - this.rcmInitTimestamp >= this.remoteConfigFetchDelayInMs) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Exception exc) {
        logger.g("Call to Remote Config failed: %s. This may cause a degraded experience with Firebase Performance. Please reach out to Firebase Support https://firebase.google.com/support/", exc);
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        if (!hasRemoteConfigFetchDelayElapsed(currentSystemTimeMillis) || !hasLastFetchBecomeStale(currentSystemTimeMillis)) {
            return false;
        }
        return true;
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        nf2 nf2 = this.firebaseRemoteConfig;
        wz0 wz0 = nf2.e;
        long j = ((d01) wz0.g).a.getLong("minimum_fetch_interval_in_seconds", 43200);
        HashMap hashMap = new HashMap((Map) wz0.h);
        hashMap.put("X-Firebase-RC-Fetch-Type", "BASE/1");
        yb9 l = ((qz0) wz0.e).b().g((Executor) wz0.c, new tz0((Object) wz0, j, (Object) hashMap)).l(re2.w, new ta1(29)).l(nf2.b, new mf2(nf2));
        l.e(this.executor, new c46(this));
        l.d(this.executor, new c46(this));
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                this.allRcConfigMap.putAll(this.firebaseRemoteConfig.a());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    public n75 getBoolean(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config boolean value is null.");
            return new n75();
        }
        pf2 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new n75(Boolean.valueOf(((qf2) remoteConfigValue).a()));
            } catch (IllegalArgumentException unused) {
                qf2 qf2 = (qf2) remoteConfigValue;
                if (!qf2.d().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", qf2.d(), str);
                }
            }
        }
        return new n75();
    }

    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public n75 getDouble(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config double value is null.");
            return new n75();
        }
        pf2 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new n75(Double.valueOf(((qf2) remoteConfigValue).b()));
            } catch (IllegalArgumentException unused) {
                qf2 qf2 = (qf2) remoteConfigValue;
                if (!qf2.d().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", qf2.d(), str);
                }
            }
        }
        return new n75();
    }

    public n75 getLong(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config long value is null.");
            return new n75();
        }
        pf2 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new n75(Long.valueOf(((qf2) remoteConfigValue).c()));
            } catch (IllegalArgumentException unused) {
                qf2 qf2 = (qf2) remoteConfigValue;
                if (!qf2.d().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", qf2.d(), str);
                }
            }
        }
        return new n75();
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0068  */
    public <T> T getRemoteConfigValueOrDefault(String str, T t) {
        qf2 qf2;
        pf2 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                if (t instanceof Boolean) {
                    return Boolean.valueOf(((qf2) remoteConfigValue).a());
                }
                if (t instanceof Double) {
                    return Double.valueOf(((qf2) remoteConfigValue).b());
                }
                if (!(t instanceof Long)) {
                    if (!(t instanceof Integer)) {
                        if (t instanceof String) {
                            return ((qf2) remoteConfigValue).d();
                        }
                        T d = ((qf2) remoteConfigValue).d();
                        try {
                            logger.b("No matching type found for the defaultValue: '%s', using String.", t);
                            return d;
                        } catch (IllegalArgumentException unused) {
                            t = d;
                            qf2 = (qf2) remoteConfigValue;
                            if (!qf2.d().isEmpty()) {
                            }
                            return t;
                        }
                    }
                }
                return Long.valueOf(((qf2) remoteConfigValue).c());
            } catch (IllegalArgumentException unused2) {
                qf2 = (qf2) remoteConfigValue;
                if (!qf2.d().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", qf2.d(), str);
                }
                return t;
            }
        }
        return t;
    }

    public n75 getString(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config String value is null.");
            return new n75();
        }
        pf2 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            return new n75(((qf2) remoteConfigValue).d());
        }
        return new n75();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        nu5 nu5;
        b46 b46;
        if (!(this.firebaseRemoteConfig != null || (nu5 = this.firebaseRemoteConfigProvider) == null || (b46 = (b46) nu5.get()) == null)) {
            this.firebaseRemoteConfig = b46.b(FIREPERF_FRC_NAMESPACE_NAME);
        }
        if (this.firebaseRemoteConfig != null) {
            return true;
        }
        return false;
    }

    public boolean isLastFetchFailed() {
        nf2 nf2 = this.firebaseRemoteConfig;
        if (nf2 == null || nf2.b().x == 1 || this.firebaseRemoteConfig.b().x == 2) {
            return true;
        }
        return false;
    }

    public void setFirebaseRemoteConfigProvider(nu5 nu5) {
        this.firebaseRemoteConfigProvider = nu5;
    }

    public void syncConfigValues(Map<String, pf2> map) {
        this.allRcConfigMap.putAll(map);
        for (String next : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(next)) {
                this.allRcConfigMap.remove(next);
            }
        }
        i01 O = i01.O();
        ConcurrentHashMap<String, pf2> concurrentHashMap = this.allRcConfigMap;
        O.getClass();
        pf2 pf2 = concurrentHashMap.get("fpr_experiment_app_start_ttid");
        if (pf2 != null) {
            try {
                this.cache.g("com.google.firebase.perf.ExperimentTTID", ((qf2) pf2).a());
            } catch (Exception unused) {
                logger.a("ExperimentTTID remote config flag has invalid value, expected boolean.");
            }
        } else {
            logger.a("ExperimentTTID remote config flag does not exist.");
        }
    }

    public RemoteConfigManager(zt1 zt1, Executor executor2, nf2 nf2, long j) {
        ConcurrentHashMap<String, pf2> concurrentHashMap;
        this.rcmInitTimestamp = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
        this.cache = zt1;
        this.executor = executor2;
        this.firebaseRemoteConfig = nf2;
        if (nf2 == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(nf2.a());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.remoteConfigFetchDelayInMs = j;
    }
}
