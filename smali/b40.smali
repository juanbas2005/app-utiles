.class public final Lb40;
.super Lll4;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgz1;
.implements Lh35;
.implements Ldk6;


# instance fields
.field public K:J

.field public L:Lkc0;

.field public M:F

.field public N:Lpq6;

.field public O:J

.field public P:Ley3;

.field public Q:Ln85;

.field public R:Lpq6;

.field public S:Ln85;


# virtual methods
.method public final D0(Lok6;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lb40;->N:Lpq6;

    .line 2
    .line 3
    invoke-static {p1, p0}, Lmk6;->g(Lok6;Lpq6;)V

    .line 4
    .line 5
    .line 6
    return-void
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

.method public final h()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
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
.end method

.method public final m0()V
    .locals 2

    .line 1
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide v0, p0, Lb40;->O:J

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lb40;->P:Ley3;

    .line 10
    .line 11
    iput-object v0, p0, Lb40;->Q:Ln85;

    .line 12
    .line 13
    iput-object v0, p0, Lb40;->R:Lpq6;

    .line 14
    .line 15
    invoke-static {p0}, Lrc9;->e0(Lgz1;)V

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
.end method

.method public final p0(Lwy3;)V
    .locals 10

    .line 1
    iget-object v2, p1, Lwy3;->w:Ltk0;

    .line 2
    .line 3
    iget-object v3, p0, Lb40;->N:Lpq6;

    .line 4
    .line 5
    sget-object v4, Lgr8;->h:Lm23;

    .line 6
    .line 7
    if-ne v3, v4, :cond_1

    .line 8
    .line 9
    iget-wide v2, p0, Lb40;->K:J

    .line 10
    .line 11
    sget-wide v4, Ljt0;->g:J

    .line 12
    .line 13
    invoke-static {v2, v3, v4, v5}, Ljt0;->c(JJ)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    iget-wide v2, p0, Lb40;->K:J

    .line 20
    .line 21
    const/4 v8, 0x0

    .line 22
    const/16 v9, 0x7e

    .line 23
    .line 24
    const-wide/16 v4, 0x0

    .line 25
    .line 26
    const-wide/16 v6, 0x0

    .line 27
    .line 28
    move-object v1, p1

    .line 29
    invoke-static/range {v1 .. v9}, Lhz1;->f0(Lhz1;JJJFI)V

    .line 30
    .line 31
    .line 32
    :cond_0
    iget-object v1, p0, Lb40;->L:Lkc0;

    .line 33
    .line 34
    if-eqz v1, :cond_4

    .line 35
    .line 36
    iget v6, p0, Lb40;->M:F

    .line 37
    .line 38
    const/4 v8, 0x0

    .line 39
    const/16 v9, 0x76

    .line 40
    .line 41
    const-wide/16 v2, 0x0

    .line 42
    .line 43
    const-wide/16 v4, 0x0

    .line 44
    .line 45
    const/4 v7, 0x0

    .line 46
    move-object v0, p1

    .line 47
    invoke-static/range {v0 .. v9}, Lhz1;->q(Lhz1;Lkc0;JJFLiz1;Llt0;I)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    invoke-interface {v2}, Lhz1;->e()J

    .line 52
    .line 53
    .line 54
    move-result-wide v3

    .line 55
    iget-wide v5, p0, Lb40;->O:J

    .line 56
    .line 57
    invoke-static {v3, v4, v5, v6}, Lwu6;->a(JJ)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_2

    .line 62
    .line 63
    invoke-virtual {p1}, Lwy3;->getLayoutDirection()Ley3;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    iget-object v4, p0, Lb40;->P:Ley3;

    .line 68
    .line 69
    if-ne v3, v4, :cond_2

    .line 70
    .line 71
    iget-object v3, p0, Lb40;->R:Lpq6;

    .line 72
    .line 73
    iget-object v4, p0, Lb40;->N:Lpq6;

    .line 74
    .line 75
    invoke-static {v3, v4}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-eqz v3, :cond_2

    .line 80
    .line 81
    iget-object v3, p0, Lb40;->Q:Ln85;

    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_2
    new-instance v3, Lf5;

    .line 88
    .line 89
    const/4 v4, 0x5

    .line 90
    invoke-direct {v3, v4, p0, p1}, Lf5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-static {p0, v3}, Li35;->o(Lll4;Lsr2;)V

    .line 94
    .line 95
    .line 96
    iget-object v3, p0, Lb40;->S:Ln85;

    .line 97
    .line 98
    const/4 v4, 0x0

    .line 99
    iput-object v4, p0, Lb40;->S:Ln85;

    .line 100
    .line 101
    :goto_0
    iput-object v3, p0, Lb40;->Q:Ln85;

    .line 102
    .line 103
    invoke-interface {v2}, Lhz1;->e()J

    .line 104
    .line 105
    .line 106
    move-result-wide v4

    .line 107
    iput-wide v4, p0, Lb40;->O:J

    .line 108
    .line 109
    invoke-virtual {p1}, Lwy3;->getLayoutDirection()Ley3;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    iput-object v2, p0, Lb40;->P:Ley3;

    .line 114
    .line 115
    iget-object v2, p0, Lb40;->N:Lpq6;

    .line 116
    .line 117
    iput-object v2, p0, Lb40;->R:Lpq6;

    .line 118
    .line 119
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    iget-wide v4, p0, Lb40;->K:J

    .line 123
    .line 124
    sget-wide v6, Ljt0;->g:J

    .line 125
    .line 126
    invoke-static {v4, v5, v6, v7}, Ljt0;->c(JJ)Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-nez v2, :cond_3

    .line 131
    .line 132
    iget-wide v4, p0, Lb40;->K:J

    .line 133
    .line 134
    invoke-static {p1, v3, v4, v5}, Lo85;->e(Lwy3;Ln85;J)V

    .line 135
    .line 136
    .line 137
    :cond_3
    iget-object v2, p0, Lb40;->L:Lkc0;

    .line 138
    .line 139
    if-eqz v2, :cond_4

    .line 140
    .line 141
    iget v0, p0, Lb40;->M:F

    .line 142
    .line 143
    const/16 v4, 0x38

    .line 144
    .line 145
    invoke-static {p1, v3, v2, v0, v4}, Lo85;->d(Lwy3;Ln85;Lkc0;FI)V

    .line 146
    .line 147
    .line 148
    :cond_4
    :goto_1
    invoke-virtual {p1}, Lwy3;->a()V

    .line 149
    .line 150
    .line 151
    return-void
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
