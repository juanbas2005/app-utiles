.class public Lcom/google/firebase/perf/config/RemoteConfigManager;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field private static final FETCH_NEVER_HAPPENED_TIMESTAMP_MS:J = 0x0L

.field private static final FIREPERF_FRC_NAMESPACE_NAME:Ljava/lang/String; = "fireperf"

.field private static final MIN_CONFIG_FETCH_DELAY_MS:J = 0x1388L

.field private static final RANDOM_CONFIG_FETCH_DELAY_MS:I = 0x61a8

.field private static final TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS:J

.field private static final instance:Lcom/google/firebase/perf/config/RemoteConfigManager;

.field private static final logger:Lrg;


# instance fields
.field private final allRcConfigMap:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lpf2;",
            ">;"
        }
    .end annotation
.end field

.field private final cache:Lzt1;

.field private final executor:Ljava/util/concurrent/Executor;

.field private firebaseRemoteConfig:Lnf2;

.field private firebaseRemoteConfigLastFetchTimestampMs:J

.field private firebaseRemoteConfigProvider:Lnu5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnu5;"
        }
    .end annotation
.end field

.field private final rcmInitTimestamp:J

.field private final remoteConfigFetchDelayInMs:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Lrg;->d()Lrg;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lcom/google/firebase/perf/config/RemoteConfigManager;->logger:Lrg;

    .line 6
    .line 7
    new-instance v0, Lcom/google/firebase/perf/config/RemoteConfigManager;

    .line 8
    .line 9
    invoke-direct {v0}, Lcom/google/firebase/perf/config/RemoteConfigManager;-><init>()V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lcom/google/firebase/perf/config/RemoteConfigManager;->instance:Lcom/google/firebase/perf/config/RemoteConfigManager;

    .line 13
    .line 14
    const-wide/32 v0, 0x2932e00

    .line 15
    .line 16
    .line 17
    sput-wide v0, Lcom/google/firebase/perf/config/RemoteConfigManager;->TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS:J

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
.end method

.method private constructor <init>()V
    .locals 9

    .line 1
    invoke-static {}, Lzt1;->b()Lzt1;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    new-instance v2, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 6
    .line 7
    new-instance v8, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 8
    .line 9
    invoke-direct {v8}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 10
    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x1

    .line 14
    const-wide/16 v5, 0x0

    .line 15
    .line 16
    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 17
    .line 18
    invoke-direct/range {v2 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Ljava/util/Random;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 24
    .line 25
    .line 26
    const/16 v3, 0x61a8

    .line 27
    .line 28
    invoke-virtual {v0, v3}, Ljava/util/Random;->nextInt(I)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    int-to-long v3, v0

    .line 33
    const-wide/16 v5, 0x1388

    .line 34
    .line 35
    add-long v4, v3, v5

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    move-object v0, p0

    .line 39
    invoke-direct/range {v0 .. v5}, Lcom/google/firebase/perf/config/RemoteConfigManager;-><init>(Lzt1;Ljava/util/concurrent/Executor;Lnf2;J)V

    .line 40
    .line 41
    .line 42
    return-void
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public constructor <init>(Lzt1;Ljava/util/concurrent/Executor;Lnf2;J)V
    .locals 2

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    invoke-virtual {p0}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getCurrentSystemTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->rcmInitTimestamp:J

    const-wide/16 v0, 0x0

    .line 45
    iput-wide v0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->firebaseRemoteConfigLastFetchTimestampMs:J

    .line 46
    iput-object p1, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->cache:Lzt1;

    .line 47
    iput-object p2, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->executor:Ljava/util/concurrent/Executor;

    .line 48
    iput-object p3, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->firebaseRemoteConfig:Lnf2;

    if-nez p3, :cond_0

    .line 49
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    goto :goto_0

    .line 50
    :cond_0
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p3}, Lnf2;->a()Ljava/util/HashMap;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(Ljava/util/Map;)V

    :goto_0
    iput-object p1, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->allRcConfigMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 51
    iput-wide p4, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->remoteConfigFetchDelayInMs:J

    return-void
