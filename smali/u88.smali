.class public final Lu88;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Lk90;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I


# direct methods
.method public constructor <init>(Lk90;)V
    .locals 3

    .line 42
    iget v0, p1, Lk90;->w:I

    .line 43
    div-int/lit8 v0, v0, 0x2

    .line 44
    iget v1, p1, Lk90;->x:I

    .line 45
    div-int/lit8 v1, v1, 0x2

    const/16 v2, 0xa

    invoke-direct {p0, p1, v2, v0, v1}, Lu88;-><init>(Lk90;III)V

    return-void
.end method

.method public constructor <init>(Lk90;III)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu88;->a:Lk90;

    .line 5
    .line 6
    iget v0, p1, Lk90;->x:I

    .line 7
    .line 8
    iput v0, p0, Lu88;->b:I

    .line 9
    .line 10
    iget p1, p1, Lk90;->w:I

    .line 11
    .line 12
    iput p1, p0, Lu88;->c:I

    .line 13
    .line 14
    div-int/lit8 p2, p2, 0x2

    .line 15
    .line 16
    sub-int v1, p3, p2

    .line 17
    .line 18
    iput v1, p0, Lu88;->d:I

    .line 19
    .line 20
    add-int/2addr p3, p2

    .line 21
    iput p3, p0, Lu88;->e:I

    .line 22
    .line 23
    sub-int v2, p4, p2

    .line 24
    .line 25
    iput v2, p0, Lu88;->g:I

    .line 26
    .line 27
    add-int/2addr p4, p2

    .line 28
    iput p4, p0, Lu88;->f:I

    .line 29
    .line 30
    if-ltz v2, :cond_0

    .line 31
    .line 32
    if-ltz v1, :cond_0

    .line 33
    .line 34
    if-ge p4, v0, :cond_0

    .line 35
    .line 36
    if-ge p3, p1, :cond_0

    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    sget-object p0, Lcom/google/zxing/NotFoundException;->y:Lcom/google/zxing/NotFoundException;

    .line 40
    .line 41
    throw p0
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
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method


# virtual methods
.method public final a(IIIZ)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lu88;->a:Lk90;

    .line 2
    .line 3
    if-eqz p4, :cond_1

    .line 4
    .line 5
    :goto_0
    if-gt p1, p2, :cond_3

    .line 6
    .line 7
    invoke-virtual {p0, p1, p3}, Lk90;->b(II)Z

    .line 8
    .line 9
    .line 10
    move-result p4

    .line 11
    if-eqz p4, :cond_0

    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    :goto_1
    if-gt p1, p2, :cond_3

    .line 18
    .line 19
    invoke-virtual {p0, p3, p1}, Lk90;->b(II)Z

    .line 20
    .line 21
    .line 22
    move-result p4

    .line 23
    if-eqz p4, :cond_2

    .line 24
    .line 25
    :goto_2
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :cond_2
    add-int/lit8 p1, p1, 0x1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_3
    const/4 p0, 0x0

    .line 31
    return p0
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
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method

