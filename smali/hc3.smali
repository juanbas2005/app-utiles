.class public final Lhc3;
.super Lxz4;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final t0:Lkb9;


# instance fields
.field public final r0:Lib7;

.field public s0:Lgc3;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    invoke-static {}, Ldh4;->b()Lkb9;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Ljt0;->h:I

    .line 6
    .line 7
    sget-wide v1, Ljt0;->d:J

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lkb9;->k(J)V

    .line 10
    .line 11
    .line 12
    const/high16 v1, 0x3f800000    # 1.0f

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lkb9;->q(F)V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-virtual {v0, v1}, Lkb9;->r(I)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lhc3;->t0:Lkb9;

    .line 22
    .line 23
    return-void
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
.end method

.method public constructor <init>(Luy3;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lxz4;-><init>(Luy3;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lib7;

    .line 5
    .line 6
    invoke-direct {v0}, Lll4;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iput v1, v0, Lll4;->z:I

    .line 11
    .line 12
    iput-object v0, p0, Lhc3;->r0:Lib7;

    .line 13
    .line 14
    iput-object p0, v0, Lll4;->D:Lxz4;

    .line 15
    .line 16
    iget-object p1, p1, Luy3;->D:Luy3;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    new-instance p1, Lgc3;

    .line 21
    .line 22
    invoke-direct {p1, p0}, Lfd4;-><init>(Lxz4;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    :goto_0
    iput-object p1, p0, Lhc3;->s0:Lgc3;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final W(I)I
    .locals 2

    .line 1
    iget-object p0, p0, Lxz4;->O:Luy3;

    .line 2
    .line 3
    invoke-virtual {p0}, Luy3;->u()Lhv2;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lhv2;->O0()Llh4;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object p0, p0, Lhv2;->y:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Luy3;

    .line 14
    .line 15
    iget-object v1, p0, Luy3;->a0:Lo00;

    .line 16
    .line 17
    iget-object v1, v1, Lo00;->e:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Lxz4;

    .line 20
    .line 21
    invoke-virtual {p0}, Luy3;->m()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {v0, v1, p0, p1}, Llh4;->e(Lkg3;Ljava/util/List;I)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    return p0
.end method

.method public final X0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lhc3;->s0:Lgc3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lgc3;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lfd4;-><init>(Lxz4;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lhc3;->s0:Lgc3;

    .line 11
    .line 12
    :cond_0
    return-void
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

.method public final a1()Lfd4;
    .locals 0

    .line 1
    iget-object p0, p0, Lhc3;->s0:Lgc3;

    .line 2
    .line 3
    return-object p0
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

.method public final c(I)I
    .locals 2

    .line 1
    iget-object p0, p0, Lxz4;->O:Luy3;

    .line 2
    .line 3
    invoke-virtual {p0}, Luy3;->u()Lhv2;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lhv2;->O0()Llh4;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object p0, p0, Lhv2;->y:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Luy3;

    .line 14
    .line 15
    iget-object v1, p0, Luy3;->a0:Lo00;

    .line 16
    .line 17
    iget-object v1, v1, Lo00;->e:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Lxz4;

    .line 20
    .line 21
    invoke-virtual {p0}, Luy3;->m()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {v0, v1, p0, p1}, Llh4;->d(Lkg3;Ljava/util/List;I)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    return p0
.end method

.method public final c1()Lll4;
    .locals 0

    .line 1
    iget-object p0, p0, Lhc3;->r0:Lib7;

    .line 2
    .line 3
    return-object p0
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

.method public final h0(JFLvr2;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lxz4;->s1(JFLvr2;)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Ldd4;->J:Z

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object p0, p0, Lxz4;->O:Luy3;

    .line 10
    .line 11
    iget-object p0, p0, Luy3;->b0:Lyy3;

    .line 12
    .line 13
    iget-object p0, p0, Lyy3;->p:Lkh4;

    .line 14
    .line 15
    invoke-virtual {p0}, Lkh4;->x0()V

    .line 16
    .line 17
    .line 18
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

.method public final i1(Lvz4;JLf03;IZ)V
    .locals 11

    .line 1
    iget-object v0, p0, Lxz4;->O:Luy3;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lvz4;->g(Luy3;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0, p2, p3}, Lxz4;->D1(J)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    move/from16 v9, p5

    .line 18
    .line 19
    move/from16 v10, p6

    .line 20
    .line 21
    :goto_0
    move v3, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    move/from16 v9, p5

    .line 24
    .line 25
    if-ne v9, v2, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0}, Lxz4;->b1()J

    .line 28
    .line 29
    .line 30
    move-result-wide v4

    .line 31
    invoke-virtual {p0, p2, p3, v4, v5}, Lxz4;->U0(JJ)F

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    const v1, 0x7fffffff

    .line 40
    .line 41
    .line 42
    and-int/2addr p0, v1

    .line 43
    const/high16 v1, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 44
    .line 45
    if-ge p0, v1, :cond_2

    .line 46
    .line 47
    move v10, v3

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move/from16 v9, p5

    .line 50
    .line 51
    :cond_2
    move/from16 v10, p6

    .line 52
    .line 53
    :goto_1
    if-eqz v3, :cond_5

    .line 54
    .line 55
    iget p0, p4, Lf03;->y:I

    .line 56
    .line 57
    invoke-virtual {v0}, Luy3;->y()Leq4;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget-object v1, v0, Leq4;->w:[Ljava/lang/Object;

    .line 62
    .line 63
    iget v0, v0, Leq4;->y:I

    .line 64
    .line 65
    sub-int/2addr v0, v2

    .line 66
    :goto_2
    if-ltz v0, :cond_4

    .line 67
    .line 68
    aget-object v2, v1, v0

    .line 69
    .line 70
    move-object v5, v2

    .line 71
    check-cast v5, Luy3;

    .line 72
    .line 73
    invoke-virtual {v5}, Luy3;->K()Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_3

    .line 78
    .line 79
    move-object v4, p1

    .line 80
    move-wide v6, p2

    .line 81
    move-object v8, p4

    .line 82
    invoke-interface/range {v4 .. v10}, Lvz4;->e(Luy3;JLf03;IZ)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p4}, Lf03;->f()J

    .line 86
    .line 87
    .line 88
    move-result-wide v2

    .line 89
    invoke-static {v2, v3}, Lhj8;->v(J)F

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    const/4 v7, 0x0

    .line 94
    cmpg-float v6, v6, v7

    .line 95
    .line 96
    if-gez v6, :cond_3

    .line 97
    .line 98
    invoke-static {v2, v3}, Lhj8;->C(J)Z

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    if-eqz v6, :cond_3

    .line 103
    .line 104
    invoke-static {v2, v3}, Lhj8;->B(J)Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-nez v2, :cond_3

    .line 109
    .line 110
    invoke-interface {p1, p4, v5}, Lvz4;->f(Lf03;Luy3;)Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-eqz v2, :cond_4

    .line 115
    .line 116
    :cond_3
    add-int/lit8 v0, v0, -0x1

    .line 117
    .line 118
    move/from16 v9, p5

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_4
    iput p0, p4, Lf03;->y:I

    .line 122
    .line 123
    :cond_5
    return-void
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
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
.end method

.method public final l(I)I
    .locals 2

    .line 1
    iget-object p0, p0, Lxz4;->O:Luy3;

    .line 2
    .line 3
    invoke-virtual {p0}, Luy3;->u()Lhv2;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lhv2;->O0()Llh4;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object p0, p0, Lhv2;->y:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Luy3;

    .line 14
    .line 15
    iget-object v1, p0, Luy3;->a0:Lo00;

    .line 16
    .line 17
    iget-object v1, v1, Lo00;->e:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Lxz4;

    .line 20
    .line 21
    invoke-virtual {p0}, Luy3;->m()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {v0, v1, p0, p1}, Llh4;->c(Lkg3;Ljava/util/List;I)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    return p0
.end method

.method public final p0(Lkb;)I
    .locals 4

    .line 1
    iget-object v0, p0, Lhc3;->s0:Lgc3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lgc3;->p0(Lkb;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    iget-object p0, p0, Lxz4;->O:Luy3;

    .line 11
    .line 12
    iget-object p0, p0, Luy3;->b0:Lyy3;

    .line 13
    .line 14
    iget-object p0, p0, Lyy3;->p:Lkh4;

    .line 15
    .line 16
    iget-object v0, p0, Lkh4;->T:Lvy3;

    .line 17
    .line 18
    iget-boolean v1, p0, Lkh4;->I:Z

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    iget-object v1, p0, Lkh4;->B:Lyy3;

    .line 24
    .line 25
    iget-object v1, v1, Lyy3;->d:Lqy3;

    .line 26
    .line 27
    sget-object v3, Lqy3;->w:Lqy3;

    .line 28
    .line 29
    if-ne v1, v3, :cond_1

    .line 30
    .line 31
    iput-boolean v2, v0, Lvy3;->f:Z

    .line 32
    .line 33
    iget-boolean v1, v0, Lvy3;->b:Z

    .line 34
    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    iput-boolean v2, p0, Lkh4;->R:Z

    .line 38
    .line 39
    iput-boolean v2, p0, Lkh4;->S:Z

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    iput-boolean v2, v0, Lvy3;->g:Z

    .line 43
    .line 44
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lkh4;->f()Lhc3;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iget-boolean v3, v1, Ldd4;->K:Z

    .line 49
    .line 50
    iput-boolean v2, v1, Ldd4;->K:Z

    .line 51
    .line 52
    invoke-virtual {p0}, Lkh4;->J()V

    .line 53
    .line 54
    .line 55
    iput-boolean v3, v1, Ldd4;->K:Z

    .line 56
    .line 57
    iget-object p0, v0, Lvy3;->i:Ljava/util/HashMap;

    .line 58
    .line 59
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    check-cast p0, Ljava/lang/Integer;

    .line 64
    .line 65
    if-eqz p0, :cond_3

    .line 66
    .line 67
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    return p0

    .line 72
    :cond_3
    const/high16 p0, -0x80000000

    .line 73
    .line 74
    return p0
    .line 75
    .line 76
.end method

.method public final r1(Lqk0;Lcx2;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lxz4;->O:Luy3;

    .line 2
    .line 3
    invoke-static {v0}, Lxy3;->a(Luy3;)Lp95;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0}, Luy3;->y()Leq4;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v2, v0, Leq4;->w:[Ljava/lang/Object;

    .line 12
    .line 13
    iget v0, v0, Leq4;->y:I

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    :goto_0
    if-ge v3, v0, :cond_1

    .line 17
    .line 18
    aget-object v4, v2, v3

    .line 19
    .line 20
    check-cast v4, Luy3;

    .line 21
    .line 22
    invoke-virtual {v4}, Luy3;->K()Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-eqz v5, :cond_0

    .line 27
    .line 28
    invoke-virtual {v4, p1, p2}, Luy3;->i(Lqk0;Lcx2;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    check-cast v1, Lje;

    .line 35
    .line 36
    invoke-virtual {v1}, Lje;->getShowLayoutBounds()Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-eqz p2, :cond_2

    .line 41
    .line 42
    iget-wide v0, p0, Leh5;->y:J

    .line 43
    .line 44
    const/16 p0, 0x20

    .line 45
    .line 46
    shr-long v2, v0, p0

    .line 47
    .line 48
    long-to-int p0, v2

    .line 49
    int-to-float p0, p0

    .line 50
    const/high16 p2, 0x3f000000    # 0.5f

    .line 51
    .line 52
    sub-float v5, p0, p2

    .line 53
    .line 54
    const-wide v2, 0xffffffffL

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    and-long/2addr v0, v2

    .line 60
    long-to-int p0, v0

    .line 61
    int-to-float p0, p0

    .line 62
    sub-float v6, p0, p2

    .line 63
    .line 64
    const/high16 v3, 0x3f000000    # 0.5f

    .line 65
    .line 66
    const/high16 v4, 0x3f000000    # 0.5f

    .line 67
    .line 68
    sget-object v7, Lhc3;->t0:Lkb9;

    .line 69
    .line 70
    move-object v2, p1

    .line 71
    invoke-interface/range {v2 .. v7}, Lqk0;->a(FFFFLkb9;)V

    .line 72
    .line 73
    .line 74
    :cond_2
    return-void
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
.end method

.method public final v(I)I
    .locals 2

    .line 1
    iget-object p0, p0, Lxz4;->O:Luy3;

    .line 2
    .line 3
    invoke-virtual {p0}, Luy3;->u()Lhv2;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lhv2;->O0()Llh4;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object p0, p0, Lhv2;->y:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Luy3;

    .line 14
    .line 15
    iget-object v1, p0, Luy3;->a0:Lo00;

    .line 16
    .line 17
    iget-object v1, v1, Lo00;->e:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Lxz4;

    .line 20
    .line 21
    invoke-virtual {p0}, Luy3;->m()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {v0, v1, p0, p1}, Llh4;->a(Lkg3;Ljava/util/List;I)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    return p0
.end method

.method public final y(J)Leh5;
    .locals 6

    .line 1
    invoke-virtual {p0, p1, p2}, Leh5;->m0(J)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lxz4;->O:Luy3;

    .line 5
    .line 6
    invoke-virtual {v0}, Luy3;->z()Leq4;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-object v2, v1, Leq4;->w:[Ljava/lang/Object;

    .line 11
    .line 12
    iget v1, v1, Leq4;->y:I

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    :goto_0
    if-ge v3, v1, :cond_0

    .line 16
    .line 17
    aget-object v4, v2, v3

    .line 18
    .line 19
    check-cast v4, Luy3;

    .line 20
    .line 21
    iget-object v4, v4, Luy3;->b0:Lyy3;

    .line 22
    .line 23
    iget-object v4, v4, Lyy3;->p:Lkh4;

    .line 24
    .line 25
    sget-object v5, Lsy3;->y:Lsy3;

    .line 26
    .line 27
    iput-object v5, v4, Lkh4;->H:Lsy3;

    .line 28
    .line 29
    add-int/lit8 v3, v3, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object v1, v0, Luy3;->R:Llh4;

    .line 33
    .line 34
    invoke-virtual {v0}, Luy3;->m()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-interface {v1, p0, v0, p1, p2}, Llh4;->b(Loh4;Ljava/util/List;J)Lmh4;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p0, p1}, Lxz4;->v1(Lmh4;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lxz4;->m1()V

    .line 46
    .line 47
    .line 48
    return-object p0
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
.end method
