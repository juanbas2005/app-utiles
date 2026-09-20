.class public final Lsq3;
.super Le21;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# direct methods
.method public constructor <init>(Lgq0;I)V
    .locals 1

    .line 1
    new-instance v0, Ljq0;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Ljq0;-><init>(Lgq0;I)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lqq3;

    .line 7
    .line 8
    invoke-direct {p1, v0}, Lqq3;-><init>(Ljq0;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1}, Le21;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
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
.method public final a(Lsl4;)Lvw3;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lro7;->x:Lkg5;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    sget-object v0, Lro7;->y:Lro7;

    .line 10
    .line 11
    invoke-interface {p1}, Lsl4;->g()Lfv3;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    sget-object v2, Lm27;->Q:Lvp2;

    .line 19
    .line 20
    invoke-virtual {v2}, Lvp2;->i()Lup2;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v1, v2}, Lfv3;->j(Lup2;)Lql4;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    new-instance v2, Lp27;

    .line 29
    .line 30
    iget-object p0, p0, Le21;->a:Ljava/lang/Object;

    .line 31
    .line 32
    move-object v3, p0

    .line 33
    check-cast v3, Lrq3;

    .line 34
    .line 35
    instance-of v4, v3, Lpq3;

    .line 36
    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    check-cast p0, Lpq3;

    .line 40
    .line 41
    iget-object p0, p0, Lpq3;->a:Lvw3;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    instance-of v3, v3, Lqq3;

    .line 45
    .line 46
    if-eqz v3, :cond_3

    .line 47
    .line 48
    check-cast p0, Lqq3;

    .line 49
    .line 50
    iget-object p0, p0, Lqq3;->a:Ljq0;

    .line 51
    .line 52
    iget-object v3, p0, Ljq0;->a:Lgq0;

    .line 53
    .line 54
    iget p0, p0, Ljq0;->b:I

    .line 55
    .line 56
    invoke-static {p1, v3}, Lr16;->y(Lsl4;Lgq0;)Lql4;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    if-nez v4, :cond_1

    .line 61
    .line 62
    invoke-virtual {v3}, Lgq0;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    filled-new-array {p1, p0}, [Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    sget-object p1, Lx62;->z:Lx62;

    .line 75
    .line 76
    invoke-static {p1, p0}, Lz62;->c(Lx62;[Ljava/lang/String;)Lv62;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    goto :goto_1

    .line 81
    :cond_1
    invoke-virtual {v4}, Lql4;->g0()Lfu6;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-static {v3}, Ljb5;->F(Lvw3;)Ldu7;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    const/4 v4, 0x0

    .line 93
    :goto_0
    if-ge v4, p0, :cond_2

    .line 94
    .line 95
    invoke-interface {p1}, Lsl4;->g()Lfv3;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    invoke-virtual {v5, v3}, Lfv3;->h(Lvw3;)Lfu6;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    add-int/lit8 v4, v4, 0x1

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_2
    move-object p0, v3

    .line 107
    :goto_1
    invoke-direct {v2, p0}, Lp27;-><init>(Lvw3;)V

    .line 108
    .line 109
    .line 110
    invoke-static {v2}, Lsg3;->D(Ljava/lang/Object;)Ljava/util/List;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-static {v0, v1, p0}, Lkl8;->H(Lro7;Lql4;Ljava/util/List;)Lfu6;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    return-object p0

    .line 119
    :cond_3
    invoke-static {}, Lh;->c()V

    .line 120
    .line 121
    .line 122
    const/4 p0, 0x0

    .line 123
    return-object p0
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
.end method
