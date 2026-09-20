.class public final Lpp3;
.super Lzu2;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final C:Lpp3;

.field public static final D:Lfp3;


# instance fields
.field public A:B

.field public B:I

.field public final w:Lbg0;

.field public x:Ljava/util/List;

.field public y:Ljava/util/List;

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lfp3;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Lfp3;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lpp3;->D:Lfp3;

    .line 8
    .line 9
    new-instance v0, Lpp3;

    .line 10
    .line 11
    invoke-direct {v0}, Lpp3;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lpp3;->C:Lpp3;

    .line 15
    .line 16
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 17
    .line 18
    iput-object v1, v0, Lpp3;->x:Ljava/util/List;

    .line 19
    .line 20
    iput-object v1, v0, Lpp3;->y:Ljava/util/List;

    .line 21
    .line 22
    return-void
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
.end method

.method public constructor <init>()V
    .locals 1

    .line 270
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 271
    iput v0, p0, Lpp3;->z:I

    .line 272
    iput-byte v0, p0, Lpp3;->A:B

    .line 273
    iput v0, p0, Lpp3;->B:I

    .line 274
    sget-object v0, Lbg0;->w:Lb94;

    iput-object v0, p0, Lpp3;->w:Lbg0;

    return-void
.end method

.method public constructor <init>(Llp3;)V
    .locals 1

    .line 275
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 276
    iput v0, p0, Lpp3;->z:I

    .line 277
    iput-byte v0, p0, Lpp3;->A:B

    .line 278
    iput v0, p0, Lpp3;->B:I

    .line 279
    iget-object p1, p1, Lru2;->w:Lbg0;

    .line 280
    iput-object p1, p0, Lpp3;->w:Lbg0;

    return-void
.end method

