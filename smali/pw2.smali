.class public final Lpw2;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Landroid/os/Handler$Callback;


# static fields
.field public static final K:Lcom/google/android/gms/common/api/Status;

.field public static final L:Lcom/google/android/gms/common/api/Status;

.field public static final M:Ljava/lang/Object;

.field public static N:Lpw2;


# instance fields
.field public final A:Landroid/content/Context;

.field public final B:Llw2;

.field public final C:Lk68;

.field public final D:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final E:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final F:Ljava/util/concurrent/ConcurrentHashMap;

.field public final G:Los;

.field public final H:Los;

.field public final I:Lph8;

.field public volatile J:Z

.field public w:J

.field public x:Z

.field public y:Ldc7;

.field public z:Lyf3;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const-string v2, "Sign-out occurred while this API call was in progress."

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-direct {v0, v1, v2, v3, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lm11;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lpw2;->K:Lcom/google/android/gms/common/api/Status;

    .line 11
    .line 12
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 13
    .line 14
    const-string v2, "The user must be signed in to make this API call."

    .line 15
    .line 16
    invoke-direct {v0, v1, v2, v3, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lm11;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lpw2;->L:Lcom/google/android/gms/common/api/Status;

    .line 20
    .line 21
    new-instance v0, Ljava/lang/Object;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lpw2;->M:Ljava/lang/Object;

    .line 27
    .line 28
    return-void
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

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;)V
    .locals 6

    .line 1
    sget-object v0, Llw2;->e:Llw2;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide/16 v1, 0x2710

    .line 7
    .line 8
    iput-wide v1, p0, Lpw2;->w:J

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-boolean v1, p0, Lpw2;->x:Z

    .line 12
    .line 13
    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v2, p0, Lpw2;->D:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 20
    .line 21
    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 22
    .line 23
    invoke-direct {v2, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iput-object v2, p0, Lpw2;->E:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 27
    .line 28
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 29
    .line 30
    const/4 v4, 0x5

    .line 31
    const/high16 v5, 0x3f400000    # 0.75f

    .line 32
    .line 33
    invoke-direct {v2, v4, v5, v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    .line 34
    .line 35
    .line 36
    iput-object v2, p0, Lpw2;->F:Ljava/util/concurrent/ConcurrentHashMap;

    .line 37
    .line 38
    new-instance v2, Los;

    .line 39
    .line 40
    invoke-direct {v2, v1}, Los;-><init>(I)V

    .line 41
    .line 42
    .line 43
    iput-object v2, p0, Lpw2;->G:Los;

    .line 44
    .line 45
    new-instance v2, Los;

    .line 46
    .line 47
    invoke-direct {v2, v1}, Los;-><init>(I)V

    .line 48
    .line 49
    .line 50
    iput-object v2, p0, Lpw2;->H:Los;

    .line 51
    .line 52
    iput-boolean v3, p0, Lpw2;->J:Z

    .line 53
    .line 54
    iput-object p1, p0, Lpw2;->A:Landroid/content/Context;

    .line 55
    .line 56
    new-instance v2, Lph8;

    .line 57
    .line 58
    invoke-direct {v2, p2, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 59
    .line 60
    .line 61
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 62
    .line 63
    .line 64
    iput-object v2, p0, Lpw2;->I:Lph8;

    .line 65
    .line 66
    iput-object v0, p0, Lpw2;->B:Llw2;

    .line 67
    .line 68
    new-instance p2, Lk68;

    .line 69
    .line 70
    const/16 v0, 0x8

    .line 71
    .line 72
    invoke-direct {p2, v0}, Lk68;-><init>(I)V

    .line 73
    .line 74
    .line 75
    iput-object p2, p0, Lpw2;->C:Lk68;

    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    sget-object p2, Lsg3;->q:Ljava/lang/Boolean;

    .line 82
    .line 83
    if-nez p2, :cond_1

    .line 84
    .line 85
    invoke-static {}, Lza5;->w()Z

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    if-eqz p2, :cond_0

    .line 90
    .line 91
    const-string p2, "android.hardware.type.automotive"

    .line 92
    .line 93
    invoke-virtual {p1, p2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-eqz p1, :cond_0

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_0
    move v3, v1

    .line 101
    :goto_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    sput-object p1, Lsg3;->q:Ljava/lang/Boolean;

    .line 106
    .line 107
    :cond_1
    sget-object p1, Lsg3;->q:Ljava/lang/Boolean;

    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-eqz p1, :cond_2

    .line 114
    .line 115
    iput-boolean v1, p0, Lpw2;->J:Z

    .line 116
    .line 117
    :cond_2
    const/4 p0, 0x6

    .line 118
    invoke-virtual {v2, p0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-virtual {v2, p0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 123
    .line 124
    .line 125
    return-void
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

.method public static a()V
    .locals 3

    .line 1
    sget-object v0, Lpw2;->M:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lpw2;->N:Lpw2;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iget-object v2, v1, Lpw2;->E:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 11
    .line 12
    .line 13
    iget-object v1, v1, Lpw2;->I:Lph8;

    .line 14
    .line 15
    const/16 v2, 0xa

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v1

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    :goto_0
    monitor-exit v0

    .line 28
    return-void

    .line 29
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    throw v1
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

.method public static d(Lln;Lm11;)Lcom/google/android/gms/common/api/Status;
    .locals 5

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    iget-object p0, p0, Lln;->b:Lqc3;

    .line 4
    .line 5
    iget-object p0, p0, Lqc3;->y:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    new-instance v4, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    add-int/lit8 v2, v2, 0x3f

    .line 28
    .line 29
    add-int/2addr v2, v3

    .line 30
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 31
    .line 32
    .line 33
    const-string v2, "API: "

    .line 34
    .line 35
    const-string v3, " is not available on this device. Connection failed with: "

    .line 36
    .line 37
    invoke-static {v4, v2, p0, v3, v1}, Lpb4;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const/16 v1, 0x11

    .line 42
    .line 43
    iget-object v2, p1, Lm11;->y:Landroid/app/PendingIntent;

    .line 44
    .line 45
    invoke-direct {v0, v1, p0, v2, p1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lm11;)V

    .line 46
    .line 47
    .line 48
    return-object v0
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
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
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
.end method

.method public static e(Landroid/content/Context;)Lpw2;
    .locals 5

    .line 1
    sget-object v0, Lpw2;->M:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lpw2;->N:Lpw2;

    .line 5
    .line 6
    if-nez v1, :cond_1

    .line 7
    .line 8
    sget-object v1, Lg99;->g:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    :try_start_1
    sget-object v2, Lg99;->i:Landroid/os/HandlerThread;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    monitor-exit v1

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    new-instance v2, Landroid/os/HandlerThread;

    .line 20
    .line 21
    const-string v3, "GoogleApiHandler"

    .line 22
    .line 23
    const/16 v4, 0x9

    .line 24
    .line 25
    invoke-direct {v2, v3, v4}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 26
    .line 27
    .line 28
    sput-object v2, Lg99;->i:Landroid/os/HandlerThread;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 31
    .line 32
    .line 33
    sget-object v2, Lg99;->i:Landroid/os/HandlerThread;

    .line 34
    .line 35
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    :goto_0
    :try_start_2
    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    new-instance v2, Lpw2;

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    sget-object v3, Llw2;->d:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-direct {v2, p0, v1}, Lpw2;-><init>(Landroid/content/Context;Landroid/os/Looper;)V

    .line 49
    .line 50
    .line 51
    sput-object v2, Lpw2;->N:Lpw2;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :catchall_1
    move-exception p0

    .line 55
    goto :goto_3

    .line 56
    :goto_1
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 57
    :try_start_4
    throw p0

    .line 58
    :cond_1
    :goto_2
    sget-object p0, Lpw2;->N:Lpw2;

    .line 59
    .line 60
    monitor-exit v0

    .line 61
    return-object p0

    .line 62
    :goto_3
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 63
    throw p0
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


# virtual methods
.method public final b(Lkw2;)Lng8;
    .locals 3

    .line 1
    iget-object v0, p1, Lkw2;->f:Lln;

    .line 2
    .line 3
    iget-object v1, p0, Lpw2;->F:Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    check-cast v2, Lng8;

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    new-instance v2, Lng8;

    .line 14
    .line 15
    invoke-direct {v2, p0, p1}, Lng8;-><init>(Lpw2;Lkw2;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object p1, v2, Lng8;->e:Liw2;

    .line 22
    .line 23
    invoke-virtual {p1}, Ly50;->r()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object p0, p0, Lpw2;->H:Los;

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Los;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {v2}, Lng8;->r()V

    .line 35
    .line 36
    .line 37
    return-object v2
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

.method public final c(Lxb7;ILkw2;)V
    .locals 8

    .line 1
    if-eqz p2, :cond_6

    .line 2
    .line 3
    iget-object v3, p3, Lkw2;->f:Lln;

    .line 4
    .line 5
    invoke-virtual {p0}, Lpw2;->f()Z

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    if-nez p3, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-static {}, Lf96;->z()Lf96;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    iget-object p3, p3, Lf96;->x:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p3, Lg96;

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    if-eqz p3, :cond_3

    .line 22
    .line 23
    iget-boolean v1, p3, Lg96;->x:Z

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    iget-boolean p3, p3, Lg96;->y:Z

    .line 28
    .line 29
    iget-object v1, p0, Lpw2;->F:Ljava/util/concurrent/ConcurrentHashMap;

    .line 30
    .line 31
    invoke-virtual {v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lng8;

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    iget-object v2, v1, Lng8;->e:Liw2;

    .line 40
    .line 41
    instance-of v4, v2, Ly50;

    .line 42
    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    check-cast v2, Ly50;

    .line 46
    .line 47
    iget-object v4, v2, Ly50;->w:Ls29;

    .line 48
    .line 49
    if-eqz v4, :cond_1

    .line 50
    .line 51
    invoke-virtual {v2}, Ly50;->q()Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-nez v4, :cond_1

    .line 56
    .line 57
    invoke-static {v1, v2, p2}, Lqg8;->a(Lng8;Ly50;I)Lp11;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    if-eqz p3, :cond_2

    .line 62
    .line 63
    iget v2, v1, Lng8;->o:I

    .line 64
    .line 65
    add-int/2addr v2, v0

    .line 66
    iput v2, v1, Lng8;->o:I

    .line 67
    .line 68
    iget-boolean v0, p3, Lp11;->y:Z

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    move v0, p3

    .line 72
    goto :goto_1

    .line 73
    :cond_2
    :goto_0
    const/4 p2, 0x0

    .line 74
    move-object v1, p0

    .line 75
    goto :goto_3

    .line 76
    :cond_3
    :goto_1
    new-instance p3, Lqg8;

    .line 77
    .line 78
    const-wide/16 v1, 0x0

    .line 79
    .line 80
    if-eqz v0, :cond_4

    .line 81
    .line 82
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 83
    .line 84
    .line 85
    move-result-wide v4

    .line 86
    goto :goto_2

    .line 87
    :cond_4
    move-wide v4, v1

    .line 88
    :goto_2
    if-eqz v0, :cond_5

    .line 89
    .line 90
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 91
    .line 92
    .line 93
    move-result-wide v1

    .line 94
    :cond_5
    move-object v0, p3

    .line 95
    move-wide v6, v1

    .line 96
    move-object v1, p0

    .line 97
    move v2, p2

    .line 98
    invoke-direct/range {v0 .. v7}, Lqg8;-><init>(Lpw2;ILln;JJ)V

    .line 99
    .line 100
    .line 101
    move-object p2, v0

    .line 102
    :goto_3
    if-eqz p2, :cond_6

    .line 103
    .line 104
    iget-object p0, p1, Lxb7;->a:Lyb9;

    .line 105
    .line 106
    iget-object p1, v1, Lpw2;->I:Lph8;

    .line 107
    .line 108
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    new-instance p3, Lw80;

    .line 112
    .line 113
    const/4 v0, 0x4

    .line 114
    invoke-direct {p3, p1, v0}, Lw80;-><init>(Landroid/os/Handler;I)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0, p3, p2}, Lyb9;->c(Ljava/util/concurrent/Executor;Ly45;)V

    .line 118
    .line 119
    .line 120
    :cond_6
    return-void
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
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
.end method

.method public final f()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lpw2;->x:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, Lf96;->z()Lf96;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v0, v0, Lf96;->x:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lg96;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-boolean v0, v0, Lg96;->x:Z

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    :cond_1
    iget-object p0, p0, Lpw2;->C:Lk68;

    .line 21
    .line 22
    iget-object p0, p0, Lk68;->x:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, Landroid/util/SparseIntArray;

    .line 25
    .line 26
    monitor-enter p0

    .line 27
    const/4 v0, -0x1

    .line 28
    const v1, 0xc1fa340

    .line 29
    .line 30
    .line 31
    :try_start_0
    invoke-virtual {p0, v1, v0}, Landroid/util/SparseIntArray;->get(II)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    monitor-exit p0

    .line 36
    if-eq v1, v0, :cond_3

    .line 37
    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 42
    return p0

    .line 43
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 44
    return p0

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    throw v0
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

.method public final g(Lm11;I)Z
    .locals 10

    .line 1
    iget-object v0, p0, Lpw2;->B:Llw2;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lpw2;->A:Landroid/content/Context;

    .line 7
    .line 8
    invoke-static {p0}, Lrd3;->B(Landroid/content/Context;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v8, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto/16 :goto_4

    .line 16
    .line 17
    :cond_0
    iget v1, p1, Lm11;->x:I

    .line 18
    .line 19
    iget-object v2, p1, Lm11;->y:Landroid/app/PendingIntent;

    .line 20
    .line 21
    const/4 v9, 0x1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    move v3, v9

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move v3, v8

    .line 29
    :goto_0
    if-eqz v3, :cond_2

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    const/4 v2, 0x0

    .line 33
    invoke-virtual {v0, p0, v2, v1}, Lmw2;->a(Landroid/content/Context;Ljava/lang/String;I)Landroid/content/Intent;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    if-nez v3, :cond_3

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_3
    const/high16 v2, 0xc000000

    .line 41
    .line 42
    invoke-static {p0, v8, v3, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    :goto_1
    if-eqz v2, :cond_6

    .line 47
    .line 48
    sget v3, Lcom/google/android/gms/common/api/GoogleApiActivity;->x:I

    .line 49
    .line 50
    new-instance v3, Landroid/content/Intent;

    .line 51
    .line 52
    const-class v4, Lcom/google/android/gms/common/api/GoogleApiActivity;

    .line 53
    .line 54
    invoke-direct {v3, p0, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 55
    .line 56
    .line 57
    const-string v4, "pending_intent"

    .line 58
    .line 59
    invoke-virtual {v3, v4, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 60
    .line 61
    .line 62
    const-string v2, "failing_client_id"

    .line 63
    .line 64
    invoke-virtual {v3, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 65
    .line 66
    .line 67
    const-string p2, "notify_manager"

    .line 68
    .line 69
    invoke-virtual {v3, p2, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 70
    .line 71
    .line 72
    sget p2, Lnh8;->a:I

    .line 73
    .line 74
    const/high16 v2, 0x8000000

    .line 75
    .line 76
    or-int/2addr p2, v2

    .line 77
    invoke-static {p0, v8, v3, p2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-virtual {v0, p0, v1, p2}, Llw2;->f(Landroid/content/Context;ILandroid/app/PendingIntent;)V

    .line 82
    .line 83
    .line 84
    iget-object p2, p1, Lm11;->A:Ljava/lang/Integer;

    .line 85
    .line 86
    new-instance v2, Ljg8;

    .line 87
    .line 88
    if-nez p2, :cond_4

    .line 89
    .line 90
    const/4 p2, -0x1

    .line 91
    :goto_2
    move v3, p2

    .line 92
    goto :goto_3

    .line 93
    :cond_4
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    goto :goto_2

    .line 98
    :goto_3
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 103
    .line 104
    .line 105
    move-result-wide v5

    .line 106
    iget v4, p1, Lm11;->x:I

    .line 107
    .line 108
    invoke-direct/range {v2 .. v8}, Ljg8;-><init>(IIJLjava/lang/String;Z)V

    .line 109
    .line 110
    .line 111
    iget-object p1, v0, Llw2;->c:Lyf3;

    .line 112
    .line 113
    if-nez p1, :cond_5

    .line 114
    .line 115
    new-instance p1, Lyf3;

    .line 116
    .line 117
    sget-object p2, Lyf3;->m:Lqc3;

    .line 118
    .line 119
    sget-object v1, Lym;->a:Lxm;

    .line 120
    .line 121
    sget-object v3, Ljw2;->c:Ljw2;

    .line 122
    .line 123
    invoke-direct {p1, p0, p2, v1, v3}, Lkw2;-><init>(Landroid/content/Context;Lqc3;Lym;Ljw2;)V

    .line 124
    .line 125
    .line 126
    iput-object p1, v0, Llw2;->c:Lyf3;

    .line 127
    .line 128
    :cond_5
    iget-object p0, v0, Llw2;->c:Lyf3;

    .line 129
    .line 130
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-static {}, Li93;->b()Lza0;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    sget-object p2, Lh03;->C0:Lcc2;

    .line 138
    .line 139
    filled-new-array {p2}, [Lcc2;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    iput-object p2, p1, Lza0;->e:Ljava/lang/Object;

    .line 144
    .line 145
    const/4 p2, 0x0

    .line 146
    iput-boolean p2, p1, Lza0;->c:Z

    .line 147
    .line 148
    new-instance p2, Luy5;

    .line 149
    .line 150
    const/16 v0, 0xc

    .line 151
    .line 152
    invoke-direct {p2, v0, v2}, Luy5;-><init>(ILjava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    iput-object p2, p1, Lza0;->d:Ljava/lang/Object;

    .line 156
    .line 157
    invoke-virtual {p1}, Lza0;->a()Lxg8;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    const/4 p2, 0x2

    .line 162
    invoke-virtual {p0, p2, p1}, Lkw2;->b(ILi93;)Lyb9;

    .line 163
    .line 164
    .line 165
    return v9

    .line 166
    :cond_6
    :goto_4
    return v8
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
.end method

.method public final h(Lm11;I)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Lpw2;->g(Lm11;I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x5

    .line 8
    const/4 v1, 0x0

    .line 9
    iget-object p0, p0, Lpw2;->I:Lph8;

    .line 10
    .line 11
    invoke-virtual {p0, v0, p2, v1, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
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

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 14

    .line 1
    sget-object v0, Lyf3;->n:Lqc3;

    .line 2
    .line 3
    iget v1, p1, Landroid/os/Message;->what:I

    .line 4
    .line 5
    sget-object v2, Lec7;->x:Lec7;

    .line 6
    .line 7
    iget-object v3, p0, Lpw2;->A:Landroid/content/Context;

    .line 8
    .line 9
    const-wide/32 v4, 0x493e0

    .line 10
    .line 11
    .line 12
    const-string v6, "GoogleApiManager"

    .line 13
    .line 14
    const/16 v7, 0x11

    .line 15
    .line 16
    iget-object v8, p0, Lpw2;->I:Lph8;

    .line 17
    .line 18
    const/4 v9, 0x0

    .line 19
    const/4 v10, 0x0

    .line 20
    const/4 v11, 0x1

    .line 21
    iget-object v12, p0, Lpw2;->F:Ljava/util/concurrent/ConcurrentHashMap;

    .line 22
    .line 23
    packed-switch v1, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    new-instance p1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    add-int/lit8 p0, p0, 0x14

    .line 37
    .line 38
    invoke-direct {p1, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 39
    .line 40
    .line 41
    const-string p0, "Unknown message id: "

    .line 42
    .line 43
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-static {v6, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    return v9

    .line 57
    :pswitch_0
    iput-boolean v9, p0, Lpw2;->x:Z

    .line 58
    .line 59
    return v11

    .line 60
    :pswitch_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p1, Lrg8;

    .line 63
    .line 64
    iget-wide v4, p1, Lrg8;->c:J

    .line 65
    .line 66
    iget-object v1, p1, Lrg8;->a:Lsk4;

    .line 67
    .line 68
    iget v6, p1, Lrg8;->b:I

    .line 69
    .line 70
    const-wide/16 v12, 0x0

    .line 71
    .line 72
    cmp-long v9, v4, v12

    .line 73
    .line 74
    if-nez v9, :cond_1

    .line 75
    .line 76
    new-instance p1, Ldc7;

    .line 77
    .line 78
    filled-new-array {v1}, [Lsk4;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-direct {p1, v6, v1}, Ldc7;-><init>(ILjava/util/List;)V

    .line 87
    .line 88
    .line 89
    iget-object v1, p0, Lpw2;->z:Lyf3;

    .line 90
    .line 91
    if-nez v1, :cond_0

    .line 92
    .line 93
    new-instance v1, Lyf3;

    .line 94
    .line 95
    sget-object v4, Ljw2;->c:Ljw2;

    .line 96
    .line 97
    invoke-direct {v1, v3, v0, v2, v4}, Lkw2;-><init>(Landroid/content/Context;Lqc3;Lym;Ljw2;)V

    .line 98
    .line 99
    .line 100
    iput-object v1, p0, Lpw2;->z:Lyf3;

    .line 101
    .line 102
    :cond_0
    iget-object p0, p0, Lpw2;->z:Lyf3;

    .line 103
    .line 104
    invoke-virtual {p0, p1}, Lyf3;->c(Ldc7;)Lyb9;

    .line 105
    .line 106
    .line 107
    return v11

    .line 108
    :cond_1
    iget-object v9, p0, Lpw2;->y:Ldc7;

    .line 109
    .line 110
    if-eqz v9, :cond_8

    .line 111
    .line 112
    iget-object v12, v9, Ldc7;->x:Ljava/util/List;

    .line 113
    .line 114
    iget v9, v9, Ldc7;->w:I

    .line 115
    .line 116
    if-ne v9, v6, :cond_4

    .line 117
    .line 118
    if-eqz v12, :cond_2

    .line 119
    .line 120
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 121
    .line 122
    .line 123
    move-result v9

    .line 124
    iget p1, p1, Lrg8;->d:I

    .line 125
    .line 126
    if-lt v9, p1, :cond_2

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_2
    iget-object p1, p0, Lpw2;->y:Ldc7;

    .line 130
    .line 131
    iget-object v0, p1, Ldc7;->x:Ljava/util/List;

    .line 132
    .line 133
    if-nez v0, :cond_3

    .line 134
    .line 135
    new-instance v0, Ljava/util/ArrayList;

    .line 136
    .line 137
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 138
    .line 139
    .line 140
    iput-object v0, p1, Ldc7;->x:Ljava/util/List;

    .line 141
    .line 142
    :cond_3
    iget-object p1, p1, Ldc7;->x:Ljava/util/List;

    .line 143
    .line 144
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_4
    :goto_0
    invoke-virtual {v8, v7}, Landroid/os/Handler;->removeMessages(I)V

    .line 149
    .line 150
    .line 151
    iget-object p1, p0, Lpw2;->y:Ldc7;

    .line 152
    .line 153
    if-eqz p1, :cond_8

    .line 154
    .line 155
    iget v9, p1, Ldc7;->w:I

    .line 156
    .line 157
    if-gtz v9, :cond_5

    .line 158
    .line 159
    invoke-virtual {p0}, Lpw2;->f()Z

    .line 160
    .line 161
    .line 162
    move-result v9

    .line 163
    if-eqz v9, :cond_7

    .line 164
    .line 165
    :cond_5
    iget-object v9, p0, Lpw2;->z:Lyf3;

    .line 166
    .line 167
    if-nez v9, :cond_6

    .line 168
    .line 169
    new-instance v9, Lyf3;

    .line 170
    .line 171
    sget-object v12, Ljw2;->c:Ljw2;

    .line 172
    .line 173
    invoke-direct {v9, v3, v0, v2, v12}, Lkw2;-><init>(Landroid/content/Context;Lqc3;Lym;Ljw2;)V

    .line 174
    .line 175
    .line 176
    iput-object v9, p0, Lpw2;->z:Lyf3;

    .line 177
    .line 178
    :cond_6
    iget-object v0, p0, Lpw2;->z:Lyf3;

    .line 179
    .line 180
    invoke-virtual {v0, p1}, Lyf3;->c(Ldc7;)Lyb9;

    .line 181
    .line 182
    .line 183
    :cond_7
    iput-object v10, p0, Lpw2;->y:Ldc7;

    .line 184
    .line 185
    :cond_8
    :goto_1
    iget-object p1, p0, Lpw2;->y:Ldc7;

    .line 186
    .line 187
    if-nez p1, :cond_24

    .line 188
    .line 189
    new-instance p1, Ljava/util/ArrayList;

    .line 190
    .line 191
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    new-instance v0, Ldc7;

    .line 198
    .line 199
    invoke-direct {v0, v6, p1}, Ldc7;-><init>(ILjava/util/List;)V

    .line 200
    .line 201
    .line 202
    iput-object v0, p0, Lpw2;->y:Ldc7;

    .line 203
    .line 204
    invoke-virtual {v8, v7}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    invoke-virtual {v8, p0, v4, v5}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 209
    .line 210
    .line 211
    return v11

    .line 212
    :pswitch_2
    iget-object p1, p0, Lpw2;->y:Ldc7;

    .line 213
    .line 214
    if-eqz p1, :cond_24

    .line 215
    .line 216
    iget v1, p1, Ldc7;->w:I

    .line 217
    .line 218
    if-gtz v1, :cond_9

    .line 219
    .line 220
    invoke-virtual {p0}, Lpw2;->f()Z

    .line 221
    .line 222
    .line 223
    move-result v1

    .line 224
    if-eqz v1, :cond_b

    .line 225
    .line 226
    :cond_9
    iget-object v1, p0, Lpw2;->z:Lyf3;

    .line 227
    .line 228
    if-nez v1, :cond_a

    .line 229
    .line 230
    new-instance v1, Lyf3;

    .line 231
    .line 232
    sget-object v4, Ljw2;->c:Ljw2;

    .line 233
    .line 234
    invoke-direct {v1, v3, v0, v2, v4}, Lkw2;-><init>(Landroid/content/Context;Lqc3;Lym;Ljw2;)V

    .line 235
    .line 236
    .line 237
    iput-object v1, p0, Lpw2;->z:Lyf3;

    .line 238
    .line 239
    :cond_a
    iget-object v0, p0, Lpw2;->z:Lyf3;

    .line 240
    .line 241
    invoke-virtual {v0, p1}, Lyf3;->c(Ldc7;)Lyb9;

    .line 242
    .line 243
    .line 244
    :cond_b
    iput-object v10, p0, Lpw2;->y:Ldc7;

    .line 245
    .line 246
    return v11

    .line 247
    :pswitch_3
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast p0, Log8;

    .line 250
    .line 251
    iget-object p1, p0, Log8;->a:Lln;

    .line 252
    .line 253
    invoke-virtual {v12, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result p1

    .line 257
    if-eqz p1, :cond_24

    .line 258
    .line 259
    iget-object p1, p0, Log8;->a:Lln;

    .line 260
    .line 261
    invoke-virtual {v12, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    check-cast p1, Lng8;

    .line 266
    .line 267
    iget-object v0, p1, Lng8;->m:Ljava/util/ArrayList;

    .line 268
    .line 269
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    if-eqz v0, :cond_24

    .line 274
    .line 275
    iget-object v0, p1, Lng8;->p:Lpw2;

    .line 276
    .line 277
    iget-object v1, v0, Lpw2;->I:Lph8;

    .line 278
    .line 279
    const/16 v2, 0xf

    .line 280
    .line 281
    invoke-virtual {v1, v2, p0}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    iget-object v0, v0, Lpw2;->I:Lph8;

    .line 285
    .line 286
    const/16 v1, 0x10

    .line 287
    .line 288
    invoke-virtual {v0, v1, p0}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    iget-object p0, p0, Log8;->b:Lcc2;

    .line 292
    .line 293
    iget-object v0, p1, Lng8;->d:Ljava/util/LinkedList;

    .line 294
    .line 295
    new-instance v1, Ljava/util/ArrayList;

    .line 296
    .line 297
    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    .line 298
    .line 299
    .line 300
    move-result v2

    .line 301
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 302
    .line 303
    .line 304
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    :cond_c
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 309
    .line 310
    .line 311
    move-result v3

    .line 312
    if-eqz v3, :cond_e

    .line 313
    .line 314
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v3

    .line 318
    check-cast v3, Ljh8;

    .line 319
    .line 320
    instance-of v4, v3, Lsg8;

    .line 321
    .line 322
    if-eqz v4, :cond_c

    .line 323
    .line 324
    move-object v4, v3

    .line 325
    check-cast v4, Lsg8;

    .line 326
    .line 327
    invoke-virtual {v4, p1}, Lsg8;->f(Lng8;)[Lcc2;

    .line 328
    .line 329
    .line 330
    move-result-object v4

    .line 331
    if-eqz v4, :cond_c

    .line 332
    .line 333
    array-length v5, v4

    .line 334
    move v6, v9

    .line 335
    :goto_3
    if-ge v6, v5, :cond_c

    .line 336
    .line 337
    aget-object v7, v4, v6

    .line 338
    .line 339
    invoke-static {v7, p0}, Lb35;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result v7

    .line 343
    if-eqz v7, :cond_d

    .line 344
    .line 345
    if-ltz v6, :cond_c

    .line 346
    .line 347
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    goto :goto_2

    .line 351
    :cond_d
    add-int/lit8 v6, v6, 0x1

    .line 352
    .line 353
    goto :goto_3

    .line 354
    :cond_e
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 355
    .line 356
    .line 357
    move-result p1

    .line 358
    :goto_4
    if-ge v9, p1, :cond_24

    .line 359
    .line 360
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    check-cast v2, Ljh8;

    .line 365
    .line 366
    invoke-virtual {v0, v2}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 367
    .line 368
    .line 369
    new-instance v3, Lcom/google/android/gms/common/api/UnsupportedApiCallException;

    .line 370
    .line 371
    invoke-direct {v3, p0}, Lcom/google/android/gms/common/api/UnsupportedApiCallException;-><init>(Lcc2;)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v2, v3}, Ljh8;->b(Ljava/lang/Exception;)V

    .line 375
    .line 376
    .line 377
    add-int/lit8 v9, v9, 0x1

    .line 378
    .line 379
    goto :goto_4

    .line 380
    :pswitch_4
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 381
    .line 382
    check-cast p0, Log8;

    .line 383
    .line 384
    iget-object p1, p0, Log8;->a:Lln;

    .line 385
    .line 386
    invoke-virtual {v12, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    move-result p1

    .line 390
    if-eqz p1, :cond_24

    .line 391
    .line 392
    iget-object p1, p0, Log8;->a:Lln;

    .line 393
    .line 394
    invoke-virtual {v12, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object p1

    .line 398
    check-cast p1, Lng8;

    .line 399
    .line 400
    iget-object v0, p1, Lng8;->m:Ljava/util/ArrayList;

    .line 401
    .line 402
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    move-result p0

    .line 406
    if-nez p0, :cond_f

    .line 407
    .line 408
    goto/16 :goto_f

    .line 409
    .line 410
    :cond_f
    iget-boolean p0, p1, Lng8;->l:Z

    .line 411
    .line 412
    if-nez p0, :cond_24

    .line 413
    .line 414
    iget-object p0, p1, Lng8;->e:Liw2;

    .line 415
    .line 416
    check-cast p0, Ly50;

    .line 417
    .line 418
    invoke-virtual {p0}, Ly50;->p()Z

    .line 419
    .line 420
    .line 421
    move-result p0

    .line 422
    if-nez p0, :cond_10

    .line 423
    .line 424
    invoke-virtual {p1}, Lng8;->r()V

    .line 425
    .line 426
    .line 427
    return v11

    .line 428
    :cond_10
    invoke-virtual {p1}, Lng8;->g()V

    .line 429
    .line 430
    .line 431
    return v11

    .line 432
    :pswitch_5
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 433
    .line 434
    invoke-static {p0}, Lb81;->j(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    .line 435
    .line 436
    .line 437
    move-result-object p0

    .line 438
    throw p0

    .line 439
    :pswitch_6
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 440
    .line 441
    invoke-virtual {v12, p0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 442
    .line 443
    .line 444
    move-result p0

    .line 445
    if-eqz p0, :cond_24

    .line 446
    .line 447
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 448
    .line 449
    invoke-virtual {v12, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object p0

    .line 453
    check-cast p0, Lng8;

    .line 454
    .line 455
    iget-object p1, p0, Lng8;->p:Lpw2;

    .line 456
    .line 457
    iget-object p1, p1, Lpw2;->I:Lph8;

    .line 458
    .line 459
    invoke-static {p1}, Lz65;->g(Landroid/os/Handler;)V

    .line 460
    .line 461
    .line 462
    iget-object p1, p0, Lng8;->e:Liw2;

    .line 463
    .line 464
    move-object v0, p1

    .line 465
    check-cast v0, Ly50;

    .line 466
    .line 467
    invoke-virtual {v0}, Ly50;->p()Z

    .line 468
    .line 469
    .line 470
    move-result v0

    .line 471
    if-eqz v0, :cond_13

    .line 472
    .line 473
    iget-object v0, p0, Lng8;->i:Ljava/util/HashMap;

    .line 474
    .line 475
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    .line 476
    .line 477
    .line 478
    move-result v0

    .line 479
    if-eqz v0, :cond_13

    .line 480
    .line 481
    iget-object v0, p0, Lng8;->g:Lk68;

    .line 482
    .line 483
    iget-object v1, v0, Lk68;->x:Ljava/lang/Object;

    .line 484
    .line 485
    check-cast v1, Ljava/util/Map;

    .line 486
    .line 487
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 488
    .line 489
    .line 490
    move-result v1

    .line 491
    if-eqz v1, :cond_12

    .line 492
    .line 493
    iget-object v0, v0, Lk68;->y:Ljava/lang/Object;

    .line 494
    .line 495
    check-cast v0, Ljava/util/Map;

    .line 496
    .line 497
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 498
    .line 499
    .line 500
    move-result v0

    .line 501
    if-nez v0, :cond_11

    .line 502
    .line 503
    goto :goto_5

    .line 504
    :cond_11
    const-string p0, "Timing out service connection."

    .line 505
    .line 506
    check-cast p1, Ly50;

    .line 507
    .line 508
    invoke-virtual {p1, p0}, Ly50;->d(Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    return v11

    .line 512
    :cond_12
    :goto_5
    invoke-virtual {p0}, Lng8;->k()V

    .line 513
    .line 514
    .line 515
    :cond_13
    return v11

    .line 516
    :pswitch_7
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 517
    .line 518
    invoke-virtual {v12, p0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 519
    .line 520
    .line 521
    move-result p0

    .line 522
    if-eqz p0, :cond_24

    .line 523
    .line 524
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 525
    .line 526
    invoke-virtual {v12, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object p0

    .line 530
    check-cast p0, Lng8;

    .line 531
    .line 532
    iget-object p1, p0, Lng8;->p:Lpw2;

    .line 533
    .line 534
    iget-object v0, p1, Lpw2;->I:Lph8;

    .line 535
    .line 536
    invoke-static {v0}, Lz65;->g(Landroid/os/Handler;)V

    .line 537
    .line 538
    .line 539
    iget-boolean v0, p0, Lng8;->l:Z

    .line 540
    .line 541
    if-eqz v0, :cond_24

    .line 542
    .line 543
    if-eqz v0, :cond_14

    .line 544
    .line 545
    iget-object v0, p0, Lng8;->p:Lpw2;

    .line 546
    .line 547
    iget-object v1, p0, Lng8;->f:Lln;

    .line 548
    .line 549
    iget-object v2, v0, Lpw2;->I:Lph8;

    .line 550
    .line 551
    const/16 v3, 0xb

    .line 552
    .line 553
    invoke-virtual {v2, v3, v1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 554
    .line 555
    .line 556
    iget-object v0, v0, Lpw2;->I:Lph8;

    .line 557
    .line 558
    const/16 v2, 0x9

    .line 559
    .line 560
    invoke-virtual {v0, v2, v1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 561
    .line 562
    .line 563
    iput-boolean v9, p0, Lng8;->l:Z

    .line 564
    .line 565
    :cond_14
    iget-object v0, p1, Lpw2;->A:Landroid/content/Context;

    .line 566
    .line 567
    iget-object p1, p1, Lpw2;->B:Llw2;

    .line 568
    .line 569
    sget v1, Lmw2;->a:I

    .line 570
    .line 571
    invoke-virtual {p1, v0, v1}, Lmw2;->b(Landroid/content/Context;I)I

    .line 572
    .line 573
    .line 574
    move-result p1

    .line 575
    const/16 v0, 0x12

    .line 576
    .line 577
    if-ne p1, v0, :cond_15

    .line 578
    .line 579
    new-instance p1, Lcom/google/android/gms/common/api/Status;

    .line 580
    .line 581
    const/16 v0, 0x15

    .line 582
    .line 583
    const-string v1, "Connection timed out waiting for Google Play services update to complete."

    .line 584
    .line 585
    invoke-direct {p1, v0, v1, v10, v10}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lm11;)V

    .line 586
    .line 587
    .line 588
    goto :goto_6

    .line 589
    :cond_15
    new-instance p1, Lcom/google/android/gms/common/api/Status;

    .line 590
    .line 591
    const/16 v0, 0x16

    .line 592
    .line 593
    const-string v1, "API failed to connect while resuming due to an unknown error."

    .line 594
    .line 595
    invoke-direct {p1, v0, v1, v10, v10}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lm11;)V

    .line 596
    .line 597
    .line 598
    :goto_6
    invoke-virtual {p0, p1}, Lng8;->j(Lcom/google/android/gms/common/api/Status;)V

    .line 599
    .line 600
    .line 601
    iget-object p0, p0, Lng8;->e:Liw2;

    .line 602
    .line 603
    const-string p1, "Timing out connection while resuming."

    .line 604
    .line 605
    check-cast p0, Ly50;

    .line 606
    .line 607
    invoke-virtual {p0, p1}, Ly50;->d(Ljava/lang/String;)V

    .line 608
    .line 609
    .line 610
    return v11

    .line 611
    :pswitch_8
    iget-object p0, p0, Lpw2;->H:Los;

    .line 612
    .line 613
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 614
    .line 615
    .line 616
    new-instance p1, Les;

    .line 617
    .line 618
    invoke-direct {p1, p0}, Les;-><init>(Los;)V

    .line 619
    .line 620
    .line 621
    :cond_16
    :goto_7
    invoke-virtual {p1}, Les;->hasNext()Z

    .line 622
    .line 623
    .line 624
    move-result v0

    .line 625
    if-eqz v0, :cond_17

    .line 626
    .line 627
    invoke-virtual {p1}, Les;->next()Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    move-result-object v0

    .line 631
    check-cast v0, Lln;

    .line 632
    .line 633
    invoke-virtual {v12, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object v0

    .line 637
    check-cast v0, Lng8;

    .line 638
    .line 639
    if-eqz v0, :cond_16

    .line 640
    .line 641
    invoke-virtual {v0}, Lng8;->q()V

    .line 642
    .line 643
    .line 644
    goto :goto_7

    .line 645
    :cond_17
    invoke-virtual {p0}, Los;->clear()V

    .line 646
    .line 647
    .line 648
    return v11

    .line 649
    :pswitch_9
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 650
    .line 651
    invoke-virtual {v12, p0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 652
    .line 653
    .line 654
    move-result p0

    .line 655
    if-eqz p0, :cond_24

    .line 656
    .line 657
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 658
    .line 659
    invoke-virtual {v12, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object p0

    .line 663
    check-cast p0, Lng8;

    .line 664
    .line 665
    iget-object p1, p0, Lng8;->p:Lpw2;

    .line 666
    .line 667
    iget-object p1, p1, Lpw2;->I:Lph8;

    .line 668
    .line 669
    invoke-static {p1}, Lz65;->g(Landroid/os/Handler;)V

    .line 670
    .line 671
    .line 672
    iget-boolean p1, p0, Lng8;->l:Z

    .line 673
    .line 674
    if-eqz p1, :cond_24

    .line 675
    .line 676
    invoke-virtual {p0}, Lng8;->r()V

    .line 677
    .line 678
    .line 679
    return v11

    .line 680
    :pswitch_a
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 681
    .line 682
    check-cast p1, Lkw2;

    .line 683
    .line 684
    invoke-virtual {p0, p1}, Lpw2;->b(Lkw2;)Lng8;

    .line 685
    .line 686
    .line 687
    return v11

    .line 688
    :pswitch_b
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 689
    .line 690
    .line 691
    move-result-object p1

    .line 692
    instance-of p1, p1, Landroid/app/Application;

    .line 693
    .line 694
    if-eqz p1, :cond_24

    .line 695
    .line 696
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 697
    .line 698
    .line 699
    move-result-object p1

    .line 700
    check-cast p1, Landroid/app/Application;

    .line 701
    .line 702
    invoke-static {p1}, Lv30;->b(Landroid/app/Application;)V

    .line 703
    .line 704
    .line 705
    sget-object p1, Lv30;->A:Lv30;

    .line 706
    .line 707
    new-instance v0, Lmg8;

    .line 708
    .line 709
    invoke-direct {v0, p0}, Lmg8;-><init>(Lpw2;)V

    .line 710
    .line 711
    .line 712
    invoke-virtual {p1, v0}, Lv30;->a(Lu30;)V

    .line 713
    .line 714
    .line 715
    iget-object v0, p1, Lv30;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 716
    .line 717
    iget-object p1, p1, Lv30;->x:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 718
    .line 719
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 720
    .line 721
    .line 722
    move-result v1

    .line 723
    if-nez v1, :cond_1c

    .line 724
    .line 725
    sget-object v1, Li95;->d:Ljava/lang/Boolean;

    .line 726
    .line 727
    if-nez v1, :cond_1a

    .line 728
    .line 729
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 730
    .line 731
    const/16 v2, 0x1c

    .line 732
    .line 733
    if-lt v1, v2, :cond_18

    .line 734
    .line 735
    invoke-static {}, Ltj5;->v()Z

    .line 736
    .line 737
    .line 738
    move-result v1

    .line 739
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 740
    .line 741
    .line 742
    move-result-object v1

    .line 743
    goto :goto_8

    .line 744
    :cond_18
    :try_start_0
    const-class v1, Landroid/os/Process;

    .line 745
    .line 746
    const-string v2, "isIsolated"

    .line 747
    .line 748
    invoke-virtual {v1, v2, v10}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 749
    .line 750
    .line 751
    move-result-object v1

    .line 752
    invoke-virtual {v1, v10, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 753
    .line 754
    .line 755
    move-result-object v1

    .line 756
    new-array v2, v9, [Ljava/lang/Object;

    .line 757
    .line 758
    const-string v3, "expected a non-null reference"

    .line 759
    .line 760
    if-eqz v1, :cond_19

    .line 761
    .line 762
    check-cast v1, Ljava/lang/Boolean;

    .line 763
    .line 764
    goto :goto_8

    .line 765
    :cond_19
    new-instance v1, Lcom/google/android/gms/internal/common/zzy;

    .line 766
    .line 767
    invoke-static {v3, v2}, Lh75;->L(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 768
    .line 769
    .line 770
    move-result-object v2

    .line 771
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 772
    .line 773
    .line 774
    throw v1
    :try_end_0
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 775
    :catch_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 776
    .line 777
    :goto_8
    sput-object v1, Li95;->d:Ljava/lang/Boolean;

    .line 778
    .line 779
    :cond_1a
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 780
    .line 781
    .line 782
    move-result v1

    .line 783
    if-nez v1, :cond_1b

    .line 784
    .line 785
    new-instance v1, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 786
    .line 787
    invoke-direct {v1}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>()V

    .line 788
    .line 789
    .line 790
    invoke-static {v1}, Landroid/app/ActivityManager;->getMyMemoryState(Landroid/app/ActivityManager$RunningAppProcessInfo;)V

    .line 791
    .line 792
    .line 793
    invoke-virtual {p1, v11}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 794
    .line 795
    .line 796
    move-result p1

    .line 797
    if-nez p1, :cond_1c

    .line 798
    .line 799
    iget p1, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    .line 800
    .line 801
    const/16 v1, 0x64

    .line 802
    .line 803
    if-le p1, v1, :cond_1c

    .line 804
    .line 805
    invoke-virtual {v0, v11}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 806
    .line 807
    .line 808
    goto :goto_9

    .line 809
    :cond_1b
    move p1, v11

    .line 810
    goto :goto_a

    .line 811
    :cond_1c
    :goto_9
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 812
    .line 813
    .line 814
    move-result p1

    .line 815
    :goto_a
    if-nez p1, :cond_24

    .line 816
    .line 817
    iput-wide v4, p0, Lpw2;->w:J

    .line 818
    .line 819
    goto/16 :goto_f

    .line 820
    .line 821
    :pswitch_c
    iget v0, p1, Landroid/os/Message;->arg1:I

    .line 822
    .line 823
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 824
    .line 825
    check-cast p1, Lm11;

    .line 826
    .line 827
    invoke-virtual {v12}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 828
    .line 829
    .line 830
    move-result-object v1

    .line 831
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 832
    .line 833
    .line 834
    move-result-object v1

    .line 835
    :cond_1d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 836
    .line 837
    .line 838
    move-result v2

    .line 839
    if-eqz v2, :cond_1e

    .line 840
    .line 841
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 842
    .line 843
    .line 844
    move-result-object v2

    .line 845
    check-cast v2, Lng8;

    .line 846
    .line 847
    iget v3, v2, Lng8;->j:I

    .line 848
    .line 849
    if-ne v3, v0, :cond_1d

    .line 850
    .line 851
    goto :goto_b

    .line 852
    :cond_1e
    move-object v2, v10

    .line 853
    :goto_b
    if-eqz v2, :cond_20

    .line 854
    .line 855
    iget v0, p1, Lm11;->x:I

    .line 856
    .line 857
    const/16 v1, 0xd

    .line 858
    .line 859
    if-ne v0, v1, :cond_1f

    .line 860
    .line 861
    new-instance v1, Lcom/google/android/gms/common/api/Status;

    .line 862
    .line 863
    iget-object p0, p0, Lpw2;->B:Llw2;

    .line 864
    .line 865
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 866
    .line 867
    .line 868
    sget p0, Lrw2;->e:I

    .line 869
    .line 870
    invoke-static {v0}, Lm11;->f(I)Ljava/lang/String;

    .line 871
    .line 872
    .line 873
    move-result-object p0

    .line 874
    iget-object p1, p1, Lm11;->z:Ljava/lang/String;

    .line 875
    .line 876
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 877
    .line 878
    .line 879
    move-result v0

    .line 880
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 881
    .line 882
    .line 883
    move-result-object v3

    .line 884
    add-int/lit8 v0, v0, 0x45

    .line 885
    .line 886
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 887
    .line 888
    .line 889
    move-result v3

    .line 890
    new-instance v4, Ljava/lang/StringBuilder;

    .line 891
    .line 892
    add-int/2addr v0, v3

    .line 893
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 894
    .line 895
    .line 896
    const-string v0, "Error resolution was canceled by the user, original error message: "

    .line 897
    .line 898
    const-string v3, ": "

    .line 899
    .line 900
    invoke-static {v4, v0, p0, v3, p1}, Lpb4;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 901
    .line 902
    .line 903
    move-result-object p0

    .line 904
    invoke-direct {v1, v7, p0, v10, v10}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lm11;)V

    .line 905
    .line 906
    .line 907
    invoke-virtual {v2, v1}, Lng8;->j(Lcom/google/android/gms/common/api/Status;)V

    .line 908
    .line 909
    .line 910
    return v11

    .line 911
    :cond_1f
    iget-object p0, v2, Lng8;->f:Lln;

    .line 912
    .line 913
    invoke-static {p0, p1}, Lpw2;->d(Lln;Lm11;)Lcom/google/android/gms/common/api/Status;

    .line 914
    .line 915
    .line 916
    move-result-object p0

    .line 917
    invoke-virtual {v2, p0}, Lng8;->j(Lcom/google/android/gms/common/api/Status;)V

    .line 918
    .line 919
    .line 920
    return v11

    .line 921
    :cond_20
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 922
    .line 923
    .line 924
    move-result-object p0

    .line 925
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 926
    .line 927
    .line 928
    move-result p0

    .line 929
    new-instance p1, Ljava/lang/StringBuilder;

    .line 930
    .line 931
    add-int/lit8 p0, p0, 0x41

    .line 932
    .line 933
    invoke-direct {p1, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 934
    .line 935
    .line 936
    const-string p0, "Could not find API instance "

    .line 937
    .line 938
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 939
    .line 940
    .line 941
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 942
    .line 943
    .line 944
    const-string p0, " while trying to fail enqueued calls."

    .line 945
    .line 946
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 947
    .line 948
    .line 949
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 950
    .line 951
    .line 952
    move-result-object p0

    .line 953
    new-instance p1, Ljava/lang/Exception;

    .line 954
    .line 955
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 956
    .line 957
    .line 958
    invoke-static {v6, p0, p1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 959
    .line 960
    .line 961
    return v11

    .line 962
    :pswitch_d
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 963
    .line 964
    check-cast p1, Lug8;

    .line 965
    .line 966
    iget-object v0, p1, Lug8;->c:Lkw2;

    .line 967
    .line 968
    iget-object v1, p1, Lug8;->a:Ljh8;

    .line 969
    .line 970
    iget-object v2, v0, Lkw2;->f:Lln;

    .line 971
    .line 972
    invoke-virtual {v12, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 973
    .line 974
    .line 975
    move-result-object v2

    .line 976
    check-cast v2, Lng8;

    .line 977
    .line 978
    if-nez v2, :cond_21

    .line 979
    .line 980
    invoke-virtual {p0, v0}, Lpw2;->b(Lkw2;)Lng8;

    .line 981
    .line 982
    .line 983
    move-result-object v2

    .line 984
    :cond_21
    iget-object v0, v2, Lng8;->e:Liw2;

    .line 985
    .line 986
    invoke-virtual {v0}, Ly50;->r()Z

    .line 987
    .line 988
    .line 989
    move-result v0

    .line 990
    if-eqz v0, :cond_22

    .line 991
    .line 992
    iget-object p0, p0, Lpw2;->E:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 993
    .line 994
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 995
    .line 996
    .line 997
    move-result p0

    .line 998
    iget p1, p1, Lug8;->b:I

    .line 999
    .line 1000
    if-eq p0, p1, :cond_22

    .line 1001
    .line 1002
    sget-object p0, Lpw2;->K:Lcom/google/android/gms/common/api/Status;

    .line 1003
    .line 1004
    invoke-virtual {v1, p0}, Ljh8;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 1005
    .line 1006
    .line 1007
    invoke-virtual {v2}, Lng8;->q()V

    .line 1008
    .line 1009
    .line 1010
    return v11

    .line 1011
    :cond_22
    invoke-virtual {v2, v1}, Lng8;->p(Ljh8;)V

    .line 1012
    .line 1013
    .line 1014
    return v11

    .line 1015
    :pswitch_e
    invoke-virtual {v12}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 1016
    .line 1017
    .line 1018
    move-result-object p0

    .line 1019
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 1020
    .line 1021
    .line 1022
    move-result-object p0

    .line 1023
    :goto_c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 1024
    .line 1025
    .line 1026
    move-result p1

    .line 1027
    if-eqz p1, :cond_24

    .line 1028
    .line 1029
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1030
    .line 1031
    .line 1032
    move-result-object p1

    .line 1033
    check-cast p1, Lng8;

    .line 1034
    .line 1035
    iget-object v0, p1, Lng8;->p:Lpw2;

    .line 1036
    .line 1037
    iget-object v0, v0, Lpw2;->I:Lph8;

    .line 1038
    .line 1039
    invoke-static {v0}, Lz65;->g(Landroid/os/Handler;)V

    .line 1040
    .line 1041
    .line 1042
    iput-object v10, p1, Lng8;->n:Lm11;

    .line 1043
    .line 1044
    invoke-virtual {p1}, Lng8;->r()V

    .line 1045
    .line 1046
    .line 1047
    goto :goto_c

    .line 1048
    :pswitch_f
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1049
    .line 1050
    invoke-static {p0}, Lb81;->j(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    .line 1051
    .line 1052
    .line 1053
    move-result-object p0

    .line 1054
    throw p0

    .line 1055
    :pswitch_10
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1056
    .line 1057
    check-cast p1, Ljava/lang/Boolean;

    .line 1058
    .line 1059
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1060
    .line 1061
    .line 1062
    move-result p1

    .line 1063
    if-eq v11, p1, :cond_23

    .line 1064
    .line 1065
    goto :goto_d

    .line 1066
    :cond_23
    const-wide/16 v4, 0x2710

    .line 1067
    .line 1068
    :goto_d
    iput-wide v4, p0, Lpw2;->w:J

    .line 1069
    .line 1070
    const/16 p1, 0xc

    .line 1071
    .line 1072
    invoke-virtual {v8, p1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1073
    .line 1074
    .line 1075
    invoke-virtual {v12}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v0

    .line 1079
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v0

    .line 1083
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1084
    .line 1085
    .line 1086
    move-result v1

    .line 1087
    if-eqz v1, :cond_24

    .line 1088
    .line 1089
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v1

    .line 1093
    check-cast v1, Lln;

    .line 1094
    .line 1095
    invoke-virtual {v8, p1, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v1

    .line 1099
    iget-wide v2, p0, Lpw2;->w:J

    .line 1100
    .line 1101
    invoke-virtual {v8, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 1102
    .line 1103
    .line 1104
    goto :goto_e

    .line 1105
    :cond_24
    :goto_f
    return v11

    .line 1106
    nop

    .line 1107
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_d
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_d
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
.end method
