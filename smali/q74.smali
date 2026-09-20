.class public final Lq74;
.super Lr74;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# virtual methods
.method public final a(JLjava/lang/Object;)V
    .locals 0

    .line 1
    sget-object p0, Lst7;->c:Lqt7;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lqt7;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lpf3;

    .line 8
    .line 9
    check-cast p0, Lr2;

    .line 10
    .line 11
    iget-boolean p1, p0, Lr2;->w:Z

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput-boolean p1, p0, Lr2;->w:Z

    .line 17
    .line 18
    :cond_0
    return-void
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

.method public final b(Ljava/lang/Object;JLjava/lang/Object;)V
    .locals 3

    .line 1
    sget-object p0, Lst7;->c:Lqt7;

    .line 2
    .line 3
    invoke-virtual {p0, p2, p3, p1}, Lqt7;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lpf3;

    .line 8
    .line 9
    invoke-virtual {p0, p2, p3, p4}, Lqt7;->i(JLjava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lpf3;

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result p4

    .line 19
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-lez p4, :cond_1

    .line 24
    .line 25
    if-lez v1, :cond_1

    .line 26
    .line 27
    move-object v2, v0

    .line 28
    check-cast v2, Lr2;

    .line 29
    .line 30
    iget-boolean v2, v2, Lr2;->w:Z

    .line 31
    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    add-int/2addr v1, p4

    .line 35
    invoke-interface {v0, v1}, Lpf3;->j(I)Lpf3;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :cond_0
    invoke-interface {v0, p0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 40
    .line 41
    .line 42
    :cond_1
    if-lez p4, :cond_2

    .line 43
    .line 44
    move-object p0, v0

    .line 45
    :cond_2
    invoke-static {p1, p2, p3, p0}, Lst7;->o(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-void
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