.method public constructor <init>(Lts0;Ly92;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lpp3;->z:I

    .line 6
    .line 7
    iput-byte v0, p0, Lpp3;->A:B

    .line 8
    .line 9
    iput v0, p0, Lpp3;->B:I

    .line 10
    .line 11
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 12
    .line 13
    iput-object v0, p0, Lpp3;->x:Ljava/util/List;

    .line 14
    .line 15
    iput-object v0, p0, Lpp3;->y:Ljava/util/List;

    .line 16
    .line 17
    new-instance v0, Lag0;

    .line 18
    .line 19
    invoke-direct {v0}, Lag0;-><init>()V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-static {v0, v1}, Lxs0;->G(Ljava/io/OutputStream;I)Lxs0;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const/4 v3, 0x0

    .line 28
    move v4, v3

    .line 29
    :cond_0
    :goto_0
    const/4 v5, 0x2

    .line 30
    if-nez v3, :cond_b

    .line 31
    .line 32
    :try_start_0
    invoke-virtual {p1}, Lts0;->o()I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-eqz v6, :cond_1

    .line 37
    .line 38
    const/16 v7, 0xa

    .line 39
    .line 40
    if-eq v6, v7, :cond_7

    .line 41
    .line 42
    const/16 v7, 0x28

    .line 43
    .line 44
    if-eq v6, v7, :cond_5

    .line 45
    .line 46
    const/16 v7, 0x2a

    .line 47
    .line 48
    if-eq v6, v7, :cond_2

    .line 49
    .line 50
    invoke-virtual {p1, v6, v2}, Lts0;->r(ILxs0;)Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-nez v5, :cond_0

    .line 55
    .line 56
    :cond_1
    move v3, v1

    .line 57
    goto :goto_0

    .line 58
    :catchall_0
    move-exception p1

    .line 59
    goto/16 :goto_4

    .line 60
    .line 61
    :catch_0
    move-exception p1

    .line 62
    goto :goto_2

    .line 63
    :catch_1
    move-exception p1

    .line 64
    goto/16 :goto_3

    .line 65
    .line 66
    :cond_2
    invoke-virtual {p1}, Lts0;->l()I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    invoke-virtual {p1, v6}, Lts0;->e(I)I

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    and-int/lit8 v7, v4, 0x2

    .line 75
    .line 76
    if-eq v7, v5, :cond_3

    .line 77
    .line 78
    invoke-virtual {p1}, Lts0;->c()I

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    if-lez v7, :cond_3

    .line 83
    .line 84
    new-instance v7, Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 87
    .line 88
    .line 89
    iput-object v7, p0, Lpp3;->y:Ljava/util/List;

    .line 90
    .line 91
    or-int/lit8 v4, v4, 0x2

    .line 92
    .line 93
    :cond_3
    :goto_1
    invoke-virtual {p1}, Lts0;->c()I

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    if-lez v7, :cond_4

    .line 98
    .line 99
    iget-object v7, p0, Lpp3;->y:Ljava/util/List;

    .line 100
    .line 101
    invoke-virtual {p1}, Lts0;->l()I

    .line 102
    .line 103
    .line 104
    move-result v8

    .line 105
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_4
    invoke-virtual {p1, v6}, Lts0;->d(I)V

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_5
    and-int/lit8 v6, v4, 0x2

    .line 118
    .line 119
    if-eq v6, v5, :cond_6

    .line 120
    .line 121
    new-instance v6, Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 124
    .line 125
    .line 126
    iput-object v6, p0, Lpp3;->y:Ljava/util/List;

    .line 127
    .line 128
    or-int/lit8 v4, v4, 0x2

    .line 129
    .line 130
    :cond_6
    iget-object v6, p0, Lpp3;->y:Ljava/util/List;

    .line 131
    .line 132
    invoke-virtual {p1}, Lts0;->l()I

    .line 133
    .line 134
    .line 135
    move-result v7

    .line 136
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_7
    and-int/lit8 v6, v4, 0x1

    .line 145
    .line 146
    if-eq v6, v1, :cond_8

    .line 147
    .line 148
    new-instance v6, Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 151
    .line 152
    .line 153
    iput-object v6, p0, Lpp3;->x:Ljava/util/List;

    .line 154
    .line 155
    or-int/lit8 v4, v4, 0x1

    .line 156
    .line 157
    :cond_8
    iget-object v6, p0, Lpp3;->x:Ljava/util/List;

    .line 158
    .line 159
    sget-object v7, Lop3;->J:Lfp3;

    .line 160
    .line 161
    invoke-virtual {p1, v7, p2}, Lts0;->h(Lfp3;Ly92;)Lk2;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 166
    .line 167
    .line 168
    goto/16 :goto_0

    .line 169
    .line 170
    :goto_2
    :try_start_1
    new-instance p2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 171
    .line 172
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-direct {p2, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    iput-object p0, p2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lk2;

    .line 180
    .line 181
    throw p2

    .line 182
    :goto_3
    iput-object p0, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lk2;

    .line 183
    .line 184
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 185
    :goto_4
    and-int/lit8 p2, v4, 0x1

    .line 186
    .line 187
    if-ne p2, v1, :cond_9

    .line 188
    .line 189
    iget-object p2, p0, Lpp3;->x:Ljava/util/List;

    .line 190
    .line 191
    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 192
    .line 193
    .line 194
    move-result-object p2

    .line 195
    iput-object p2, p0, Lpp3;->x:Ljava/util/List;

    .line 196
    .line 197
    :cond_9
    and-int/lit8 p2, v4, 0x2

    .line 198
    .line 199
    if-ne p2, v5, :cond_a

    .line 200
    .line 201
    iget-object p2, p0, Lpp3;->y:Ljava/util/List;

    .line 202
    .line 203
    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 204
    .line 205
    .line 206
    move-result-object p2

    .line 207
    iput-object p2, p0, Lpp3;->y:Ljava/util/List;

    .line 208
    .line 209
    :cond_a
    :try_start_2
    invoke-virtual {v2}, Lxs0;->R()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 210
    .line 211
    .line 212
    :catch_2
    invoke-virtual {v0}, Lag0;->l()Lbg0;

    .line 213
    .line 214
    .line 215
    move-result-object p2

    .line 216
    iput-object p2, p0, Lpp3;->w:Lbg0;

    .line 217
    .line 218
    goto :goto_5

    .line 219
    :catchall_1
    move-exception p1

    .line 220
    invoke-virtual {v0}, Lag0;->l()Lbg0;

    .line 221
    .line 222
    .line 223
    move-result-object p2

    .line 224
    iput-object p2, p0, Lpp3;->w:Lbg0;

    .line 225
    .line 226
    throw p1

    .line 227
    :goto_5
    throw p1

    .line 228
    :cond_b
    and-int/lit8 p1, v4, 0x1

    .line 229
    .line 230
    if-ne p1, v1, :cond_c

    .line 231
    .line 232
    iget-object p1, p0, Lpp3;->x:Ljava/util/List;

    .line 233
    .line 234
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    iput-object p1, p0, Lpp3;->x:Ljava/util/List;

    .line 239
    .line 240
    :cond_c
    and-int/lit8 p1, v4, 0x2

    .line 241
    .line 242
    if-ne p1, v5, :cond_d

    .line 243
    .line 244
    iget-object p1, p0, Lpp3;->y:Ljava/util/List;

    .line 245
    .line 246
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    iput-object p1, p0, Lpp3;->y:Ljava/util/List;

    .line 251
    .line 252
    :cond_d
    :try_start_3
    invoke-virtual {v2}, Lxs0;->R()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 253
    .line 254
    .line 255
    :catch_3
    invoke-virtual {v0}, Lag0;->l()Lbg0;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    iput-object p1, p0, Lpp3;->w:Lbg0;

    .line 260
    .line 261
    return-void

    .line 262
    :catchall_2
    move-exception p1

    .line 263
    invoke-virtual {v0}, Lag0;->l()Lbg0;

    .line 264
    .line 265
    .line 266
    move-result-object p2

    .line 267
    iput-object p2, p0, Lpp3;->w:Lbg0;

    .line 268
    .line 269
    throw p1
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


# virtual methods
.method public final a()Z
    .locals 2

    .line 1
    iget-byte v0, p0, Lpp3;->A:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iput-byte v1, p0, Lpp3;->A:B

    .line 8
    .line 9
    return v1
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

.method public final c()I
    .locals 5

    .line 1
    iget v0, p0, Lpp3;->B:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    move v1, v0

    .line 9
    move v2, v1

    .line 10
    :goto_0
    iget-object v3, p0, Lpp3;->x:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-ge v1, v3, :cond_1

    .line 17
    .line 18
    iget-object v3, p0, Lpp3;->x:Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Lk2;

    .line 25
    .line 26
    const/4 v4, 0x1

    .line 27
    invoke-static {v4, v3}, Lxs0;->n(ILk2;)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    add-int/2addr v2, v3

    .line 32
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move v1, v0

    .line 36
    :goto_1
    iget-object v3, p0, Lpp3;->y:Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    iget-object v4, p0, Lpp3;->y:Ljava/util/List;

    .line 43
    .line 44
    if-ge v0, v3, :cond_2

    .line 45
    .line 46
    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Ljava/lang/Integer;

    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    invoke-static {v3}, Lxs0;->m(I)I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    add-int/2addr v1, v3

    .line 61
    add-int/lit8 v0, v0, 0x1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    add-int/2addr v2, v1

    .line 65
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_3

    .line 70
    .line 71
    add-int/lit8 v2, v2, 0x1

    .line 72
    .line 73
    invoke-static {v1}, Lxs0;->m(I)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    add-int/2addr v2, v0

    .line 78
    :cond_3
    iput v1, p0, Lpp3;->z:I

    .line 79
    .line 80
    iget-object v0, p0, Lpp3;->w:Lbg0;

    .line 81
    .line 82
    invoke-virtual {v0}, Lbg0;->size()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    add-int/2addr v0, v2

    .line 87
    iput v0, p0, Lpp3;->B:I

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
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method public final d()Lru2;
    .locals 1

    .line 1
    new-instance p0, Llp3;

    .line 2
    .line 3
    invoke-direct {p0}, Lru2;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 7
    .line 8
    iput-object v0, p0, Llp3;->y:Ljava/util/List;

    .line 9
    .line 10
    iput-object v0, p0, Llp3;->z:Ljava/util/List;

    .line 11
    .line 12
    return-object p0
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

.method public final e()Lru2;
    .locals 2

    .line 1
    new-instance v0, Llp3;

    .line 2
    .line 3
    invoke-direct {v0}, Lru2;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 7
    .line 8
    iput-object v1, v0, Llp3;->y:Ljava/util/List;

    .line 9
    .line 10
    iput-object v1, v0, Llp3;->z:Ljava/util/List;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Llp3;->g(Lpp3;)V

    .line 13
    .line 14
    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final f(Lxs0;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lpp3;->c()I

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    move v1, v0

    .line 6
    :goto_0
    iget-object v2, p0, Lpp3;->x:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-ge v1, v2, :cond_0

    .line 13
    .line 14
    iget-object v2, p0, Lpp3;->x:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Lk2;

    .line 21
    .line 22
    const/4 v3, 0x1

    .line 23
    invoke-virtual {p1, v3, v2}, Lxs0;->Y(ILk2;)V

    .line 24
    .line 25
    .line 26
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object v1, p0, Lpp3;->y:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-lez v1, :cond_1

    .line 36
    .line 37
    const/16 v1, 0x2a

    .line 38
    .line 39
    invoke-virtual {p1, v1}, Lxs0;->f0(I)V

    .line 40
    .line 41
    .line 42
    iget v1, p0, Lpp3;->z:I

    .line 43
    .line 44
    invoke-virtual {p1, v1}, Lxs0;->f0(I)V

    .line 45
    .line 46
    .line 47
    :cond_1
    :goto_1
    iget-object v1, p0, Lpp3;->y:Ljava/util/List;

    .line 48
    .line 49
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-ge v0, v1, :cond_2

    .line 54
    .line 55
    iget-object v1, p0, Lpp3;->y:Ljava/util/List;

    .line 56
    .line 57
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, Ljava/lang/Integer;

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-virtual {p1, v1}, Lxs0;->X(I)V

    .line 68
    .line 69
    .line 70
    add-int/lit8 v0, v0, 0x1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    iget-object p0, p0, Lpp3;->w:Lbg0;

    .line 74
    .line 75
    invoke-virtual {p1, p0}, Lxs0;->b0(Lbg0;)V

    .line 76
    .line 77
    .line 78
    return-void
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
.end method
