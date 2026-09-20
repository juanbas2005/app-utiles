.class public final Lqs0;
.super Lm55;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final d:[I


# instance fields
.field public final a:Z

.field public final b:Ljava/lang/StringBuilder;

.field public final c:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x2b

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lqs0;->d:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
        0x34
        0x121
        0x61
        0x160
        0x31
        0x130
        0x70
        0x25
        0x124
        0x64
        0x109
        0x49
        0x148
        0x19
        0x118
        0x58
        0xd
        0x10c
        0x4c
        0x1c
        0x103
        0x43
        0x142
        0x13
        0x112
        0x52
        0x7
        0x106
        0x46
        0x16
        0x181
        0xc1
        0x1c0
        0x91
        0x190
        0xd0
        0x85
        0x184
        0xc4
        0xa8
        0xa2
        0x8a
        0x2a
    .end array-data
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

.method public constructor <init>(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lqs0;->a:Z

    .line 5
    .line 6
    new-instance p1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const/16 v0, 0x14

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lqs0;->b:Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const/16 p1, 0x9

    .line 16
    .line 17
    new-array p1, p1, [I

    .line 18
    .line 19
    iput-object p1, p0, Lqs0;->c:[I

    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public static g([I)I
    .locals 10

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    array-length v3, p0

    .line 5
    const v4, 0x7fffffff

    .line 6
    .line 7
    .line 8
    move v5, v1

    .line 9
    :goto_1
    if-ge v5, v3, :cond_1

    .line 10
    .line 11
    aget v6, p0, v5

    .line 12
    .line 13
    if-ge v6, v4, :cond_0

    .line 14
    .line 15
    if-le v6, v2, :cond_0

    .line 16
    .line 17
    move v4, v6

    .line 18
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move v2, v1

    .line 22
    move v3, v2

    .line 23
    move v5, v3

    .line 24
    move v6, v5

    .line 25
    :goto_2
    if-ge v2, v0, :cond_3

    .line 26
    .line 27
    aget v7, p0, v2

    .line 28
    .line 29
    if-le v7, v4, :cond_2

    .line 30
    .line 31
    add-int/lit8 v8, v0, -0x1

    .line 32
    .line 33
    sub-int/2addr v8, v2

    .line 34
    const/4 v9, 0x1

    .line 35
    shl-int v8, v9, v8

    .line 36
    .line 37
    or-int/2addr v5, v8

    .line 38
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    add-int/2addr v6, v7

    .line 41
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_3
    const/4 v2, 0x3

    .line 45
    if-ne v3, v2, :cond_6

    .line 46
    .line 47
    :goto_3
    if-ge v1, v0, :cond_5

    .line 48
    .line 49
    if-lez v3, :cond_5

    .line 50
    .line 51
    aget v2, p0, v1

    .line 52
    .line 53
    if-le v2, v4, :cond_4

    .line 54
    .line 55
    add-int/lit8 v3, v3, -0x1

    .line 56
    .line 57
    shl-int/lit8 v2, v2, 0x1

    .line 58
    .line 59
    if-lt v2, v6, :cond_4

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_5
    return v5

    .line 66
    :cond_6
    if-gt v3, v2, :cond_7

    .line 67
    .line 68
    :goto_4
    const/4 p0, -0x1

    .line 69
    return p0

    .line 70
    :cond_7
    move v2, v4

    .line 71
    goto :goto_0
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method


# virtual methods
.method public final b(ILi90;Ljava/util/Map;)Ln66;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, Lqs0;->c:[I

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-static {v2, v3}, Ljava/util/Arrays;->fill([II)V

    .line 9
    .line 10
    .line 11
    iget-object v4, v0, Lqs0;->b:Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 14
    .line 15
    .line 16
    iget v5, v1, Li90;->x:I

    .line 17
    .line 18
    invoke-virtual {v1, v3}, Li90;->b(I)I

    .line 19
    .line 20
    .line 21
    move-result v6

    .line 22
    array-length v7, v2

    .line 23
    move v9, v3

    .line 24
    move v10, v9

    .line 25
    move v8, v6

    .line 26
    :goto_0
    if-ge v6, v5, :cond_10

    .line 27
    .line 28
    invoke-virtual {v1, v6}, Li90;->a(I)Z

    .line 29
    .line 30
    .line 31
    move-result v11

    .line 32
    const/4 v12, 0x1

    .line 33
    if-eq v11, v9, :cond_0

    .line 34
    .line 35
    aget v11, v2, v10

    .line 36
    .line 37
    add-int/2addr v11, v12

    .line 38
    aput v11, v2, v10

    .line 39
    .line 40
    move/from16 v11, p1

    .line 41
    .line 42
    goto/16 :goto_a

    .line 43
    .line 44
    :cond_0
    add-int/lit8 v11, v7, -0x1

    .line 45
    .line 46
    if-ne v10, v11, :cond_f

    .line 47
    .line 48
    invoke-static {v2}, Lqs0;->g([I)I

    .line 49
    .line 50
    .line 51
    move-result v11

    .line 52
    const/16 v13, 0x94

    .line 53
    .line 54
    const/4 v14, 0x2

    .line 55
    if-ne v11, v13, :cond_e

    .line 56
    .line 57
    sub-int v11, v6, v8

    .line 58
    .line 59
    div-int/2addr v11, v14

    .line 60
    sub-int v11, v8, v11

    .line 61
    .line 62
    invoke-static {v3, v11}, Ljava/lang/Math;->max(II)I

    .line 63
    .line 64
    .line 65
    move-result v11

    .line 66
    invoke-virtual {v1, v11, v8}, Li90;->d(II)Z

    .line 67
    .line 68
    .line 69
    move-result v11

    .line 70
    if-eqz v11, :cond_e

    .line 71
    .line 72
    filled-new-array {v8, v6}, [I

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    aget v7, v6, v12

    .line 77
    .line 78
    invoke-virtual {v1, v7}, Li90;->b(I)I

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    :goto_1
    invoke-static {v7, v1, v2}, Lm55;->e(ILi90;[I)V

    .line 83
    .line 84
    .line 85
    invoke-static {v2}, Lqs0;->g([I)I

    .line 86
    .line 87
    .line 88
    move-result v8

    .line 89
    if-ltz v8, :cond_d

    .line 90
    .line 91
    move v9, v3

    .line 92
    :goto_2
    const/16 v10, 0x2a

    .line 93
    .line 94
    const-string v11, "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%"

    .line 95
    .line 96
    const/16 v14, 0x2b

    .line 97
    .line 98
    if-ge v9, v14, :cond_2

    .line 99
    .line 100
    sget-object v15, Lqs0;->d:[I

    .line 101
    .line 102
    aget v15, v15, v9

    .line 103
    .line 104
    if-ne v15, v8, :cond_1

    .line 105
    .line 106
    invoke-virtual {v11, v9}, Ljava/lang/String;->charAt(I)C

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    goto :goto_3

    .line 111
    :cond_1
    add-int/lit8 v9, v9, 0x1

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_2
    if-ne v8, v13, :cond_c

    .line 115
    .line 116
    move v8, v10

    .line 117
    :goto_3
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    array-length v9, v2

    .line 121
    move v15, v3

    .line 122
    move/from16 p3, v12

    .line 123
    .line 124
    move v12, v7

    .line 125
    :goto_4
    if-ge v15, v9, :cond_3

    .line 126
    .line 127
    aget v16, v2, v15

    .line 128
    .line 129
    add-int v12, v12, v16

    .line 130
    .line 131
    add-int/lit8 v15, v15, 0x1

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_3
    invoke-virtual {v1, v12}, Li90;->b(I)I

    .line 135
    .line 136
    .line 137
    move-result v9

    .line 138
    if-ne v8, v10, :cond_b

    .line 139
    .line 140
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    add-int/lit8 v1, v1, -0x1

    .line 145
    .line 146
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 147
    .line 148
    .line 149
    array-length v1, v2

    .line 150
    move v8, v3

    .line 151
    move v10, v8

    .line 152
    :goto_5
    if-ge v8, v1, :cond_4

    .line 153
    .line 154
    aget v12, v2, v8

    .line 155
    .line 156
    add-int/2addr v10, v12

    .line 157
    add-int/lit8 v8, v8, 0x1

    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_4
    sub-int v1, v9, v7

    .line 161
    .line 162
    sub-int/2addr v1, v10

    .line 163
    if-eq v9, v5, :cond_6

    .line 164
    .line 165
    shl-int/lit8 v1, v1, 0x1

    .line 166
    .line 167
    if-lt v1, v10, :cond_5

    .line 168
    .line 169
    goto :goto_6

    .line 170
    :cond_5
    sget-object v0, Lcom/google/zxing/NotFoundException;->y:Lcom/google/zxing/NotFoundException;

    .line 171
    .line 172
    throw v0

    .line 173
    :cond_6
    :goto_6
    iget-boolean v0, v0, Lqs0;->a:Z

    .line 174
    .line 175
    if-eqz v0, :cond_9

    .line 176
    .line 177
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    add-int/lit8 v0, v0, -0x1

    .line 182
    .line 183
    move v1, v3

    .line 184
    move v2, v1

    .line 185
    :goto_7
    if-ge v1, v0, :cond_7

    .line 186
    .line 187
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->charAt(I)C

    .line 188
    .line 189
    .line 190
    move-result v5

    .line 191
    invoke-virtual {v11, v5}, Ljava/lang/String;->indexOf(I)I

    .line 192
    .line 193
    .line 194
    move-result v5

    .line 195
    add-int/2addr v2, v5

    .line 196
    add-int/lit8 v1, v1, 0x1

    .line 197
    .line 198
    goto :goto_7

    .line 199
    :cond_7
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->charAt(I)C

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    rem-int/2addr v2, v14

    .line 204
    invoke-virtual {v11, v2}, Ljava/lang/String;->charAt(I)C

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    if-ne v1, v2, :cond_8

    .line 209
    .line 210
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 211
    .line 212
    .line 213
    goto :goto_8

    .line 214
    :cond_8
    invoke-static {}, Lcom/google/zxing/ChecksumException;->a()Lcom/google/zxing/ChecksumException;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    throw v0

    .line 219
    :cond_9
    :goto_8
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    if-eqz v0, :cond_a

    .line 224
    .line 225
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    aget v1, v6, p3

    .line 230
    .line 231
    aget v2, v6, v3

    .line 232
    .line 233
    add-int/2addr v1, v2

    .line 234
    int-to-float v1, v1

    .line 235
    const/high16 v2, 0x40000000    # 2.0f

    .line 236
    .line 237
    div-float/2addr v1, v2

    .line 238
    int-to-float v3, v7

    .line 239
    int-to-float v4, v10

    .line 240
    div-float/2addr v4, v2

    .line 241
    add-float/2addr v4, v3

    .line 242
    new-instance v2, Ln66;

    .line 243
    .line 244
    new-instance v3, Lr66;

    .line 245
    .line 246
    move/from16 v11, p1

    .line 247
    .line 248
    int-to-float v5, v11

    .line 249
    invoke-direct {v3, v1, v5}, Lr66;-><init>(FF)V

    .line 250
    .line 251
    .line 252
    new-instance v1, Lr66;

    .line 253
    .line 254
    invoke-direct {v1, v4, v5}, Lr66;-><init>(FF)V

    .line 255
    .line 256
    .line 257
    filled-new-array {v3, v1}, [Lr66;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    sget-object v3, Ld50;->y:Ld50;

    .line 262
    .line 263
    const/4 v4, 0x0

    .line 264
    invoke-direct {v2, v0, v4, v1, v3}, Ln66;-><init>(Ljava/lang/String;[B[Lr66;Ld50;)V

    .line 265
    .line 266
    .line 267
    return-object v2

    .line 268
    :cond_a
    sget-object v0, Lcom/google/zxing/NotFoundException;->y:Lcom/google/zxing/NotFoundException;

    .line 269
    .line 270
    throw v0

    .line 271
    :cond_b
    move/from16 v11, p1

    .line 272
    .line 273
    move/from16 v12, p3

    .line 274
    .line 275
    move v7, v9

    .line 276
    goto/16 :goto_1

    .line 277
    .line 278
    :cond_c
    sget-object v0, Lcom/google/zxing/NotFoundException;->y:Lcom/google/zxing/NotFoundException;

    .line 279
    .line 280
    throw v0

    .line 281
    :cond_d
    sget-object v0, Lcom/google/zxing/NotFoundException;->y:Lcom/google/zxing/NotFoundException;

    .line 282
    .line 283
    throw v0

    .line 284
    :cond_e
    move/from16 v11, p1

    .line 285
    .line 286
    move/from16 p3, v12

    .line 287
    .line 288
    aget v12, v2, v3

    .line 289
    .line 290
    aget v13, v2, p3

    .line 291
    .line 292
    add-int/2addr v12, v13

    .line 293
    add-int/2addr v8, v12

    .line 294
    add-int/lit8 v12, v10, -0x1

    .line 295
    .line 296
    invoke-static {v2, v14, v2, v3, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 297
    .line 298
    .line 299
    aput v3, v2, v12

    .line 300
    .line 301
    aput v3, v2, v10

    .line 302
    .line 303
    add-int/lit8 v10, v10, -0x1

    .line 304
    .line 305
    goto :goto_9

    .line 306
    :cond_f
    move/from16 v11, p1

    .line 307
    .line 308
    move/from16 p3, v12

    .line 309
    .line 310
    add-int/lit8 v10, v10, 0x1

    .line 311
    .line 312
    :goto_9
    aput p3, v2, v10

    .line 313
    .line 314
    xor-int/lit8 v9, v9, 0x1

    .line 315
    .line 316
    :goto_a
    add-int/lit8 v6, v6, 0x1

    .line 317
    .line 318
    goto/16 :goto_0

    .line 319
    .line 320
    :cond_10
    sget-object v0, Lcom/google/zxing/NotFoundException;->y:Lcom/google/zxing/NotFoundException;

    .line 321
    .line 322
    throw v0
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
.end method
