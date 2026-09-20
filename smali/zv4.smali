.class public abstract Lzv4;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public a:Lrv4;

.field public b:Z


# virtual methods
.method public final a()V
    .locals 6

    .line 1
    iget-object v0, p0, Lzv4;->a:Lrv4;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    iget-boolean v1, p0, Lzv4;->b:Z

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p0, v2}, Lrv4;->e(Lzv4;Lqv4;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {v0}, Lrv4;->d()V

    .line 14
    .line 15
    .line 16
    iget-boolean v1, v0, Lrv4;->c:Z

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    iget-object v1, v0, Lrv4;->d:Law4;

    .line 23
    .line 24
    iget-object v0, v0, Lrv4;->a:Lc9;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object v4, v1, Law4;->h:Lzv4;

    .line 30
    .line 31
    invoke-virtual {p0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_6

    .line 36
    .line 37
    iget v4, v1, Law4;->g:I

    .line 38
    .line 39
    const/4 v5, -0x1

    .line 40
    if-eq v5, v4, :cond_2

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    iget-object v4, v1, Law4;->f:Ltv4;

    .line 44
    .line 45
    if-nez v4, :cond_3

    .line 46
    .line 47
    invoke-virtual {v1, v5}, Law4;->c(I)Ltv4;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    :cond_3
    iput-object v2, v1, Law4;->f:Ltv4;

    .line 52
    .line 53
    iput v3, v1, Law4;->g:I

    .line 54
    .line 55
    iput-object v2, v1, Law4;->h:Lzv4;

    .line 56
    .line 57
    sget-object v5, Lcw4;->a:Lcw4;

    .line 58
    .line 59
    if-nez v4, :cond_4

    .line 60
    .line 61
    if-eqz v0, :cond_5

    .line 62
    .line 63
    iget-object v0, v0, Lc9;->x:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, Lv45;

    .line 66
    .line 67
    iget-object v0, v0, Lv45;->a:Ljava/lang/Runnable;

    .line 68
    .line 69
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_4
    iput-object v5, v4, Ltv4;->d:Lew4;

    .line 74
    .line 75
    invoke-virtual {v4}, Ltv4;->d()V

    .line 76
    .line 77
    .line 78
    :cond_5
    :goto_0
    iget-object v0, v1, Law4;->a:Ld37;

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v2, v5}, Ld37;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    :cond_6
    :goto_1
    iput-boolean v3, p0, Lzv4;->b:Z

    .line 87
    .line 88
    return-void

    .line 89
    :cond_7
    const-string p0, "This input is not added to any dispatcher."

    .line 90
    .line 91
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-void
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
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method public b(Z)V
    .locals 0

    .line 1
    return-void
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

.method public c()V
    .locals 0

    .line 1
    return-void
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
.end method
