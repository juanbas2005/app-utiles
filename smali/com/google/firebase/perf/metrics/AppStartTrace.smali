.class public Lcom/google/firebase/perf/metrics/AppStartTrace;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;
.implements Ls54;


# static fields
.field public static final S:Lui7;

.field public static final T:J

.field public static final U:J

.field public static volatile V:Lcom/google/firebase/perf/metrics/AppStartTrace;

.field public static W:Ljava/util/concurrent/ThreadPoolExecutor;


# instance fields
.field public A:Landroid/app/Application;

.field public B:Z

.field public final C:Lui7;

.field public final D:Lui7;

.field public E:Lui7;

.field public F:Lui7;

.field public G:Lui7;

.field public H:Lui7;

.field public I:Lui7;

.field public J:Lui7;

.field public K:Lui7;

.field public L:Lui7;

.field public M:Lui7;

.field public N:Lsf5;

.field public O:Z

.field public P:I

.field public final Q:Luq;

.field public R:Z

.field public w:Z

.field public final x:Lhn7;

.field public final y:Lb01;

.field public final z:Lvk7;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lui7;

    .line 2
    .line 3
    invoke-direct {v0}, Lui7;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/firebase/perf/metrics/AppStartTrace;->S:Lui7;

    .line 7
    .line 8
    const-wide/32 v0, 0x3938700

    .line 9
    .line 10
    .line 11
    sput-wide v0, Lcom/google/firebase/perf/metrics/AppStartTrace;->T:J

    .line 12
    .line 13
    const-wide/32 v0, 0xc350

    .line 14
    .line 15
    .line 16
    sput-wide v0, Lcom/google/firebase/perf/metrics/AppStartTrace;->U:J

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
.end method

