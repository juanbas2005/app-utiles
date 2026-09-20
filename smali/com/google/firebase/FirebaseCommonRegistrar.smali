.class public Lcom/google/firebase/FirebaseCommonRegistrar;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# direct methods
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

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    const/16 v1, 0x5f

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/16 v0, 0x2f

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
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


# virtual methods
.method public final getComponents()Ljava/util/List;
    .locals 7

    .line 1
    new-instance p0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const-class v0, Lho1;

    .line 7
    .line 8
    invoke-static {v0}, Lgv0;->b(Ljava/lang/Class;)Lfv0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lzp1;

    .line 13
    .line 14
    const/4 v3, 0x2

    .line 15
    const/4 v4, 0x0

    .line 16
    const-class v5, Ly00;

    .line 17
    .line 18
    invoke-direct {v2, v3, v4, v5}, Lzp1;-><init>(IILjava/lang/Class;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2}, Lfv0;->a(Lzp1;)V

    .line 22
    .line 23
    .line 24
    new-instance v2, Lta1;

    .line 25
    .line 26
    const/4 v5, 0x6

    .line 27
    invoke-direct {v2, v5}, Lta1;-><init>(I)V

    .line 28
    .line 29
    .line 30
    iput-object v2, v1, Lfv0;->g:Ljava/lang/Object;

    .line 31
    .line 32
    invoke-virtual {v1}, Lfv0;->b()Lgv0;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    new-instance v1, Lav5;

    .line 40
    .line 41
    const-class v2, Lt30;

    .line 42
    .line 43
    const-class v5, Ljava/util/concurrent/Executor;

    .line 44
    .line 45
    invoke-direct {v1, v2, v5}, Lav5;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 46
    .line 47
    .line 48
    const-class v2, Liz2;

    .line 49
    .line 50
    const-class v5, Ljz2;

    .line 51
    .line 52
    filled-new-array {v2, v5}, [Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    new-instance v5, Lfv0;

    .line 57
    .line 58
    const-class v6, Lwl1;

    .line 59
    .line 60
    invoke-direct {v5, v6, v2}, Lfv0;-><init>(Ljava/lang/Class;[Ljava/lang/Class;)V

    .line 61
    .line 62
    .line 63
    const-class v2, Landroid/content/Context;

    .line 64
    .line 65
    invoke-static {v2}, Lzp1;->c(Ljava/lang/Class;)Lzp1;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v5, v2}, Lfv0;->a(Lzp1;)V

    .line 70
    .line 71
    .line 72
    const-class v2, Loe2;

    .line 73
    .line 74
    invoke-static {v2}, Lzp1;->c(Ljava/lang/Class;)Lzp1;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-virtual {v5, v2}, Lfv0;->a(Lzp1;)V

    .line 79
    .line 80
    .line 81
    new-instance v2, Lzp1;

    .line 82
    .line 83
    const-class v6, Lhz2;

    .line 84
    .line 85
    invoke-direct {v2, v3, v4, v6}, Lzp1;-><init>(IILjava/lang/Class;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v5, v2}, Lfv0;->a(Lzp1;)V

    .line 89
    .line 90
    .line 91
    new-instance v2, Lzp1;

    .line 92
    .line 93
    const/4 v3, 0x1

    .line 94
    invoke-direct {v2, v3, v3, v0}, Lzp1;-><init>(IILjava/lang/Class;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v5, v2}, Lfv0;->a(Lzp1;)V

    .line 98
    .line 99
    .line 100
    new-instance v0, Lzp1;

    .line 101
    .line 102
    invoke-direct {v0, v1, v3, v4}, Lzp1;-><init>(Lav5;II)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v5, v0}, Lfv0;->a(Lzp1;)V

    .line 106
    .line 107
    .line 108
    new-instance v0, Lul1;

    .line 109
    .line 110
    invoke-direct {v0, v1, v4}, Lul1;-><init>(Lav5;I)V

    .line 111
    .line 112
    .line 113
    iput-object v0, v5, Lfv0;->g:Ljava/lang/Object;

    .line 114
    .line 115
    invoke-virtual {v5}, Lfv0;->b()Lgv0;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 123
    .line 124
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    const-string v1, "fire-android"

    .line 129
    .line 130
    invoke-static {v1, v0}, Lgw8;->q(Ljava/lang/String;Ljava/lang/String;)Lgv0;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    const-string v0, "fire-core"

    .line 138
    .line 139
    const-string v1, "22.1.0"

    .line 140
    .line 141
    invoke-static {v0, v1}, Lgw8;->q(Ljava/lang/String;Ljava/lang/String;)Lgv0;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    sget-object v0, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    .line 149
    .line 150
    invoke-static {v0}, Lcom/google/firebase/FirebaseCommonRegistrar;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    const-string v1, "device-name"

    .line 155
    .line 156
    invoke-static {v1, v0}, Lgw8;->q(Ljava/lang/String;Ljava/lang/String;)Lgv0;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    sget-object v0, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 164
    .line 165
    invoke-static {v0}, Lcom/google/firebase/FirebaseCommonRegistrar;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    const-string v1, "device-model"

    .line 170
    .line 171
    invoke-static {v1, v0}, Lgw8;->q(Ljava/lang/String;Ljava/lang/String;)Lgv0;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 179
    .line 180
    invoke-static {v0}, Lcom/google/firebase/FirebaseCommonRegistrar;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    const-string v1, "device-brand"

    .line 185
    .line 186
    invoke-static {v1, v0}, Lgw8;->q(Ljava/lang/String;Ljava/lang/String;)Lgv0;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    new-instance v0, Lta1;

    .line 194
    .line 195
    const/16 v1, 0x15

    .line 196
    .line 197
    invoke-direct {v0, v1}, Lta1;-><init>(I)V

    .line 198
    .line 199
    .line 200
    const-string v1, "android-target-sdk"

    .line 201
    .line 202
    invoke-static {v1, v0}, Lgw8;->v(Ljava/lang/String;Lta1;)Lgv0;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    new-instance v0, Lta1;

    .line 210
    .line 211
    const/16 v1, 0x16

    .line 212
    .line 213
    invoke-direct {v0, v1}, Lta1;-><init>(I)V

    .line 214
    .line 215
    .line 216
    const-string v1, "android-min-sdk"

    .line 217
    .line 218
    invoke-static {v1, v0}, Lgw8;->v(Ljava/lang/String;Lta1;)Lgv0;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    new-instance v0, Lta1;

    .line 226
    .line 227
    const/16 v1, 0x17

    .line 228
    .line 229
    invoke-direct {v0, v1}, Lta1;-><init>(I)V

    .line 230
    .line 231
    .line 232
    const-string v1, "android-platform"

    .line 233
    .line 234
    invoke-static {v1, v0}, Lgw8;->v(Ljava/lang/String;Lta1;)Lgv0;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    new-instance v0, Lta1;

    .line 242
    .line 243
    const/16 v1, 0x18

    .line 244
    .line 245
    invoke-direct {v0, v1}, Lta1;-><init>(I)V

    .line 246
    .line 247
    .line 248
    const-string v1, "android-installer"

    .line 249
    .line 250
    invoke-static {v1, v0}, Lgw8;->v(Ljava/lang/String;Lta1;)Lgv0;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    :try_start_0
    sget-object v0, Lcx3;->z:Lcx3;

    .line 258
    .line 259
    invoke-virtual {v0}, Lcx3;->toString()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    .line 263
    goto :goto_0

    .line 264
    :catch_0
    const/4 v0, 0x0

    .line 265
    :goto_0
    if-eqz v0, :cond_0

    .line 266
    .line 267
    const-string v1, "kotlin"

    .line 268
    .line 269
    invoke-static {v1, v0}, Lgw8;->q(Ljava/lang/String;Ljava/lang/String;)Lgv0;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    :cond_0
    return-object p0
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
