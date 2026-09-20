.class public final Lxj8;
.super Ljava/util/AbstractMap;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final B:Lzf8;


# instance fields
.field public A:Ljava/lang/String;

.field public final w:[Ljava/lang/Object;

.field public final x:[I

.field public final y:Lwj8;

.field public z:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lzf8;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, Lzf8;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lxj8;->B:Lzf8;

    .line 8
    .line 9
    return-void
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

.method public constructor <init>()V
    .locals 4

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 406
    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    new-instance v1, Lwj8;

    const/4 v2, -0x1

    .line 407
    invoke-direct {v1, p0, v2}, Lwj8;-><init>(Lxj8;I)V

    iput-object v1, p0, Lxj8;->y:Lwj8;

    const/4 v1, 0x0

    iput-object v1, p0, Lxj8;->z:Ljava/lang/Integer;

    iput-object v1, p0, Lxj8;->A:Ljava/lang/String;

    .line 408
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_2

    .line 409
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v2, v1, [Ljava/lang/Object;

    .line 410
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_1

    const/4 v0, 0x0

    .line 411
    filled-new-array {v0}, [I

    move-result-object v3

    invoke-static {v1, v0}, Lxj8;->b(II)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 412
    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    :cond_0
    iput-object v2, p0, Lxj8;->w:[Ljava/lang/Object;

    iput-object v3, p0, Lxj8;->x:[I

    return-void

    .line 413
    :cond_1
    invoke-static {v0}, Lpb4;->g(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object p0

    .line 414
    throw p0

    .line 415
    :cond_2
    invoke-static {v1}, Lpb4;->g(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object p0

    .line 416
    throw p0
.end method

.method public constructor <init>(Lxj8;Lxj8;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    move-object/from16 v7, p2

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/AbstractMap;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lwj8;

    .line 11
    .line 12
    const/4 v8, -0x1

    .line 13
    invoke-direct {v1, v0, v8}, Lwj8;-><init>(Lxj8;I)V

    .line 14
    .line 15
    .line 16
    iput-object v1, v0, Lxj8;->y:Lwj8;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    iput-object v1, v0, Lxj8;->z:Ljava/lang/Integer;

    .line 20
    .line 21
    iput-object v1, v0, Lxj8;->A:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v6}, Ljava/util/AbstractMap;->size()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {v7}, Ljava/util/AbstractMap;->size()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    add-int/2addr v2, v1

    .line 32
    iget-object v1, v6, Lxj8;->x:[I

    .line 33
    .line 34
    invoke-virtual {v6}, Ljava/util/AbstractMap;->size()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    aget v1, v1, v3

    .line 39
    .line 40
    iget-object v3, v7, Lxj8;->x:[I

    .line 41
    .line 42
    invoke-virtual {v7}, Ljava/util/AbstractMap;->size()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    aget v3, v3, v4

    .line 47
    .line 48
    add-int v9, v1, v3

    .line 49
    .line 50
    add-int/lit8 v10, v2, 0x1

    .line 51
    .line 52
    new-array v4, v9, [Ljava/lang/Object;

    .line 53
    .line 54
    new-array v5, v10, [I

    .line 55
    .line 56
    const/4 v11, 0x0

    .line 57
    aput v2, v5, v11

    .line 58
    .line 59
    invoke-virtual {v6, v11}, Lxj8;->c(I)Ljava/util/Map$Entry;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v7, v11}, Lxj8;->c(I)Ljava/util/Map$Entry;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    move-object v12, v3

    .line 68
    move v13, v11

    .line 69
    move v14, v13

    .line 70
    move v3, v2

    .line 71
    move v2, v14

    .line 72
    :goto_0
    const/4 v15, 0x1

    .line 73
    if-nez v1, :cond_0

    .line 74
    .line 75
    if-eqz v12, :cond_1

    .line 76
    .line 77
    :cond_0
    add-int/lit8 v16, v2, 0x1

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_1
    aget v1, v5, v11

    .line 81
    .line 82
    sub-int v3, v1, v2

    .line 83
    .line 84
    if-nez v3, :cond_2

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_2
    move v6, v11

    .line 88
    :goto_1
    if-gt v6, v2, :cond_3

    .line 89
    .line 90
    aget v7, v5, v6

    .line 91
    .line 92
    sub-int/2addr v7, v3

    .line 93
    aput v7, v5, v6

    .line 94
    .line 95
    add-int/lit8 v6, v6, 0x1

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_3
    aget v3, v5, v2

    .line 99
    .line 100
    sub-int v6, v3, v2

    .line 101
    .line 102
    invoke-static {v9, v3}, Lxj8;->b(II)Z

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    if-eqz v7, :cond_4

    .line 107
    .line 108
    new-array v3, v3, [Ljava/lang/Object;

    .line 109
    .line 110
    invoke-static {v4, v11, v3, v11, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_4
    move-object v3, v4

    .line 115
    :goto_2
    invoke-static {v4, v1, v3, v2, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 116
    .line 117
    .line 118
    move-object v4, v3

    .line 119
    :goto_3
    iput-object v4, v0, Lxj8;->w:[Ljava/lang/Object;

    .line 120
    .line 121
    aget v1, v5, v11

    .line 122
    .line 123
    add-int/2addr v1, v15

    .line 124
    invoke-static {v10, v1}, Lxj8;->b(II)Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-eqz v2, :cond_5

    .line 129
    .line 130
    invoke-static {v5, v1}, Ljava/util/Arrays;->copyOf([II)[I

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    :cond_5
    iput-object v5, v0, Lxj8;->x:[I

    .line 135
    .line 136
    return-void

    .line 137
    :goto_4
    if-nez v1, :cond_7

    .line 138
    .line 139
    :cond_6
    move-object v8, v1

    .line 140
    goto/16 :goto_b

    .line 141
    .line 142
    :cond_7
    if-nez v12, :cond_8

    .line 143
    .line 144
    goto/16 :goto_a

    .line 145
    .line 146
    :cond_8
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v17

    .line 150
    move-object/from16 v8, v17

    .line 151
    .line 152
    check-cast v8, Ljava/lang/String;

    .line 153
    .line 154
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v17

    .line 158
    move-object/from16 v11, v17

    .line 159
    .line 160
    check-cast v11, Ljava/lang/String;

    .line 161
    .line 162
    invoke-virtual {v8, v11}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 163
    .line 164
    .line 165
    move-result v8

    .line 166
    if-nez v8, :cond_10

    .line 167
    .line 168
    add-int/lit8 v11, v13, 0x1

    .line 169
    .line 170
    add-int/lit8 v8, v14, 0x1

    .line 171
    .line 172
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v13

    .line 176
    check-cast v13, Ljava/lang/String;

    .line 177
    .line 178
    new-instance v14, Ljava/util/AbstractMap$SimpleImmutableEntry;

    .line 179
    .line 180
    new-instance v15, Lwj8;

    .line 181
    .line 182
    invoke-direct {v15, v0, v2}, Lwj8;-><init>(Lxj8;I)V

    .line 183
    .line 184
    .line 185
    invoke-direct {v14, v13, v15}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    aput-object v14, v4, v2

    .line 189
    .line 190
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    move-object v15, v1

    .line 195
    check-cast v15, Lwj8;

    .line 196
    .line 197
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    check-cast v1, Lwj8;

    .line 202
    .line 203
    const/4 v2, 0x0

    .line 204
    const/4 v12, 0x0

    .line 205
    :goto_5
    invoke-virtual {v15}, Lwj8;->f()I

    .line 206
    .line 207
    .line 208
    move-result v13

    .line 209
    iget-object v14, v15, Lwj8;->x:Lxj8;

    .line 210
    .line 211
    invoke-virtual {v15}, Lwj8;->d()I

    .line 212
    .line 213
    .line 214
    move-result v18

    .line 215
    sub-int v13, v13, v18

    .line 216
    .line 217
    if-lt v2, v13, :cond_a

    .line 218
    .line 219
    invoke-virtual {v1}, Lwj8;->f()I

    .line 220
    .line 221
    .line 222
    move-result v13

    .line 223
    invoke-virtual {v1}, Lwj8;->d()I

    .line 224
    .line 225
    .line 226
    move-result v18

    .line 227
    sub-int v13, v13, v18

    .line 228
    .line 229
    if-ge v12, v13, :cond_9

    .line 230
    .line 231
    goto :goto_6

    .line 232
    :cond_9
    aput v3, v5, v16

    .line 233
    .line 234
    invoke-virtual {v6, v8}, Lxj8;->c(I)Ljava/util/Map$Entry;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    invoke-virtual {v7, v11}, Lxj8;->c(I)Ljava/util/Map$Entry;

    .line 239
    .line 240
    .line 241
    move-result-object v12

    .line 242
    move v14, v8

    .line 243
    move v13, v11

    .line 244
    move/from16 v2, v16

    .line 245
    .line 246
    const/4 v8, -0x1

    .line 247
    const/4 v11, 0x0

    .line 248
    goto/16 :goto_0

    .line 249
    .line 250
    :cond_a
    :goto_6
    invoke-virtual {v15}, Lwj8;->f()I

    .line 251
    .line 252
    .line 253
    move-result v13

    .line 254
    invoke-virtual {v15}, Lwj8;->d()I

    .line 255
    .line 256
    .line 257
    move-result v18

    .line 258
    sub-int v13, v13, v18

    .line 259
    .line 260
    if-ne v2, v13, :cond_b

    .line 261
    .line 262
    const/4 v13, 0x1

    .line 263
    goto :goto_7

    .line 264
    :cond_b
    invoke-virtual {v1}, Lwj8;->f()I

    .line 265
    .line 266
    .line 267
    move-result v13

    .line 268
    invoke-virtual {v1}, Lwj8;->d()I

    .line 269
    .line 270
    .line 271
    move-result v18

    .line 272
    sub-int v13, v13, v18

    .line 273
    .line 274
    if-ne v12, v13, :cond_c

    .line 275
    .line 276
    const/4 v13, -0x1

    .line 277
    goto :goto_7

    .line 278
    :cond_c
    const/4 v13, 0x0

    .line 279
    :goto_7
    if-nez v13, :cond_d

    .line 280
    .line 281
    sget-object v13, Lyj8;->b:Lzf8;

    .line 282
    .line 283
    invoke-virtual {v15}, Lwj8;->d()I

    .line 284
    .line 285
    .line 286
    move-result v13

    .line 287
    add-int/2addr v13, v2

    .line 288
    iget-object v0, v14, Lxj8;->w:[Ljava/lang/Object;

    .line 289
    .line 290
    aget-object v0, v0, v13

    .line 291
    .line 292
    invoke-virtual {v1}, Lwj8;->d()I

    .line 293
    .line 294
    .line 295
    move-result v13

    .line 296
    add-int/2addr v13, v12

    .line 297
    move/from16 v18, v2

    .line 298
    .line 299
    iget-object v2, v1, Lwj8;->x:Lxj8;

    .line 300
    .line 301
    iget-object v2, v2, Lxj8;->w:[Ljava/lang/Object;

    .line 302
    .line 303
    aget-object v2, v2, v13

    .line 304
    .line 305
    sget-object v13, Lyj8;->b:Lzf8;

    .line 306
    .line 307
    invoke-virtual {v13, v0, v2}, Lzf8;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 308
    .line 309
    .line 310
    move-result v13

    .line 311
    goto :goto_8

    .line 312
    :cond_d
    move/from16 v18, v2

    .line 313
    .line 314
    :goto_8
    if-gez v13, :cond_e

    .line 315
    .line 316
    add-int/lit8 v2, v18, 0x1

    .line 317
    .line 318
    invoke-virtual {v15}, Lwj8;->d()I

    .line 319
    .line 320
    .line 321
    move-result v0

    .line 322
    add-int v0, v0, v18

    .line 323
    .line 324
    iget-object v13, v14, Lxj8;->w:[Ljava/lang/Object;

    .line 325
    .line 326
    aget-object v0, v13, v0

    .line 327
    .line 328
    goto :goto_9

    .line 329
    :cond_e
    add-int/lit8 v0, v12, 0x1

    .line 330
    .line 331
    invoke-virtual {v1}, Lwj8;->d()I

    .line 332
    .line 333
    .line 334
    move-result v2

    .line 335
    add-int/2addr v2, v12

    .line 336
    iget-object v12, v1, Lwj8;->x:Lxj8;

    .line 337
    .line 338
    iget-object v12, v12, Lxj8;->w:[Ljava/lang/Object;

    .line 339
    .line 340
    aget-object v2, v12, v2

    .line 341
    .line 342
    if-nez v13, :cond_f

    .line 343
    .line 344
    add-int/lit8 v12, v18, 0x1

    .line 345
    .line 346
    move/from16 v19, v12

    .line 347
    .line 348
    move v12, v0

    .line 349
    move-object v0, v2

    .line 350
    move/from16 v2, v19

    .line 351
    .line 352
    goto :goto_9

    .line 353
    :cond_f
    move v12, v0

    .line 354
    move-object v0, v2

    .line 355
    move/from16 v2, v18

    .line 356
    .line 357
    :goto_9
    add-int/lit8 v13, v3, 0x1

    .line 358
    .line 359
    aput-object v0, v4, v3

    .line 360
    .line 361
    move-object/from16 v0, p0

    .line 362
    .line 363
    move v3, v13

    .line 364
    goto/16 :goto_5

    .line 365
    .line 366
    :cond_10
    if-gez v8, :cond_6

    .line 367
    .line 368
    :goto_a
    add-int/lit8 v14, v14, 0x1

    .line 369
    .line 370
    move-object/from16 v0, p0

    .line 371
    .line 372
    invoke-virtual/range {v0 .. v5}, Lxj8;->a(Ljava/util/Map$Entry;II[Ljava/lang/Object;[I)I

    .line 373
    .line 374
    .line 375
    move-result v1

    .line 376
    invoke-virtual {v6, v14}, Lxj8;->c(I)Ljava/util/Map$Entry;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    move v3, v1

    .line 381
    move-object v1, v0

    .line 382
    goto :goto_c

    .line 383
    :goto_b
    add-int/lit8 v13, v13, 0x1

    .line 384
    .line 385
    move-object/from16 v0, p0

    .line 386
    .line 387
    move-object v1, v12

    .line 388
    invoke-virtual/range {v0 .. v5}, Lxj8;->a(Ljava/util/Map$Entry;II[Ljava/lang/Object;[I)I

    .line 389
    .line 390
    .line 391
    move-result v1

    .line 392
    invoke-virtual {v7, v13}, Lxj8;->c(I)Ljava/util/Map$Entry;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    move-object v12, v0

    .line 397
    move v3, v1

    .line 398
    move-object v1, v8

    .line 399
    :goto_c
    move/from16 v2, v16

    .line 400
    .line 401
    const/4 v8, -0x1

    .line 402
    const/4 v11, 0x0

    .line 403
    move-object/from16 v0, p0

    .line 404
    .line 405
    goto/16 :goto_0
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
.end method

.method public static b(II)Z
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    if-le p0, v0, :cond_0

    .line 4
    .line 5
    mul-int/lit8 p0, p0, 0x9

    .line 6
    .line 7
    mul-int/lit8 p1, p1, 0xa

    .line 8
    .line 9
    if-le p0, p1, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
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
.method public final a(Ljava/util/Map$Entry;II[Ljava/lang/Object;[I)I
    .locals 3

    .line 1
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lwj8;

    .line 6
    .line 7
    invoke-virtual {v0}, Lwj8;->f()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {v0}, Lwj8;->d()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    sub-int/2addr v1, v2

    .line 16
    iget-object v2, v0, Lwj8;->x:Lxj8;

    .line 17
    .line 18
    iget-object v2, v2, Lxj8;->w:[Ljava/lang/Object;

    .line 19
    .line 20
    invoke-virtual {v0}, Lwj8;->d()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-static {v2, v0, p4, p3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Ljava/lang/String;

    .line 32
    .line 33
    new-instance v0, Ljava/util/AbstractMap$SimpleImmutableEntry;

    .line 34
    .line 35
    new-instance v2, Lwj8;

    .line 36
    .line 37
    invoke-direct {v2, p0, p2}, Lwj8;-><init>(Lxj8;I)V

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, p1, v2}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    aput-object v0, p4, p2

    .line 44
    .line 45
    add-int/lit8 p2, p2, 0x1

    .line 46
    .line 47
    add-int/2addr p3, v1

    .line 48
    aput p3, p5, p2

    .line 49
    .line 50
    return p3
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

.method public final c(I)Ljava/util/Map$Entry;
    .locals 2

    .line 1
    iget-object v0, p0, Lxj8;->x:[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget v0, v0, v1

    .line 5
    .line 6
    if-ge p1, v0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Lxj8;->w:[Ljava/lang/Object;

    .line 9
    .line 10
    aget-object p0, p0, p1

    .line 11
    .line 12
    check-cast p0, Ljava/util/Map$Entry;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return-object p0
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

.method public final entrySet()Ljava/util/Set;
    .locals 0

    .line 1
    iget-object p0, p0, Lxj8;->y:Lwj8;

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

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lxj8;->z:Ljava/lang/Integer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0}, Ljava/util/AbstractMap;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lxj8;->z:Ljava/lang/Integer;

    .line 14
    .line 15
    :cond_0
    iget-object p0, p0, Lxj8;->z:Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lxj8;->A:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0}, Ljava/util/AbstractMap;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lxj8;->A:Ljava/lang/String;

    .line 10
    .line 11
    :cond_0
    iget-object p0, p0, Lxj8;->A:Ljava/lang/String;

    .line 12
    .line 13
    return-object p0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
