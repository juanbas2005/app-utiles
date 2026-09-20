.class public abstract Ln;
.super Lm;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# virtual methods
.method public abstract u(ILjava/lang/StringBuilder;)V
.end method

.method public abstract v(I)I
.end method

.method public final w(Ljava/lang/StringBuilder;II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lf1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lwr0;

    .line 4
    .line 5
    iget-object v0, v0, Lwr0;->x:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Li90;

    .line 8
    .line 9
    invoke-static {p2, p3, v0}, Lwr0;->C(IILi90;)I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    invoke-virtual {p0, p2, p1}, Ln;->u(ILjava/lang/StringBuilder;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p2}, Ln;->v(I)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    const p2, 0x186a0

    .line 21
    .line 22
    .line 23
    const/4 p3, 0x0

    .line 24
    :goto_0
    const/4 v0, 0x5

    .line 25
    if-ge p3, v0, :cond_1

    .line 26
    .line 27
    div-int v0, p0, p2

    .line 28
    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    const/16 v0, 0x30

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    :cond_0
    div-int/lit8 p2, p2, 0xa

    .line 37
    .line 38
    add-int/lit8 p3, p3, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    return-void
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
