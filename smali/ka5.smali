.class public final Lka5;
.super Lll4;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lmy3;


# instance fields
.field public K:F

.field public L:F

.field public M:F

.field public N:F

.field public O:Z


# virtual methods
.method public final c(Loh4;Lgh4;J)Lmh4;
    .locals 5

    .line 1
    iget v0, p0, Lka5;->K:F

    .line 2
    .line 3
    invoke-interface {p1, v0}, Ltp1;->r0(F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lka5;->M:F

    .line 8
    .line 9
    invoke-interface {p1, v1}, Ltp1;->r0(F)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    add-int/2addr v1, v0

    .line 14
    iget v0, p0, Lka5;->L:F

    .line 15
    .line 16
    invoke-interface {p1, v0}, Ltp1;->r0(F)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget v2, p0, Lka5;->N:F

    .line 21
    .line 22
    invoke-interface {p1, v2}, Ltp1;->r0(F)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    add-int/2addr v2, v0

    .line 27
    neg-int v0, v1

    .line 28
    neg-int v3, v2

    .line 29
    invoke-static {v0, v3, p3, p4}, Lm31;->i(IIJ)J

    .line 30
    .line 31
    .line 32
    move-result-wide v3

    .line 33
    invoke-interface {p2, v3, v4}, Lgh4;->y(J)Leh5;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    iget v0, p2, Leh5;->w:I

    .line 38
    .line 39
    add-int/2addr v0, v1

    .line 40
    invoke-static {p3, p4, v0}, Lm31;->g(JI)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget v1, p2, Leh5;->x:I

    .line 45
    .line 46
    add-int/2addr v1, v2

    .line 47
    invoke-static {p3, p4, v1}, Lm31;->f(JI)I

    .line 48
    .line 49
    .line 50
    move-result p3

    .line 51
    new-instance p4, Lw34;

    .line 52
    .line 53
    const/16 v1, 0xd

    .line 54
    .line 55
    invoke-direct {p4, v1, p0, p2}, Lw34;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    sget-object p0, Lb42;->w:Lb42;

    .line 59
    .line 60
    invoke-interface {p1, v0, p3, p0, p4}, Loh4;->d0(IILjava/util/Map;Lvr2;)Lmh4;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0
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
