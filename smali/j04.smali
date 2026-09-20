.class public final Lj04;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Lvz3;

.field public final b:Ljava/util/ArrayList;

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public final g:Ljava/util/ArrayList;

.field public h:Ljava/util/List;

.field public i:I


# direct methods
.method public constructor <init>(Lvz3;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj04;->a:Lvz3;

    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lh04;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, v1, v1}, Lh04;-><init>(II)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lj04;->b:Ljava/util/ArrayList;

    .line 21
    .line 22
    const/4 p1, -0x1

    .line 23
    iput p1, p0, Lj04;->f:I

    .line 24
    .line 25
    new-instance p1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lj04;->g:Ljava/util/ArrayList;

    .line 31
    .line 32
    sget-object p1, La42;->w:La42;

    .line 33
    .line 34
    iput-object p1, p0, Lj04;->h:Ljava/util/List;

    .line 35
    .line 36
    return-void
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
.end method


# virtual methods
.method public final a()I
    .locals 4

    .line 1
    invoke-virtual {p0}, Lj04;->d()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-double v0, v0

    .line 6
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 7
    .line 8
    mul-double/2addr v0, v2

    .line 9
    iget p0, p0, Lj04;->i:I

    .line 10
    .line 11
    int-to-double v2, p0

    .line 12
    div-double/2addr v0, v2

    .line 13
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    double-to-int p0, v0

    .line 18
    add-int/lit8 p0, p0, 0x1

    .line 19
    .line 20
    return p0
    .line 21
.end method

