.class public final Lqu6;
.super Lin8;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public A:Lup4;

.field public B:Lxk6;

.field public final C:Lay5;

.field public final D:Lc9;

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:Lup4;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x7

    .line 2
    invoke-direct {p0, v0}, Lin8;-><init>(I)V

    .line 3
    .line 4
    .line 5
    new-instance v0, Lay5;

    .line 6
    .line 7
    const/16 v1, 0xd

    .line 8
    .line 9
    invoke-direct {v0, v1, p0}, Lay5;-><init>(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lqu6;->C:Lay5;

    .line 13
    .line 14
    new-instance v0, Lph6;

    .line 15
    .line 16
    const/4 v1, 0x6

    .line 17
    invoke-direct {v0, v1, p0}, Lph6;-><init>(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sget-object v1, Lnx6;->a:Lnf6;

    .line 21
    .line 22
    invoke-static {v1}, Lnx6;->e(Lvr2;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    sget-object v1, Lnx6;->c:Ljava/lang/Object;

    .line 26
    .line 27
    monitor-enter v1

    .line 28
    :try_start_0
    sget-object v2, Lnx6;->h:Ljava/util/List;

    .line 29
    .line 30
    invoke-static {v2, v0}, Ldt0;->N0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    sput-object v2, Lnx6;->h:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    monitor-exit v1

    .line 37
    new-instance v1, Lc9;

    .line 38
    .line 39
    const/16 v2, 0x10

    .line 40
    .line 41
    invoke-direct {v1, v2, v0}, Lc9;-><init>(ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Lqu6;->D:Lc9;

    .line 45
    .line 46
    return-void

    .line 47
    :catchall_0
    move-exception p0

    .line 48
    monitor-exit v1

    .line 49
    throw p0
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
.method public final A0(Lxk6;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lqu6;->y:Ljava/lang/Object;

    .line 3
    .line 4
    iput-object p1, p0, Lqu6;->A:Lup4;

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

.method public final B0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lin8;->w:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lqu6;->y:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object v1, p0, Lqu6;->x:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v1, p0, Lqu6;->A:Lup4;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iput-object v1, p0, Lqu6;->z:Lup4;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    iget-object v1, p0, Lqu6;->z:Lup4;

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    sget-object v1, Lcg6;->a:Lup4;

    .line 23
    .line 24
    new-instance v1, Lup4;

    .line 25
    .line 26
    invoke-direct {v1}, Lup4;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Lqu6;->z:Lup4;

    .line 30
    .line 31
    :cond_1
    iget-object v1, p0, Lqu6;->z:Lup4;

    .line 32
    .line 33
    iget-object v2, p0, Lqu6;->A:Lup4;

    .line 34
    .line 35
    iput-object v2, p0, Lqu6;->z:Lup4;

    .line 36
    .line 37
    iput-object v1, p0, Lqu6;->A:Lup4;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    :goto_0
    monitor-exit v0

    .line 40
    return-void

    .line 41
    :goto_1
    monitor-exit v0

    .line 42
    throw p0
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

.method public final C0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lqu6;->D:Lc9;

    .line 2
    .line 3
    invoke-virtual {v0}, Lc9;->h()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lqu6;->y:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object v0, p0, Lqu6;->A:Lup4;

    .line 10
    .line 11
    iget-object v1, p0, Lin8;->w:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v1

    .line 14
    :try_start_0
    iput-object v0, p0, Lqu6;->B:Lxk6;

    .line 15
    .line 16
    iput-object v0, p0, Lqu6;->x:Ljava/lang/Object;

    .line 17
    .line 18
    iput-object v0, p0, Lqu6;->z:Lup4;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    monitor-exit v1

    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    monitor-exit v1

    .line 24
    throw p0
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

.method public final L0(Lxk6;)Lvr2;
    .locals 1

    .line 1
    iget-object v0, p0, Lqu6;->B:Lxk6;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, "Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions"

    .line 13
    .line 14
    invoke-static {v0}, Lvm5;->b(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    :goto_0
    iput-object p1, p0, Lqu6;->B:Lxk6;

    .line 18
    .line 19
    iget-object p0, p0, Lqu6;->C:Lay5;

    .line 20
    .line 21
    return-object p0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final N0(Len0;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lqu6;->B:Lxk6;

    .line 3
    .line 4
    iput-object p1, p0, Lqu6;->y:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p1, p0, Lqu6;->A:Lup4;

    .line 7
    .line 8
    invoke-virtual {p0}, Lqu6;->B0()V

    .line 9
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
.end method