.end method

.method public static synthetic a(Lcom/google/firebase/perf/config/RemoteConfigManager;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/firebase/perf/config/RemoteConfigManager;->lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Ljava/lang/Exception;)V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public static synthetic b(Lcom/google/firebase/perf/config/RemoteConfigManager;Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/firebase/perf/config/RemoteConfigManager;->lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Ljava/lang/Boolean;)V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public static getInstance()Lcom/google/firebase/perf/config/RemoteConfigManager;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/firebase/perf/config/RemoteConfigManager;->instance:Lcom/google/firebase/perf/config/RemoteConfigManager;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private getRemoteConfigValue(Ljava/lang/String;)Lpf2;
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/firebase/perf/config/RemoteConfigManager;->triggerRemoteConfigFetchIfNecessary()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/firebase/perf/config/RemoteConfigManager;->isFirebaseRemoteConfigAvailable()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->allRcConfigMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object p0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->allRcConfigMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Lpf2;

    .line 25
    .line 26
    move-object v0, p0

    .line 27
    check-cast v0, Lqf2;

    .line 28
    .line 29
    iget v0, v0, Lqf2;->b:I

    .line 30
    .line 31
    const/4 v1, 0x2

    .line 32
    if-ne v0, v1, :cond_0

    .line 33
    .line 34
    sget-object v0, Lcom/google/firebase/perf/config/RemoteConfigManager;->logger:Lrg;

    .line 35
    .line 36
    move-object v1, p0

    .line 37
    check-cast v1, Lqf2;

    .line 38
    .line 39
    invoke-virtual {v1}, Lqf2;->d()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    filled-new-array {v1, p1}, [Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const-string v1, "Fetched value: \'%s\' for key: \'%s\' from Firebase Remote Config."

    .line 48
    .line 49
    invoke-virtual {v0, v1, p1}, Lrg;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-object p0

    .line 53
    :cond_0
    const/4 p0, 0x0

    .line 54
    return-object p0
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public static getVersionCode(Landroid/content/Context;)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v1, p0, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    iget p0, p0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    return p0

    .line 17
    :catch_0
    return v0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method private hasLastFetchBecomeStale(J)Z
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->firebaseRemoteConfigLastFetchTimestampMs:J

    .line 2
    .line 3
    sub-long/2addr p1, v0

    .line 4
    sget-wide v0, Lcom/google/firebase/perf/config/RemoteConfigManager;->TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS:J

    .line 5
    .line 6
    cmp-long p0, p1, v0

    .line 7
    .line 8
    if-lez p0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method private hasRemoteConfigFetchDelayElapsed(J)Z
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->rcmInitTimestamp:J

    .line 2
    .line 3
    sub-long/2addr p1, v0

    .line 4
    iget-wide v0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->remoteConfigFetchDelayInMs:J

    .line 5
    .line 6
    cmp-long p0, p1, v0

    .line 7
    .line 8
    if-ltz p0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method private synthetic lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->firebaseRemoteConfig:Lnf2;

    .line 2
    .line 3
    invoke-virtual {p1}, Lnf2;->a()Ljava/util/HashMap;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Lcom/google/firebase/perf/config/RemoteConfigManager;->syncConfigValues(Ljava/util/Map;)V

    .line 8
    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method private synthetic lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/google/firebase/perf/config/RemoteConfigManager;->logger:Lrg;

    .line 2
    .line 3
    const-string v1, "Call to Remote Config failed: %s. This may cause a degraded experience with Firebase Performance. Please reach out to Firebase Support https://firebase.google.com/support/"

    .line 4
    .line 5
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {v0, v1, p1}, Lrg;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    iput-wide v0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->firebaseRemoteConfigLastFetchTimestampMs:J

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method private shouldFetchAndActivateRemoteConfigValues()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getCurrentSystemTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-direct {p0, v0, v1}, Lcom/google/firebase/perf/config/RemoteConfigManager;->hasRemoteConfigFetchDelayElapsed(J)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    invoke-direct {p0, v0, v1}, Lcom/google/firebase/perf/config/RemoteConfigManager;->hasLastFetchBecomeStale(J)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
    .line 21
.end method

.method private triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getCurrentSystemTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->firebaseRemoteConfigLastFetchTimestampMs:J

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->firebaseRemoteConfig:Lnf2;

    .line 8
    .line 9
    iget-object v1, v0, Lnf2;->e:Lwz0;

    .line 10
    .line 11
    iget-object v2, v1, Lwz0;->g:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Ld01;

    .line 14
    .line 15
    iget-object v2, v2, Ld01;->a:Landroid/content/SharedPreferences;

    .line 16
    .line 17
    const-string v3, "minimum_fetch_interval_in_seconds"

    .line 18
    .line 19
    const-wide/32 v4, 0xa8c0

    .line 20
    .line 21
    .line 22
    invoke-interface {v2, v3, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    new-instance v4, Ljava/util/HashMap;

    .line 27
    .line 28
    iget-object v5, v1, Lwz0;->h:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v5, Ljava/util/Map;

    .line 31
    .line 32
    invoke-direct {v4, v5}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 33
    .line 34
    .line 35
    const-string v5, "X-Firebase-RC-Fetch-Type"

    .line 36
    .line 37
    const-string v6, "BASE/1"

    .line 38
    .line 39
    invoke-virtual {v4, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    iget-object v5, v1, Lwz0;->e:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v5, Lqz0;

    .line 45
    .line 46
    invoke-virtual {v5}, Lqz0;->b()Lyb9;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    iget-object v6, v1, Lwz0;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v6, Ljava/util/concurrent/Executor;

    .line 53
    .line 54
    new-instance v7, Ltz0;

    .line 55
    .line 56
    invoke-direct {v7, v1, v2, v3, v4}, Ltz0;-><init>(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v5, v6, v7}, Lyb9;->g(Ljava/util/concurrent/Executor;Lg61;)Lyb9;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    new-instance v2, Lta1;

    .line 64
    .line 65
    const/16 v3, 0x1d

    .line 66
    .line 67
    invoke-direct {v2, v3}, Lta1;-><init>(I)V

    .line 68
    .line 69
    .line 70
    sget-object v3, Lre2;->w:Lre2;

    .line 71
    .line 72
    invoke-virtual {v1, v3, v2}, Lyb9;->l(Ljava/util/concurrent/Executor;Le77;)Lyb9;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    iget-object v2, v0, Lnf2;->b:Ljava/util/concurrent/Executor;

    .line 77
    .line 78
    new-instance v3, Lmf2;

    .line 79
    .line 80
    invoke-direct {v3, v0}, Lmf2;-><init>(Lnf2;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v2, v3}, Lyb9;->l(Ljava/util/concurrent/Executor;Le77;)Lyb9;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    iget-object v1, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->executor:Ljava/util/concurrent/Executor;

    .line 88
    .line 89
    new-instance v2, Lc46;

    .line 90
    .line 91
    invoke-direct {v2, p0}, Lc46;-><init>(Lcom/google/firebase/perf/config/RemoteConfigManager;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v1, v2}, Lyb9;->e(Ljava/util/concurrent/Executor;Lk55;)V

    .line 95
    .line 96
    .line 97
    iget-object v1, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->executor:Ljava/util/concurrent/Executor;

    .line 98
    .line 99
    new-instance v2, Lc46;

    .line 100
    .line 101
    invoke-direct {v2, p0}, Lc46;-><init>(Lcom/google/firebase/perf/config/RemoteConfigManager;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v1, v2}, Lyb9;->d(Ljava/util/concurrent/Executor;Lc55;)V

    .line 105
    .line 106
    .line 107
    return-void
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method private triggerRemoteConfigFetchIfNecessary()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/firebase/perf/config/RemoteConfigManager;->isFirebaseRemoteConfigAvailable()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->allRcConfigMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->allRcConfigMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    iget-object v1, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->firebaseRemoteConfig:Lnf2;

    .line 19
    .line 20
    invoke-virtual {v1}, Lnf2;->a()Ljava/util/HashMap;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-direct {p0}, Lcom/google/firebase/perf/config/RemoteConfigManager;->shouldFetchAndActivateRemoteConfigValues()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    invoke-direct {p0}, Lcom/google/firebase/perf/config/RemoteConfigManager;->triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch()V

    .line 34
    .line 35
    .line 36
    :cond_2
    :goto_0
    return-void
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method


# virtual methods
.method public getBoolean(Ljava/lang/String;)Ln75;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ln75;"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->logger:Lrg;

    .line 4
    .line 5
    const-string p1, "The key to get Remote Config boolean value is null."

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lrg;->a(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance p0, Ln75;

    .line 11
    .line 12
    invoke-direct {p0}, Ln75;-><init>()V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-direct {p0, p1}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getRemoteConfigValue(Ljava/lang/String;)Lpf2;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    :try_start_0
    move-object v0, p0

    .line 23
    check-cast v0, Lqf2;

    .line 24
    .line 25
    invoke-virtual {v0}, Lqf2;->a()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, Ln75;

    .line 34
    .line 35
    invoke-direct {v1, v0}, Ln75;-><init>(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    return-object v1

    .line 39
    :catch_0
    check-cast p0, Lqf2;

    .line 40
    .line 41
    invoke-virtual {p0}, Lqf2;->d()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_1

    .line 50
    .line 51
    sget-object v0, Lcom/google/firebase/perf/config/RemoteConfigManager;->logger:Lrg;

    .line 52
    .line 53
    invoke-virtual {p0}, Lqf2;->d()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    const-string p1, "Could not parse value: \'%s\' for key: \'%s\'."

    .line 62
    .line 63
    invoke-virtual {v0, p1, p0}, Lrg;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :cond_1
    new-instance p0, Ln75;

    .line 67
    .line 68
    invoke-direct {p0}, Ln75;-><init>()V

    .line 69
    .line 70
    .line 71
    return-object p0
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public getCurrentSystemTimeMillis()J
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public getDouble(Ljava/lang/String;)Ln75;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ln75;"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->logger:Lrg;

    .line 4
    .line 5
    const-string p1, "The key to get Remote Config double value is null."

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lrg;->a(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance p0, Ln75;

    .line 11
    .line 12
    invoke-direct {p0}, Ln75;-><init>()V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-direct {p0, p1}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getRemoteConfigValue(Ljava/lang/String;)Lpf2;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    :try_start_0
    move-object v0, p0

    .line 23
    check-cast v0, Lqf2;

    .line 24
    .line 25
    invoke-virtual {v0}, Lqf2;->b()D

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, Ln75;

    .line 34
    .line 35
    invoke-direct {v1, v0}, Ln75;-><init>(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    return-object v1

    .line 39
    :catch_0
    check-cast p0, Lqf2;

    .line 40
    .line 41
    invoke-virtual {p0}, Lqf2;->d()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_1

    .line 50
    .line 51
    sget-object v0, Lcom/google/firebase/perf/config/RemoteConfigManager;->logger:Lrg;

    .line 52
    .line 53
    invoke-virtual {p0}, Lqf2;->d()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    const-string p1, "Could not parse value: \'%s\' for key: \'%s\'."

    .line 62
    .line 63
    invoke-virtual {v0, p1, p0}, Lrg;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :cond_1
    new-instance p0, Ln75;

    .line 67
    .line 68
    invoke-direct {p0}, Ln75;-><init>()V

    .line 69
    .line 70
    .line 71
    return-object p0
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public getLong(Ljava/lang/String;)Ln75;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ln75;"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->logger:Lrg;

    .line 4
    .line 5
    const-string p1, "The key to get Remote Config long value is null."

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lrg;->a(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance p0, Ln75;

    .line 11
    .line 12
    invoke-direct {p0}, Ln75;-><init>()V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-direct {p0, p1}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getRemoteConfigValue(Ljava/lang/String;)Lpf2;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    :try_start_0
    move-object v0, p0

    .line 23
    check-cast v0, Lqf2;

    .line 24
    .line 25
    invoke-virtual {v0}, Lqf2;->c()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, Ln75;

    .line 34
    .line 35
    invoke-direct {v1, v0}, Ln75;-><init>(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    return-object v1

    .line 39
    :catch_0
    check-cast p0, Lqf2;

    .line 40
    .line 41
    invoke-virtual {p0}, Lqf2;->d()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_1

    .line 50
    .line 51
    sget-object v0, Lcom/google/firebase/perf/config/RemoteConfigManager;->logger:Lrg;

    .line 52
    .line 53
    invoke-virtual {p0}, Lqf2;->d()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    const-string p1, "Could not parse value: \'%s\' for key: \'%s\'."

    .line 62
    .line 63
    invoke-virtual {v0, p1, p0}, Lrg;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :cond_1
    new-instance p0, Ln75;

    .line 67
    .line 68
    invoke-direct {p0}, Ln75;-><init>()V

    .line 69
    .line 70
    .line 71
    return-object p0
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public getRemoteConfigValueOrDefault(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "TT;)TT;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getRemoteConfigValue(Ljava/lang/String;)Lpf2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_5

    .line 6
    .line 7
    :try_start_0
    instance-of v0, p2, Ljava/lang/Boolean;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    move-object v0, p0

    .line 12
    check-cast v0, Lqf2;

    .line 13
    .line 14
    invoke-virtual {v0}, Lqf2;->a()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_0
    instance-of v0, p2, Ljava/lang/Double;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    move-object v0, p0

    .line 28
    check-cast v0, Lqf2;

    .line 29
    .line 30
    invoke-virtual {v0}, Lqf2;->b()D

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_1
    instance-of v0, p2, Ljava/lang/Long;

    .line 40
    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    instance-of v0, p2, Ljava/lang/Integer;

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    instance-of v0, p2, Ljava/lang/String;

    .line 49
    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    move-object v0, p0

    .line 53
    check-cast v0, Lqf2;

    .line 54
    .line 55
    invoke-virtual {v0}, Lqf2;->d()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :cond_3
    move-object v0, p0

    .line 61
    check-cast v0, Lqf2;

    .line 62
    .line 63
    invoke-virtual {v0}, Lqf2;->d()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 67
    :try_start_1
    sget-object v1, Lcom/google/firebase/perf/config/RemoteConfigManager;->logger:Lrg;

    .line 68
    .line 69
    const-string v2, "No matching type found for the defaultValue: \'%s\', using String."

    .line 70
    .line 71
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    invoke-virtual {v1, v2, p2}, Lrg;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    .line 76
    .line 77
    .line 78
    return-object v0

    .line 79
    :catch_0
    move-object p2, v0

    .line 80
    goto :goto_1

    .line 81
    :cond_4
    :goto_0
    :try_start_2
    move-object v0, p0

    .line 82
    check-cast v0, Lqf2;

    .line 83
    .line 84
    invoke-virtual {v0}, Lqf2;->c()J

    .line 85
    .line 86
    .line 87
    move-result-wide v0

    .line 88
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 89
    .line 90
    .line 91
    move-result-object p0
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1

    .line 92
    return-object p0

    .line 93
    :catch_1
    :goto_1
    check-cast p0, Lqf2;

    .line 94
    .line 95
    invoke-virtual {p0}, Lqf2;->d()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-nez v0, :cond_5

    .line 104
    .line 105
    sget-object v0, Lcom/google/firebase/perf/config/RemoteConfigManager;->logger:Lrg;

    .line 106
    .line 107
    invoke-virtual {p0}, Lqf2;->d()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    const-string p1, "Could not parse value: \'%s\' for key: \'%s\'."

    .line 116
    .line 117
    invoke-virtual {v0, p1, p0}, Lrg;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    :cond_5
    return-object p2
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
.end method

.method public getString(Ljava/lang/String;)Ln75;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ln75;"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->logger:Lrg;

    .line 4
    .line 5
    const-string p1, "The key to get Remote Config String value is null."

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lrg;->a(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance p0, Ln75;

    .line 11
    .line 12
    invoke-direct {p0}, Ln75;-><init>()V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-direct {p0, p1}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getRemoteConfigValue(Ljava/lang/String;)Lpf2;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    check-cast p0, Lqf2;

    .line 23
    .line 24
    invoke-virtual {p0}, Lqf2;->d()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    new-instance p1, Ln75;

    .line 29
    .line 30
    invoke-direct {p1, p0}, Ln75;-><init>(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_1
    new-instance p0, Ln75;

    .line 35
    .line 36
    invoke-direct {p0}, Ln75;-><init>()V

    .line 37
    .line 38
    .line 39
    return-object p0
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public isFirebaseRemoteConfigAvailable()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->firebaseRemoteConfig:Lnf2;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->firebaseRemoteConfigProvider:Lnu5;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Lnu5;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lb46;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const-string v1, "fireperf"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lb46;->b(Ljava/lang/String;)Lnf2;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->firebaseRemoteConfig:Lnf2;

    .line 24
    .line 25
    :cond_0
    iget-object p0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->firebaseRemoteConfig:Lnf2;

    .line 26
    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_1
    const/4 p0, 0x0

    .line 32
    return p0
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public isLastFetchFailed()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->firebaseRemoteConfig:Lnf2;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-virtual {v0}, Lnf2;->b()Lbc4;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget v0, v0, Lbc4;->x:I

    .line 11
    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    iget-object p0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->firebaseRemoteConfig:Lnf2;

    .line 15
    .line 16
    invoke-virtual {p0}, Lnf2;->b()Lbc4;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    iget p0, p0, Lbc4;->x:I

    .line 21
    .line 22
    const/4 v0, 0x2

    .line 23
    if-ne p0, v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    return p0

    .line 28
    :cond_1
    :goto_0
    return v1
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public setFirebaseRemoteConfigProvider(Lnu5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu5;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->firebaseRemoteConfigProvider:Lnu5;

    .line 2
    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public syncConfigValues(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lpf2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->allRcConfigMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->allRcConfigMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/lang/String;

    .line 27
    .line 28
    invoke-interface {p1, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    iget-object v2, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->allRcConfigMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 35
    .line 36
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-static {}, Li01;->O()Li01;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iget-object v0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->allRcConfigMap:Ljava/util/concurrent/ConcurrentHashMap;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    const-string p1, "fpr_experiment_app_start_ttid"

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, Lpf2;

    .line 56
    .line 57
    if-eqz p1, :cond_2

    .line 58
    .line 59
    :try_start_0
    iget-object p0, p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->cache:Lzt1;

    .line 60
    .line 61
    const-string v0, "com.google.firebase.perf.ExperimentTTID"

    .line 62
    .line 63
    check-cast p1, Lqf2;

    .line 64
    .line 65
    invoke-virtual {p1}, Lqf2;->a()Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    invoke-virtual {p0, v0, p1}, Lzt1;->g(Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :catch_0
    sget-object p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->logger:Lrg;

    .line 74
    .line 75
    const-string p1, "ExperimentTTID remote config flag has invalid value, expected boolean."

    .line 76
    .line 77
    invoke-virtual {p0, p1}, Lrg;->a(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_2
    sget-object p0, Lcom/google/firebase/perf/config/RemoteConfigManager;->logger:Lrg;

    .line 82
    .line 83
    const-string p1, "ExperimentTTID remote config flag does not exist."

    .line 84
    .line 85
    invoke-virtual {p0, p1}, Lrg;->a(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    return-void
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
.end method