.method public final b(I)Lcm2;
    .locals 12

    .line 1
    iget-object v0, p0, Lj04;->a:Lvz3;

    .line 2
    .line 3
    iget-boolean v0, v0, Lvz3;->r:Z

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-nez v0, :cond_4

    .line 8
    .line 9
    iget v0, p0, Lj04;->i:I

    .line 10
    .line 11
    mul-int/2addr p1, v0

    .line 12
    new-instance v3, Lcm2;

    .line 13
    .line 14
    invoke-virtual {p0}, Lj04;->d()I

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    sub-int/2addr v4, p1

    .line 19
    if-le v0, v4, :cond_0

    .line 20
    .line 21
    move v0, v4

    .line 22
    :cond_0
    if-gez v0, :cond_1

    .line 23
    .line 24
    move v0, v2

    .line 25
    :cond_1
    iget-object v4, p0, Lj04;->h:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-ne v0, v4, :cond_2

    .line 32
    .line 33
    iget-object p0, p0, Lj04;->h:Ljava/util/List;

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    new-instance v4, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 39
    .line 40
    .line 41
    :goto_0
    if-ge v2, v0, :cond_3

    .line 42
    .line 43
    invoke-static {v1}, Lrj1;->g(I)J

    .line 44
    .line 45
    .line 46
    move-result-wide v5

    .line 47
    new-instance v7, Lpx2;

    .line 48
    .line 49
    invoke-direct {v7, v5, v6}, Lpx2;-><init>(J)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    add-int/lit8 v2, v2, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    iput-object v4, p0, Lj04;->h:Ljava/util/List;

    .line 59
    .line 60
    move-object p0, v4

    .line 61
    :goto_1
    invoke-direct {v3, p1, p0}, Lcm2;-><init>(ILjava/util/List;)V

    .line 62
    .line 63
    .line 64
    return-object v3

    .line 65
    :cond_4
    invoke-virtual {p0}, Lj04;->a()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    div-int v0, p1, v0

    .line 70
    .line 71
    iget-object v3, p0, Lj04;->b:Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    sub-int/2addr v4, v1

    .line 78
    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    invoke-virtual {p0}, Lj04;->a()I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    mul-int/2addr v4, v0

    .line 87
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    check-cast v5, Lh04;

    .line 92
    .line 93
    iget v5, v5, Lh04;->a:I

    .line 94
    .line 95
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    check-cast v6, Lh04;

    .line 100
    .line 101
    iget v6, v6, Lh04;->b:I

    .line 102
    .line 103
    iget v7, p0, Lj04;->c:I

    .line 104
    .line 105
    iget-object v8, p0, Lj04;->g:Ljava/util/ArrayList;

    .line 106
    .line 107
    if-gt v4, v7, :cond_5

    .line 108
    .line 109
    if-gt v7, p1, :cond_5

    .line 110
    .line 111
    iget v5, p0, Lj04;->d:I

    .line 112
    .line 113
    iget v6, p0, Lj04;->e:I

    .line 114
    .line 115
    move v4, v7

    .line 116
    goto :goto_2

    .line 117
    :cond_5
    iget v7, p0, Lj04;->f:I

    .line 118
    .line 119
    if-ne v0, v7, :cond_6

    .line 120
    .line 121
    sub-int v7, p1, v4

    .line 122
    .line 123
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 124
    .line 125
    .line 126
    move-result v9

    .line 127
    if-ge v7, v9, :cond_6

    .line 128
    .line 129
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    check-cast v4, Ljava/lang/Number;

    .line 134
    .line 135
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    move v4, p1

    .line 140
    move v6, v2

    .line 141
    :cond_6
    :goto_2
    invoke-virtual {p0}, Lj04;->a()I

    .line 142
    .line 143
    .line 144
    move-result v7

    .line 145
    rem-int v7, v4, v7

    .line 146
    .line 147
    if-nez v7, :cond_7

    .line 148
    .line 149
    invoke-virtual {p0}, Lj04;->a()I

    .line 150
    .line 151
    .line 152
    move-result v7

    .line 153
    sub-int v9, p1, v4

    .line 154
    .line 155
    const/4 v10, 0x2

    .line 156
    if-gt v10, v9, :cond_7

    .line 157
    .line 158
    if-ge v9, v7, :cond_7

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_7
    move v1, v2

    .line 162
    :goto_3
    if-eqz v1, :cond_8

    .line 163
    .line 164
    iput v0, p0, Lj04;->f:I

    .line 165
    .line 166
    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    .line 167
    .line 168
    .line 169
    :cond_8
    if-gt v4, p1, :cond_9

    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 173
    .line 174
    const-string v7, "currentLine ("

    .line 175
    .line 176
    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    const-string v7, ") > lineIndex ("

    .line 183
    .line 184
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    const-string v7, ")"

    .line 191
    .line 192
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-static {v0}, Lbc3;->c(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    :cond_a
    :goto_4
    if-ge v4, p1, :cond_10

    .line 203
    .line 204
    invoke-virtual {p0}, Lj04;->d()I

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    if-ge v5, v0, :cond_10

    .line 209
    .line 210
    if-eqz v1, :cond_b

    .line 211
    .line 212
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    :cond_b
    move v0, v2

    .line 220
    :goto_5
    iget v7, p0, Lj04;->i:I

    .line 221
    .line 222
    if-ge v0, v7, :cond_e

    .line 223
    .line 224
    invoke-virtual {p0}, Lj04;->d()I

    .line 225
    .line 226
    .line 227
    move-result v7

    .line 228
    if-ge v5, v7, :cond_e

    .line 229
    .line 230
    if-nez v6, :cond_c

    .line 231
    .line 232
    invoke-virtual {p0, v5}, Lj04;->e(I)I

    .line 233
    .line 234
    .line 235
    move-result v7

    .line 236
    move v11, v7

    .line 237
    move v7, v6

    .line 238
    move v6, v11

    .line 239
    goto :goto_6

    .line 240
    :cond_c
    move v7, v2

    .line 241
    :goto_6
    add-int/2addr v0, v6

    .line 242
    iget v9, p0, Lj04;->i:I

    .line 243
    .line 244
    if-le v0, v9, :cond_d

    .line 245
    .line 246
    goto :goto_7

    .line 247
    :cond_d
    add-int/lit8 v5, v5, 0x1

    .line 248
    .line 249
    move v6, v7

    .line 250
    goto :goto_5

    .line 251
    :cond_e
    :goto_7
    add-int/lit8 v4, v4, 0x1

    .line 252
    .line 253
    invoke-virtual {p0}, Lj04;->a()I

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    rem-int v0, v4, v0

    .line 258
    .line 259
    if-nez v0, :cond_a

    .line 260
    .line 261
    invoke-virtual {p0}, Lj04;->d()I

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    if-ge v5, v0, :cond_a

    .line 266
    .line 267
    invoke-virtual {p0}, Lj04;->a()I

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    div-int v0, v4, v0

    .line 272
    .line 273
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 274
    .line 275
    .line 276
    move-result v7

    .line 277
    if-ne v7, v0, :cond_f

    .line 278
    .line 279
    goto :goto_8

    .line 280
    :cond_f
    const-string v0, "invalid starting point"

    .line 281
    .line 282
    invoke-static {v0}, Lbc3;->c(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    :goto_8
    new-instance v0, Lh04;

    .line 286
    .line 287
    invoke-direct {v0, v5, v6}, Lh04;-><init>(II)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    goto :goto_4

    .line 294
    :cond_10
    iput p1, p0, Lj04;->c:I

    .line 295
    .line 296
    iput v5, p0, Lj04;->d:I

    .line 297
    .line 298
    iput v6, p0, Lj04;->e:I

    .line 299
    .line 300
    new-instance p1, Ljava/util/ArrayList;

    .line 301
    .line 302
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 303
    .line 304
    .line 305
    move v0, v2

    .line 306
    move v1, v5

    .line 307
    :goto_9
    iget v3, p0, Lj04;->i:I

    .line 308
    .line 309
    if-ge v0, v3, :cond_12

    .line 310
    .line 311
    invoke-virtual {p0}, Lj04;->d()I

    .line 312
    .line 313
    .line 314
    move-result v3

    .line 315
    if-ge v1, v3, :cond_12

    .line 316
    .line 317
    if-nez v6, :cond_11

    .line 318
    .line 319
    invoke-virtual {p0, v1}, Lj04;->e(I)I

    .line 320
    .line 321
    .line 322
    move-result v3

    .line 323
    move v11, v6

    .line 324
    move v6, v3

    .line 325
    move v3, v11

    .line 326
    goto :goto_a

    .line 327
    :cond_11
    move v3, v2

    .line 328
    :goto_a
    add-int/2addr v0, v6

    .line 329
    iget v4, p0, Lj04;->i:I

    .line 330
    .line 331
    if-gt v0, v4, :cond_12

    .line 332
    .line 333
    add-int/lit8 v1, v1, 0x1

    .line 334
    .line 335
    invoke-static {v6}, Lrj1;->g(I)J

    .line 336
    .line 337
    .line 338
    move-result-wide v6

    .line 339
    new-instance v4, Lpx2;

    .line 340
    .line 341
    invoke-direct {v4, v6, v7}, Lpx2;-><init>(J)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    move v6, v3

    .line 348
    goto :goto_9

    .line 349
    :cond_12
    new-instance p0, Lcm2;

    .line 350
    .line 351
    invoke-direct {p0, v5, p1}, Lcm2;-><init>(ILjava/util/List;)V

    .line 352
    .line 353
    .line 354
    return-object p0
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

.method public final c(I)I
    .locals 8

    .line 1
    invoke-virtual {p0}, Lj04;->d()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-gtz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual {p0}, Lj04;->d()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-ge p1, v0, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const-string v0, "ItemIndex > total count"

    .line 17
    .line 18
    invoke-static {v0}, Lbc3;->a(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    iget-object v0, p0, Lj04;->a:Lvz3;

    .line 22
    .line 23
    iget-boolean v0, v0, Lvz3;->r:Z

    .line 24
    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    iget p0, p0, Lj04;->i:I

    .line 28
    .line 29
    div-int/2addr p1, p0

    .line 30
    return p1

    .line 31
    :cond_2
    iget-object v0, p0, Lj04;->b:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-static {v3, v2}, Lsg3;->R(II)V

    .line 42
    .line 43
    .line 44
    const/4 v3, 0x1

    .line 45
    sub-int/2addr v2, v3

    .line 46
    move v4, v1

    .line 47
    :goto_1
    if-gt v4, v2, :cond_4

    .line 48
    .line 49
    add-int v5, v4, v2

    .line 50
    .line 51
    ushr-int/2addr v5, v3

    .line 52
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    check-cast v6, Lh04;

    .line 57
    .line 58
    iget v6, v6, Lh04;->a:I

    .line 59
    .line 60
    sub-int/2addr v6, p1

    .line 61
    if-gez v6, :cond_3

    .line 62
    .line 63
    add-int/lit8 v4, v5, 0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    if-lez v6, :cond_5

    .line 67
    .line 68
    add-int/lit8 v2, v5, -0x1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_4
    add-int/2addr v4, v3

    .line 72
    neg-int v5, v4

    .line 73
    :cond_5
    if-ltz v5, :cond_6

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_6
    neg-int v2, v5

    .line 77
    add-int/lit8 v5, v2, -0x2

    .line 78
    .line 79
    :goto_2
    invoke-virtual {p0}, Lj04;->a()I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    mul-int/2addr v2, v5

    .line 84
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    check-cast v4, Lh04;

    .line 89
    .line 90
    iget v4, v4, Lh04;->a:I

    .line 91
    .line 92
    if-gt v4, p1, :cond_7

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_7
    const-string v5, "currentItemIndex > itemIndex"

    .line 96
    .line 97
    invoke-static {v5}, Lbc3;->a(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    :goto_3
    move v5, v1

    .line 101
    :goto_4
    if-ge v4, p1, :cond_c

    .line 102
    .line 103
    add-int/lit8 v6, v4, 0x1

    .line 104
    .line 105
    invoke-virtual {p0, v4}, Lj04;->e(I)I

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    add-int/2addr v5, v4

    .line 110
    iget v7, p0, Lj04;->i:I

    .line 111
    .line 112
    if-ge v5, v7, :cond_8

    .line 113
    .line 114
    goto :goto_5

    .line 115
    :cond_8
    if-ne v5, v7, :cond_9

    .line 116
    .line 117
    add-int/lit8 v2, v2, 0x1

    .line 118
    .line 119
    move v5, v1

    .line 120
    goto :goto_5

    .line 121
    :cond_9
    add-int/lit8 v2, v2, 0x1

    .line 122
    .line 123
    move v5, v4

    .line 124
    :goto_5
    invoke-virtual {p0}, Lj04;->a()I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    rem-int v4, v2, v4

    .line 129
    .line 130
    if-nez v4, :cond_b

    .line 131
    .line 132
    invoke-virtual {p0}, Lj04;->a()I

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    div-int v4, v2, v4

    .line 137
    .line 138
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 139
    .line 140
    .line 141
    move-result v7

    .line 142
    if-lt v4, v7, :cond_b

    .line 143
    .line 144
    new-instance v4, Lh04;

    .line 145
    .line 146
    if-lez v5, :cond_a

    .line 147
    .line 148
    move v7, v3

    .line 149
    goto :goto_6

    .line 150
    :cond_a
    move v7, v1

    .line 151
    :goto_6
    sub-int v7, v6, v7

    .line 152
    .line 153
    invoke-direct {v4, v7, v1}, Lh04;-><init>(II)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    :cond_b
    move v4, v6

    .line 160
    goto :goto_4

    .line 161
    :cond_c
    invoke-virtual {p0, p1}, Lj04;->e(I)I

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    add-int/2addr p1, v5

    .line 166
    iget p0, p0, Lj04;->i:I

    .line 167
    .line 168
    if-le p1, p0, :cond_d

    .line 169
    .line 170
    add-int/2addr v2, v3

    .line 171
    :cond_d
    return v2
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
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
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

.method public final d()I
    .locals 0

    .line 1
    iget-object p0, p0, Lj04;->a:Lvz3;

    .line 2
    .line 3
    iget-object p0, p0, Lvz3;->q:Lig;

    .line 4
    .line 5
    iget p0, p0, Lig;->b:I

    .line 6
    .line 7
    return p0
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

.method public final e(I)I
    .locals 1

    .line 1
    iget v0, p0, Lj04;->i:I

    .line 2
    .line 3
    sput v0, Li04;->b:I

    .line 4
    .line 5
    iget-object p0, p0, Lj04;->a:Lvz3;

    .line 6
    .line 7
    iget-object p0, p0, Lvz3;->q:Lig;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lig;->e(I)Lhg3;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    iget v0, p0, Lhg3;->a:I

    .line 14
    .line 15
    sub-int/2addr p1, v0

    .line 16
    iget-object p0, p0, Lhg3;->c:Ld24;

    .line 17
    .line 18
    check-cast p0, Luz3;

    .line 19
    .line 20
    iget-object p0, p0, Luz3;->b:Lgs2;

    .line 21
    .line 22
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    sget-object v0, Li04;->a:Li04;

    .line 27
    .line 28
    invoke-interface {p0, v0, p1}, Lgs2;->H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Lpx2;

    .line 33
    .line 34
    iget-wide p0, p0, Lpx2;->a:J

    .line 35
    .line 36
    long-to-int p0, p0

    .line 37
    return p0
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
.end method
