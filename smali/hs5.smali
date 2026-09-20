.class public final Lhs5;
.super Lzu2;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final H:Lhs5;

.field public static final I:Lfp3;


# instance fields
.field public A:Lgs5;

.field public B:Lbt5;

.field public C:I

.field public D:Ljava/util/List;

.field public E:Ljava/util/List;

.field public F:B

.field public G:I

.field public final w:Lbg0;

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lfp3;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lfp3;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lhs5;->I:Lfp3;

    .line 9
    .line 10
    new-instance v0, Lhs5;

    .line 11
    .line 12
    invoke-direct {v0}, Lhs5;-><init>()V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lhs5;->H:Lhs5;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput v1, v0, Lhs5;->y:I

    .line 19
    .line 20
    iput v1, v0, Lhs5;->z:I

    .line 21
    .line 22
    sget-object v2, Lgs5;->x:Lgs5;

    .line 23
    .line 24
    iput-object v2, v0, Lhs5;->A:Lgs5;

    .line 25
    .line 26
    sget-object v2, Lbt5;->Q:Lbt5;

    .line 27
    .line 28
    iput-object v2, v0, Lhs5;->B:Lbt5;

    .line 29
    .line 30
    iput v1, v0, Lhs5;->C:I

    .line 31
    .line 32
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 33
    .line 34
    iput-object v1, v0, Lhs5;->D:Ljava/util/List;

    .line 35
    .line 36
    iput-object v1, v0, Lhs5;->E:Ljava/util/List;

    .line 37
    .line 38
    return-void
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

    .line 377
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 378
    iput-byte v0, p0, Lhs5;->F:B

    .line 379
    iput v0, p0, Lhs5;->G:I

    .line 380
    sget-object v0, Lbg0;->w:Lb94;

    iput-object v0, p0, Lhs5;->w:Lbg0;

    return-void
.end method

.method public constructor <init>(Lfs5;)V
    .locals 1

    .line 381
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 382
    iput-byte v0, p0, Lhs5;->F:B

    .line 383
    iput v0, p0, Lhs5;->G:I

    .line 384
    iget-object p1, p1, Lru2;->w:Lbg0;

    .line 385
    iput-object p1, p0, Lhs5;->w:Lbg0;

    return-void
.end method

