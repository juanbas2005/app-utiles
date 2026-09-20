.class public final Lny5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Lme3;

.field public final b:Lje;

.field public final c:Lig;

.field public final d:Lqh7;

.field public final e:Llp4;

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:Lvd;

.field public j:J

.field public final k:Lkh;

.field public final l:Lsp4;


# direct methods
.method public constructor <init>(Lyo4;Lje;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lny5;->a:Lme3;

    .line 5
    .line 6
    iput-object p2, p0, Lny5;->b:Lje;

    .line 7
    .line 8
    new-instance p1, Lig;

    .line 9
    .line 10
    const/16 p2, 0x9

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {p1, p2, v0}, Lig;-><init>(IB)V

    .line 14
    .line 15
    .line 16
    const/16 p2, 0xc0

    .line 17
    .line 18
    new-array v0, p2, [J

    .line 19
    .line 20
    iput-object v0, p1, Lig;->c:Ljava/lang/Object;

    .line 21
    .line 22
    new-array p2, p2, [J

    .line 23
    .line 24
    iput-object p2, p1, Lig;->d:Ljava/lang/Object;

    .line 25
    .line 26
    iput-object p1, p0, Lny5;->c:Lig;

    .line 27
    .line 28
    new-instance p1, Lqh7;

    .line 29
    .line 30
    invoke-direct {p1}, Lqh7;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lny5;->d:Lqh7;

    .line 34
    .line 35
    new-instance p1, Llp4;

    .line 36
    .line 37
    invoke-direct {p1}, Llp4;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Lny5;->e:Llp4;

    .line 41
    .line 42
    const-wide/16 p1, -0x1

    .line 43
    .line 44
    iput-wide p1, p0, Lny5;->j:J

    .line 45
    .line 46
    new-instance p1, Lkh;

    .line 47
    .line 48
    const/16 p2, 0xe

    .line 49
    .line 50
    invoke-direct {p1, p2, p0}, Lkh;-><init>(ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Lny5;->k:Lkh;

    .line 54
    .line 55
    new-instance p1, Lsp4;

    .line 56
    .line 57
    invoke-direct {p1}, Lsp4;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Lny5;->l:Lsp4;

    .line 61
    .line 62
    return-void
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

.method public static c(Lxz4;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lxz4;->l0:Lo95;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lfx2;

    .line 6
    .line 7
    invoke-virtual {p0}, Lfx2;->b()[F

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Lx91;->D([F)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
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

.method public static d(Luy3;)Z
    .locals 1

    .line 1
    iget p0, p0, Luy3;->C:I

    .line 2
    .line 3
    const/4 v0, -0x4

    .line 4
    if-eq p0, v0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
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

.method public static g(Luy3;)J
    .locals 5

    .line 1
    iget-object p0, p0, Luy3;->a0:Lo00;

    .line 2
    .line 3
    iget-object v0, p0, Lo00;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lxz4;

    .line 6
    .line 7
    iget-object p0, p0, Lo00;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lhc3;

    .line 10
    .line 11
    const-wide/16 v1, 0x0

    .line 12
    .line 13
    :goto_0
    if-eqz p0, :cond_1

    .line 14
    .line 15
    if-eq p0, v0, :cond_1

    .line 16
    .line 17
    invoke-static {p0}, Lny5;->c(Lxz4;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    const-wide v0, 0x7fffffff7fffffffL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    return-wide v0

    .line 29
    :cond_0
    iget-wide v3, p0, Lxz4;->Z:J

    .line 30
    .line 31
    invoke-static {v1, v2, v3, v4}, Loe3;->c(JJ)J

    .line 32
    .line 33
    .line 34
    move-result-wide v1

    .line 35
    iget-object p0, p0, Lxz4;->Q:Lxz4;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    return-wide v1
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
.end method

.method public static j(Luy3;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Luy3;->y:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Luy3;->a0:Lo00;

    .line 6
    .line 7
    iget-object v0, v0, Lo00;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lxz4;

    .line 10
    .line 11
    invoke-static {v0}, Lny5;->c(Lxz4;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, Luy3;->y:Z

    .line 19
    .line 20
    iget-boolean v1, p0, Luy3;->A:Z

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-static {p0}, Lny5;->g(Luy3;)J

    .line 25
    .line 26
    .line 27
    move-result-wide v1

    .line 28
    iput-wide v1, p0, Luy3;->z:J

    .line 29
    .line 30
    iput-boolean v0, p0, Luy3;->A:Z

    .line 31
    .line 32
    :cond_0
    iget-wide v1, p0, Luy3;->z:J

    .line 33
    .line 34
    const-wide v3, 0x7fffffff7fffffffL

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    invoke-static {v1, v2, v3, v4}, Loe3;->a(JJ)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_1

    .line 44
    .line 45
    invoke-virtual {p0}, Luy3;->z()Leq4;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    iget-object v1, p0, Leq4;->w:[Ljava/lang/Object;

    .line 50
    .line 51
    iget p0, p0, Leq4;->y:I

    .line 52
    .line 53
    :goto_0
    if-ge v0, p0, :cond_1

    .line 54
    .line 55
    aget-object v2, v1, v0

    .line 56
    .line 57
    check-cast v2, Luy3;

    .line 58
    .line 59
    invoke-static {v2}, Lny5;->j(Luy3;)V

    .line 60
    .line 61
    .line 62
    add-int/lit8 v0, v0, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    return-void
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
.method public final a()V
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lny5;->i:Lvd;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v2, v0, Lny5;->b:Lje;

    .line 8
    .line 9
    invoke-virtual {v2, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iput-object v1, v0, Lny5;->i:Lvd;

    .line 14
    .line 15
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 16
    .line 17
    .line 18
    move-result-wide v8

    .line 19
    iget-boolean v1, v0, Lny5;->f:Z

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    const/4 v12, 0x0

    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    iget-boolean v3, v0, Lny5;->g:Z

    .line 26
    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move v11, v12

    .line 31
    goto :goto_1

    .line 32
    :cond_2
    :goto_0
    move v11, v2

    .line 33
    :goto_1
    const-wide/16 v15, 0x0

    .line 34
    .line 35
    iget-object v3, v0, Lny5;->c:Lig;

    .line 36
    .line 37
    move v4, v2

    .line 38
    iget-object v2, v0, Lny5;->d:Lqh7;

    .line 39
    .line 40
    if-eqz v1, :cond_f

    .line 41
    .line 42
    iput-boolean v12, v0, Lny5;->f:Z

    .line 43
    .line 44
    iget-object v1, v0, Lny5;->e:Llp4;

    .line 45
    .line 46
    iget-object v5, v1, Llp4;->a:[Ljava/lang/Object;

    .line 47
    .line 48
    iget v1, v1, Llp4;->b:I

    .line 49
    .line 50
    move v6, v12

    .line 51
    :goto_2
    if-ge v6, v1, :cond_3

    .line 52
    .line 53
    aget-object v7, v5, v6

    .line 54
    .line 55
    check-cast v7, Lsr2;

    .line 56
    .line 57
    invoke-interface {v7}, Lsr2;->b()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    add-int/lit8 v6, v6, 0x1

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    iget-object v1, v3, Lig;->c:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, [J

    .line 66
    .line 67
    iget v5, v3, Lig;->b:I

    .line 68
    .line 69
    move v6, v12

    .line 70
    :goto_3
    array-length v7, v1

    .line 71
    add-int/lit8 v7, v7, -0x2

    .line 72
    .line 73
    if-ge v6, v7, :cond_e

    .line 74
    .line 75
    if-ge v6, v5, :cond_e

    .line 76
    .line 77
    add-int/lit8 v7, v6, 0x2

    .line 78
    .line 79
    move v10, v4

    .line 80
    move/from16 v17, v5

    .line 81
    .line 82
    aget-wide v4, v1, v7

    .line 83
    .line 84
    const/16 v7, 0x3c

    .line 85
    .line 86
    move/from16 v19, v10

    .line 87
    .line 88
    move/from16 v18, v11

    .line 89
    .line 90
    shr-long v10, v4, v7

    .line 91
    .line 92
    long-to-int v7, v10

    .line 93
    and-int/lit8 v7, v7, 0x1

    .line 94
    .line 95
    if-eqz v7, :cond_d

    .line 96
    .line 97
    aget-wide v10, v1, v6

    .line 98
    .line 99
    add-int/lit8 v7, v6, 0x1

    .line 100
    .line 101
    aget-wide v12, v1, v7

    .line 102
    .line 103
    long-to-int v4, v4

    .line 104
    const v5, 0x1ffffff

    .line 105
    .line 106
    .line 107
    and-int/2addr v4, v5

    .line 108
    iget-object v5, v2, Lqh7;->a:Lyo4;

    .line 109
    .line 110
    invoke-virtual {v5, v4}, Lme3;->b(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    check-cast v4, Lph7;

    .line 115
    .line 116
    :goto_4
    if-eqz v4, :cond_d

    .line 117
    .line 118
    iget-object v5, v4, Lph7;->f:Lph7;

    .line 119
    .line 120
    move-object v14, v5

    .line 121
    move v7, v6

    .line 122
    iget-wide v5, v4, Lph7;->i:J

    .line 123
    .line 124
    move-wide/from16 v20, v5

    .line 125
    .line 126
    iget-wide v5, v4, Lph7;->b:J

    .line 127
    .line 128
    move-wide/from16 v22, v5

    .line 129
    .line 130
    iget-wide v5, v4, Lph7;->c:J

    .line 131
    .line 132
    sub-long v24, v8, v20

    .line 133
    .line 134
    cmp-long v24, v24, v22

    .line 135
    .line 136
    if-gez v24, :cond_5

    .line 137
    .line 138
    const-wide/high16 v24, -0x8000000000000000L

    .line 139
    .line 140
    cmp-long v20, v20, v24

    .line 141
    .line 142
    if-nez v20, :cond_4

    .line 143
    .line 144
    goto :goto_5

    .line 145
    :cond_4
    const/16 v20, 0x0

    .line 146
    .line 147
    goto :goto_6

    .line 148
    :cond_5
    :goto_5
    move/from16 v20, v19

    .line 149
    .line 150
    :goto_6
    cmp-long v21, v5, v15

    .line 151
    .line 152
    if-nez v21, :cond_6

    .line 153
    .line 154
    move/from16 v21, v19

    .line 155
    .line 156
    goto :goto_7

    .line 157
    :cond_6
    const/16 v21, 0x0

    .line 158
    .line 159
    :goto_7
    cmp-long v22, v22, v15

    .line 160
    .line 161
    if-nez v22, :cond_7

    .line 162
    .line 163
    move/from16 v22, v19

    .line 164
    .line 165
    goto :goto_8

    .line 166
    :cond_7
    const/16 v22, 0x0

    .line 167
    .line 168
    :goto_8
    iput-wide v10, v4, Lph7;->g:J

    .line 169
    .line 170
    iput-wide v12, v4, Lph7;->h:J

    .line 171
    .line 172
    if-nez v21, :cond_8

    .line 173
    .line 174
    if-eqz v22, :cond_9

    .line 175
    .line 176
    :cond_8
    if-eqz v21, :cond_a

    .line 177
    .line 178
    :cond_9
    move/from16 v22, v19

    .line 179
    .line 180
    goto :goto_9

    .line 181
    :cond_a
    const/16 v22, 0x0

    .line 182
    .line 183
    :goto_9
    if-eqz v20, :cond_b

    .line 184
    .line 185
    if-eqz v22, :cond_b

    .line 186
    .line 187
    move-wide/from16 v23, v12

    .line 188
    .line 189
    const-wide/16 v12, -0x1

    .line 190
    .line 191
    iput-wide v12, v4, Lph7;->j:J

    .line 192
    .line 193
    iput-wide v8, v4, Lph7;->i:J

    .line 194
    .line 195
    iget-wide v5, v2, Lqh7;->d:J

    .line 196
    .line 197
    iget-wide v12, v2, Lqh7;->e:J

    .line 198
    .line 199
    move-wide/from16 v30, v15

    .line 200
    .line 201
    iget-object v15, v2, Lqh7;->g:[F

    .line 202
    .line 203
    move-object/from16 v20, v4

    .line 204
    .line 205
    move-wide/from16 v25, v5

    .line 206
    .line 207
    move-wide/from16 v21, v10

    .line 208
    .line 209
    move-wide/from16 v27, v12

    .line 210
    .line 211
    move-object/from16 v29, v15

    .line 212
    .line 213
    invoke-virtual/range {v20 .. v29}, Lph7;->a(JJJJ[F)V

    .line 214
    .line 215
    .line 216
    goto :goto_a

    .line 217
    :cond_b
    move-wide/from16 v23, v12

    .line 218
    .line 219
    move-wide/from16 v30, v15

    .line 220
    .line 221
    if-nez v21, :cond_c

    .line 222
    .line 223
    iput-wide v8, v4, Lph7;->j:J

    .line 224
    .line 225
    iget-wide v12, v2, Lqh7;->c:J

    .line 226
    .line 227
    add-long/2addr v5, v8

    .line 228
    cmp-long v4, v12, v30

    .line 229
    .line 230
    if-lez v4, :cond_c

    .line 231
    .line 232
    cmp-long v4, v5, v12

    .line 233
    .line 234
    if-gez v4, :cond_c

    .line 235
    .line 236
    iput-wide v12, v2, Lqh7;->c:J

    .line 237
    .line 238
    :cond_c
    :goto_a
    move v6, v7

    .line 239
    move-object v4, v14

    .line 240
    move-wide/from16 v12, v23

    .line 241
    .line 242
    move-wide/from16 v15, v30

    .line 243
    .line 244
    goto/16 :goto_4

    .line 245
    .line 246
    :cond_d
    move v7, v6

    .line 247
    move-wide/from16 v30, v15

    .line 248
    .line 249
    add-int/lit8 v6, v7, 0x3

    .line 250
    .line 251
    move/from16 v5, v17

    .line 252
    .line 253
    move/from16 v11, v18

    .line 254
    .line 255
    move/from16 v4, v19

    .line 256
    .line 257
    move-wide/from16 v15, v30

    .line 258
    .line 259
    const/4 v12, 0x0

    .line 260
    goto/16 :goto_3

    .line 261
    .line 262
    :cond_e
    move/from16 v18, v11

    .line 263
    .line 264
    move-wide/from16 v30, v15

    .line 265
    .line 266
    iget-object v1, v3, Lig;->c:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast v1, [J

    .line 269
    .line 270
    iget v4, v3, Lig;->b:I

    .line 271
    .line 272
    const/4 v5, 0x0

    .line 273
    :goto_b
    array-length v6, v1

    .line 274
    add-int/lit8 v6, v6, -0x2

    .line 275
    .line 276
    if-ge v5, v6, :cond_10

    .line 277
    .line 278
    if-ge v5, v4, :cond_10

    .line 279
    .line 280
    add-int/lit8 v6, v5, 0x2

    .line 281
    .line 282
    aget-wide v10, v1, v6

    .line 283
    .line 284
    const-wide v12, -0x1000000000000001L    # -3.1050361846014175E231

    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    and-long/2addr v10, v12

    .line 290
    aput-wide v10, v1, v6

    .line 291
    .line 292
    add-int/lit8 v5, v5, 0x3

    .line 293
    .line 294
    goto :goto_b

    .line 295
    :cond_f
    move/from16 v18, v11

    .line 296
    .line 297
    move-wide/from16 v30, v15

    .line 298
    .line 299
    :cond_10
    iget-boolean v1, v0, Lny5;->g:Z

    .line 300
    .line 301
    const/16 v16, 0x7

    .line 302
    .line 303
    const-wide v19, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    if-eqz v1, :cond_15

    .line 309
    .line 310
    const/4 v1, 0x0

    .line 311
    iput-boolean v1, v0, Lny5;->g:Z

    .line 312
    .line 313
    iget-wide v4, v2, Lqh7;->d:J

    .line 314
    .line 315
    iget-wide v6, v2, Lqh7;->e:J

    .line 316
    .line 317
    move-wide v9, v8

    .line 318
    iget-object v8, v2, Lqh7;->g:[F

    .line 319
    .line 320
    iget-object v1, v2, Lqh7;->a:Lyo4;

    .line 321
    .line 322
    const-wide/16 v21, 0x80

    .line 323
    .line 324
    iget-object v12, v1, Lme3;->c:[Ljava/lang/Object;

    .line 325
    .line 326
    iget-object v1, v1, Lme3;->a:[J

    .line 327
    .line 328
    array-length v13, v1

    .line 329
    add-int/lit8 v13, v13, -0x2

    .line 330
    .line 331
    if-ltz v13, :cond_14

    .line 332
    .line 333
    move-object/from16 v17, v12

    .line 334
    .line 335
    const/4 v14, 0x0

    .line 336
    const-wide/16 v23, 0xff

    .line 337
    .line 338
    :goto_c
    const/16 v15, 0x8

    .line 339
    .line 340
    aget-wide v11, v1, v14

    .line 341
    .line 342
    move-object/from16 v26, v1

    .line 343
    .line 344
    move-object/from16 v25, v2

    .line 345
    .line 346
    not-long v1, v11

    .line 347
    shl-long v1, v1, v16

    .line 348
    .line 349
    and-long/2addr v1, v11

    .line 350
    and-long v1, v1, v19

    .line 351
    .line 352
    cmp-long v1, v1, v19

    .line 353
    .line 354
    if-eqz v1, :cond_13

    .line 355
    .line 356
    sub-int v1, v14, v13

    .line 357
    .line 358
    not-int v1, v1

    .line 359
    ushr-int/lit8 v1, v1, 0x1f

    .line 360
    .line 361
    rsub-int/lit8 v1, v1, 0x8

    .line 362
    .line 363
    move-wide/from16 v27, v11

    .line 364
    .line 365
    const/4 v11, 0x0

    .line 366
    :goto_d
    if-ge v11, v1, :cond_12

    .line 367
    .line 368
    and-long v32, v27, v23

    .line 369
    .line 370
    cmp-long v2, v32, v21

    .line 371
    .line 372
    if-gez v2, :cond_11

    .line 373
    .line 374
    shl-int/lit8 v2, v14, 0x3

    .line 375
    .line 376
    add-int/2addr v2, v11

    .line 377
    aget-object v2, v17, v2

    .line 378
    .line 379
    check-cast v2, Lph7;

    .line 380
    .line 381
    :goto_e
    if-eqz v2, :cond_11

    .line 382
    .line 383
    move-object v12, v3

    .line 384
    move-object v3, v2

    .line 385
    move-object/from16 v2, v25

    .line 386
    .line 387
    invoke-virtual/range {v2 .. v10}, Lqh7;->b(Lph7;JJ[FJ)V

    .line 388
    .line 389
    .line 390
    iget-object v3, v3, Lph7;->f:Lph7;

    .line 391
    .line 392
    move-object v2, v3

    .line 393
    move-object v3, v12

    .line 394
    goto :goto_e

    .line 395
    :cond_11
    move-object v12, v3

    .line 396
    move-object/from16 v2, v25

    .line 397
    .line 398
    shr-long v27, v27, v15

    .line 399
    .line 400
    add-int/lit8 v11, v11, 0x1

    .line 401
    .line 402
    move-object/from16 v25, v2

    .line 403
    .line 404
    move-object v3, v12

    .line 405
    goto :goto_d

    .line 406
    :cond_12
    move-object v12, v3

    .line 407
    move-object/from16 v2, v25

    .line 408
    .line 409
    if-ne v1, v15, :cond_16

    .line 410
    .line 411
    goto :goto_f

    .line 412
    :cond_13
    move-object v12, v3

    .line 413
    move-object/from16 v2, v25

    .line 414
    .line 415
    :goto_f
    if-eq v14, v13, :cond_16

    .line 416
    .line 417
    add-int/lit8 v14, v14, 0x1

    .line 418
    .line 419
    move-object v3, v12

    .line 420
    move-object/from16 v1, v26

    .line 421
    .line 422
    goto :goto_c

    .line 423
    :cond_14
    move-object v12, v3

    .line 424
    goto :goto_10

    .line 425
    :cond_15
    move-object v12, v3

    .line 426
    move-wide v9, v8

    .line 427
    const-wide/16 v21, 0x80

    .line 428
    .line 429
    :goto_10
    const-wide/16 v23, 0xff

    .line 430
    .line 431
    :cond_16
    if-eqz v18, :cond_17

    .line 432
    .line 433
    iget-wide v4, v2, Lqh7;->d:J

    .line 434
    .line 435
    iget-wide v6, v2, Lqh7;->e:J

    .line 436
    .line 437
    iget-object v8, v2, Lqh7;->g:[F

    .line 438
    .line 439
    iget-object v1, v2, Lqh7;->b:Lph7;

    .line 440
    .line 441
    if-eqz v1, :cond_17

    .line 442
    .line 443
    move-object v3, v1

    .line 444
    :goto_11
    if-eqz v3, :cond_17

    .line 445
    .line 446
    iget-object v1, v3, Lph7;->d:Lll4;

    .line 447
    .line 448
    invoke-static {v1}, Lrc9;->O0(Lvo1;)Luy3;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    invoke-static {v1}, Lxy3;->a(Luy3;)Lp95;

    .line 453
    .line 454
    .line 455
    move-result-object v11

    .line 456
    check-cast v11, Lje;

    .line 457
    .line 458
    invoke-virtual {v11}, Lje;->getRectManager()Lny5;

    .line 459
    .line 460
    .line 461
    move-result-object v11

    .line 462
    invoke-virtual {v11, v1}, Lny5;->b(Luy3;)J

    .line 463
    .line 464
    .line 465
    move-result-wide v13

    .line 466
    iput-wide v13, v3, Lph7;->g:J

    .line 467
    .line 468
    move-object/from16 v17, v12

    .line 469
    .line 470
    const/16 v18, 0x20

    .line 471
    .line 472
    shr-long v11, v13, v18

    .line 473
    .line 474
    long-to-int v11, v11

    .line 475
    iget-object v1, v1, Luy3;->b0:Lyy3;

    .line 476
    .line 477
    iget-object v1, v1, Lyy3;->p:Lkh4;

    .line 478
    .line 479
    iget v12, v1, Leh5;->w:I

    .line 480
    .line 481
    add-int/2addr v12, v11

    .line 482
    const-wide v25, 0xffffffffL

    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    and-long v13, v13, v25

    .line 488
    .line 489
    long-to-int v11, v13

    .line 490
    iget v1, v1, Leh5;->x:I

    .line 491
    .line 492
    add-int/2addr v1, v11

    .line 493
    int-to-long v11, v12

    .line 494
    shl-long v11, v11, v18

    .line 495
    .line 496
    int-to-long v13, v1

    .line 497
    and-long v13, v13, v25

    .line 498
    .line 499
    or-long/2addr v11, v13

    .line 500
    iput-wide v11, v3, Lph7;->h:J

    .line 501
    .line 502
    invoke-virtual/range {v2 .. v10}, Lqh7;->b(Lph7;JJ[FJ)V

    .line 503
    .line 504
    .line 505
    move-object v1, v2

    .line 506
    iget-object v3, v3, Lph7;->f:Lph7;

    .line 507
    .line 508
    move-object/from16 v12, v17

    .line 509
    .line 510
    goto :goto_11

    .line 511
    :cond_17
    move-object v1, v2

    .line 512
    move-object/from16 v17, v12

    .line 513
    .line 514
    iget-boolean v2, v0, Lny5;->h:Z

    .line 515
    .line 516
    const/4 v12, 0x0

    .line 517
    if-eqz v2, :cond_1a

    .line 518
    .line 519
    iput-boolean v12, v0, Lny5;->h:Z

    .line 520
    .line 521
    move-object/from16 v2, v17

    .line 522
    .line 523
    iget-object v3, v2, Lig;->c:Ljava/lang/Object;

    .line 524
    .line 525
    check-cast v3, [J

    .line 526
    .line 527
    iget v4, v2, Lig;->b:I

    .line 528
    .line 529
    iget-object v5, v2, Lig;->d:Ljava/lang/Object;

    .line 530
    .line 531
    check-cast v5, [J

    .line 532
    .line 533
    move v6, v12

    .line 534
    move v7, v6

    .line 535
    :goto_12
    array-length v8, v3

    .line 536
    add-int/lit8 v8, v8, -0x2

    .line 537
    .line 538
    if-ge v6, v8, :cond_19

    .line 539
    .line 540
    array-length v8, v5

    .line 541
    add-int/lit8 v8, v8, -0x2

    .line 542
    .line 543
    if-ge v7, v8, :cond_19

    .line 544
    .line 545
    if-ge v6, v4, :cond_19

    .line 546
    .line 547
    add-int/lit8 v8, v6, 0x2

    .line 548
    .line 549
    aget-wide v13, v3, v8

    .line 550
    .line 551
    sget-wide v17, Lmy5;->a:J

    .line 552
    .line 553
    cmp-long v11, v13, v17

    .line 554
    .line 555
    if-eqz v11, :cond_18

    .line 556
    .line 557
    aget-wide v13, v3, v6

    .line 558
    .line 559
    aput-wide v13, v5, v7

    .line 560
    .line 561
    add-int/lit8 v11, v7, 0x1

    .line 562
    .line 563
    add-int/lit8 v13, v6, 0x1

    .line 564
    .line 565
    aget-wide v13, v3, v13

    .line 566
    .line 567
    aput-wide v13, v5, v11

    .line 568
    .line 569
    add-int/lit8 v11, v7, 0x2

    .line 570
    .line 571
    aget-wide v13, v3, v8

    .line 572
    .line 573
    aput-wide v13, v5, v11

    .line 574
    .line 575
    add-int/lit8 v7, v7, 0x3

    .line 576
    .line 577
    :cond_18
    add-int/lit8 v6, v6, 0x3

    .line 578
    .line 579
    goto :goto_12

    .line 580
    :cond_19
    iput v7, v2, Lig;->b:I

    .line 581
    .line 582
    iput-object v5, v2, Lig;->c:Ljava/lang/Object;

    .line 583
    .line 584
    iput-object v3, v2, Lig;->d:Ljava/lang/Object;

    .line 585
    .line 586
    :cond_1a
    iget-wide v2, v1, Lqh7;->c:J

    .line 587
    .line 588
    cmp-long v2, v2, v9

    .line 589
    .line 590
    if-lez v2, :cond_1b

    .line 591
    .line 592
    goto/16 :goto_1a

    .line 593
    .line 594
    :cond_1b
    iget-wide v3, v1, Lqh7;->d:J

    .line 595
    .line 596
    iget-wide v5, v1, Lqh7;->e:J

    .line 597
    .line 598
    iget-object v7, v1, Lqh7;->g:[F

    .line 599
    .line 600
    iget-object v2, v1, Lqh7;->a:Lyo4;

    .line 601
    .line 602
    iget-object v13, v2, Lme3;->c:[Ljava/lang/Object;

    .line 603
    .line 604
    iget-object v14, v2, Lme3;->a:[J

    .line 605
    .line 606
    array-length v2, v14

    .line 607
    add-int/lit8 v2, v2, -0x2

    .line 608
    .line 609
    const-wide v17, 0x7fffffffffffffffL

    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    if-ltz v2, :cond_20

    .line 615
    .line 616
    move v8, v12

    .line 617
    move-object/from16 v27, v13

    .line 618
    .line 619
    move-wide/from16 v25, v17

    .line 620
    .line 621
    :goto_13
    aget-wide v12, v14, v8

    .line 622
    .line 623
    move-wide/from16 v28, v3

    .line 624
    .line 625
    move v4, v2

    .line 626
    not-long v2, v12

    .line 627
    shl-long v2, v2, v16

    .line 628
    .line 629
    and-long/2addr v2, v12

    .line 630
    and-long v2, v2, v19

    .line 631
    .line 632
    cmp-long v2, v2, v19

    .line 633
    .line 634
    if-eqz v2, :cond_1e

    .line 635
    .line 636
    sub-int v2, v8, v4

    .line 637
    .line 638
    not-int v2, v2

    .line 639
    ushr-int/lit8 v2, v2, 0x1f

    .line 640
    .line 641
    const/16 v15, 0x8

    .line 642
    .line 643
    rsub-int/lit8 v2, v2, 0x8

    .line 644
    .line 645
    move-wide/from16 v32, v25

    .line 646
    .line 647
    move-wide/from16 v25, v12

    .line 648
    .line 649
    const/4 v12, 0x0

    .line 650
    :goto_14
    if-ge v12, v2, :cond_1d

    .line 651
    .line 652
    and-long v34, v25, v23

    .line 653
    .line 654
    cmp-long v3, v34, v21

    .line 655
    .line 656
    if-gez v3, :cond_1c

    .line 657
    .line 658
    shl-int/lit8 v3, v8, 0x3

    .line 659
    .line 660
    add-int/2addr v3, v12

    .line 661
    aget-object v3, v27, v3

    .line 662
    .line 663
    check-cast v3, Lph7;

    .line 664
    .line 665
    :goto_15
    if-eqz v3, :cond_1c

    .line 666
    .line 667
    move v0, v2

    .line 668
    move-object v2, v3

    .line 669
    move v13, v4

    .line 670
    move-wide/from16 v3, v28

    .line 671
    .line 672
    move/from16 v28, v12

    .line 673
    .line 674
    move v12, v15

    .line 675
    move v15, v8

    .line 676
    move-wide v8, v9

    .line 677
    move-wide/from16 v10, v32

    .line 678
    .line 679
    invoke-static/range {v2 .. v11}, Lqh7;->a(Lph7;JJ[FJJ)J

    .line 680
    .line 681
    .line 682
    move-result-wide v32

    .line 683
    move-wide v9, v8

    .line 684
    iget-object v2, v2, Lph7;->f:Lph7;

    .line 685
    .line 686
    move v8, v15

    .line 687
    move v15, v12

    .line 688
    move/from16 v12, v28

    .line 689
    .line 690
    move-wide/from16 v28, v3

    .line 691
    .line 692
    move v4, v13

    .line 693
    move-object v3, v2

    .line 694
    move v2, v0

    .line 695
    move-object/from16 v0, p0

    .line 696
    .line 697
    goto :goto_15

    .line 698
    :cond_1c
    move v0, v2

    .line 699
    move v13, v4

    .line 700
    move-wide/from16 v3, v28

    .line 701
    .line 702
    move/from16 v28, v12

    .line 703
    .line 704
    move v12, v15

    .line 705
    move v15, v8

    .line 706
    shr-long v25, v25, v12

    .line 707
    .line 708
    add-int/lit8 v2, v28, 0x1

    .line 709
    .line 710
    move-wide/from16 v28, v3

    .line 711
    .line 712
    move v4, v13

    .line 713
    move v8, v15

    .line 714
    move v15, v12

    .line 715
    move v12, v2

    .line 716
    move v2, v0

    .line 717
    move-object/from16 v0, p0

    .line 718
    .line 719
    goto :goto_14

    .line 720
    :cond_1d
    move v0, v2

    .line 721
    move v13, v4

    .line 722
    move v12, v15

    .line 723
    move-wide/from16 v3, v28

    .line 724
    .line 725
    move v15, v8

    .line 726
    if-ne v0, v12, :cond_21

    .line 727
    .line 728
    move-wide/from16 v25, v32

    .line 729
    .line 730
    goto :goto_16

    .line 731
    :cond_1e
    move v13, v4

    .line 732
    move v15, v8

    .line 733
    move-wide/from16 v3, v28

    .line 734
    .line 735
    const/16 v12, 0x8

    .line 736
    .line 737
    :goto_16
    if-eq v15, v13, :cond_1f

    .line 738
    .line 739
    add-int/lit8 v8, v15, 0x1

    .line 740
    .line 741
    move-object/from16 v0, p0

    .line 742
    .line 743
    move v2, v13

    .line 744
    goto :goto_13

    .line 745
    :cond_1f
    move-wide/from16 v32, v25

    .line 746
    .line 747
    goto :goto_17

    .line 748
    :cond_20
    move-wide/from16 v32, v17

    .line 749
    .line 750
    :cond_21
    :goto_17
    iget-object v0, v1, Lqh7;->b:Lph7;

    .line 751
    .line 752
    if-eqz v0, :cond_22

    .line 753
    .line 754
    move-object v2, v0

    .line 755
    :goto_18
    if-eqz v2, :cond_22

    .line 756
    .line 757
    move-wide v8, v9

    .line 758
    move-wide/from16 v10, v32

    .line 759
    .line 760
    invoke-static/range {v2 .. v11}, Lqh7;->a(Lph7;JJ[FJJ)J

    .line 761
    .line 762
    .line 763
    move-result-wide v32

    .line 764
    move-wide v9, v8

    .line 765
    iget-object v2, v2, Lph7;->f:Lph7;

    .line 766
    .line 767
    goto :goto_18

    .line 768
    :cond_22
    cmp-long v0, v32, v17

    .line 769
    .line 770
    if-nez v0, :cond_23

    .line 771
    .line 772
    const-wide/16 v13, -0x1

    .line 773
    .line 774
    goto :goto_19

    .line 775
    :cond_23
    move-wide/from16 v13, v32

    .line 776
    .line 777
    :goto_19
    iput-wide v13, v1, Lqh7;->c:J

    .line 778
    .line 779
    :goto_1a
    iget-wide v0, v1, Lqh7;->c:J

    .line 780
    .line 781
    cmp-long v0, v0, v30

    .line 782
    .line 783
    if-lez v0, :cond_24

    .line 784
    .line 785
    invoke-virtual/range {p0 .. p0}, Lny5;->k()V

    .line 786
    .line 787
    .line 788
    :cond_24
    return-void
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
.end method

.method public final b(Luy3;)J
    .locals 4

    .line 1
    invoke-static {p1}, Lny5;->d(Luy3;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lny5;->e(Luy3;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget-object p0, p0, Lny5;->c:Lig;

    .line 12
    .line 13
    iget-object p0, p0, Lig;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, [J

    .line 16
    .line 17
    aget-wide v0, p0, p1

    .line 18
    .line 19
    const/16 p0, 0x20

    .line 20
    .line 21
    shr-long v2, v0, p0

    .line 22
    .line 23
    long-to-int p1, v2

    .line 24
    long-to-int v0, v0

    .line 25
    int-to-long v1, p1

    .line 26
    shl-long p0, v1, p0

    .line 27
    .line 28
    int-to-long v0, v0

    .line 29
    const-wide v2, 0xffffffffL

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    and-long/2addr v0, v2

    .line 35
    or-long/2addr p0, v0

    .line 36
    return-wide p0

    .line 37
    :cond_0
    const-wide p0, 0x7fffffff7fffffffL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    return-wide p0
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
.end method

.method public final e(Luy3;)I
    .locals 7

    .line 1
    iget v0, p1, Luy3;->C:I

    .line 2
    .line 3
    const/4 v1, -0x4

    .line 4
    if-ne v0, v1, :cond_1

    .line 5
    .line 6
    :cond_0
    move v0, v1

    .line 7
    goto :goto_1

    .line 8
    :cond_1
    iget v2, p1, Luy3;->x:I

    .line 9
    .line 10
    iget-object p0, p0, Lny5;->c:Lig;

    .line 11
    .line 12
    iget-object v3, p0, Lig;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v3, [J

    .line 15
    .line 16
    const v4, 0x1ffffff

    .line 17
    .line 18
    .line 19
    if-ltz v0, :cond_2

    .line 20
    .line 21
    iget v5, p0, Lig;->b:I

    .line 22
    .line 23
    add-int/lit8 v5, v5, -0x2

    .line 24
    .line 25
    if-ge v0, v5, :cond_2

    .line 26
    .line 27
    add-int/lit8 v5, v0, 0x2

    .line 28
    .line 29
    aget-wide v5, v3, v5

    .line 30
    .line 31
    long-to-int v5, v5

    .line 32
    and-int/2addr v5, v4

    .line 33
    and-int v6, v2, v4

    .line 34
    .line 35
    if-ne v5, v6, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    and-int v0, v2, v4

    .line 39
    .line 40
    iget p0, p0, Lig;->b:I

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    :goto_0
    add-int/lit8 v5, p0, -0x2

    .line 44
    .line 45
    if-ge v2, v5, :cond_0

    .line 46
    .line 47
    add-int/lit8 v5, v2, 0x2

    .line 48
    .line 49
    aget-wide v5, v3, v5

    .line 50
    .line 51
    long-to-int v5, v5

    .line 52
    and-int/2addr v5, v4

    .line 53
    if-ne v5, v0, :cond_3

    .line 54
    .line 55
    move v0, v2

    .line 56
    goto :goto_1

    .line 57
    :cond_3
    add-int/lit8 v2, v2, 0x3

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :goto_1
    if-eq v0, v1, :cond_4

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_4
    iget p0, p1, Luy3;->x:I

    .line 64
    .line 65
    new-instance v1, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    const-string v2, "LayoutNode "

    .line 68
    .line 69
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string p0, " not found in RectList"

    .line 76
    .line 77
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-static {p0}, Lyb3;->a(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :goto_2
    iput v0, p1, Luy3;->C:I

    .line 88
    .line 89
    return v0
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

.method public final f(Luy3;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iput-boolean v2, v1, Luy3;->y:Z

    .line 7
    .line 8
    iget-object v3, v1, Luy3;->a0:Lo00;

    .line 9
    .line 10
    iget-object v4, v3, Lo00;->e:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v4, Lxz4;

    .line 13
    .line 14
    iget-object v5, v1, Luy3;->b0:Lyy3;

    .line 15
    .line 16
    iget-object v5, v5, Lyy3;->p:Lkh4;

    .line 17
    .line 18
    invoke-virtual {v5}, Lkh4;->b0()I

    .line 19
    .line 20
    .line 21
    move-result v6

    .line 22
    invoke-virtual {v5}, Lkh4;->Z()I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    int-to-float v6, v6

    .line 27
    int-to-float v5, v5

    .line 28
    iget-object v7, v0, Lny5;->l:Lsp4;

    .line 29
    .line 30
    const/4 v8, 0x0

    .line 31
    iput v8, v7, Lsp4;->b:F

    .line 32
    .line 33
    iput v8, v7, Lsp4;->c:F

    .line 34
    .line 35
    iput v6, v7, Lsp4;->d:F

    .line 36
    .line 37
    iput v5, v7, Lsp4;->e:F

    .line 38
    .line 39
    :goto_0
    const-wide v5, 0xffffffffL

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    const/16 v8, 0x20

    .line 45
    .line 46
    if-eqz v4, :cond_2

    .line 47
    .line 48
    iget-object v9, v4, Lxz4;->O:Luy3;

    .line 49
    .line 50
    iget-object v10, v9, Luy3;->a0:Lo00;

    .line 51
    .line 52
    iget-object v10, v10, Lo00;->e:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v10, Lxz4;

    .line 55
    .line 56
    if-ne v4, v10, :cond_0

    .line 57
    .line 58
    iget-boolean v10, v9, Luy3;->y:Z

    .line 59
    .line 60
    if-nez v10, :cond_0

    .line 61
    .line 62
    invoke-virtual {v0, v9}, Lny5;->b(Luy3;)J

    .line 63
    .line 64
    .line 65
    move-result-wide v9

    .line 66
    const-wide v11, 0x7fffffff7fffffffL

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    invoke-static {v9, v10, v11, v12}, Loe3;->a(JJ)Z

    .line 72
    .line 73
    .line 74
    move-result v11

    .line 75
    if-nez v11, :cond_0

    .line 76
    .line 77
    shr-long v11, v9, v8

    .line 78
    .line 79
    long-to-int v4, v11

    .line 80
    int-to-float v4, v4

    .line 81
    and-long/2addr v9, v5

    .line 82
    long-to-int v9, v9

    .line 83
    int-to-float v9, v9

    .line 84
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    int-to-long v10, v4

    .line 89
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    int-to-long v12, v4

    .line 94
    shl-long v9, v10, v8

    .line 95
    .line 96
    and-long v11, v12, v5

    .line 97
    .line 98
    or-long/2addr v9, v11

    .line 99
    invoke-virtual {v7, v9, v10}, Lsp4;->e(J)V

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_0
    iget-object v9, v4, Lxz4;->l0:Lo95;

    .line 104
    .line 105
    if-eqz v9, :cond_1

    .line 106
    .line 107
    check-cast v9, Lfx2;

    .line 108
    .line 109
    invoke-virtual {v9}, Lfx2;->b()[F

    .line 110
    .line 111
    .line 112
    move-result-object v9

    .line 113
    invoke-static {v9}, Lx91;->D([F)Z

    .line 114
    .line 115
    .line 116
    move-result v10

    .line 117
    if-nez v10, :cond_1

    .line 118
    .line 119
    invoke-static {v9, v7}, Leh4;->c([FLsp4;)V

    .line 120
    .line 121
    .line 122
    :cond_1
    iget-wide v9, v4, Lxz4;->Z:J

    .line 123
    .line 124
    shr-long v11, v9, v8

    .line 125
    .line 126
    long-to-int v11, v11

    .line 127
    int-to-float v11, v11

    .line 128
    and-long/2addr v9, v5

    .line 129
    long-to-int v9, v9

    .line 130
    int-to-float v9, v9

    .line 131
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 132
    .line 133
    .line 134
    move-result v10

    .line 135
    int-to-long v10, v10

    .line 136
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 137
    .line 138
    .line 139
    move-result v9

    .line 140
    int-to-long v12, v9

    .line 141
    shl-long v8, v10, v8

    .line 142
    .line 143
    and-long/2addr v5, v12

    .line 144
    or-long/2addr v5, v8

    .line 145
    invoke-virtual {v7, v5, v6}, Lsp4;->e(J)V

    .line 146
    .line 147
    .line 148
    iget-object v4, v4, Lxz4;->Q:Lxz4;

    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_2
    :goto_1
    iget v4, v7, Lsp4;->b:F

    .line 152
    .line 153
    float-to-int v11, v4

    .line 154
    iget v4, v7, Lsp4;->c:F

    .line 155
    .line 156
    float-to-int v12, v4

    .line 157
    iget v4, v7, Lsp4;->d:F

    .line 158
    .line 159
    float-to-int v13, v4

    .line 160
    iget v4, v7, Lsp4;->e:F

    .line 161
    .line 162
    float-to-int v14, v4

    .line 163
    iget v10, v1, Luy3;->x:I

    .line 164
    .line 165
    iget v4, v1, Luy3;->C:I

    .line 166
    .line 167
    iget-object v9, v0, Lny5;->c:Lig;

    .line 168
    .line 169
    const/4 v7, -0x4

    .line 170
    if-eq v4, v7, :cond_3

    .line 171
    .line 172
    invoke-virtual/range {p0 .. p1}, Lny5;->e(Luy3;)I

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    iget-object v4, v9, Lig;->c:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v4, [J

    .line 179
    .line 180
    int-to-long v9, v11

    .line 181
    shl-long/2addr v9, v8

    .line 182
    int-to-long v11, v12

    .line 183
    and-long/2addr v11, v5

    .line 184
    or-long/2addr v9, v11

    .line 185
    aput-wide v9, v4, v3

    .line 186
    .line 187
    add-int/lit8 v7, v3, 0x1

    .line 188
    .line 189
    int-to-long v9, v13

    .line 190
    shl-long v8, v9, v8

    .line 191
    .line 192
    int-to-long v10, v14

    .line 193
    and-long/2addr v5, v10

    .line 194
    or-long/2addr v5, v8

    .line 195
    aput-wide v5, v4, v7

    .line 196
    .line 197
    add-int/lit8 v3, v3, 0x2

    .line 198
    .line 199
    aget-wide v5, v4, v3

    .line 200
    .line 201
    const/16 v7, 0x3f

    .line 202
    .line 203
    shr-long v7, v5, v7

    .line 204
    .line 205
    const-wide/16 v9, 0x1

    .line 206
    .line 207
    and-long/2addr v7, v9

    .line 208
    const/16 v9, 0x3c

    .line 209
    .line 210
    shl-long/2addr v7, v9

    .line 211
    or-long/2addr v5, v7

    .line 212
    aput-wide v5, v4, v3

    .line 213
    .line 214
    goto :goto_4

    .line 215
    :cond_3
    invoke-virtual {v1}, Luy3;->v()Luy3;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    if-eqz v4, :cond_4

    .line 220
    .line 221
    iget v5, v4, Luy3;->x:I

    .line 222
    .line 223
    :goto_2
    move v15, v5

    .line 224
    goto :goto_3

    .line 225
    :cond_4
    const/4 v5, -0x1

    .line 226
    goto :goto_2

    .line 227
    :goto_3
    if-eqz v4, :cond_5

    .line 228
    .line 229
    invoke-virtual {v0, v4}, Lny5;->e(Luy3;)I

    .line 230
    .line 231
    .line 232
    move-result v7

    .line 233
    :cond_5
    move/from16 v16, v7

    .line 234
    .line 235
    const/16 v4, 0x400

    .line 236
    .line 237
    invoke-virtual {v3, v4}, Lo00;->f(I)Z

    .line 238
    .line 239
    .line 240
    move-result v17

    .line 241
    const/16 v4, 0x10

    .line 242
    .line 243
    invoke-virtual {v3, v4}, Lo00;->f(I)Z

    .line 244
    .line 245
    .line 246
    move-result v18

    .line 247
    iget-object v3, v0, Lny5;->d:Lqh7;

    .line 248
    .line 249
    iget-object v3, v3, Lqh7;->a:Lyo4;

    .line 250
    .line 251
    invoke-virtual {v3, v10}, Lme3;->a(I)Z

    .line 252
    .line 253
    .line 254
    move-result v19

    .line 255
    invoke-virtual/range {v9 .. v19}, Lig;->h(IIIIIIIZZZ)I

    .line 256
    .line 257
    .line 258
    move-result v3

    .line 259
    iput v3, v1, Luy3;->C:I

    .line 260
    .line 261
    :goto_4
    const/4 v3, 0x0

    .line 262
    iput-boolean v3, v1, Luy3;->B:Z

    .line 263
    .line 264
    iput-boolean v2, v0, Lny5;->f:Z

    .line 265
    .line 266
    invoke-virtual {v1}, Luy3;->z()Leq4;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    iget-object v2, v1, Leq4;->w:[Ljava/lang/Object;

    .line 271
    .line 272
    iget v1, v1, Leq4;->y:I

    .line 273
    .line 274
    :goto_5
    if-ge v3, v1, :cond_7

    .line 275
    .line 276
    aget-object v4, v2, v3

    .line 277
    .line 278
    check-cast v4, Luy3;

    .line 279
    .line 280
    invoke-virtual {v4}, Luy3;->K()Z

    .line 281
    .line 282
    .line 283
    move-result v5

    .line 284
    if-eqz v5, :cond_6

    .line 285
    .line 286
    invoke-virtual {v0, v4}, Lny5;->f(Luy3;)V

    .line 287
    .line 288
    .line 289
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 290
    .line 291
    goto :goto_5

    .line 292
    :cond_7
    return-void
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
.end method

.method public final h(Luy3;)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Luy3;->K()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    iget-object v3, v1, Luy3;->a0:Lo00;

    .line 10
    .line 11
    if-eqz v2, :cond_d

    .line 12
    .line 13
    iget-boolean v2, v1, Luy3;->B:Z

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    goto/16 :goto_4

    .line 18
    .line 19
    :cond_0
    invoke-virtual {v1}, Luy3;->v()Luy3;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const-wide v4, 0x7fffffff7fffffffL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    const/4 v6, 0x0

    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    iget-boolean v7, v2, Luy3;->y:Z

    .line 32
    .line 33
    if-nez v7, :cond_2

    .line 34
    .line 35
    iget-boolean v7, v2, Luy3;->A:Z

    .line 36
    .line 37
    if-eqz v7, :cond_1

    .line 38
    .line 39
    iput-boolean v6, v2, Luy3;->A:Z

    .line 40
    .line 41
    invoke-static {v2}, Lny5;->g(Luy3;)J

    .line 42
    .line 43
    .line 44
    move-result-wide v7

    .line 45
    iput-wide v7, v2, Luy3;->z:J

    .line 46
    .line 47
    :cond_1
    iget-wide v7, v2, Luy3;->z:J

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    if-nez v2, :cond_3

    .line 51
    .line 52
    const-wide/16 v7, 0x0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    move-wide v7, v4

    .line 56
    :goto_0
    iget-object v9, v3, Lo00;->e:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v9, Lxz4;

    .line 59
    .line 60
    invoke-static {v7, v8, v4, v5}, Loe3;->a(JJ)Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-nez v4, :cond_c

    .line 65
    .line 66
    invoke-static {v9}, Lny5;->c(Lxz4;)Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-nez v4, :cond_c

    .line 71
    .line 72
    iget-boolean v4, v1, Luy3;->y:Z

    .line 73
    .line 74
    if-nez v4, :cond_b

    .line 75
    .line 76
    iget-wide v4, v9, Lxz4;->Z:J

    .line 77
    .line 78
    invoke-static {v7, v8, v4, v5}, Loe3;->c(JJ)J

    .line 79
    .line 80
    .line 81
    move-result-wide v4

    .line 82
    iget-object v7, v1, Luy3;->b0:Lyy3;

    .line 83
    .line 84
    iget-object v7, v7, Lyy3;->p:Lkh4;

    .line 85
    .line 86
    invoke-virtual {v7}, Lkh4;->b0()I

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    invoke-virtual {v7}, Lkh4;->Z()I

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    iget v9, v1, Luy3;->C:I

    .line 95
    .line 96
    const/4 v10, -0x4

    .line 97
    iget-object v11, v0, Lny5;->c:Lig;

    .line 98
    .line 99
    const-wide v12, 0xffffffffL

    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    const/16 v14, 0x20

    .line 105
    .line 106
    if-eq v9, v10, :cond_8

    .line 107
    .line 108
    move-wide v9, v12

    .line 109
    invoke-virtual/range {p0 .. p1}, Lny5;->e(Luy3;)I

    .line 110
    .line 111
    .line 112
    move-result v12

    .line 113
    const-wide/16 v15, 0x1

    .line 114
    .line 115
    if-eqz v2, :cond_6

    .line 116
    .line 117
    invoke-virtual {v0, v2}, Lny5;->e(Luy3;)I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    move-wide/from16 v17, v4

    .line 122
    .line 123
    const/16 v5, 0x3c

    .line 124
    .line 125
    shr-long v3, v17, v14

    .line 126
    .line 127
    long-to-int v3, v3

    .line 128
    move-wide/from16 v19, v9

    .line 129
    .line 130
    and-long v9, v17, v19

    .line 131
    .line 132
    long-to-int v4, v9

    .line 133
    iget-object v9, v11, Lig;->c:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v9, [J

    .line 136
    .line 137
    move v10, v14

    .line 138
    const/16 v21, 0x3f

    .line 139
    .line 140
    aget-wide v13, v9, v2

    .line 141
    .line 142
    move/from16 v23, v10

    .line 143
    .line 144
    move-object/from16 v22, v11

    .line 145
    .line 146
    shr-long v10, v13, v23

    .line 147
    .line 148
    long-to-int v2, v10

    .line 149
    long-to-int v10, v13

    .line 150
    add-int/2addr v2, v3

    .line 151
    add-int/2addr v10, v4

    .line 152
    add-int/2addr v8, v2

    .line 153
    add-int/2addr v7, v10

    .line 154
    aget-wide v3, v9, v12

    .line 155
    .line 156
    shr-long v13, v3, v23

    .line 157
    .line 158
    long-to-int v11, v13

    .line 159
    long-to-int v3, v3

    .line 160
    sub-int v13, v2, v11

    .line 161
    .line 162
    sub-int v14, v10, v3

    .line 163
    .line 164
    add-int/lit8 v3, v12, 0x2

    .line 165
    .line 166
    aget-wide v17, v9, v3

    .line 167
    .line 168
    move v11, v5

    .line 169
    int-to-long v5, v2

    .line 170
    shl-long v5, v5, v23

    .line 171
    .line 172
    move-wide/from16 v24, v5

    .line 173
    .line 174
    int-to-long v4, v10

    .line 175
    and-long v4, v4, v19

    .line 176
    .line 177
    or-long v4, v24, v4

    .line 178
    .line 179
    aput-wide v4, v9, v12

    .line 180
    .line 181
    add-int/lit8 v2, v12, 0x1

    .line 182
    .line 183
    int-to-long v4, v8

    .line 184
    shl-long v4, v4, v23

    .line 185
    .line 186
    int-to-long v6, v7

    .line 187
    and-long v6, v6, v19

    .line 188
    .line 189
    or-long/2addr v4, v6

    .line 190
    aput-wide v4, v9, v2

    .line 191
    .line 192
    shr-long v4, v17, v21

    .line 193
    .line 194
    and-long/2addr v4, v15

    .line 195
    shl-long/2addr v4, v11

    .line 196
    or-long v4, v17, v4

    .line 197
    .line 198
    aput-wide v4, v9, v3

    .line 199
    .line 200
    if-nez v13, :cond_4

    .line 201
    .line 202
    if-eqz v14, :cond_5

    .line 203
    .line 204
    :cond_4
    move-wide/from16 v15, v17

    .line 205
    .line 206
    move-object/from16 v11, v22

    .line 207
    .line 208
    invoke-virtual/range {v11 .. v16}, Lig;->m(IIIJ)V

    .line 209
    .line 210
    .line 211
    :cond_5
    :goto_1
    const/4 v4, 0x0

    .line 212
    goto/16 :goto_3

    .line 213
    .line 214
    :cond_6
    move-wide/from16 v17, v4

    .line 215
    .line 216
    move-wide/from16 v19, v9

    .line 217
    .line 218
    move/from16 v23, v14

    .line 219
    .line 220
    const/16 v5, 0x3c

    .line 221
    .line 222
    const/16 v21, 0x3f

    .line 223
    .line 224
    invoke-virtual/range {p0 .. p1}, Lny5;->e(Luy3;)I

    .line 225
    .line 226
    .line 227
    move-result v12

    .line 228
    shr-long v2, v17, v23

    .line 229
    .line 230
    long-to-int v2, v2

    .line 231
    and-long v3, v17, v19

    .line 232
    .line 233
    long-to-int v3, v3

    .line 234
    add-int/2addr v8, v2

    .line 235
    add-int/2addr v7, v3

    .line 236
    iget-object v4, v11, Lig;->c:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v4, [J

    .line 239
    .line 240
    aget-wide v9, v4, v12

    .line 241
    .line 242
    int-to-long v13, v2

    .line 243
    shl-long v13, v13, v23

    .line 244
    .line 245
    move/from16 v22, v5

    .line 246
    .line 247
    int-to-long v5, v3

    .line 248
    and-long v5, v5, v19

    .line 249
    .line 250
    or-long/2addr v5, v13

    .line 251
    aput-wide v5, v4, v12

    .line 252
    .line 253
    add-int/lit8 v5, v12, 0x1

    .line 254
    .line 255
    int-to-long v13, v8

    .line 256
    shl-long v13, v13, v23

    .line 257
    .line 258
    int-to-long v6, v7

    .line 259
    and-long v6, v6, v19

    .line 260
    .line 261
    or-long/2addr v6, v13

    .line 262
    aput-wide v6, v4, v5

    .line 263
    .line 264
    add-int/lit8 v5, v12, 0x2

    .line 265
    .line 266
    aget-wide v6, v4, v5

    .line 267
    .line 268
    shr-long v13, v6, v21

    .line 269
    .line 270
    and-long/2addr v13, v15

    .line 271
    shl-long v13, v13, v22

    .line 272
    .line 273
    or-long/2addr v13, v6

    .line 274
    aput-wide v13, v4, v5

    .line 275
    .line 276
    shr-long v4, v9, v23

    .line 277
    .line 278
    long-to-int v4, v4

    .line 279
    sub-int v13, v2, v4

    .line 280
    .line 281
    long-to-int v2, v9

    .line 282
    sub-int v14, v3, v2

    .line 283
    .line 284
    if-nez v13, :cond_7

    .line 285
    .line 286
    if-eqz v14, :cond_5

    .line 287
    .line 288
    :cond_7
    move-wide v15, v6

    .line 289
    invoke-virtual/range {v11 .. v16}, Lig;->m(IIIJ)V

    .line 290
    .line 291
    .line 292
    goto :goto_1

    .line 293
    :cond_8
    move-wide/from16 v17, v4

    .line 294
    .line 295
    move-wide/from16 v19, v12

    .line 296
    .line 297
    move/from16 v23, v14

    .line 298
    .line 299
    iget v12, v1, Luy3;->x:I

    .line 300
    .line 301
    const/16 v4, 0x400

    .line 302
    .line 303
    invoke-virtual {v3, v4}, Lo00;->f(I)Z

    .line 304
    .line 305
    .line 306
    move-result v4

    .line 307
    const/16 v5, 0x10

    .line 308
    .line 309
    invoke-virtual {v3, v5}, Lo00;->f(I)Z

    .line 310
    .line 311
    .line 312
    move-result v3

    .line 313
    iget-object v5, v0, Lny5;->d:Lqh7;

    .line 314
    .line 315
    iget-object v5, v5, Lqh7;->a:Lyo4;

    .line 316
    .line 317
    invoke-virtual {v5, v12}, Lme3;->a(I)Z

    .line 318
    .line 319
    .line 320
    move-result v21

    .line 321
    if-eqz v2, :cond_a

    .line 322
    .line 323
    iget v5, v2, Luy3;->x:I

    .line 324
    .line 325
    invoke-virtual {v0, v2}, Lny5;->e(Luy3;)I

    .line 326
    .line 327
    .line 328
    move-result v2

    .line 329
    shr-long v9, v17, v23

    .line 330
    .line 331
    long-to-int v6, v9

    .line 332
    and-long v9, v17, v19

    .line 333
    .line 334
    long-to-int v9, v9

    .line 335
    const v10, 0x1ffffff

    .line 336
    .line 337
    .line 338
    and-int/2addr v12, v10

    .line 339
    iget-object v13, v11, Lig;->c:Ljava/lang/Object;

    .line 340
    .line 341
    check-cast v13, [J

    .line 342
    .line 343
    add-int/lit8 v14, v2, 0x2

    .line 344
    .line 345
    aget-wide v14, v13, v14

    .line 346
    .line 347
    long-to-int v14, v14

    .line 348
    and-int/2addr v14, v10

    .line 349
    and-int/2addr v10, v5

    .line 350
    if-ne v14, v10, :cond_9

    .line 351
    .line 352
    goto :goto_2

    .line 353
    :cond_9
    new-instance v10, Ljava/lang/StringBuilder;

    .line 354
    .line 355
    const-string v14, "Inserted child "

    .line 356
    .line 357
    invoke-direct {v10, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    const-string v14, " without valid parent index or parent "

    .line 364
    .line 365
    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    .line 371
    const-string v14, " not found"

    .line 372
    .line 373
    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v10

    .line 380
    invoke-static {v10}, Lyb3;->a(Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    :goto_2
    aget-wide v14, v13, v2

    .line 384
    .line 385
    move v13, v2

    .line 386
    move v10, v3

    .line 387
    shr-long v2, v14, v23

    .line 388
    .line 389
    long-to-int v2, v2

    .line 390
    long-to-int v3, v14

    .line 391
    add-int/2addr v2, v6

    .line 392
    add-int v14, v3, v9

    .line 393
    .line 394
    add-int v15, v2, v8

    .line 395
    .line 396
    add-int v16, v14, v7

    .line 397
    .line 398
    move/from16 v19, v4

    .line 399
    .line 400
    move/from16 v17, v5

    .line 401
    .line 402
    move/from16 v20, v10

    .line 403
    .line 404
    move/from16 v18, v13

    .line 405
    .line 406
    move v13, v2

    .line 407
    invoke-virtual/range {v11 .. v21}, Lig;->h(IIIIIIIZZZ)I

    .line 408
    .line 409
    .line 410
    move-result v2

    .line 411
    iput v2, v1, Luy3;->C:I

    .line 412
    .line 413
    goto/16 :goto_1

    .line 414
    .line 415
    :cond_a
    move-wide/from16 v9, v19

    .line 416
    .line 417
    move/from16 v20, v3

    .line 418
    .line 419
    move/from16 v19, v4

    .line 420
    .line 421
    shr-long v2, v17, v23

    .line 422
    .line 423
    long-to-int v13, v2

    .line 424
    and-long v2, v17, v9

    .line 425
    .line 426
    long-to-int v14, v2

    .line 427
    add-int v15, v13, v8

    .line 428
    .line 429
    add-int v16, v14, v7

    .line 430
    .line 431
    const/16 v17, -0x1

    .line 432
    .line 433
    const/16 v18, -0x4

    .line 434
    .line 435
    invoke-virtual/range {v11 .. v21}, Lig;->h(IIIIIIIZZZ)I

    .line 436
    .line 437
    .line 438
    move-result v2

    .line 439
    iput v2, v1, Luy3;->C:I

    .line 440
    .line 441
    goto/16 :goto_1

    .line 442
    .line 443
    :cond_b
    invoke-virtual/range {p0 .. p1}, Lny5;->f(Luy3;)V

    .line 444
    .line 445
    .line 446
    invoke-static {v1}, Lny5;->j(Luy3;)V

    .line 447
    .line 448
    .line 449
    goto/16 :goto_1

    .line 450
    .line 451
    :cond_c
    invoke-virtual/range {p0 .. p1}, Lny5;->f(Luy3;)V

    .line 452
    .line 453
    .line 454
    goto/16 :goto_1

    .line 455
    .line 456
    :goto_3
    iput-boolean v4, v1, Luy3;->B:Z

    .line 457
    .line 458
    const/4 v1, 0x1

    .line 459
    iput-boolean v1, v0, Lny5;->f:Z

    .line 460
    .line 461
    invoke-virtual {v0}, Lny5;->k()V

    .line 462
    .line 463
    .line 464
    :cond_d
    :goto_4
    return-void
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
.end method

.method public final i(Luy3;)V
    .locals 5

    .line 1
    invoke-static {p1}, Lny5;->d(Luy3;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lny5;->e(Luy3;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, Lny5;->c:Lig;

    .line 12
    .line 13
    iget-object v1, v1, Lig;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, [J

    .line 16
    .line 17
    const-wide/16 v2, -0x1

    .line 18
    .line 19
    aput-wide v2, v1, v0

    .line 20
    .line 21
    add-int/lit8 v4, v0, 0x1

    .line 22
    .line 23
    aput-wide v2, v1, v4

    .line 24
    .line 25
    add-int/lit8 v0, v0, 0x2

    .line 26
    .line 27
    sget-wide v2, Lmy5;->a:J

    .line 28
    .line 29
    aput-wide v2, v1, v0

    .line 30
    .line 31
    const/4 v0, -0x4

    .line 32
    iput v0, p1, Luy3;->C:I

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    iput-boolean v0, p1, Luy3;->B:Z

    .line 36
    .line 37
    iput-boolean v0, p0, Lny5;->f:Z

    .line 38
    .line 39
    iput-boolean v0, p0, Lny5;->h:Z

    .line 40
    .line 41
    :cond_0
    return-void
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
.end method

.method public final k()V
    .locals 9

    .line 1
    iget-object v0, p0, Lny5;->i:Lvd;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move v2, v1

    .line 9
    :goto_0
    iget-object v3, p0, Lny5;->d:Lqh7;

    .line 10
    .line 11
    iget-wide v3, v3, Lqh7;->c:J

    .line 12
    .line 13
    const-wide/16 v5, 0x0

    .line 14
    .line 15
    cmp-long v5, v3, v5

    .line 16
    .line 17
    if-gez v5, :cond_1

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    iget-wide v5, p0, Lny5;->j:J

    .line 23
    .line 24
    cmp-long v5, v5, v3

    .line 25
    .line 26
    if-nez v5, :cond_2

    .line 27
    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    :goto_1
    return-void

    .line 31
    :cond_2
    iget-object v2, p0, Lny5;->b:Lje;

    .line 32
    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    invoke-virtual {v2, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 36
    .line 37
    .line 38
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 39
    .line 40
    .line 41
    move-result-wide v5

    .line 42
    const-wide/16 v7, 0x10

    .line 43
    .line 44
    add-long/2addr v7, v5

    .line 45
    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 46
    .line 47
    .line 48
    move-result-wide v3

    .line 49
    iput-wide v3, p0, Lny5;->j:J

    .line 50
    .line 51
    sub-long/2addr v3, v5

    .line 52
    new-instance v0, Lvd;

    .line 53
    .line 54
    iget-object v5, p0, Lny5;->k:Lkh;

    .line 55
    .line 56
    invoke-direct {v0, v1, v5}, Lvd;-><init>(ILsr2;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v0, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 60
    .line 61
    .line 62
    iput-object v0, p0, Lny5;->i:Lvd;

    .line 63
    .line 64
    return-void
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
