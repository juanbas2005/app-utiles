.class public final Lkd5;
.super Lll4;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lmy3;


# instance fields
.field public K:F

.field public L:Lbd5;


# virtual methods
.method public final c(Loh4;Lgh4;J)Lmh4;
    .locals 3

    .line 1
    iget-object v0, p0, Lkd5;->L:Lbd5;

    .line 2
    .line 3
    const v1, 0x7fffffff

    .line 4
    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lbd5;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eq v2, v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0}, Lbd5;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Ljava/lang/Number;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget p0, p0, Lkd5;->K:F

    .line 31
    .line 32
    mul-float/2addr v0, p0

    .line 33
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move p0, v1

    .line 39
    :goto_0
    if-eq p0, v1, :cond_1

    .line 40
    .line 41
    move v0, p0

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-static {p3, p4}, Lk31;->j(J)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    :goto_1
    invoke-static {p3, p4}, Lk31;->i(J)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eq p0, v1, :cond_2

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    invoke-static {p3, p4}, Lk31;->h(J)I

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    :goto_2
    invoke-static {p3, p4}, Lk31;->g(J)I

    .line 59
    .line 60
    .line 61
    move-result p3

    .line 62
    invoke-static {v0, p0, v2, p3}, Lm31;->a(IIII)J

    .line 63
    .line 64
    .line 65
    move-result-wide p3

    .line 66
    invoke-interface {p2, p3, p4}, Lgh4;->y(J)Leh5;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    iget p2, p0, Leh5;->w:I

    .line 71
    .line 72
    iget p3, p0, Leh5;->x:I

    .line 73
    .line 74
    new-instance p4, Lws;

    .line 75
    .line 76
    const/16 v0, 0xa

    .line 77
    .line 78
    invoke-direct {p4, p0, v0}, Lws;-><init>(Leh5;I)V

    .line 79
    .line 80
    .line 81
    sget-object p0, Lb42;->w:Lb42;

    .line 82
    .line 83
    invoke-interface {p1, p2, p3, p0, p4}, Loh4;->d0(IILjava/util/Map;Lvr2;)Lmh4;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
.end method
