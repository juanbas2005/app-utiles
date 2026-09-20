.class public final Lkh5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkh5;->a:Landroid/content/Context;

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


# virtual methods
.method public final a()V
    .locals 6

    .line 1
    sget-object v0, Lyh7;->a:Lhr2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v1, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-static {v1}, Lhr2;->m([Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lkh5;->a:Landroid/content/Context;

    .line 13
    .line 14
    invoke-static {p0}, Lnd8;->c(Landroid/content/Context;)Lnd8;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    iget-object v0, p0, Lnd8;->b:Lf01;

    .line 19
    .line 20
    iget-object v0, v0, Lf01;->m:Ltd0;

    .line 21
    .line 22
    const-string v1, "CancelWorkByName_"

    .line 23
    .line 24
    const-string v2, "cu.lestebang.utiletecsa.sync.worker.planexpiry"

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iget-object v3, p0, Lnd8;->d:Lqd8;

    .line 31
    .line 32
    iget-object v3, v3, Lqd8;->a:Lol6;

    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    new-instance v4, Lf5;

    .line 38
    .line 39
    const/16 v5, 0xb

    .line 40
    .line 41
    invoke-direct {v4, v5, v2, p0}, Lf5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v1, v3, v4}, Lg75;->E(Ltd0;Ljava/lang/String;Ljava/util/concurrent/Executor;Lsr2;)Lg22;

    .line 45
    .line 46
    .line 47
    return-void
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

.method public final b()V
    .locals 3

    .line 1
    sget-object v0, Lyh7;->a:Lhr2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v1, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-static {v1}, Lhr2;->m([Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lkh5;->a:Landroid/content/Context;

    .line 13
    .line 14
    invoke-static {p0}, Lnd8;->c(Landroid/content/Context;)Lnd8;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    sget-object v0, Lcu/lestebang/utiletecsa/sync/worker/PlanExpiryWorker;->k:Lk26;

    .line 19
    .line 20
    new-instance v0, Lr55;

    .line 21
    .line 22
    const-wide/16 v1, 0xc

    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, Lr55;-><init>(J)V

    .line 25
    .line 26
    .line 27
    const-class v1, Lcu/lestebang/utiletecsa/sync/worker/PlanExpiryWorker;

    .line 28
    .line 29
    sget-object v2, Lb26;->a:Lc26;

    .line 30
    .line 31
    invoke-virtual {v2, v1}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v1}, Lwe;->i(Lgq3;)Lce1;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget-object v2, v0, Lst5;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v2, Lbe8;

    .line 42
    .line 43
    iput-object v1, v2, Lbe8;->e:Lce1;

    .line 44
    .line 45
    invoke-virtual {v0}, Lst5;->a()Lxd8;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Ltf5;

    .line 50
    .line 51
    const-string v1, "cu.lestebang.utiletecsa.sync.worker.planexpiry"

    .line 52
    .line 53
    invoke-virtual {p0, v1, v0}, Lnd8;->a(Ljava/lang/String;Ltf5;)Lg22;

    .line 54
    .line 55
    .line 56
    return-void
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method
