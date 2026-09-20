.class public Lcom/google/firebase/concurrent/ExecutorsRegistrar;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# static fields
.field public static final a:Loz3;

.field public static final b:Loz3;

.field public static final c:Loz3;

.field public static final d:Loz3;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Loz3;

    .line 2
    .line 3
    new-instance v1, Law0;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v1, v2}, Law0;-><init>(I)V

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, Loz3;-><init>(Lnu5;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->a:Loz3;

    .line 13
    .line 14
    new-instance v0, Loz3;

    .line 15
    .line 16
    new-instance v1, Law0;

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    invoke-direct {v1, v2}, Law0;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v1}, Loz3;-><init>(Lnu5;)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->b:Loz3;

    .line 26
    .line 27
    new-instance v0, Loz3;

    .line 28
    .line 29
    new-instance v1, Law0;

    .line 30
    .line 31
    const/4 v2, 0x3

    .line 32
    invoke-direct {v1, v2}, Law0;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, v1}, Loz3;-><init>(Lnu5;)V

    .line 36
    .line 37
    .line 38
    sput-object v0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->c:Loz3;

    .line 39
    .line 40
    new-instance v0, Loz3;

    .line 41
    .line 42
    new-instance v1, Law0;

    .line 43
    .line 44
    const/4 v2, 0x4

    .line 45
    invoke-direct {v1, v2}, Law0;-><init>(I)V

    .line 46
    .line 47
    .line 48
    invoke-direct {v0, v1}, Loz3;-><init>(Lnu5;)V

    .line 49
    .line 50
    .line 51
    sput-object v0, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->d:Loz3;

    .line 52
    .line 53
    return-void
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
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
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


