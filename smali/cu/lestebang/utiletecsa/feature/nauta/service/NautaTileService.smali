.class public final Lcu/lestebang/utiletecsa/feature/nauta/service/NautaTileService;
.super Landroid/service/quicksettings/TileService;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lnu2;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcu/lestebang/utiletecsa/feature/nauta/service/NautaTileService;",
        "Landroid/service/quicksettings/TileService;",
        "<init>",
        "()V",
        "nauta"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic D:I


# instance fields
.field public final A:Lig0;

.field public B:Lh27;

.field public C:Lh27;

.field public volatile w:Lyl6;

.field public final x:Ljava/lang/Object;

.field public y:Z

.field public z:Lur4;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/service/quicksettings/TileService;-><init>()V

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
    iput-object v0, p0, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaTileService;->x:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaTileService;->y:Z

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
    sget-object v1, Lpe4;->a:Lgy2;

    .line 21
    .line 22
    iget-object v1, v1, Lgy2;->B:Lgy2;

    .line 23
    .line 24
    invoke-static {v0, v1}, Lrc9;->D0(Lc81;Le81;)Le81;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Lgl0;->E(Le81;)Lig0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaTileService;->A:Lig0;

    .line 33
    .line 34
    return-void
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

.method public static final b(Lcu/lestebang/utiletecsa/feature/nauta/service/NautaTileService;ZLjava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/service/quicksettings/TileService;->getQsTile()Landroid/service/quicksettings/Tile;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    if-eqz p1, :cond_1

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    goto :goto_0

    .line 12
    :cond_1
    const/4 v0, 0x1

    .line 13
    :goto_0
    invoke-virtual {p0, v0}, Landroid/service/quicksettings/Tile;->setState(I)V

    .line 14
    .line 15
    .line 16
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 17
    .line 18
    const/16 v1, 0x1d

    .line 19
    .line 20
    if-lt v0, v1, :cond_3

    .line 21
    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    invoke-static {p2}, Ld57;->I0(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-nez p1, :cond_2

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_2
    const/4 p2, 0x0

    .line 32
    :goto_1
    invoke-static {p0, p2}, Lix2;->n(Landroid/service/quicksettings/Tile;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :cond_3
    invoke-virtual {p0}, Landroid/service/quicksettings/Tile;->updateTile()V

    .line 36
    .line 37
    .line 38
    return-void
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
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaTileService;->w:Lyl6;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaTileService;->x:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaTileService;->w:Lyl6;

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
    iput-object v1, p0, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaTileService;->w:Lyl6;

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
    iget-object p0, p0, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaTileService;->w:Lyl6;

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

.method public final c()Lur4;
    .locals 0

    .line 1
    iget-object p0, p0, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaTileService;->z:Lur4;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "nautaRepository"

    .line 7
    .line 8
    invoke-static {p0}, Lsg3;->a0(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
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

.method public final onClick()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/service/quicksettings/TileService;->onClick()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaTileService;->C:Lh27;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lll3;->l()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x1

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance v0, Lb23;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-direct {v0, p0, v1}, Lb23;-><init>(Lcu/lestebang/utiletecsa/feature/nauta/service/NautaTileService;Lf61;)V

    .line 20
    .line 21
    .line 22
    const/4 v2, 0x3

    .line 23
    iget-object v3, p0, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaTileService;->A:Lig0;

    .line 24
    .line 25
    invoke-static {v3, v1, v1, v0, v2}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaTileService;->C:Lh27;

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

.method public final onCreate()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaTileService;->y:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaTileService;->y:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaTileService;->a()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lss4;

    .line 13
    .line 14
    check-cast v0, Lsd1;

    .line 15
    .line 16
    iget-object v0, v0, Lsd1;->a:Lvd1;

    .line 17
    .line 18
    iget-object v0, v0, Lvd1;->C:Llu5;

    .line 19
    .line 20
    invoke-interface {v0}, Lmu5;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lur4;

    .line 25
    .line 26
    iput-object v0, p0, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaTileService;->z:Lur4;

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
    iget-object v0, p0, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaTileService;->A:Lig0;

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

.method public final onStartListening()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/service/quicksettings/TileService;->onStartListening()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lot;

    .line 5
    .line 6
    const/16 v1, 0x15

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v0, p0, v2, v1}, Lot;-><init>(Ljava/lang/Object;Lf61;I)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x3

    .line 13
    iget-object v3, p0, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaTileService;->A:Lig0;

    .line 14
    .line 15
    invoke-static {v3, v2, v2, v0, v1}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaTileService;->B:Lh27;

    .line 20
    .line 21
    return-void
.end method

.method public final onStopListening()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaTileService;->B:Lh27;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0, v1}, Lll3;->o(Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iput-object v1, p0, Lcu/lestebang/utiletecsa/feature/nauta/service/NautaTileService;->B:Lh27;

    .line 10
    .line 11
    invoke-super {p0}, Landroid/service/quicksettings/TileService;->onStopListening()V

    .line 12
    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