.method public constructor <init>(Lhn7;Lg22;Lb01;Ljava/util/concurrent/ThreadPoolExecutor;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 p2, 0x0

    .line 5
    iput-boolean p2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->w:Z

    .line 6
    .line 7
    iput-boolean p2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->B:Z

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->E:Lui7;

    .line 11
    .line 12
    iput-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->F:Lui7;

    .line 13
    .line 14
    iput-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->G:Lui7;

    .line 15
    .line 16
    iput-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->H:Lui7;

    .line 17
    .line 18
    iput-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->I:Lui7;

    .line 19
    .line 20
    iput-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->J:Lui7;

    .line 21
    .line 22
    iput-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->K:Lui7;

    .line 23
    .line 24
    iput-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->L:Lui7;

    .line 25
    .line 26
    iput-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->M:Lui7;

    .line 27
    .line 28
    iput-boolean p2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->O:Z

    .line 29
    .line 30
    iput p2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->P:I

    .line 31
    .line 32
    new-instance v1, Luq;

    .line 33
    .line 34
    invoke-direct {v1, p0}, Luq;-><init>(Lcom/google/firebase/perf/metrics/AppStartTrace;)V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->Q:Luq;

    .line 38
    .line 39
    iput-boolean p2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->R:Z

    .line 40
    .line 41
    iput-object p1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->x:Lhn7;

    .line 42
    .line 43
    iput-object p3, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->y:Lb01;

    .line 44
    .line 45
    sput-object p4, Lcom/google/firebase/perf/metrics/AppStartTrace;->W:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 46
    .line 47
    invoke-static {}, Lyk7;->L()Lvk7;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string p2, "_experiment_app_start_ttid"

    .line 52
    .line 53
    invoke-virtual {p1, p2}, Lvk7;->m(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->z:Lvk7;

    .line 57
    .line 58
    invoke-static {}, Landroid/os/Process;->getStartElapsedRealtime()J

    .line 59
    .line 60
    .line 61
    move-result-wide p1

    .line 62
    sget-object p3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 63
    .line 64
    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMicros(J)J

    .line 65
    .line 66
    .line 67
    move-result-wide p1

    .line 68
    invoke-static {}, Lui7;->e()J

    .line 69
    .line 70
    .line 71
    move-result-wide v1

    .line 72
    invoke-static {}, Lui7;->a()J

    .line 73
    .line 74
    .line 75
    move-result-wide v3

    .line 76
    sub-long v3, p1, v3

    .line 77
    .line 78
    add-long/2addr v3, v1

    .line 79
    new-instance p4, Lui7;

    .line 80
    .line 81
    invoke-direct {p4, v3, v4, p1, p2}, Lui7;-><init>(JJ)V

    .line 82
    .line 83
    .line 84
    iput-object p4, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->C:Lui7;

    .line 85
    .line 86
    invoke-static {}, Loe2;->c()Loe2;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    const-class p2, Lo10;

    .line 91
    .line 92
    invoke-virtual {p1, p2}, Loe2;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    check-cast p1, Lo10;

    .line 97
    .line 98
    if-eqz p1, :cond_0

    .line 99
    .line 100
    iget-wide p1, p1, Lo10;->b:J

    .line 101
    .line 102
    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMicros(J)J

    .line 103
    .line 104
    .line 105
    move-result-wide p1

    .line 106
    invoke-static {}, Lui7;->e()J

    .line 107
    .line 108
    .line 109
    move-result-wide p3

    .line 110
    invoke-static {}, Lui7;->a()J

    .line 111
    .line 112
    .line 113
    move-result-wide v0

    .line 114
    sub-long v0, p1, v0

    .line 115
    .line 116
    add-long/2addr v0, p3

    .line 117
    new-instance p3, Lui7;

    .line 118
    .line 119
    invoke-direct {p3, v0, v1, p1, p2}, Lui7;-><init>(JJ)V

    .line 120
    .line 121
    .line 122
    move-object v0, p3

    .line 123
    :cond_0
    iput-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->D:Lui7;

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
.end method

.method public static d(Landroid/app/Application;)Z
    .locals 5

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/app/ActivityManager;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_4

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const-string v1, ":"

    .line 23
    .line 24
    invoke-static {p0, v1}, Lb81;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_4

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 43
    .line 44
    iget v3, v2, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    .line 45
    .line 46
    const/16 v4, 0x64

    .line 47
    .line 48
    if-eq v3, v4, :cond_2

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    iget-object v3, v2, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-nez v3, :cond_3

    .line 58
    .line 59
    iget-object v2, v2, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_1

    .line 66
    .line 67
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 68
    return p0

    .line 69
    :cond_4
    const/4 p0, 0x0

    .line 70
    return p0
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public static setLauncherActivityOnCreateTime(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public static setLauncherActivityOnResumeTime(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public static setLauncherActivityOnStartTime(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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


# virtual methods
.method public final b()Lui7;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->D:Lui7;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    sget-object p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->S:Lui7;

    .line 7
    .line 8
    return-object p0
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

.method public final c()Lui7;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->C:Lui7;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->b()Lui7;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
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

.method public final e(Lvk7;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->K:Lui7;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->L:Lui7;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->M:Lui7;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object v0, Lcom/google/firebase/perf/metrics/AppStartTrace;->W:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 15
    .line 16
    new-instance v1, Lga;

    .line 17
    .line 18
    const/4 v2, 0x4

    .line 19
    invoke-direct {v1, v2, p0, p1}, Lga;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->f()V

    .line 26
    .line 27
    .line 28
    :cond_1
    :goto_0
    return-void
    .line 29
.end method

.method public final declared-synchronized f()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->w:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    sget-object v0, Lgp5;->E:Lgp5;

    .line 9
    .line 10
    iget-object v0, v0, Lgp5;->B:Lw54;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Lw54;->M0(Ls54;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->A:Landroid/app/Application;

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->w:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    monitor-exit p0

    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 27
    throw v0
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

.method public final declared-synchronized onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object p2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->F:Lui7;

    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    const/16 v2, 0x22

    .line 11
    .line 12
    if-lt v1, v2, :cond_1

    .line 13
    .line 14
    invoke-virtual {p2}, Lui7;->b()J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    sget-wide v3, Lcom/google/firebase/perf/metrics/AppStartTrace;->U:J

    .line 19
    .line 20
    cmp-long p2, v1, v3

    .line 21
    .line 22
    if-lez p2, :cond_2

    .line 23
    .line 24
    :cond_1
    iput-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->O:Z

    .line 25
    .line 26
    :cond_2
    const/4 p2, 0x0

    .line 27
    iput-object p2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->F:Lui7;

    .line 28
    .line 29
    :goto_0
    iget-boolean p2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->O:Z

    .line 30
    .line 31
    if-nez p2, :cond_7

    .line 32
    .line 33
    iget-object p2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->E:Lui7;

    .line 34
    .line 35
    if-eqz p2, :cond_3

    .line 36
    .line 37
    goto :goto_3

    .line 38
    :cond_3
    iget-boolean p2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->R:Z

    .line 39
    .line 40
    if-nez p2, :cond_5

    .line 41
    .line 42
    iget-object p2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->A:Landroid/app/Application;

    .line 43
    .line 44
    invoke-static {p2}, Lcom/google/firebase/perf/metrics/AppStartTrace;->d(Landroid/app/Application;)Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    if-eqz p2, :cond_4

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_4
    const/4 p2, 0x0

    .line 52
    goto :goto_2

    .line 53
    :catchall_0
    move-exception p1

    .line 54
    goto :goto_4

    .line 55
    :cond_5
    :goto_1
    move p2, v0

    .line 56
    :goto_2
    iput-boolean p2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->R:Z

    .line 57
    .line 58
    new-instance p2, Ljava/lang/ref/WeakReference;

    .line 59
    .line 60
    invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    new-instance p1, Lui7;

    .line 64
    .line 65
    invoke-direct {p1}, Lui7;-><init>()V

    .line 66
    .line 67
    .line 68
    iput-object p1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->E:Lui7;

    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->c()Lui7;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iget-object p2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->E:Lui7;

    .line 75
    .line 76
    invoke-virtual {p1, p2}, Lui7;->c(Lui7;)J

    .line 77
    .line 78
    .line 79
    move-result-wide p1

    .line 80
    sget-wide v1, Lcom/google/firebase/perf/metrics/AppStartTrace;->T:J

    .line 81
    .line 82
    cmp-long p1, p1, v1

    .line 83
    .line 84
    if-lez p1, :cond_6

    .line 85
    .line 86
    iput-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->B:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    .line 88
    :cond_6
    monitor-exit p0

    .line 89
    return-void

    .line 90
    :cond_7
    :goto_3
    monitor-exit p0

    .line 91
    return-void

    .line 92
    :goto_4
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 93
    throw p1
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

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->O:Z

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->B:Z

    .line 6
    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->y:Lb01;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {}, Li01;->O()Li01;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Lb01;->g(Lwe;)Ln75;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ln75;->b()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Ln75;->a()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v0, 0x0

    .line 40
    :goto_0
    if-nez v0, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const v0, 0x1020002

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iget-object p0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->Q:Luq;

    .line 57
    .line 58
    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->removeOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V

    .line 59
    .line 60
    .line 61
    :cond_2
    :goto_1
    return-void
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

.method public final declared-synchronized onActivityResumed(Landroid/app/Activity;)V
    .locals 7

    .line 1
    const-string v0, "onResume(): "

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->O:Z

    .line 5
    .line 6
    if-nez v1, :cond_7

    .line 7
    .line 8
    iget-boolean v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->B:Z

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    goto/16 :goto_4

    .line 13
    .line 14
    :cond_0
    iget-object v1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->y:Lb01;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {}, Li01;->O()Li01;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v1, v2}, Lb01;->g(Lwe;)Ln75;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Ln75;->b()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    const/4 v3, 0x0

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    invoke-virtual {v1}, Ln75;->a()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move v1, v3

    .line 46
    :goto_0
    const/4 v2, 0x3

    .line 47
    if-eqz v1, :cond_4

    .line 48
    .line 49
    const v4, 0x1020002

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v4}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    if-eqz v4, :cond_4

    .line 57
    .line 58
    invoke-virtual {v4}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    iget-object v6, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->Q:Luq;

    .line 63
    .line 64
    invoke-virtual {v5, v6}, Landroid/view/ViewTreeObserver;->addOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V

    .line 65
    .line 66
    .line 67
    new-instance v5, Ltq;

    .line 68
    .line 69
    invoke-direct {v5, p0, v3}, Ltq;-><init>(Lcom/google/firebase/perf/metrics/AppStartTrace;I)V

    .line 70
    .line 71
    .line 72
    new-instance v3, Ldg2;

    .line 73
    .line 74
    invoke-direct {v3, v4, v5}, Ldg2;-><init>(Landroid/view/View;Ltq;)V

    .line 75
    .line 76
    .line 77
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 78
    .line 79
    const/16 v6, 0x1a

    .line 80
    .line 81
    if-ge v5, v6, :cond_3

    .line 82
    .line 83
    invoke-virtual {v4}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    invoke-virtual {v5}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    if-eqz v5, :cond_2

    .line 92
    .line 93
    invoke-virtual {v4}, Landroid/view/View;->isAttachedToWindow()Z

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    if-eqz v5, :cond_2

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_2
    new-instance v5, Lfg;

    .line 101
    .line 102
    invoke-direct {v5, v2, v3}, Lfg;-><init>(ILjava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v4, v5}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_3
    :goto_1
    invoke-virtual {v4}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    invoke-virtual {v5, v3}, Landroid/view/ViewTreeObserver;->addOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V

    .line 114
    .line 115
    .line 116
    :goto_2
    new-instance v3, Ltq;

    .line 117
    .line 118
    const/4 v5, 0x1

    .line 119
    invoke-direct {v3, p0, v5}, Ltq;-><init>(Lcom/google/firebase/perf/metrics/AppStartTrace;I)V

    .line 120
    .line 121
    .line 122
    new-instance v5, Ltq;

    .line 123
    .line 124
    const/4 v6, 0x2

    .line 125
    invoke-direct {v5, p0, v6}, Ltq;-><init>(Lcom/google/firebase/perf/metrics/AppStartTrace;I)V

    .line 126
    .line 127
    .line 128
    new-instance v6, Llm5;

    .line 129
    .line 130
    invoke-direct {v6, v4, v3, v5}, Llm5;-><init>(Landroid/view/View;Ltq;Ltq;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v4}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    invoke-virtual {v3, v6}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 138
    .line 139
    .line 140
    goto :goto_3

    .line 141
    :catchall_0
    move-exception p1

    .line 142
    goto :goto_5

    .line 143
    :cond_4
    :goto_3
    iget-object v3, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->H:Lui7;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 144
    .line 145
    if-eqz v3, :cond_5

    .line 146
    .line 147
    monitor-exit p0

    .line 148
    return-void

    .line 149
    :cond_5
    :try_start_1
    new-instance v3, Ljava/lang/ref/WeakReference;

    .line 150
    .line 151
    invoke-direct {v3, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    new-instance v3, Lui7;

    .line 155
    .line 156
    invoke-direct {v3}, Lui7;-><init>()V

    .line 157
    .line 158
    .line 159
    iput-object v3, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->H:Lui7;

    .line 160
    .line 161
    invoke-static {}, Lcom/google/firebase/perf/session/SessionManager;->getInstance()Lcom/google/firebase/perf/session/SessionManager;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    invoke-virtual {v3}, Lcom/google/firebase/perf/session/SessionManager;->perfSession()Lsf5;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    iput-object v3, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->N:Lsf5;

    .line 170
    .line 171
    invoke-static {}, Lrg;->d()Lrg;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    new-instance v4, Ljava/lang/StringBuilder;

    .line 176
    .line 177
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    const-string p1, ": "

    .line 192
    .line 193
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->b()Lui7;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->H:Lui7;

    .line 201
    .line 202
    invoke-virtual {p1, v0}, Lui7;->c(Lui7;)J

    .line 203
    .line 204
    .line 205
    move-result-wide v5

    .line 206
    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    const-string p1, " microseconds"

    .line 210
    .line 211
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    invoke-virtual {v3, p1}, Lrg;->a(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    sget-object p1, Lcom/google/firebase/perf/metrics/AppStartTrace;->W:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 222
    .line 223
    new-instance v0, Ltq;

    .line 224
    .line 225
    invoke-direct {v0, p0, v2}, Ltq;-><init>(Lcom/google/firebase/perf/metrics/AppStartTrace;I)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p1, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 229
    .line 230
    .line 231
    if-nez v1, :cond_6

    .line 232
    .line 233
    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->f()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 234
    .line 235
    .line 236
    :cond_6
    monitor-exit p0

    .line 237
    return-void

    .line 238
    :cond_7
    :goto_4
    monitor-exit p0

    .line 239
    return-void

    .line 240
    :goto_5
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 241
    throw p1
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
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public final declared-synchronized onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean p1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->O:Z

    .line 3
    .line 4
    if-nez p1, :cond_1

    .line 5
    .line 6
    iget-object p1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->G:Lui7;

    .line 7
    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    iget-boolean p1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->B:Z

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance p1, Lui7;

    .line 16
    .line 17
    invoke-direct {p1}, Lui7;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->G:Lui7;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    monitor-exit p0

    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    monitor-exit p0

    .line 27
    return-void

    .line 28
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    throw p1
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public onAppEnteredBackground()V
    .locals 3
    .annotation runtime Lg55;
        value = .enum Lj54;->ON_STOP:Lj54;
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->O:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->B:Z

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->J:Lui7;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v0, Lui7;

    .line 15
    .line 16
    invoke-direct {v0}, Lui7;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->J:Lui7;

    .line 20
    .line 21
    invoke-static {}, Lyk7;->L()Lvk7;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, "_experiment_firstBackgrounding"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lvk7;->m(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->c()Lui7;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget-wide v1, v1, Lui7;->w:J

    .line 35
    .line 36
    invoke-virtual {v0, v1, v2}, Lvk7;->k(J)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->c()Lui7;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iget-object v2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->J:Lui7;

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Lui7;->c(Lui7;)J

    .line 46
    .line 47
    .line 48
    move-result-wide v1

    .line 49
    invoke-virtual {v0, v1, v2}, Lvk7;->l(J)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Lqu2;->g()Lcom/google/protobuf/b;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Lyk7;

    .line 57
    .line 58
    iget-object p0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->z:Lvk7;

    .line 59
    .line 60
    invoke-virtual {p0, v0}, Lvk7;->i(Lyk7;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    :goto_0
    return-void
.end method

.method public onAppEnteredForeground()V
    .locals 3
    .annotation runtime Lg55;
        value = .enum Lj54;->ON_START:Lj54;
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->O:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->B:Z

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->I:Lui7;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v0, Lui7;

    .line 15
    .line 16
    invoke-direct {v0}, Lui7;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->I:Lui7;

    .line 20
    .line 21
    invoke-static {}, Lyk7;->L()Lvk7;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, "_experiment_firstForegrounding"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lvk7;->m(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->c()Lui7;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget-wide v1, v1, Lui7;->w:J

    .line 35
    .line 36
    invoke-virtual {v0, v1, v2}, Lvk7;->k(J)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/AppStartTrace;->c()Lui7;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iget-object v2, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->I:Lui7;

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Lui7;->c(Lui7;)J

    .line 46
    .line 47
    .line 48
    move-result-wide v1

    .line 49
    invoke-virtual {v0, v1, v2}, Lvk7;->l(J)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Lqu2;->g()Lcom/google/protobuf/b;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Lyk7;

    .line 57
    .line 58
    iget-object p0, p0, Lcom/google/firebase/perf/metrics/AppStartTrace;->z:Lvk7;

    .line 59
    .line 60
    invoke-virtual {p0, v0}, Lvk7;->i(Lyk7;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    :goto_0
    return-void
.end method