# virtual methods
.method public final getComponents()Ljava/util/List;
    .locals 24

    .line 1
    new-instance v0, Lav5;

    .line 2
    .line 3
    const-class v1, Lt30;

    .line 4
    .line 5
    const-class v2, Ljava/util/concurrent/ScheduledExecutorService;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lav5;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    new-instance v3, Lav5;

    .line 11
    .line 12
    const-class v4, Ljava/util/concurrent/ExecutorService;

    .line 13
    .line 14
    invoke-direct {v3, v1, v4}, Lav5;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 15
    .line 16
    .line 17
    new-instance v5, Lav5;

    .line 18
    .line 19
    const-class v6, Ljava/util/concurrent/Executor;

    .line 20
    .line 21
    invoke-direct {v5, v1, v6}, Lav5;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 22
    .line 23
    .line 24
    filled-new-array {v3, v5}, [Lav5;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    new-instance v3, Ljava/util/HashSet;

    .line 29
    .line 30
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 31
    .line 32
    .line 33
    new-instance v5, Ljava/util/HashSet;

    .line 34
    .line 35
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 36
    .line 37
    .line 38
    new-instance v14, Ljava/util/HashSet;

    .line 39
    .line 40
    invoke-direct {v14}, Ljava/util/HashSet;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    array-length v0, v1

    .line 47
    const/4 v11, 0x0

    .line 48
    move v7, v11

    .line 49
    :goto_0
    const-string v15, "Null interface"

    .line 50
    .line 51
    if-ge v7, v0, :cond_0

    .line 52
    .line 53
    aget-object v8, v1, v7

    .line 54
    .line 55
    invoke-static {v15, v8}, Lh75;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    add-int/lit8 v7, v7, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    invoke-static {v3, v1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    new-instance v13, Lta1;

    .line 65
    .line 66
    const/16 v0, 0xe

    .line 67
    .line 68
    invoke-direct {v13, v0}, Lta1;-><init>(I)V

    .line 69
    .line 70
    .line 71
    new-instance v7, Lgv0;

    .line 72
    .line 73
    new-instance v9, Ljava/util/HashSet;

    .line 74
    .line 75
    invoke-direct {v9, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 76
    .line 77
    .line 78
    new-instance v10, Ljava/util/HashSet;

    .line 79
    .line 80
    invoke-direct {v10, v5}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 81
    .line 82
    .line 83
    const/4 v8, 0x0

    .line 84
    move v12, v11

    .line 85
    invoke-direct/range {v7 .. v14}, Lgv0;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;IILxv0;Ljava/util/Set;)V

    .line 86
    .line 87
    .line 88
    new-instance v0, Lav5;

    .line 89
    .line 90
    const-class v1, Lx90;

    .line 91
    .line 92
    invoke-direct {v0, v1, v2}, Lav5;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 93
    .line 94
    .line 95
    new-instance v3, Lav5;

    .line 96
    .line 97
    invoke-direct {v3, v1, v4}, Lav5;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 98
    .line 99
    .line 100
    new-instance v5, Lav5;

    .line 101
    .line 102
    invoke-direct {v5, v1, v6}, Lav5;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 103
    .line 104
    .line 105
    filled-new-array {v3, v5}, [Lav5;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    new-instance v3, Ljava/util/HashSet;

    .line 110
    .line 111
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 112
    .line 113
    .line 114
    new-instance v5, Ljava/util/HashSet;

    .line 115
    .line 116
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 117
    .line 118
    .line 119
    new-instance v23, Ljava/util/HashSet;

    .line 120
    .line 121
    invoke-direct/range {v23 .. v23}, Ljava/util/HashSet;-><init>()V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v3, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    array-length v0, v1

    .line 128
    const/16 v20, 0x0

    .line 129
    .line 130
    move/from16 v8, v20

    .line 131
    .line 132
    :goto_1
    if-ge v8, v0, :cond_1

    .line 133
    .line 134
    aget-object v9, v1, v8

    .line 135
    .line 136
    invoke-static {v15, v9}, Lh75;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    add-int/lit8 v8, v8, 0x1

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_1
    invoke-static {v3, v1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    new-instance v0, Lta1;

    .line 146
    .line 147
    const/16 v1, 0xf

    .line 148
    .line 149
    invoke-direct {v0, v1}, Lta1;-><init>(I)V

    .line 150
    .line 151
    .line 152
    new-instance v16, Lgv0;

    .line 153
    .line 154
    new-instance v1, Ljava/util/HashSet;

    .line 155
    .line 156
    invoke-direct {v1, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 157
    .line 158
    .line 159
    new-instance v3, Ljava/util/HashSet;

    .line 160
    .line 161
    invoke-direct {v3, v5}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 162
    .line 163
    .line 164
    const/16 v17, 0x0

    .line 165
    .line 166
    move/from16 v21, v20

    .line 167
    .line 168
    move-object/from16 v22, v0

    .line 169
    .line 170
    move-object/from16 v18, v1

    .line 171
    .line 172
    move-object/from16 v19, v3

    .line 173
    .line 174
    invoke-direct/range {v16 .. v23}, Lgv0;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;IILxv0;Ljava/util/Set;)V

    .line 175
    .line 176
    .line 177
    move-object/from16 v0, v16

    .line 178
    .line 179
    new-instance v1, Lav5;

    .line 180
    .line 181
    const-class v3, Ld64;

    .line 182
    .line 183
    invoke-direct {v1, v3, v2}, Lav5;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 184
    .line 185
    .line 186
    new-instance v2, Lav5;

    .line 187
    .line 188
    invoke-direct {v2, v3, v4}, Lav5;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 189
    .line 190
    .line 191
    new-instance v4, Lav5;

    .line 192
    .line 193
    invoke-direct {v4, v3, v6}, Lav5;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 194
    .line 195
    .line 196
    filled-new-array {v2, v4}, [Lav5;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    new-instance v3, Ljava/util/HashSet;

    .line 201
    .line 202
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 203
    .line 204
    .line 205
    new-instance v4, Ljava/util/HashSet;

    .line 206
    .line 207
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 208
    .line 209
    .line 210
    new-instance v23, Ljava/util/HashSet;

    .line 211
    .line 212
    invoke-direct/range {v23 .. v23}, Ljava/util/HashSet;-><init>()V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v3, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    array-length v1, v2

    .line 219
    const/16 v20, 0x0

    .line 220
    .line 221
    move/from16 v5, v20

    .line 222
    .line 223
    :goto_2
    if-ge v5, v1, :cond_2

    .line 224
    .line 225
    aget-object v8, v2, v5

    .line 226
    .line 227
    invoke-static {v15, v8}, Lh75;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    add-int/lit8 v5, v5, 0x1

    .line 231
    .line 232
    goto :goto_2

    .line 233
    :cond_2
    invoke-static {v3, v2}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    new-instance v1, Lta1;

    .line 237
    .line 238
    const/16 v2, 0x10

    .line 239
    .line 240
    invoke-direct {v1, v2}, Lta1;-><init>(I)V

    .line 241
    .line 242
    .line 243
    new-instance v16, Lgv0;

    .line 244
    .line 245
    new-instance v2, Ljava/util/HashSet;

    .line 246
    .line 247
    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 248
    .line 249
    .line 250
    new-instance v3, Ljava/util/HashSet;

    .line 251
    .line 252
    invoke-direct {v3, v4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 253
    .line 254
    .line 255
    const/16 v17, 0x0

    .line 256
    .line 257
    move/from16 v21, v20

    .line 258
    .line 259
    move-object/from16 v22, v1

    .line 260
    .line 261
    move-object/from16 v18, v2

    .line 262
    .line 263
    move-object/from16 v19, v3

    .line 264
    .line 265
    invoke-direct/range {v16 .. v23}, Lgv0;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;IILxv0;Ljava/util/Set;)V

    .line 266
    .line 267
    .line 268
    move-object/from16 v1, v16

    .line 269
    .line 270
    new-instance v2, Lav5;

    .line 271
    .line 272
    const-class v3, Ljs7;

    .line 273
    .line 274
    invoke-direct {v2, v3, v6}, Lav5;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 275
    .line 276
    .line 277
    invoke-static {v2}, Lgv0;->a(Lav5;)Lfv0;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    new-instance v3, Lta1;

    .line 282
    .line 283
    const/16 v4, 0x11

    .line 284
    .line 285
    invoke-direct {v3, v4}, Lta1;-><init>(I)V

    .line 286
    .line 287
    .line 288
    iput-object v3, v2, Lfv0;->g:Ljava/lang/Object;

    .line 289
    .line 290
    invoke-virtual {v2}, Lfv0;->b()Lgv0;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    filled-new-array {v7, v0, v1, v2}, [Lgv0;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    return-object v0
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
