.class public final Lrz6;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lvp6;

.field public final c:Lig0;

.field public final d:Landroid/net/ConnectivityManager;

.field public final e:Landroid/net/NetworkRequest;

.field public final f:Ljava/util/Set;

.field public final g:Ldb3;

.field public h:Z

.field public i:Lh27;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lvp6;Lh81;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lrz6;->a:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p2, p0, Lrz6;->b:Lvp6;

    .line 10
    .line 11
    invoke-static {}, Lb85;->d()Lw77;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-static {p2, p3}, Lrc9;->D0(Lc81;Le81;)Le81;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-static {p2}, Lgl0;->E(Le81;)Lig0;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    iput-object p2, p0, Lrz6;->c:Lig0;

    .line 24
    .line 25
    const-class p2, Landroid/net/ConnectivityManager;

    .line 26
    .line 27
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Landroid/net/ConnectivityManager;

    .line 32
    .line 33
    iput-object p1, p0, Lrz6;->d:Landroid/net/ConnectivityManager;

    .line 34
    .line 35
    new-instance p1, Landroid/net/NetworkRequest$Builder;

    .line 36
    .line 37
    invoke-direct {p1}, Landroid/net/NetworkRequest$Builder;-><init>()V

    .line 38
    .line 39
    .line 40
    const/4 p2, 0x1

    .line 41
    invoke-virtual {p1, p2}, Landroid/net/NetworkRequest$Builder;->addTransportType(I)Landroid/net/NetworkRequest$Builder;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const/4 p2, 0x0

    .line 46
    invoke-virtual {p1, p2}, Landroid/net/NetworkRequest$Builder;->addTransportType(I)Landroid/net/NetworkRequest$Builder;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iput-object p1, p0, Lrz6;->e:Landroid/net/NetworkRequest;

    .line 55
    .line 56
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 57
    .line 58
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-static {p1}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iput-object p1, p0, Lrz6;->f:Ljava/util/Set;

    .line 66
    .line 67
    new-instance p1, Ldb3;

    .line 68
    .line 69
    const/4 p2, 0x3

    .line 70
    invoke-direct {p1, p2, p0}, Ldb3;-><init>(ILjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iput-object p1, p0, Lrz6;->g:Ldb3;

    .line 74
    .line 75
    return-void
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
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lrz6;->i:Lh27;

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
    new-instance v0, Lgw6;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-direct {v0, p0, v1, v2}, Lgw6;-><init>(Ljava/lang/Object;Lf61;I)V

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x3

    .line 16
    iget-object v3, p0, Lrz6;->c:Lig0;

    .line 17
    .line 18
    invoke-static {v3, v1, v1, v0, v2}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lrz6;->i:Lh27;

    .line 23
    .line 24
    return-void
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
