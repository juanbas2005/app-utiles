.class public abstract Lf63;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lau;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    const-class v0, Ly53;

    .line 2
    .line 3
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 4
    .line 5
    const-class v2, Lm63;

    .line 6
    .line 7
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 8
    .line 9
    const-string v4, "io.ktor.client.plugins.HttpRequestRetry"

    .line 10
    .line 11
    invoke-static {v4}, Lfc4;->b(Ljava/lang/String;)Lcc4;

    .line 12
    .line 13
    .line 14
    sget v4, Le63;->D:I

    .line 15
    .line 16
    sget-object v4, Lb26;->a:Lc26;

    .line 17
    .line 18
    const-class v5, Lxr0;

    .line 19
    .line 20
    invoke-virtual {v4, v5}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    const/4 v7, 0x0

    .line 25
    :try_start_0
    sget-object v8, Lgs3;->c:Lgs3;

    .line 26
    .line 27
    const-class v8, Lwr0;

    .line 28
    .line 29
    invoke-virtual {v4, v8}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 30
    .line 31
    .line 32
    move-result-object v8

    .line 33
    invoke-virtual {v4, v8}, Lc26;->n(Lgq3;)Lcs3;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    const-class v9, Ljava/lang/Object;

    .line 38
    .line 39
    invoke-static {v9}, Lb26;->b(Ljava/lang/Class;)Las3;

    .line 40
    .line 41
    .line 42
    move-result-object v9

    .line 43
    invoke-static {v9}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v9

    .line 47
    invoke-virtual {v4, v8, v9}, Lc26;->l(Lcs3;Ljava/util/List;)V

    .line 48
    .line 49
    .line 50
    sget-object v9, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 51
    .line 52
    const/4 v10, 0x0

    .line 53
    invoke-virtual {v4, v8, v9, v10}, Lc26;->m(Lvq3;Ljava/util/List;Z)Las3;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-static {v4}, Lx91;->C(Las3;)Lgs3;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-static {v5, v4}, Lb26;->c(Ljava/lang/Class;Lgs3;)Las3;

    .line 62
    .line 63
    .line 64
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    goto :goto_0

    .line 66
    :catchall_0
    move-object v4, v7

    .line 67
    :goto_0
    new-instance v5, Lfp7;

    .line 68
    .line 69
    invoke-direct {v5, v6, v4}, Lfp7;-><init>(Lgq3;Las3;)V

    .line 70
    .line 71
    .line 72
    new-instance v4, Lau;

    .line 73
    .line 74
    const-string v6, "RetryFeature"

    .line 75
    .line 76
    invoke-direct {v4, v6, v5}, Lau;-><init>(Ljava/lang/String;Lfp7;)V

    .line 77
    .line 78
    .line 79
    const-class v4, Ljava/lang/Integer;

    .line 80
    .line 81
    sget-object v5, Lb26;->a:Lc26;

    .line 82
    .line 83
    invoke-virtual {v5, v4}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    :try_start_1
    invoke-static {v3}, Lb26;->b(Ljava/lang/Class;)Las3;

    .line 88
    .line 89
    .line 90
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 91
    goto :goto_1

    .line 92
    :catchall_1
    move-object v5, v7

    .line 93
    :goto_1
    new-instance v6, Lfp7;

    .line 94
    .line 95
    invoke-direct {v6, v4, v5}, Lfp7;-><init>(Lgq3;Las3;)V

    .line 96
    .line 97
    .line 98
    new-instance v4, Lau;

    .line 99
    .line 100
    const-string v5, "MaxRetriesPerRequestAttributeKey"

    .line 101
    .line 102
    invoke-direct {v4, v5, v6}, Lau;-><init>(Ljava/lang/String;Lfp7;)V

    .line 103
    .line 104
    .line 105
    sput-object v4, Lf63;->a:Lau;

    .line 106
    .line 107
    sget-object v4, Lb26;->a:Lc26;

    .line 108
    .line 109
    const-class v5, Lhs2;

    .line 110
    .line 111
    invoke-virtual {v4, v5}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    :try_start_2
    sget-object v6, Lgs3;->c:Lgs3;

    .line 116
    .line 117
    invoke-static {v2}, Lb26;->b(Ljava/lang/Class;)Las3;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    invoke-static {v6}, Lx91;->C(Las3;)Lgs3;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    const-class v8, Lx53;

    .line 126
    .line 127
    invoke-static {v8}, Lb26;->b(Ljava/lang/Class;)Las3;

    .line 128
    .line 129
    .line 130
    move-result-object v8

    .line 131
    invoke-static {v8}, Lx91;->C(Las3;)Lgs3;

    .line 132
    .line 133
    .line 134
    move-result-object v8

    .line 135
    const-class v9, Lyl1;

    .line 136
    .line 137
    invoke-static {v9}, Lb26;->b(Ljava/lang/Class;)Las3;

    .line 138
    .line 139
    .line 140
    move-result-object v9

    .line 141
    invoke-static {v9}, Lx91;->C(Las3;)Lgs3;

    .line 142
    .line 143
    .line 144
    move-result-object v9

    .line 145
    invoke-static {v1}, Lb26;->b(Ljava/lang/Class;)Las3;

    .line 146
    .line 147
    .line 148
    move-result-object v10

    .line 149
    invoke-static {v10}, Lx91;->C(Las3;)Lgs3;

    .line 150
    .line 151
    .line 152
    move-result-object v10

    .line 153
    filled-new-array {v6, v8, v9, v10}, [Lgs3;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    invoke-static {v5, v6}, Lb26;->d(Ljava/lang/Class;[Lgs3;)Las3;

    .line 158
    .line 159
    .line 160
    move-result-object v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 161
    goto :goto_2

    .line 162
    :catchall_2
    move-object v6, v7

    .line 163
    :goto_2
    new-instance v8, Lfp7;

    .line 164
    .line 165
    invoke-direct {v8, v4, v6}, Lfp7;-><init>(Lgq3;Las3;)V

    .line 166
    .line 167
    .line 168
    new-instance v4, Lau;

    .line 169
    .line 170
    const-string v6, "ShouldRetryPerRequestAttributeKey"

    .line 171
    .line 172
    invoke-direct {v4, v6, v8}, Lau;-><init>(Ljava/lang/String;Lfp7;)V

    .line 173
    .line 174
    .line 175
    sget-object v4, Lb26;->a:Lc26;

    .line 176
    .line 177
    invoke-virtual {v4, v5}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    :try_start_3
    sget-object v6, Lgs3;->c:Lgs3;

    .line 182
    .line 183
    invoke-static {v2}, Lb26;->b(Ljava/lang/Class;)Las3;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    invoke-static {v2}, Lx91;->C(Las3;)Lgs3;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    invoke-static {v0}, Lb26;->b(Ljava/lang/Class;)Las3;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    invoke-static {v6}, Lx91;->C(Las3;)Lgs3;

    .line 196
    .line 197
    .line 198
    move-result-object v6

    .line 199
    const-class v8, Ljava/lang/Throwable;

    .line 200
    .line 201
    invoke-static {v8}, Lb26;->b(Ljava/lang/Class;)Las3;

    .line 202
    .line 203
    .line 204
    move-result-object v8

    .line 205
    invoke-static {v8}, Lx91;->C(Las3;)Lgs3;

    .line 206
    .line 207
    .line 208
    move-result-object v8

    .line 209
    invoke-static {v1}, Lb26;->b(Ljava/lang/Class;)Las3;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-static {v1}, Lx91;->C(Las3;)Lgs3;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    filled-new-array {v2, v6, v8, v1}, [Lgs3;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    invoke-static {v5, v1}, Lb26;->d(Ljava/lang/Class;[Lgs3;)Las3;

    .line 222
    .line 223
    .line 224
    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 225
    goto :goto_3

    .line 226
    :catchall_3
    move-object v1, v7

    .line 227
    :goto_3
    new-instance v2, Lfp7;

    .line 228
    .line 229
    invoke-direct {v2, v4, v1}, Lfp7;-><init>(Lgq3;Las3;)V

    .line 230
    .line 231
    .line 232
    new-instance v1, Lau;

    .line 233
    .line 234
    const-string v4, "ShouldRetryOnExceptionPerRequestAttributeKey"

    .line 235
    .line 236
    invoke-direct {v1, v4, v2}, Lau;-><init>(Ljava/lang/String;Lfp7;)V

    .line 237
    .line 238
    .line 239
    sget-object v1, Lb26;->a:Lc26;

    .line 240
    .line 241
    const-class v2, Lgs2;

    .line 242
    .line 243
    invoke-virtual {v1, v2}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    :try_start_4
    sget-object v4, Lgs3;->c:Lgs3;

    .line 248
    .line 249
    const-class v4, Ll63;

    .line 250
    .line 251
    invoke-static {v4}, Lb26;->b(Ljava/lang/Class;)Las3;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    invoke-static {v4}, Lx91;->C(Las3;)Lgs3;

    .line 256
    .line 257
    .line 258
    move-result-object v4

    .line 259
    invoke-static {v0}, Lb26;->b(Ljava/lang/Class;)Las3;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-static {v0}, Lx91;->C(Las3;)Lgs3;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    const-class v5, Lvs7;

    .line 268
    .line 269
    invoke-static {v5}, Lb26;->b(Ljava/lang/Class;)Las3;

    .line 270
    .line 271
    .line 272
    move-result-object v5

    .line 273
    invoke-static {v5}, Lx91;->C(Las3;)Lgs3;

    .line 274
    .line 275
    .line 276
    move-result-object v5

    .line 277
    filled-new-array {v4, v0, v5}, [Lgs3;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    invoke-static {v2, v0}, Lb26;->d(Ljava/lang/Class;[Lgs3;)Las3;

    .line 282
    .line 283
    .line 284
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 285
    goto :goto_4

    .line 286
    :catchall_4
    move-object v0, v7

    .line 287
    :goto_4
    new-instance v4, Lfp7;

    .line 288
    .line 289
    invoke-direct {v4, v1, v0}, Lfp7;-><init>(Lgq3;Las3;)V

    .line 290
    .line 291
    .line 292
    new-instance v0, Lau;

    .line 293
    .line 294
    const-string v1, "ModifyRequestPerRequestAttributeKey"

    .line 295
    .line 296
    invoke-direct {v0, v1, v4}, Lau;-><init>(Ljava/lang/String;Lfp7;)V

    .line 297
    .line 298
    .line 299
    sget-object v0, Lb26;->a:Lc26;

    .line 300
    .line 301
    invoke-virtual {v0, v2}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    :try_start_5
    sget-object v1, Lgs3;->c:Lgs3;

    .line 306
    .line 307
    const-class v1, Lk63;

    .line 308
    .line 309
    invoke-static {v1}, Lb26;->b(Ljava/lang/Class;)Las3;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    invoke-static {v1}, Lx91;->C(Las3;)Lgs3;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    invoke-static {v3}, Lb26;->b(Ljava/lang/Class;)Las3;

    .line 318
    .line 319
    .line 320
    move-result-object v3

    .line 321
    invoke-static {v3}, Lx91;->C(Las3;)Lgs3;

    .line 322
    .line 323
    .line 324
    move-result-object v3

    .line 325
    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 326
    .line 327
    invoke-static {v4}, Lb26;->b(Ljava/lang/Class;)Las3;

    .line 328
    .line 329
    .line 330
    move-result-object v4

    .line 331
    invoke-static {v4}, Lx91;->C(Las3;)Lgs3;

    .line 332
    .line 333
    .line 334
    move-result-object v4

    .line 335
    filled-new-array {v1, v3, v4}, [Lgs3;

    .line 336
    .line 337
    .line 338
    move-result-object v1

    .line 339
    invoke-static {v2, v1}, Lb26;->d(Ljava/lang/Class;[Lgs3;)Las3;

    .line 340
    .line 341
    .line 342
    move-result-object v7
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 343
    :catchall_5
    new-instance v1, Lfp7;

    .line 344
    .line 345
    invoke-direct {v1, v0, v7}, Lfp7;-><init>(Lgq3;Las3;)V

    .line 346
    .line 347
    .line 348
    new-instance v0, Lau;

    .line 349
    .line 350
    const-string v2, "RetryDelayPerRequestAttributeKey"

    .line 351
    .line 352
    invoke-direct {v0, v2, v1}, Lau;-><init>(Ljava/lang/String;Lfp7;)V

    .line 353
    .line 354
    .line 355
    return-void
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