.method public final b()[Lr66;
    .locals 14

    .line 1
    iget v0, p0, Lu88;->d:I

    .line 2
    .line 3
    iget v1, p0, Lu88;->e:I

    .line 4
    .line 5
    iget v2, p0, Lu88;->g:I

    .line 6
    .line 7
    iget v3, p0, Lu88;->f:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    move v7, v4

    .line 12
    move v8, v7

    .line 13
    move v9, v8

    .line 14
    move v10, v9

    .line 15
    move v6, v5

    .line 16
    :cond_0
    iget v11, p0, Lu88;->c:I

    .line 17
    .line 18
    if-eqz v6, :cond_14

    .line 19
    .line 20
    move v12, v4

    .line 21
    move v6, v5

    .line 22
    :cond_1
    :goto_0
    if-nez v6, :cond_2

    .line 23
    .line 24
    if-nez v7, :cond_4

    .line 25
    .line 26
    :cond_2
    if-ge v1, v11, :cond_4

    .line 27
    .line 28
    invoke-virtual {p0, v2, v3, v1, v4}, Lu88;->a(IIIZ)Z

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    if-eqz v6, :cond_3

    .line 33
    .line 34
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    move v7, v5

    .line 37
    move v12, v7

    .line 38
    goto :goto_0

    .line 39
    :cond_3
    if-nez v7, :cond_1

    .line 40
    .line 41
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_4
    if-lt v1, v11, :cond_5

    .line 45
    .line 46
    :goto_1
    move v4, v5

    .line 47
    goto/16 :goto_5

    .line 48
    .line 49
    :cond_5
    move v6, v5

    .line 50
    :cond_6
    :goto_2
    iget v13, p0, Lu88;->b:I

    .line 51
    .line 52
    if-nez v6, :cond_7

    .line 53
    .line 54
    if-nez v8, :cond_9

    .line 55
    .line 56
    :cond_7
    if-ge v3, v13, :cond_9

    .line 57
    .line 58
    invoke-virtual {p0, v0, v1, v3, v5}, Lu88;->a(IIIZ)Z

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    if-eqz v6, :cond_8

    .line 63
    .line 64
    add-int/lit8 v3, v3, 0x1

    .line 65
    .line 66
    move v8, v5

    .line 67
    move v12, v8

    .line 68
    goto :goto_2

    .line 69
    :cond_8
    if-nez v8, :cond_6

    .line 70
    .line 71
    add-int/lit8 v3, v3, 0x1

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_9
    if-lt v3, v13, :cond_a

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_a
    move v6, v5

    .line 78
    :cond_b
    :goto_3
    if-nez v6, :cond_c

    .line 79
    .line 80
    if-nez v9, :cond_e

    .line 81
    .line 82
    :cond_c
    if-ltz v0, :cond_e

    .line 83
    .line 84
    invoke-virtual {p0, v2, v3, v0, v4}, Lu88;->a(IIIZ)Z

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    if-eqz v6, :cond_d

    .line 89
    .line 90
    add-int/lit8 v0, v0, -0x1

    .line 91
    .line 92
    move v9, v5

    .line 93
    move v12, v9

    .line 94
    goto :goto_3

    .line 95
    :cond_d
    if-nez v9, :cond_b

    .line 96
    .line 97
    add-int/lit8 v0, v0, -0x1

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_e
    if-gez v0, :cond_f

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_f
    move v6, v12

    .line 104
    move v12, v5

    .line 105
    :cond_10
    :goto_4
    if-nez v12, :cond_11

    .line 106
    .line 107
    if-nez v10, :cond_13

    .line 108
    .line 109
    :cond_11
    if-ltz v2, :cond_13

    .line 110
    .line 111
    invoke-virtual {p0, v0, v1, v2, v5}, Lu88;->a(IIIZ)Z

    .line 112
    .line 113
    .line 114
    move-result v12

    .line 115
    if-eqz v12, :cond_12

    .line 116
    .line 117
    add-int/lit8 v2, v2, -0x1

    .line 118
    .line 119
    move v6, v5

    .line 120
    move v10, v6

    .line 121
    goto :goto_4

    .line 122
    :cond_12
    if-nez v10, :cond_10

    .line 123
    .line 124
    add-int/lit8 v2, v2, -0x1

    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_13
    if-gez v2, :cond_0

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_14
    :goto_5
    if-nez v4, :cond_1e

    .line 131
    .line 132
    sub-int v4, v1, v0

    .line 133
    .line 134
    const/4 v6, 0x0

    .line 135
    move v8, v5

    .line 136
    move-object v7, v6

    .line 137
    :goto_6
    if-nez v7, :cond_15

    .line 138
    .line 139
    if-ge v8, v4, :cond_15

    .line 140
    .line 141
    int-to-float v7, v0

    .line 142
    sub-int v9, v3, v8

    .line 143
    .line 144
    int-to-float v9, v9

    .line 145
    add-int v10, v0, v8

    .line 146
    .line 147
    int-to-float v10, v10

    .line 148
    int-to-float v12, v3

    .line 149
    invoke-virtual {p0, v7, v9, v10, v12}, Lu88;->c(FFFF)Lr66;

    .line 150
    .line 151
    .line 152
    move-result-object v7

    .line 153
    add-int/lit8 v8, v8, 0x1

    .line 154
    .line 155
    goto :goto_6

    .line 156
    :cond_15
    if-eqz v7, :cond_1d

    .line 157
    .line 158
    move v9, v5

    .line 159
    move-object v8, v6

    .line 160
    :goto_7
    if-nez v8, :cond_16

    .line 161
    .line 162
    if-ge v9, v4, :cond_16

    .line 163
    .line 164
    int-to-float v8, v0

    .line 165
    add-int v10, v2, v9

    .line 166
    .line 167
    int-to-float v10, v10

    .line 168
    add-int v12, v0, v9

    .line 169
    .line 170
    int-to-float v12, v12

    .line 171
    int-to-float v13, v2

    .line 172
    invoke-virtual {p0, v8, v10, v12, v13}, Lu88;->c(FFFF)Lr66;

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    add-int/lit8 v9, v9, 0x1

    .line 177
    .line 178
    goto :goto_7

    .line 179
    :cond_16
    if-eqz v8, :cond_1c

    .line 180
    .line 181
    move v9, v5

    .line 182
    move-object v0, v6

    .line 183
    :goto_8
    if-nez v0, :cond_17

    .line 184
    .line 185
    if-ge v9, v4, :cond_17

    .line 186
    .line 187
    int-to-float v0, v1

    .line 188
    add-int v10, v2, v9

    .line 189
    .line 190
    int-to-float v10, v10

    .line 191
    sub-int v12, v1, v9

    .line 192
    .line 193
    int-to-float v12, v12

    .line 194
    int-to-float v13, v2

    .line 195
    invoke-virtual {p0, v0, v10, v12, v13}, Lu88;->c(FFFF)Lr66;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    add-int/lit8 v9, v9, 0x1

    .line 200
    .line 201
    goto :goto_8

    .line 202
    :cond_17
    if-eqz v0, :cond_1b

    .line 203
    .line 204
    :goto_9
    if-nez v6, :cond_18

    .line 205
    .line 206
    if-ge v5, v4, :cond_18

    .line 207
    .line 208
    int-to-float v2, v1

    .line 209
    sub-int v6, v3, v5

    .line 210
    .line 211
    int-to-float v6, v6

    .line 212
    sub-int v9, v1, v5

    .line 213
    .line 214
    int-to-float v9, v9

    .line 215
    int-to-float v10, v3

    .line 216
    invoke-virtual {p0, v2, v6, v9, v10}, Lu88;->c(FFFF)Lr66;

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    add-int/lit8 v5, v5, 0x1

    .line 221
    .line 222
    goto :goto_9

    .line 223
    :cond_18
    if-eqz v6, :cond_1a

    .line 224
    .line 225
    iget p0, v6, Lr66;->a:F

    .line 226
    .line 227
    iget v1, v6, Lr66;->b:F

    .line 228
    .line 229
    iget v2, v7, Lr66;->a:F

    .line 230
    .line 231
    iget v3, v7, Lr66;->b:F

    .line 232
    .line 233
    iget v4, v0, Lr66;->a:F

    .line 234
    .line 235
    iget v0, v0, Lr66;->b:F

    .line 236
    .line 237
    iget v5, v8, Lr66;->a:F

    .line 238
    .line 239
    iget v6, v8, Lr66;->b:F

    .line 240
    .line 241
    int-to-float v7, v11

    .line 242
    const/high16 v8, 0x40000000    # 2.0f

    .line 243
    .line 244
    div-float/2addr v7, v8

    .line 245
    cmpg-float v7, p0, v7

    .line 246
    .line 247
    const/high16 v8, 0x3f800000    # 1.0f

    .line 248
    .line 249
    if-gez v7, :cond_19

    .line 250
    .line 251
    new-instance v7, Lr66;

    .line 252
    .line 253
    sub-float/2addr v5, v8

    .line 254
    add-float/2addr v6, v8

    .line 255
    invoke-direct {v7, v5, v6}, Lr66;-><init>(FF)V

    .line 256
    .line 257
    .line 258
    new-instance v5, Lr66;

    .line 259
    .line 260
    add-float/2addr v2, v8

    .line 261
    add-float/2addr v3, v8

    .line 262
    invoke-direct {v5, v2, v3}, Lr66;-><init>(FF)V

    .line 263
    .line 264
    .line 265
    new-instance v2, Lr66;

    .line 266
    .line 267
    sub-float/2addr v4, v8

    .line 268
    sub-float/2addr v0, v8

    .line 269
    invoke-direct {v2, v4, v0}, Lr66;-><init>(FF)V

    .line 270
    .line 271
    .line 272
    new-instance v0, Lr66;

    .line 273
    .line 274
    add-float/2addr p0, v8

    .line 275
    sub-float/2addr v1, v8

    .line 276
    invoke-direct {v0, p0, v1}, Lr66;-><init>(FF)V

    .line 277
    .line 278
    .line 279
    filled-new-array {v7, v5, v2, v0}, [Lr66;

    .line 280
    .line 281
    .line 282
    move-result-object p0

    .line 283
    return-object p0

    .line 284
    :cond_19
    new-instance v7, Lr66;

    .line 285
    .line 286
    add-float/2addr v5, v8

    .line 287
    add-float/2addr v6, v8

    .line 288
    invoke-direct {v7, v5, v6}, Lr66;-><init>(FF)V

    .line 289
    .line 290
    .line 291
    new-instance v5, Lr66;

    .line 292
    .line 293
    add-float/2addr v2, v8

    .line 294
    sub-float/2addr v3, v8

    .line 295
    invoke-direct {v5, v2, v3}, Lr66;-><init>(FF)V

    .line 296
    .line 297
    .line 298
    new-instance v2, Lr66;

    .line 299
    .line 300
    sub-float/2addr v4, v8

    .line 301
    add-float/2addr v0, v8

    .line 302
    invoke-direct {v2, v4, v0}, Lr66;-><init>(FF)V

    .line 303
    .line 304
    .line 305
    new-instance v0, Lr66;

    .line 306
    .line 307
    sub-float/2addr p0, v8

    .line 308
    sub-float/2addr v1, v8

    .line 309
    invoke-direct {v0, p0, v1}, Lr66;-><init>(FF)V

    .line 310
    .line 311
    .line 312
    filled-new-array {v7, v5, v2, v0}, [Lr66;

    .line 313
    .line 314
    .line 315
    move-result-object p0

    .line 316
    return-object p0

    .line 317
    :cond_1a
    sget-object p0, Lcom/google/zxing/NotFoundException;->y:Lcom/google/zxing/NotFoundException;

    .line 318
    .line 319
    throw p0

    .line 320
    :cond_1b
    sget-object p0, Lcom/google/zxing/NotFoundException;->y:Lcom/google/zxing/NotFoundException;

    .line 321
    .line 322
    throw p0

    .line 323
    :cond_1c
    sget-object p0, Lcom/google/zxing/NotFoundException;->y:Lcom/google/zxing/NotFoundException;

    .line 324
    .line 325
    throw p0

    .line 326
    :cond_1d
    sget-object p0, Lcom/google/zxing/NotFoundException;->y:Lcom/google/zxing/NotFoundException;

    .line 327
    .line 328
    throw p0

    .line 329
    :cond_1e
    sget-object p0, Lcom/google/zxing/NotFoundException;->y:Lcom/google/zxing/NotFoundException;

    .line 330
    .line 331
    throw p0
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
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
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
.end method

.method public final c(FFFF)Lr66;
    .locals 5

    .line 1
    invoke-static {p1, p2, p3, p4}, Lbb0;->f0(FFFF)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lbb0;->w0(F)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    sub-float/2addr p3, p1

    .line 10
    int-to-float v1, v0

    .line 11
    div-float/2addr p3, v1

    .line 12
    sub-float/2addr p4, p2

    .line 13
    div-float/2addr p4, v1

    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_0
    if-ge v1, v0, :cond_1

    .line 16
    .line 17
    int-to-float v2, v1

    .line 18
    mul-float v3, v2, p3

    .line 19
    .line 20
    add-float/2addr v3, p1

    .line 21
    invoke-static {v3}, Lbb0;->w0(F)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    mul-float/2addr v2, p4

    .line 26
    add-float/2addr v2, p2

    .line 27
    invoke-static {v2}, Lbb0;->w0(F)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    iget-object v4, p0, Lu88;->a:Lk90;

    .line 32
    .line 33
    invoke-virtual {v4, v3, v2}, Lk90;->b(II)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    new-instance p0, Lr66;

    .line 40
    .line 41
    int-to-float p1, v3

    .line 42
    int-to-float p2, v2

    .line 43
    invoke-direct {p0, p1, p2}, Lr66;-><init>(FF)V

    .line 44
    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    const/4 p0, 0x0

    .line 51
    return-object p0
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
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method