.method public constructor <init>(Lts0;Ly92;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    const/4 v3, -0x1

    .line 11
    iput-byte v3, v1, Lhs5;->F:B

    .line 12
    .line 13
    iput v3, v1, Lhs5;->G:I

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    iput v3, v1, Lhs5;->y:I

    .line 17
    .line 18
    iput v3, v1, Lhs5;->z:I

    .line 19
    .line 20
    sget-object v4, Lgs5;->x:Lgs5;

    .line 21
    .line 22
    iput-object v4, v1, Lhs5;->A:Lgs5;

    .line 23
    .line 24
    sget-object v5, Lbt5;->Q:Lbt5;

    .line 25
    .line 26
    iput-object v5, v1, Lhs5;->B:Lbt5;

    .line 27
    .line 28
    iput v3, v1, Lhs5;->C:I

    .line 29
    .line 30
    sget-object v5, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 31
    .line 32
    iput-object v5, v1, Lhs5;->D:Ljava/util/List;

    .line 33
    .line 34
    iput-object v5, v1, Lhs5;->E:Ljava/util/List;

    .line 35
    .line 36
    new-instance v5, Lag0;

    .line 37
    .line 38
    invoke-direct {v5}, Lag0;-><init>()V

    .line 39
    .line 40
    .line 41
    const/4 v6, 0x1

    .line 42
    invoke-static {v5, v6}, Lxs0;->G(Ljava/io/OutputStream;I)Lxs0;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    move v8, v3

    .line 47
    :cond_0
    :goto_0
    const/16 v9, 0x20

    .line 48
    .line 49
    const/16 v10, 0x40

    .line 50
    .line 51
    if-nez v3, :cond_13

    .line 52
    .line 53
    :try_start_0
    invoke-virtual {v0}, Lts0;->o()I

    .line 54
    .line 55
    .line 56
    move-result v11
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    if-eqz v11, :cond_1

    .line 58
    .line 59
    const/16 v12, 0x8

    .line 60
    .line 61
    if-eq v11, v12, :cond_10

    .line 62
    .line 63
    const/4 v13, 0x2

    .line 64
    const/16 v14, 0x10

    .line 65
    .line 66
    if-eq v11, v14, :cond_f

    .line 67
    .line 68
    const/16 v15, 0x18

    .line 69
    .line 70
    const/16 v16, 0x0

    .line 71
    .line 72
    if-eq v11, v15, :cond_a

    .line 73
    .line 74
    const/16 v13, 0x22

    .line 75
    .line 76
    if-eq v11, v13, :cond_7

    .line 77
    .line 78
    const/16 v12, 0x28

    .line 79
    .line 80
    if-eq v11, v12, :cond_6

    .line 81
    .line 82
    const/16 v12, 0x32

    .line 83
    .line 84
    sget-object v13, Lhs5;->I:Lfp3;

    .line 85
    .line 86
    if-eq v11, v12, :cond_4

    .line 87
    .line 88
    const/16 v12, 0x3a

    .line 89
    .line 90
    if-eq v11, v12, :cond_2

    .line 91
    .line 92
    :try_start_1
    invoke-virtual {v0, v11, v7}, Lts0;->r(ILxs0;)Z

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    if-nez v9, :cond_0

    .line 97
    .line 98
    :cond_1
    move v3, v6

    .line 99
    goto :goto_0

    .line 100
    :catchall_0
    move-exception v0

    .line 101
    goto/16 :goto_5

    .line 102
    .line 103
    :catch_0
    move-exception v0

    .line 104
    goto/16 :goto_3

    .line 105
    .line 106
    :catch_1
    move-exception v0

    .line 107
    goto/16 :goto_4

    .line 108
    .line 109
    :cond_2
    and-int/lit8 v11, v8, 0x40

    .line 110
    .line 111
    if-eq v11, v10, :cond_3

    .line 112
    .line 113
    new-instance v11, Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 116
    .line 117
    .line 118
    iput-object v11, v1, Lhs5;->E:Ljava/util/List;

    .line 119
    .line 120
    or-int/lit8 v8, v8, 0x40

    .line 121
    .line 122
    :cond_3
    iget-object v11, v1, Lhs5;->E:Ljava/util/List;

    .line 123
    .line 124
    invoke-virtual {v0, v13, v2}, Lts0;->h(Lfp3;Ly92;)Lk2;

    .line 125
    .line 126
    .line 127
    move-result-object v12

    .line 128
    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_4
    and-int/lit8 v11, v8, 0x20

    .line 133
    .line 134
    if-eq v11, v9, :cond_5

    .line 135
    .line 136
    new-instance v11, Ljava/util/ArrayList;

    .line 137
    .line 138
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 139
    .line 140
    .line 141
    iput-object v11, v1, Lhs5;->D:Ljava/util/List;

    .line 142
    .line 143
    or-int/lit8 v8, v8, 0x20

    .line 144
    .line 145
    :cond_5
    iget-object v11, v1, Lhs5;->D:Ljava/util/List;

    .line 146
    .line 147
    invoke-virtual {v0, v13, v2}, Lts0;->h(Lfp3;Ly92;)Lk2;

    .line 148
    .line 149
    .line 150
    move-result-object v12

    .line 151
    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    goto :goto_0

    .line 155
    :cond_6
    iget v11, v1, Lhs5;->x:I

    .line 156
    .line 157
    or-int/2addr v11, v14

    .line 158
    iput v11, v1, Lhs5;->x:I

    .line 159
    .line 160
    invoke-virtual {v0}, Lts0;->l()I

    .line 161
    .line 162
    .line 163
    move-result v11

    .line 164
    iput v11, v1, Lhs5;->C:I

    .line 165
    .line 166
    goto :goto_0

    .line 167
    :cond_7
    iget v11, v1, Lhs5;->x:I

    .line 168
    .line 169
    and-int/2addr v11, v12

    .line 170
    if-ne v11, v12, :cond_8

    .line 171
    .line 172
    iget-object v11, v1, Lhs5;->B:Lbt5;

    .line 173
    .line 174
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-static {v11}, Lbt5;->r(Lbt5;)Lat5;

    .line 178
    .line 179
    .line 180
    move-result-object v16

    .line 181
    :cond_8
    move-object/from16 v11, v16

    .line 182
    .line 183
    sget-object v13, Lbt5;->R:Lfp3;

    .line 184
    .line 185
    invoke-virtual {v0, v13, v2}, Lts0;->h(Lfp3;Ly92;)Lk2;

    .line 186
    .line 187
    .line 188
    move-result-object v13

    .line 189
    check-cast v13, Lbt5;

    .line 190
    .line 191
    iput-object v13, v1, Lhs5;->B:Lbt5;

    .line 192
    .line 193
    if-eqz v11, :cond_9

    .line 194
    .line 195
    invoke-virtual {v11, v13}, Lat5;->i(Lbt5;)Lat5;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v11}, Lat5;->g()Lbt5;

    .line 199
    .line 200
    .line 201
    move-result-object v11

    .line 202
    iput-object v11, v1, Lhs5;->B:Lbt5;

    .line 203
    .line 204
    :cond_9
    iget v11, v1, Lhs5;->x:I

    .line 205
    .line 206
    or-int/2addr v11, v12

    .line 207
    iput v11, v1, Lhs5;->x:I

    .line 208
    .line 209
    goto/16 :goto_0

    .line 210
    .line 211
    :cond_a
    invoke-virtual {v0}, Lts0;->l()I

    .line 212
    .line 213
    .line 214
    move-result v12

    .line 215
    if-eqz v12, :cond_d

    .line 216
    .line 217
    if-eq v12, v6, :cond_c

    .line 218
    .line 219
    if-eq v12, v13, :cond_b

    .line 220
    .line 221
    :goto_1
    move-object/from16 v13, v16

    .line 222
    .line 223
    goto :goto_2

    .line 224
    :cond_b
    sget-object v16, Lgs5;->z:Lgs5;

    .line 225
    .line 226
    goto :goto_1

    .line 227
    :cond_c
    sget-object v16, Lgs5;->y:Lgs5;

    .line 228
    .line 229
    goto :goto_1

    .line 230
    :cond_d
    move-object v13, v4

    .line 231
    :goto_2
    if-nez v13, :cond_e

    .line 232
    .line 233
    invoke-virtual {v7, v11}, Lxs0;->f0(I)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v7, v12}, Lxs0;->f0(I)V

    .line 237
    .line 238
    .line 239
    goto/16 :goto_0

    .line 240
    .line 241
    :cond_e
    iget v11, v1, Lhs5;->x:I

    .line 242
    .line 243
    or-int/lit8 v11, v11, 0x4

    .line 244
    .line 245
    iput v11, v1, Lhs5;->x:I

    .line 246
    .line 247
    iput-object v13, v1, Lhs5;->A:Lgs5;

    .line 248
    .line 249
    goto/16 :goto_0

    .line 250
    .line 251
    :cond_f
    iget v11, v1, Lhs5;->x:I

    .line 252
    .line 253
    or-int/2addr v11, v13

    .line 254
    iput v11, v1, Lhs5;->x:I

    .line 255
    .line 256
    invoke-virtual {v0}, Lts0;->l()I

    .line 257
    .line 258
    .line 259
    move-result v11

    .line 260
    iput v11, v1, Lhs5;->z:I

    .line 261
    .line 262
    goto/16 :goto_0

    .line 263
    .line 264
    :cond_10
    iget v11, v1, Lhs5;->x:I

    .line 265
    .line 266
    or-int/2addr v11, v6

    .line 267
    iput v11, v1, Lhs5;->x:I

    .line 268
    .line 269
    invoke-virtual {v0}, Lts0;->l()I

    .line 270
    .line 271
    .line 272
    move-result v11

    .line 273
    iput v11, v1, Lhs5;->y:I
    :try_end_1
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 274
    .line 275
    goto/16 :goto_0

    .line 276
    .line 277
    :goto_3
    :try_start_2
    new-instance v2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 278
    .line 279
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    invoke-direct {v2, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    iput-object v1, v2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lk2;

    .line 287
    .line 288
    throw v2

    .line 289
    :goto_4
    iput-object v1, v0, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lk2;

    .line 290
    .line 291
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 292
    :goto_5
    and-int/lit8 v2, v8, 0x20

    .line 293
    .line 294
    if-ne v2, v9, :cond_11

    .line 295
    .line 296
    iget-object v2, v1, Lhs5;->D:Ljava/util/List;

    .line 297
    .line 298
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    iput-object v2, v1, Lhs5;->D:Ljava/util/List;

    .line 303
    .line 304
    :cond_11
    and-int/lit8 v2, v8, 0x40

    .line 305
    .line 306
    if-ne v2, v10, :cond_12

    .line 307
    .line 308
    iget-object v2, v1, Lhs5;->E:Ljava/util/List;

    .line 309
    .line 310
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    iput-object v2, v1, Lhs5;->E:Ljava/util/List;

    .line 315
    .line 316
    :cond_12
    :try_start_3
    invoke-virtual {v7}, Lxs0;->R()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 317
    .line 318
    .line 319
    :catch_2
    invoke-virtual {v5}, Lag0;->l()Lbg0;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    iput-object v2, v1, Lhs5;->w:Lbg0;

    .line 324
    .line 325
    goto :goto_6

    .line 326
    :catchall_1
    move-exception v0

    .line 327
    invoke-virtual {v5}, Lag0;->l()Lbg0;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    iput-object v2, v1, Lhs5;->w:Lbg0;

    .line 332
    .line 333
    throw v0

    .line 334
    :goto_6
    throw v0

    .line 335
    :cond_13
    and-int/lit8 v0, v8, 0x20

    .line 336
    .line 337
    if-ne v0, v9, :cond_14

    .line 338
    .line 339
    iget-object v0, v1, Lhs5;->D:Ljava/util/List;

    .line 340
    .line 341
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    iput-object v0, v1, Lhs5;->D:Ljava/util/List;

    .line 346
    .line 347
    :cond_14
    and-int/lit8 v0, v8, 0x40

    .line 348
    .line 349
    if-ne v0, v10, :cond_15

    .line 350
    .line 351
    iget-object v0, v1, Lhs5;->E:Ljava/util/List;

    .line 352
    .line 353
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    iput-object v0, v1, Lhs5;->E:Ljava/util/List;

    .line 358
    .line 359
    :cond_15
    :try_start_4
    invoke-virtual {v7}, Lxs0;->R()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 360
    .line 361
    .line 362
    :catch_3
    invoke-virtual {v5}, Lag0;->l()Lbg0;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    iput-object v0, v1, Lhs5;->w:Lbg0;

    .line 367
    .line 368
    return-void

    .line 369
    :catchall_2
    move-exception v0

    .line 370
    invoke-virtual {v5}, Lag0;->l()Lbg0;

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    iput-object v2, v1, Lhs5;->w:Lbg0;

    .line 375
    .line 376
    throw v0
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
    .locals 4

    .line 1
    iget-byte v0, p0, Lhs5;->F:B

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
    const/4 v2, 0x0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    iget v0, p0, Lhs5;->x:I

    .line 12
    .line 13
    const/16 v3, 0x8

    .line 14
    .line 15
    and-int/2addr v0, v3

    .line 16
    if-ne v0, v3, :cond_2

    .line 17
    .line 18
    iget-object v0, p0, Lhs5;->B:Lbt5;

    .line 19
    .line 20
    invoke-virtual {v0}, Lbt5;->a()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    iput-byte v2, p0, Lhs5;->F:B

    .line 27
    .line 28
    return v2

    .line 29
    :cond_2
    move v0, v2

    .line 30
    :goto_0
    iget-object v3, p0, Lhs5;->D:Ljava/util/List;

    .line 31
    .line 32
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-ge v0, v3, :cond_4

    .line 37
    .line 38
    iget-object v3, p0, Lhs5;->D:Ljava/util/List;

    .line 39
    .line 40
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, Lhs5;

    .line 45
    .line 46
    invoke-virtual {v3}, Lhs5;->a()Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-nez v3, :cond_3

    .line 51
    .line 52
    iput-byte v2, p0, Lhs5;->F:B

    .line 53
    .line 54
    return v2

    .line 55
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_4
    move v0, v2

    .line 59
    :goto_1
    iget-object v3, p0, Lhs5;->E:Ljava/util/List;

    .line 60
    .line 61
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-ge v0, v3, :cond_6

    .line 66
    .line 67
    iget-object v3, p0, Lhs5;->E:Ljava/util/List;

    .line 68
    .line 69
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    check-cast v3, Lhs5;

    .line 74
    .line 75
    invoke-virtual {v3}, Lhs5;->a()Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-nez v3, :cond_5

    .line 80
    .line 81
    iput-byte v2, p0, Lhs5;->F:B

    .line 82
    .line 83
    return v2

    .line 84
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_6
    iput-byte v1, p0, Lhs5;->F:B

    .line 88
    .line 89
    return v1
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

.method public final c()I
    .locals 5

    .line 1
    iget v0, p0, Lhs5;->G:I

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
    iget v0, p0, Lhs5;->x:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    and-int/2addr v0, v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    iget v0, p0, Lhs5;->y:I

    .line 15
    .line 16
    invoke-static {v1, v0}, Lxs0;->l(II)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    move v0, v2

    .line 22
    :goto_0
    iget v1, p0, Lhs5;->x:I

    .line 23
    .line 24
    const/4 v3, 0x2

    .line 25
    and-int/2addr v1, v3

    .line 26
    if-ne v1, v3, :cond_2

    .line 27
    .line 28
    iget v1, p0, Lhs5;->z:I

    .line 29
    .line 30
    invoke-static {v3, v1}, Lxs0;->l(II)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    add-int/2addr v0, v1

    .line 35
    :cond_2
    iget v1, p0, Lhs5;->x:I

    .line 36
    .line 37
    const/4 v3, 0x4

    .line 38
    and-int/2addr v1, v3

    .line 39
    if-ne v1, v3, :cond_3

    .line 40
    .line 41
    iget-object v1, p0, Lhs5;->A:Lgs5;

    .line 42
    .line 43
    iget v1, v1, Lgs5;->w:I

    .line 44
    .line 45
    const/4 v4, 0x3

    .line 46
    invoke-static {v4, v1}, Lxs0;->k(II)I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    add-int/2addr v0, v1

    .line 51
    :cond_3
    iget v1, p0, Lhs5;->x:I

    .line 52
    .line 53
    const/16 v4, 0x8

    .line 54
    .line 55
    and-int/2addr v1, v4

    .line 56
    if-ne v1, v4, :cond_4

    .line 57
    .line 58
    iget-object v1, p0, Lhs5;->B:Lbt5;

    .line 59
    .line 60
    invoke-static {v3, v1}, Lxs0;->n(ILk2;)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    add-int/2addr v0, v1

    .line 65
    :cond_4
    iget v1, p0, Lhs5;->x:I

    .line 66
    .line 67
    const/16 v3, 0x10

    .line 68
    .line 69
    and-int/2addr v1, v3

    .line 70
    if-ne v1, v3, :cond_5

    .line 71
    .line 72
    const/4 v1, 0x5

    .line 73
    iget v3, p0, Lhs5;->C:I

    .line 74
    .line 75
    invoke-static {v1, v3}, Lxs0;->l(II)I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    add-int/2addr v0, v1

    .line 80
    :cond_5
    move v1, v2

    .line 81
    :goto_1
    iget-object v3, p0, Lhs5;->D:Ljava/util/List;

    .line 82
    .line 83
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-ge v1, v3, :cond_6

    .line 88
    .line 89
    iget-object v3, p0, Lhs5;->D:Ljava/util/List;

    .line 90
    .line 91
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    check-cast v3, Lk2;

    .line 96
    .line 97
    const/4 v4, 0x6

    .line 98
    invoke-static {v4, v3}, Lxs0;->n(ILk2;)I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    add-int/2addr v0, v3

    .line 103
    add-int/lit8 v1, v1, 0x1

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_6
    :goto_2
    iget-object v1, p0, Lhs5;->E:Ljava/util/List;

    .line 107
    .line 108
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-ge v2, v1, :cond_7

    .line 113
    .line 114
    iget-object v1, p0, Lhs5;->E:Ljava/util/List;

    .line 115
    .line 116
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    check-cast v1, Lk2;

    .line 121
    .line 122
    const/4 v3, 0x7

    .line 123
    invoke-static {v3, v1}, Lxs0;->n(ILk2;)I

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    add-int/2addr v0, v1

    .line 128
    add-int/lit8 v2, v2, 0x1

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_7
    iget-object v1, p0, Lhs5;->w:Lbg0;

    .line 132
    .line 133
    invoke-virtual {v1}, Lbg0;->size()I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    add-int/2addr v1, v0

    .line 138
    iput v1, p0, Lhs5;->G:I

    .line 139
    .line 140
    return v1
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
    .locals 0

    .line 1
    invoke-static {}, Lfs5;->g()Lfs5;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method public final e()Lru2;
    .locals 1

    .line 1
    invoke-static {}, Lfs5;->g()Lfs5;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lfs5;->h(Lhs5;)V

    .line 6
    .line 7
    .line 8
    return-object v0
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

.method public final f(Lxs0;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lhs5;->c()I

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lhs5;->x:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    and-int/2addr v0, v1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget v0, p0, Lhs5;->y:I

    .line 11
    .line 12
    invoke-virtual {p1, v1, v0}, Lxs0;->W(II)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget v0, p0, Lhs5;->x:I

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    and-int/2addr v0, v1

    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    iget v0, p0, Lhs5;->z:I

    .line 22
    .line 23
    invoke-virtual {p1, v1, v0}, Lxs0;->W(II)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget v0, p0, Lhs5;->x:I

    .line 27
    .line 28
    const/4 v1, 0x4

    .line 29
    and-int/2addr v0, v1

    .line 30
    if-ne v0, v1, :cond_2

    .line 31
    .line 32
    iget-object v0, p0, Lhs5;->A:Lgs5;

    .line 33
    .line 34
    iget v0, v0, Lgs5;->w:I

    .line 35
    .line 36
    const/4 v2, 0x3

    .line 37
    invoke-virtual {p1, v2, v0}, Lxs0;->V(II)V

    .line 38
    .line 39
    .line 40
    :cond_2
    iget v0, p0, Lhs5;->x:I

    .line 41
    .line 42
    const/16 v2, 0x8

    .line 43
    .line 44
    and-int/2addr v0, v2

    .line 45
    if-ne v0, v2, :cond_3

    .line 46
    .line 47
    iget-object v0, p0, Lhs5;->B:Lbt5;

    .line 48
    .line 49
    invoke-virtual {p1, v1, v0}, Lxs0;->Y(ILk2;)V

    .line 50
    .line 51
    .line 52
    :cond_3
    iget v0, p0, Lhs5;->x:I

    .line 53
    .line 54
    const/16 v1, 0x10

    .line 55
    .line 56
    and-int/2addr v0, v1

    .line 57
    if-ne v0, v1, :cond_4

    .line 58
    .line 59
    const/4 v0, 0x5

    .line 60
    iget v1, p0, Lhs5;->C:I

    .line 61
    .line 62
    invoke-virtual {p1, v0, v1}, Lxs0;->W(II)V

    .line 63
    .line 64
    .line 65
    :cond_4
    const/4 v0, 0x0

    .line 66
    move v1, v0

    .line 67
    :goto_0
    iget-object v2, p0, Lhs5;->D:Ljava/util/List;

    .line 68
    .line 69
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-ge v1, v2, :cond_5

    .line 74
    .line 75
    iget-object v2, p0, Lhs5;->D:Ljava/util/List;

    .line 76
    .line 77
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    check-cast v2, Lk2;

    .line 82
    .line 83
    const/4 v3, 0x6

    .line 84
    invoke-virtual {p1, v3, v2}, Lxs0;->Y(ILk2;)V

    .line 85
    .line 86
    .line 87
    add-int/lit8 v1, v1, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_5
    :goto_1
    iget-object v1, p0, Lhs5;->E:Ljava/util/List;

    .line 91
    .line 92
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-ge v0, v1, :cond_6

    .line 97
    .line 98
    iget-object v1, p0, Lhs5;->E:Ljava/util/List;

    .line 99
    .line 100
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    check-cast v1, Lk2;

    .line 105
    .line 106
    const/4 v2, 0x7

    .line 107
    invoke-virtual {p1, v2, v1}, Lxs0;->Y(ILk2;)V

    .line 108
    .line 109
    .line 110
    add-int/lit8 v0, v0, 0x1

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_6
    iget-object p0, p0, Lhs5;->w:Lbg0;

    .line 114
    .line 115
    invoke-virtual {p1, p0}, Lxs0;->b0(Lbg0;)V

    .line 116
    .line 117
    .line 118
    return-void
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
