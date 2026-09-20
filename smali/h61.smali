.class public abstract Lh61;
.super Lq50;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final x:Le81;

.field public transient y:Lf61;


# direct methods
.method public constructor <init>(Lf61;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p1}, Lf61;->r()Le81;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    invoke-direct {p0, p1, v0}, Lh61;-><init>(Lf61;Le81;)V

    .line 10
    .line 11
    .line 12
    return-void
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

.method public constructor <init>(Lf61;Le81;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1}, Lq50;-><init>(Lf61;)V

    .line 14
    iput-object p2, p0, Lh61;->x:Le81;

    return-void
.end method


# virtual methods
.method public r()Le81;
    .locals 0

    .line 1
    iget-object p0, p0, Lh61;->x:Le81;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-object p0
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
.end method

.method public t()V
    .locals 3

    .line 1
    iget-object v0, p0, Lh61;->y:Lf61;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    if-eq v0, p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lh61;->r()Le81;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sget-object v2, Lhz2;->z:Lhz2;

    .line 12
    .line 13
    invoke-interface {v1, v2}, Le81;->a0(Ld81;)Lc81;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    check-cast v1, Lh81;

    .line 21
    .line 22
    check-cast v0, Lsv1;

    .line 23
    .line 24
    invoke-virtual {v0}, Lsv1;->k()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lsv1;->m()Lkk0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {v0}, Lkk0;->o()V

    .line 34
    .line 35
    .line 36
    :cond_0
    sget-object v0, Lzu0;->x:Lzu0;

    .line 37
    .line 38
    iput-object v0, p0, Lh61;->y:Lf61;

    .line 39
    .line 40
    return-void
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
