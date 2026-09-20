.class public final Lb44;
.super Lh27;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final B:Lf61;


# direct methods
.method public constructor <init>(Le81;Lgs2;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lb1;-><init>(Le81;Z)V

    .line 3
    .line 4
    .line 5
    invoke-static {p0, p0, p2}, Lrc9;->C(Lf61;Lf61;Lgs2;)Lf61;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lb44;->B:Lf61;

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


# virtual methods
.method public final k0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lb44;->B:Lf61;

    .line 2
    .line 3
    :try_start_0
    invoke-static {v0}, Lrc9;->a0(Lf61;)Lf61;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lvs7;->a:Lvs7;

    .line 8
    .line 9
    invoke-static {v0, v1}, Ltv1;->a(Lf61;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    invoke-static {p0, v0}, Lkl8;->k(Lf61;Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    throw p0
    .line 19
    .line 20
    .line 21
.end method
