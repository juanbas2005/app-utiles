.class public final Lw38;
.super Lll4;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgz1;


# instance fields
.field public K:Lbm7;

.field public L:Ln52;

.field public M:Lx82;

.field public N:Ltr6;


# virtual methods
.method public final p0(Lwy3;)V
    .locals 13

    .line 1
    invoke-virtual {p1}, Lwy3;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lw38;->K:Lbm7;

    .line 5
    .line 6
    new-instance v1, Lv38;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v1, p0, v2}, Lv38;-><init>(Lw38;I)V

    .line 10
    .line 11
    .line 12
    iget-object v2, p0, Lw38;->N:Ltr6;

    .line 13
    .line 14
    invoke-virtual {v2}, Ltr6;->a()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const/4 v4, 0x0

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    iget-wide v2, v2, Ltr6;->e:J

    .line 22
    .line 23
    new-instance v5, Ljt0;

    .line 24
    .line 25
    invoke-direct {v5, v2, v3}, Ljt0;-><init>(J)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v5, v4

    .line 30
    :goto_0
    new-instance v2, Lv38;

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    invoke-direct {v2, p0, v3}, Lv38;-><init>(Lw38;I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1, v5, v4, v2}, Lbm7;->a(Lvr2;Ljava/lang/Object;Lol;Lvr2;)Lam7;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iget-object v1, p0, Lw38;->N:Ltr6;

    .line 41
    .line 42
    invoke-virtual {v0}, Lam7;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Ljt0;

    .line 47
    .line 48
    iget-wide v2, v0, Ljt0;->a:J

    .line 49
    .line 50
    iget-object v0, v1, Ltr6;->c:Lwz0;

    .line 51
    .line 52
    invoke-virtual {v1}, Ltr6;->b()Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz v4, :cond_1

    .line 57
    .line 58
    iget-object v4, v0, Lwz0;->g:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v4, Led5;

    .line 61
    .line 62
    invoke-virtual {v4}, Led5;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    check-cast v4, Ljava/lang/Boolean;

    .line 67
    .line 68
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-eqz v4, :cond_1

    .line 73
    .line 74
    iget-object v0, v0, Lwz0;->h:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Led5;

    .line 77
    .line 78
    invoke-virtual {v0}, Led5;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, Ljt0;

    .line 83
    .line 84
    iget-wide v2, v0, Ljt0;->a:J

    .line 85
    .line 86
    :cond_1
    move-wide v5, v2

    .line 87
    invoke-virtual {v1}, Ltr6;->b()Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_2

    .line 92
    .line 93
    iput-wide v5, v1, Ltr6;->e:J

    .line 94
    .line 95
    :cond_2
    invoke-static {v5, v6}, Ljt0;->d(J)F

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    const/4 v1, 0x0

    .line 100
    cmpg-float v0, v0, v1

    .line 101
    .line 102
    if-nez v0, :cond_3

    .line 103
    .line 104
    return-void

    .line 105
    :cond_3
    iget-object v0, p0, Lw38;->L:Ln52;

    .line 106
    .line 107
    iget-object v0, v0, Ln52;->a:Lnm7;

    .line 108
    .line 109
    iget-object p0, p0, Lw38;->M:Lx82;

    .line 110
    .line 111
    iget-object p0, p0, Lx82;->a:Lnm7;

    .line 112
    .line 113
    const/4 v11, 0x0

    .line 114
    const/16 v12, 0x7e

    .line 115
    .line 116
    const-wide/16 v7, 0x0

    .line 117
    .line 118
    const-wide/16 v9, 0x0

    .line 119
    .line 120
    move-object v4, p1

    .line 121
    invoke-static/range {v4 .. v12}, Lhz1;->f0(Lhz1;JJJFI)V

    .line 122
    .line 123
    .line 124
    return-void
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
