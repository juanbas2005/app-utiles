.class public final Ldr;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lnu2;


# instance fields
.field public volatile w:Lvd1;

.field public final x:Ljava/lang/Object;

.field public final y:Lwv2;


# direct methods
.method public constructor <init>(Lwv2;)V
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
    iput-object v0, p0, Ldr;->x:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p1, p0, Ldr;->y:Lwv2;

    .line 12
    .line 13
    return-void
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
.method public final a()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Ldr;->w:Lvd1;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Ldr;->x:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Ldr;->w:Lvd1;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Ldr;->y:Lwv2;

    .line 13
    .line 14
    new-instance v2, Ler;

    .line 15
    .line 16
    iget-object v1, v1, Lwv2;->x:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Lcu/lestebang/utiletecsa/App;

    .line 19
    .line 20
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v1, v2, Ler;->a:Landroid/content/Context;

    .line 24
    .line 25
    new-instance v1, Lvd1;

    .line 26
    .line 27
    invoke-direct {v1, v2}, Lvd1;-><init>(Ler;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Ldr;->w:Lvd1;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    :goto_0
    monitor-exit v0

    .line 36
    goto :goto_2

    .line 37
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    throw p0

    .line 39
    :cond_1
    :goto_2
    iget-object p0, p0, Ldr;->w:Lvd1;

    .line 40
    .line 41
    return-object p0
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
