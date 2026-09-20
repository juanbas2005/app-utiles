.class public final Lcu/lestebang/utiletecsa/feature/settings/service/CallBlockService;
.super Landroid/telecom/CallScreeningService;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lnu2;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcu/lestebang/utiletecsa/feature/settings/service/CallBlockService;",
        "Landroid/telecom/CallScreeningService;",
        "<init>",
        "()V",
        "settings"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final A:Lig0;

.field public volatile w:Lyl6;

.field public final x:Ljava/lang/Object;

.field public y:Z

.field public z:Lvp6;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/telecom/CallScreeningService;-><init>()V

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
    iput-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/CallBlockService;->x:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/CallBlockService;->y:Z

    .line 13
    .line 14
    invoke-static {}, Lb85;->d()Lw77;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sget-object v1, Law1;->a:Ldn1;

    .line 19
    .line 20
    sget-object v1, Lcm1;->y:Lcm1;

    .line 21
    .line 22
    invoke-static {v0, v1}, Lrc9;->D0(Lc81;Le81;)Le81;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, Lgl0;->E(Le81;)Lig0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/CallBlockService;->A:Lig0;

    .line 31
    .line 32
    return-void
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


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/CallBlockService;->w:Lyl6;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/CallBlockService;->x:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Lcu/lestebang/utiletecsa/feature/settings/service/CallBlockService;->w:Lyl6;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lyl6;

    .line 13
    .line 14
    invoke-direct {v1, p0}, Lyl6;-><init>(Landroid/app/Service;)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lcu/lestebang/utiletecsa/feature/settings/service/CallBlockService;->w:Lyl6;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    goto :goto_2

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw p0

    .line 26
    :cond_1
    :goto_2
    iget-object p0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/CallBlockService;->w:Lyl6;

    .line 27
    .line 28
    invoke-virtual {p0}, Lyl6;->a()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
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

.method public final onCreate()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/CallBlockService;->y:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/CallBlockService;->y:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lcu/lestebang/utiletecsa/feature/settings/service/CallBlockService;->a()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lli0;

    .line 13
    .line 14
    check-cast v0, Lsd1;

    .line 15
    .line 16
    iget-object v0, v0, Lsd1;->a:Lvd1;

    .line 17
    .line 18
    iget-object v0, v0, Lvd1;->x:Llu5;

    .line 19
    .line 20
    invoke-interface {v0}, Lmu5;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lvp6;

    .line 25
    .line 26
    iput-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/CallBlockService;->z:Lvp6;

    .line 27
    .line 28
    :cond_0
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 29
    .line 30
    .line 31
    return-void
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

.method public final onDestroy()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/CallBlockService;->A:Lig0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lgl0;->J(Lo81;Ljava/util/concurrent/CancellationException;)V

    .line 5
    .line 6
    .line 7
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

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
.end method

.method public final onScreenCall(Landroid/telecom/Call$Details;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lnd;->a(Landroid/telecom/Call$Details;)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Landroid/telecom/CallScreeningService$CallResponse$Builder;

    .line 11
    .line 12
    invoke-direct {v0}, Landroid/telecom/CallScreeningService$CallResponse$Builder;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/telecom/CallScreeningService$CallResponse$Builder;->build()Landroid/telecom/CallScreeningService$CallResponse;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0, p1, v0}, Landroid/telecom/CallScreeningService;->respondToCall(Landroid/telecom/Call$Details;Landroid/telecom/CallScreeningService$CallResponse;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    new-instance v1, Lng;

    .line 28
    .line 29
    const/4 v6, 0x2

    .line 30
    const/4 v5, 0x0

    .line 31
    move-object v4, p0

    .line 32
    move-object v2, p1

    .line 33
    invoke-direct/range {v1 .. v6}, Lng;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lf61;I)V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x3

    .line 37
    iget-object p1, v4, Lcu/lestebang/utiletecsa/feature/settings/service/CallBlockService;->A:Lig0;

    .line 38
    .line 39
    invoke-static {p1, v5, v5, v1, p0}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

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
