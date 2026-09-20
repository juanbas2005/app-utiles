.class public final Lwk;
.super Lwx3;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lhs2;


# instance fields
.field public final synthetic x:Lvr2;

.field public final synthetic y:Lmm7;


# direct methods
.method public constructor <init>(Lvr2;Lmm7;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lwk;->x:Lvr2;

    .line 2
    .line 3
    iput-object p2, p0, Lwk;->y:Lmm7;

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1}, Lwx3;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
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
.method public final u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Loh4;

    .line 2
    .line 3
    check-cast p2, Lgh4;

    .line 4
    .line 5
    check-cast p3, Lk31;

    .line 6
    .line 7
    iget-wide v0, p3, Lk31;->a:J

    .line 8
    .line 9
    invoke-interface {p2, v0, v1}, Lgh4;->y(J)Leh5;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-interface {p1}, Lkg3;->a0()Z

    .line 14
    .line 15
    .line 16
    move-result p3

    .line 17
    const-wide v0, 0xffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    const/16 v2, 0x20

    .line 23
    .line 24
    if-eqz p3, :cond_0

    .line 25
    .line 26
    iget-object p3, p0, Lwk;->y:Lmm7;

    .line 27
    .line 28
    iget-object p3, p3, Lmm7;->d:Led5;

    .line 29
    .line 30
    invoke-virtual {p3}, Led5;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p3

    .line 34
    iget-object p0, p0, Lwk;->x:Lvr2;

    .line 35
    .line 36
    invoke-interface {p0, p3}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-nez p0, :cond_0

    .line 47
    .line 48
    const-wide/16 v3, 0x0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    iget p0, p2, Leh5;->w:I

    .line 52
    .line 53
    iget p3, p2, Leh5;->x:I

    .line 54
    .line 55
    int-to-long v3, p0

    .line 56
    shl-long/2addr v3, v2

    .line 57
    int-to-long v5, p3

    .line 58
    and-long/2addr v5, v0

    .line 59
    or-long/2addr v3, v5

    .line 60
    :goto_0
    shr-long v5, v3, v2

    .line 61
    .line 62
    long-to-int p0, v5

    .line 63
    and-long/2addr v0, v3

    .line 64
    long-to-int p3, v0

    .line 65
    new-instance v0, Lwd;

    .line 66
    .line 67
    const/4 v1, 0x2

    .line 68
    invoke-direct {v0, p2, v1}, Lwd;-><init>(Leh5;I)V

    .line 69
    .line 70
    .line 71
    sget-object p2, Lb42;->w:Lb42;

    .line 72
    .line 73
    invoke-interface {p1, p0, p3, p2, v0}, Loh4;->d0(IILjava/util/Map;Lvr2;)Lmh4;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0
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
