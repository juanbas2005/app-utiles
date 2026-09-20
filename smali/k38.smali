.class public final Lk38;
.super Lvb5;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final A:Led5;

.field public final B:Led5;

.field public final C:Lm28;

.field public final D:Led5;

.field public E:F

.field public F:Llt0;


# direct methods
.method public constructor <init>(Lsx2;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lvb5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lwu6;

    .line 5
    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lwu6;-><init>(J)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lu55;->p(Ljava/lang/Object;)Led5;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lk38;->A:Led5;

    .line 16
    .line 17
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-static {v0}, Lu55;->p(Ljava/lang/Object;)Led5;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lk38;->B:Led5;

    .line 24
    .line 25
    new-instance v0, Lm28;

    .line 26
    .line 27
    invoke-direct {v0, p1}, Lm28;-><init>(Lsx2;)V

    .line 28
    .line 29
    .line 30
    new-instance p1, Lkh;

    .line 31
    .line 32
    const/16 v1, 0x11

    .line 33
    .line 34
    invoke-direct {p1, v1, p0}, Lkh;-><init>(ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iput-object p1, v0, Lm28;->f:Lsr2;

    .line 38
    .line 39
    iput-object v0, p0, Lk38;->C:Lm28;

    .line 40
    .line 41
    sget-object p1, Ld63;->G:Ld63;

    .line 42
    .line 43
    new-instance v0, Led5;

    .line 44
    .line 45
    sget-object v1, Lvs7;->a:Lvs7;

    .line 46
    .line 47
    invoke-direct {v0, v1, p1}, Led5;-><init>(Ljava/lang/Object;Lux6;)V

    .line 48
    .line 49
    .line 50
    iput-object v0, p0, Lk38;->D:Led5;

    .line 51
    .line 52
    const/high16 p1, 0x3f800000    # 1.0f

    .line 53
    .line 54
    iput p1, p0, Lk38;->E:F

    .line 55
    .line 56
    return-void
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
.end method


# virtual methods
.method public final d(F)V
    .locals 0

    .line 1
    iput p1, p0, Lk38;->E:F

    .line 2
    .line 3
    return-void
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

.method public final e(Llt0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk38;->F:Llt0;

    .line 2
    .line 3
    return-void
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

.method public final i()J
    .locals 2

    .line 1
    iget-object p0, p0, Lk38;->A:Led5;

    .line 2
    .line 3
    invoke-virtual {p0}, Led5;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lwu6;

    .line 8
    .line 9
    iget-wide v0, p0, Lwu6;->a:J

    .line 10
    .line 11
    return-wide v0
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

.method public final j(Lwy3;)V
    .locals 10

    .line 1
    iget-object v0, p1, Lwy3;->w:Ltk0;

    .line 2
    .line 3
    iget-object v1, p0, Lk38;->F:Llt0;

    .line 4
    .line 5
    iget-object v2, p0, Lk38;->C:Lm28;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget-object v1, v2, Lm28;->g:Led5;

    .line 10
    .line 11
    invoke-virtual {v1}, Led5;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Llt0;

    .line 16
    .line 17
    :cond_0
    iget-object v3, p0, Lk38;->B:Led5;

    .line 18
    .line 19
    invoke-virtual {v3}, Led5;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    invoke-virtual {p1}, Lwy3;->getLayoutDirection()Ley3;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    sget-object v4, Ley3;->x:Ley3;

    .line 36
    .line 37
    if-ne v3, v4, :cond_1

    .line 38
    .line 39
    invoke-interface {v0}, Lhz1;->v0()J

    .line 40
    .line 41
    .line 42
    move-result-wide v3

    .line 43
    iget-object v0, v0, Ltk0;->x:Lwr0;

    .line 44
    .line 45
    invoke-virtual {v0}, Lwr0;->L()J

    .line 46
    .line 47
    .line 48
    move-result-wide v5

    .line 49
    invoke-virtual {v0}, Lwr0;->D()Lqk0;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    invoke-interface {v7}, Lqk0;->h()V

    .line 54
    .line 55
    .line 56
    :try_start_0
    iget-object v7, v0, Lwr0;->x:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v7, Lji8;

    .line 59
    .line 60
    const/high16 v8, -0x40800000    # -1.0f

    .line 61
    .line 62
    const/high16 v9, 0x3f800000    # 1.0f

    .line 63
    .line 64
    invoke-virtual {v7, v8, v9, v3, v4}, Lji8;->E(FFJ)V

    .line 65
    .line 66
    .line 67
    iget v3, p0, Lk38;->E:F

    .line 68
    .line 69
    invoke-virtual {v2, p1, v3, v1}, Lm28;->e(Lhz1;FLlt0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    .line 71
    .line 72
    invoke-static {v0, v5, v6}, Lb81;->u(Lwr0;J)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :catchall_0
    move-exception p0

    .line 77
    invoke-static {v0, v5, v6}, Lb81;->u(Lwr0;J)V

    .line 78
    .line 79
    .line 80
    throw p0

    .line 81
    :cond_1
    iget v0, p0, Lk38;->E:F

    .line 82
    .line 83
    invoke-virtual {v2, p1, v0, v1}, Lm28;->e(Lhz1;FLlt0;)V

    .line 84
    .line 85
    .line 86
    :goto_0
    iget-object p0, p0, Lk38;->D:Led5;

    .line 87
    .line 88
    invoke-virtual {p0}, Led5;->getValue()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    return-void
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
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
