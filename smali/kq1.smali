.class public final Lkq1;
.super Ldd3;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lmy3;


# instance fields
.field public M:Laa8;

.field public N:Lkj6;

.field public O:Laa8;


# virtual methods
.method public final V0(Laa8;)Laa8;
    .locals 0

    .line 1
    return-object p1
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
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

.method public final W0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lkq1;->M:Laa8;

    .line 2
    .line 3
    iget-object v1, p0, Ldd3;->K:Laa8;

    .line 4
    .line 5
    new-instance v2, Ly72;

    .line 6
    .line 7
    invoke-direct {v2, v0, v1}, Ly72;-><init>(Laa8;Laa8;)V

    .line 8
    .line 9
    .line 10
    iput-object v2, p0, Lkq1;->O:Laa8;

    .line 11
    .line 12
    invoke-super {p0}, Ldd3;->W0()V

    .line 13
    .line 14
    .line 15
    invoke-static {p0}, Lsu0;->B(Lmy3;)V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
.end method

.method public final c(Loh4;Lgh4;J)Lmh4;
    .locals 8

    .line 1
    iget-object v0, p0, Lkq1;->N:Lkj6;

    .line 2
    .line 3
    iget-object p0, p0, Lkq1;->O:Laa8;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface {p0, p1}, Laa8;->c(Ltp1;)I

    .line 9
    .line 10
    .line 11
    move-result v5

    .line 12
    sget-object p0, Lb42;->w:Lb42;

    .line 13
    .line 14
    if-nez v5, :cond_0

    .line 15
    .line 16
    new-instance p2, Lvd2;

    .line 17
    .line 18
    const/16 p3, 0x14

    .line 19
    .line 20
    invoke-direct {p2, p3}, Lvd2;-><init>(I)V

    .line 21
    .line 22
    .line 23
    const/4 p3, 0x0

    .line 24
    invoke-interface {p1, p3, p3, p0, p2}, Loh4;->d0(IILjava/util/Map;Lvr2;)Lmh4;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_0
    const/4 v4, 0x0

    .line 30
    const/4 v7, 0x3

    .line 31
    const/4 v3, 0x0

    .line 32
    move v6, v5

    .line 33
    move-wide v1, p3

    .line 34
    invoke-static/range {v1 .. v7}, Lk31;->a(JIIIII)J

    .line 35
    .line 36
    .line 37
    move-result-wide p3

    .line 38
    invoke-interface {p2, p3, p4}, Lgh4;->y(J)Leh5;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    iget p3, p2, Leh5;->w:I

    .line 43
    .line 44
    new-instance p4, Lws;

    .line 45
    .line 46
    const/4 v0, 0x4

    .line 47
    invoke-direct {p4, p2, v0}, Lws;-><init>(Leh5;I)V

    .line 48
    .line 49
    .line 50
    invoke-interface {p1, p3, v5, p0, p4}, Loh4;->d0(IILjava/util/Map;Lvr2;)Lmh4;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0
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
