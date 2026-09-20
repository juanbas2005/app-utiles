.class public final Lya1;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final w:Ljava/util/concurrent/ExecutorService;

.field public final x:Ljava/lang/Object;

.field public y:Lyb9;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ExecutorService;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lya1;->x:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-static {v0}, Lb35;->l(Ljava/lang/Object;)Lyb9;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lya1;->y:Lyb9;

    .line 17
    .line 18
    iput-object p1, p0, Lya1;->w:Ljava/util/concurrent/ExecutorService;

    .line 19
    .line 20
    return-void
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
.method public final a(Ljava/lang/Runnable;)Lyb9;
    .locals 5

    .line 1
    iget-object v0, p0, Lya1;->x:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lya1;->y:Lyb9;

    .line 5
    .line 6
    iget-object v2, p0, Lya1;->w:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    new-instance v3, Lc9;

    .line 9
    .line 10
    const/4 v4, 0x6

    .line 11
    invoke-direct {v3, v4, p1}, Lc9;-><init>(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2, v3}, Lyb9;->g(Ljava/util/concurrent/Executor;Lg61;)Lyb9;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lya1;->y:Lyb9;

    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-object p1

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw p0
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final b(Ljava/util/concurrent/Callable;)Lyb9;
    .locals 5

    .line 1
    iget-object v0, p0, Lya1;->x:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lya1;->y:Lyb9;

    .line 5
    .line 6
    iget-object v2, p0, Lya1;->w:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    new-instance v3, Lc9;

    .line 9
    .line 10
    const/4 v4, 0x5

    .line 11
    invoke-direct {v3, v4, p1}, Lc9;-><init>(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2, v3}, Lyb9;->g(Ljava/util/concurrent/Executor;Lg61;)Lyb9;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lya1;->y:Lyb9;

    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-object p1

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw p0
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final execute(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lya1;->w:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 4
    .line 5
    .line 6
    return-void
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
