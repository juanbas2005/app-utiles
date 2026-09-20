.class public final Lqz0;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final d:Ljava/util/HashMap;

.field public static final e:Lor;


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Le01;

.field public c:Lyb9;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lqz0;->d:Ljava/util/HashMap;

    .line 7
    .line 8
    new-instance v0, Lor;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Lor;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lqz0;->e:Lor;

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;Le01;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqz0;->a:Ljava/util/concurrent/Executor;

    .line 5
    .line 6
    iput-object p2, p0, Lqz0;->b:Le01;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Lqz0;->c:Lyb9;

    .line 10
    .line 11
    return-void
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

.method public static a(Lyb9;)Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance v0, Lwv2;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lwv2;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lqz0;->e:Lor;

    .line 9
    .line 10
    invoke-virtual {p0, v1, v0}, Lyb9;->e(Ljava/util/concurrent/Executor;Lk55;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v1, v0}, Lyb9;->d(Ljava/util/concurrent/Executor;Lc55;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v1, v0}, Lyb9;->a(Ljava/util/concurrent/Executor;Lx45;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, v0, Lwv2;->x:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/util/concurrent/CountDownLatch;

    .line 22
    .line 23
    const-wide/16 v1, 0x5

    .line 24
    .line 25
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 26
    .line 27
    invoke-virtual {v0, v1, v2, v3}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0}, Lyb9;->k()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    invoke-virtual {p0}, Lyb9;->i()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :cond_0
    new-instance v0, Ljava/util/concurrent/ExecutionException;

    .line 45
    .line 46
    invoke-virtual {p0}, Lyb9;->h()Ljava/lang/Exception;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-direct {v0, p0}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    throw v0

    .line 54
    :cond_1
    new-instance p0, Ljava/util/concurrent/TimeoutException;

    .line 55
    .line 56
    const-string v0, "Task await timed out."

    .line 57
    .line 58
    invoke-direct {p0, v0}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p0
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


# virtual methods
.method public final declared-synchronized b()Lyb9;
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lqz0;->c:Lyb9;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Lyb9;->j()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lqz0;->c:Lyb9;

    .line 13
    .line 14
    invoke-virtual {v0}, Lyb9;->k()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    iget-object v0, p0, Lqz0;->a:Ljava/util/concurrent/Executor;

    .line 24
    .line 25
    iget-object v1, p0, Lqz0;->b:Le01;

    .line 26
    .line 27
    new-instance v2, Loz0;

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-direct {v2, v3, v1}, Loz0;-><init>(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v2}, Lb35;->d(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lyb9;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iput-object v0, p0, Lqz0;->c:Lyb9;

    .line 38
    .line 39
    :cond_1
    iget-object v0, p0, Lqz0;->c:Lyb9;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    monitor-exit p0

    .line 42
    return-object v0

    .line 43
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    throw v0
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

.method public final c()Lsz0;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lqz0;->c:Lyb9;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Lyb9;->k()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lqz0;->c:Lyb9;

    .line 13
    .line 14
    invoke-virtual {v0}, Lyb9;->i()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lsz0;

    .line 19
    .line 20
    monitor-exit p0

    .line 21
    return-object v0

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    :try_start_1
    invoke-virtual {p0}, Lqz0;->b()Lyb9;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, Lqz0;->a(Lyb9;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Lsz0;
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_0

    .line 34
    .line 35
    return-object p0

    .line 36
    :catch_0
    move-exception p0

    .line 37
    const-string v0, "FirebaseRemoteConfig"

    .line 38
    .line 39
    const-string v1, "Reading from storage file failed."

    .line 40
    .line 41
    invoke-static {v0, v1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 42
    .line 43
    .line 44
    const/4 p0, 0x0

    .line 45
    return-object p0

    .line 46
    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

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
