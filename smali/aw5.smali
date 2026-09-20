.class public final Law5;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final i:J


# instance fields
.field public a:Lui7;

.field public b:Lzv5;

.field public c:J

.field public d:D

.field public final e:Lzv5;

.field public final f:Lzv5;

.field public final g:J

.field public final h:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Lrg;->d()Lrg;

    .line 2
    .line 3
    .line 4
    const-wide/32 v0, 0xf4240

    .line 5
    .line 6
    .line 7
    sput-wide v0, Law5;->i:J

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

.method public constructor <init>(Lzv5;Lg22;Lb01;Ljava/lang/String;)V
    .locals 11

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x1f4

    .line 5
    .line 6
    iput-wide v0, p0, Law5;->c:J

    .line 7
    .line 8
    iput-object p1, p0, Law5;->b:Lzv5;

    .line 9
    .line 10
    const-wide p1, 0x407f400000000000L    # 500.0

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    iput-wide p1, p0, Law5;->d:D

    .line 16
    .line 17
    new-instance p1, Lui7;

    .line 18
    .line 19
    invoke-direct {p1}, Lui7;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Law5;->a:Lui7;

    .line 23
    .line 24
    const-string p1, "Trace"

    .line 25
    .line 26
    if-ne p4, p1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p3}, Lb01;->j()J

    .line 29
    .line 30
    .line 31
    move-result-wide p1

    .line 32
    :goto_0
    move-wide v3, p1

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    invoke-virtual {p3}, Lb01;->j()J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    goto :goto_0

    .line 39
    :goto_1
    const-string p1, "Trace"

    .line 40
    .line 41
    if-ne p4, p1, :cond_4

    .line 42
    .line 43
    const-class p1, Lz01;

    .line 44
    .line 45
    monitor-enter p1

    .line 46
    :try_start_0
    sget-object p2, Lz01;->G:Lz01;

    .line 47
    .line 48
    if-nez p2, :cond_1

    .line 49
    .line 50
    new-instance p2, Lz01;

    .line 51
    .line 52
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 53
    .line 54
    .line 55
    sput-object p2, Lz01;->G:Lz01;

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :catchall_0
    move-exception v0

    .line 59
    move-object p0, v0

    .line 60
    goto :goto_4

    .line 61
    :cond_1
    :goto_2
    sget-object p2, Lz01;->G:Lz01;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    .line 63
    monitor-exit p1

    .line 64
    iget-object p1, p3, Lb01;->a:Lcom/google/firebase/perf/config/RemoteConfigManager;

    .line 65
    .line 66
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    const-string v0, "fpr_rl_trace_event_count_fg"

    .line 70
    .line 71
    invoke-virtual {p1, v0}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getLong(Ljava/lang/String;)Ln75;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1}, Ln75;->b()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    invoke-virtual {p1}, Ln75;->a()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, Ljava/lang/Long;

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 88
    .line 89
    .line 90
    move-result-wide v0

    .line 91
    invoke-static {v0, v1}, Lb01;->k(J)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_2

    .line 96
    .line 97
    iget-object p2, p3, Lb01;->c:Lzt1;

    .line 98
    .line 99
    const-string v0, "com.google.firebase.perf.TraceEventCountForeground"

    .line 100
    .line 101
    invoke-virtual {p1}, Ln75;->a()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    check-cast v1, Ljava/lang/Long;

    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 108
    .line 109
    .line 110
    move-result-wide v1

    .line 111
    invoke-virtual {p2, v1, v2, v0}, Lzt1;->d(JLjava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Ln75;->a()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    check-cast p1, Ljava/lang/Long;

    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 121
    .line 122
    .line 123
    move-result-wide p1

    .line 124
    :goto_3
    move-wide v1, p1

    .line 125
    goto/16 :goto_6

    .line 126
    .line 127
    :cond_2
    invoke-virtual {p3, p2}, Lb01;->c(Lwe;)Ln75;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-virtual {p1}, Ln75;->b()Z

    .line 132
    .line 133
    .line 134
    move-result p2

    .line 135
    if-eqz p2, :cond_3

    .line 136
    .line 137
    invoke-virtual {p1}, Ln75;->a()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    check-cast p2, Ljava/lang/Long;

    .line 142
    .line 143
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 144
    .line 145
    .line 146
    move-result-wide v0

    .line 147
    invoke-static {v0, v1}, Lb01;->k(J)Z

    .line 148
    .line 149
    .line 150
    move-result p2

    .line 151
    if-eqz p2, :cond_3

    .line 152
    .line 153
    invoke-virtual {p1}, Ln75;->a()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    check-cast p1, Ljava/lang/Long;

    .line 158
    .line 159
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 160
    .line 161
    .line 162
    move-result-wide p1

    .line 163
    goto :goto_3

    .line 164
    :cond_3
    const-wide/16 p1, 0x12c

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :goto_4
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 168
    throw p0

    .line 169
    :cond_4
    const-class p1, Ln01;

    .line 170
    .line 171
    monitor-enter p1

    .line 172
    :try_start_2
    sget-object p2, Ln01;->G:Ln01;

    .line 173
    .line 174
    if-nez p2, :cond_5

    .line 175
    .line 176
    new-instance p2, Ln01;

    .line 177
    .line 178
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 179
    .line 180
    .line 181
    sput-object p2, Ln01;->G:Ln01;

    .line 182
    .line 183
    goto :goto_5

    .line 184
    :catchall_1
    move-exception v0

    .line 185
    move-object p0, v0

    .line 186
    goto/16 :goto_f

    .line 187
    .line 188
    :cond_5
    :goto_5
    sget-object p2, Ln01;->G:Ln01;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 189
    .line 190
    monitor-exit p1

    .line 191
    iget-object p1, p3, Lb01;->a:Lcom/google/firebase/perf/config/RemoteConfigManager;

    .line 192
    .line 193
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    const-string v0, "fpr_rl_network_event_count_fg"

    .line 197
    .line 198
    invoke-virtual {p1, v0}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getLong(Ljava/lang/String;)Ln75;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    invoke-virtual {p1}, Ln75;->b()Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-eqz v0, :cond_6

    .line 207
    .line 208
    invoke-virtual {p1}, Ln75;->a()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    check-cast v0, Ljava/lang/Long;

    .line 213
    .line 214
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 215
    .line 216
    .line 217
    move-result-wide v0

    .line 218
    invoke-static {v0, v1}, Lb01;->k(J)Z

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    if-eqz v0, :cond_6

    .line 223
    .line 224
    iget-object p2, p3, Lb01;->c:Lzt1;

    .line 225
    .line 226
    const-string v0, "com.google.firebase.perf.NetworkEventCountForeground"

    .line 227
    .line 228
    invoke-virtual {p1}, Ln75;->a()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    check-cast v1, Ljava/lang/Long;

    .line 233
    .line 234
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 235
    .line 236
    .line 237
    move-result-wide v1

    .line 238
    invoke-virtual {p2, v1, v2, v0}, Lzt1;->d(JLjava/lang/String;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {p1}, Ln75;->a()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    check-cast p1, Ljava/lang/Long;

    .line 246
    .line 247
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 248
    .line 249
    .line 250
    move-result-wide p1

    .line 251
    goto :goto_3

    .line 252
    :cond_6
    invoke-virtual {p3, p2}, Lb01;->c(Lwe;)Ln75;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    invoke-virtual {p1}, Ln75;->b()Z

    .line 257
    .line 258
    .line 259
    move-result p2

    .line 260
    if-eqz p2, :cond_7

    .line 261
    .line 262
    invoke-virtual {p1}, Ln75;->a()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object p2

    .line 266
    check-cast p2, Ljava/lang/Long;

    .line 267
    .line 268
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 269
    .line 270
    .line 271
    move-result-wide v0

    .line 272
    invoke-static {v0, v1}, Lb01;->k(J)Z

    .line 273
    .line 274
    .line 275
    move-result p2

    .line 276
    if-eqz p2, :cond_7

    .line 277
    .line 278
    invoke-virtual {p1}, Ln75;->a()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    check-cast p1, Ljava/lang/Long;

    .line 283
    .line 284
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 285
    .line 286
    .line 287
    move-result-wide p1

    .line 288
    goto/16 :goto_3

    .line 289
    .line 290
    :cond_7
    const-wide/16 p1, 0x2bc

    .line 291
    .line 292
    goto/16 :goto_3

    .line 293
    .line 294
    :goto_6
    new-instance v0, Lzv5;

    .line 295
    .line 296
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 297
    .line 298
    invoke-direct/range {v0 .. v5}, Lzv5;-><init>(JJLjava/util/concurrent/TimeUnit;)V

    .line 299
    .line 300
    .line 301
    iput-object v0, p0, Law5;->e:Lzv5;

    .line 302
    .line 303
    iput-wide v1, p0, Law5;->g:J

    .line 304
    .line 305
    const-string p1, "Trace"

    .line 306
    .line 307
    if-ne p4, p1, :cond_8

    .line 308
    .line 309
    invoke-virtual {p3}, Lb01;->j()J

    .line 310
    .line 311
    .line 312
    move-result-wide p1

    .line 313
    :goto_7
    move-wide v8, p1

    .line 314
    goto :goto_8

    .line 315
    :cond_8
    invoke-virtual {p3}, Lb01;->j()J

    .line 316
    .line 317
    .line 318
    move-result-wide p1

    .line 319
    goto :goto_7

    .line 320
    :goto_8
    const-string p1, "Trace"

    .line 321
    .line 322
    if-ne p4, p1, :cond_c

    .line 323
    .line 324
    const-class p1, Ly01;

    .line 325
    .line 326
    monitor-enter p1

    .line 327
    :try_start_3
    sget-object p2, Ly01;->G:Ly01;

    .line 328
    .line 329
    if-nez p2, :cond_9

    .line 330
    .line 331
    new-instance p2, Ly01;

    .line 332
    .line 333
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 334
    .line 335
    .line 336
    sput-object p2, Ly01;->G:Ly01;

    .line 337
    .line 338
    goto :goto_9

    .line 339
    :catchall_2
    move-exception v0

    .line 340
    move-object p0, v0

    .line 341
    goto :goto_b

    .line 342
    :cond_9
    :goto_9
    sget-object p2, Ly01;->G:Ly01;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 343
    .line 344
    monitor-exit p1

    .line 345
    iget-object p1, p3, Lb01;->a:Lcom/google/firebase/perf/config/RemoteConfigManager;

    .line 346
    .line 347
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    const-string p4, "fpr_rl_trace_event_count_bg"

    .line 351
    .line 352
    invoke-virtual {p1, p4}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getLong(Ljava/lang/String;)Ln75;

    .line 353
    .line 354
    .line 355
    move-result-object p1

    .line 356
    invoke-virtual {p1}, Ln75;->b()Z

    .line 357
    .line 358
    .line 359
    move-result p4

    .line 360
    if-eqz p4, :cond_a

    .line 361
    .line 362
    invoke-virtual {p1}, Ln75;->a()Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object p4

    .line 366
    check-cast p4, Ljava/lang/Long;

    .line 367
    .line 368
    invoke-virtual {p4}, Ljava/lang/Long;->longValue()J

    .line 369
    .line 370
    .line 371
    move-result-wide v0

    .line 372
    invoke-static {v0, v1}, Lb01;->k(J)Z

    .line 373
    .line 374
    .line 375
    move-result p4

    .line 376
    if-eqz p4, :cond_a

    .line 377
    .line 378
    iget-object p2, p3, Lb01;->c:Lzt1;

    .line 379
    .line 380
    const-string p3, "com.google.firebase.perf.TraceEventCountBackground"

    .line 381
    .line 382
    invoke-virtual {p1}, Ln75;->a()Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object p4

    .line 386
    check-cast p4, Ljava/lang/Long;

    .line 387
    .line 388
    invoke-virtual {p4}, Ljava/lang/Long;->longValue()J

    .line 389
    .line 390
    .line 391
    move-result-wide v0

    .line 392
    invoke-virtual {p2, v0, v1, p3}, Lzt1;->d(JLjava/lang/String;)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {p1}, Ln75;->a()Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object p1

    .line 399
    check-cast p1, Ljava/lang/Long;

    .line 400
    .line 401
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 402
    .line 403
    .line 404
    move-result-wide p1

    .line 405
    :goto_a
    move-wide v6, p1

    .line 406
    move-object v10, v5

    .line 407
    goto/16 :goto_d

    .line 408
    .line 409
    :cond_a
    invoke-virtual {p3, p2}, Lb01;->c(Lwe;)Ln75;

    .line 410
    .line 411
    .line 412
    move-result-object p1

    .line 413
    invoke-virtual {p1}, Ln75;->b()Z

    .line 414
    .line 415
    .line 416
    move-result p2

    .line 417
    if-eqz p2, :cond_b

    .line 418
    .line 419
    invoke-virtual {p1}, Ln75;->a()Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object p2

    .line 423
    check-cast p2, Ljava/lang/Long;

    .line 424
    .line 425
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 426
    .line 427
    .line 428
    move-result-wide p2

    .line 429
    invoke-static {p2, p3}, Lb01;->k(J)Z

    .line 430
    .line 431
    .line 432
    move-result p2

    .line 433
    if-eqz p2, :cond_b

    .line 434
    .line 435
    invoke-virtual {p1}, Ln75;->a()Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object p1

    .line 439
    check-cast p1, Ljava/lang/Long;

    .line 440
    .line 441
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 442
    .line 443
    .line 444
    move-result-wide p1

    .line 445
    goto :goto_a

    .line 446
    :cond_b
    const-wide/16 p1, 0x1e

    .line 447
    .line 448
    goto :goto_a

    .line 449
    :goto_b
    :try_start_4
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 450
    throw p0

    .line 451
    :cond_c
    const-class p2, Lm01;

    .line 452
    .line 453
    monitor-enter p2

    .line 454
    :try_start_5
    sget-object p1, Lm01;->G:Lm01;

    .line 455
    .line 456
    if-nez p1, :cond_d

    .line 457
    .line 458
    new-instance p1, Lm01;

    .line 459
    .line 460
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 461
    .line 462
    .line 463
    sput-object p1, Lm01;->G:Lm01;

    .line 464
    .line 465
    goto :goto_c

    .line 466
    :catchall_3
    move-exception v0

    .line 467
    move-object p0, v0

    .line 468
    goto :goto_e

    .line 469
    :cond_d
    :goto_c
    sget-object p1, Lm01;->G:Lm01;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 470
    .line 471
    monitor-exit p2

    .line 472
    iget-object p2, p3, Lb01;->a:Lcom/google/firebase/perf/config/RemoteConfigManager;

    .line 473
    .line 474
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 475
    .line 476
    .line 477
    const-string p4, "fpr_rl_network_event_count_bg"

    .line 478
    .line 479
    invoke-virtual {p2, p4}, Lcom/google/firebase/perf/config/RemoteConfigManager;->getLong(Ljava/lang/String;)Ln75;

    .line 480
    .line 481
    .line 482
    move-result-object p2

    .line 483
    invoke-virtual {p2}, Ln75;->b()Z

    .line 484
    .line 485
    .line 486
    move-result p4

    .line 487
    if-eqz p4, :cond_e

    .line 488
    .line 489
    invoke-virtual {p2}, Ln75;->a()Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object p4

    .line 493
    check-cast p4, Ljava/lang/Long;

    .line 494
    .line 495
    invoke-virtual {p4}, Ljava/lang/Long;->longValue()J

    .line 496
    .line 497
    .line 498
    move-result-wide v0

    .line 499
    invoke-static {v0, v1}, Lb01;->k(J)Z

    .line 500
    .line 501
    .line 502
    move-result p4

    .line 503
    if-eqz p4, :cond_e

    .line 504
    .line 505
    iget-object p1, p3, Lb01;->c:Lzt1;

    .line 506
    .line 507
    const-string p3, "com.google.firebase.perf.NetworkEventCountBackground"

    .line 508
    .line 509
    invoke-virtual {p2}, Ln75;->a()Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object p4

    .line 513
    check-cast p4, Ljava/lang/Long;

    .line 514
    .line 515
    invoke-virtual {p4}, Ljava/lang/Long;->longValue()J

    .line 516
    .line 517
    .line 518
    move-result-wide v0

    .line 519
    invoke-virtual {p1, v0, v1, p3}, Lzt1;->d(JLjava/lang/String;)V

    .line 520
    .line 521
    .line 522
    invoke-virtual {p2}, Ln75;->a()Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object p1

    .line 526
    check-cast p1, Ljava/lang/Long;

    .line 527
    .line 528
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 529
    .line 530
    .line 531
    move-result-wide p1

    .line 532
    goto :goto_a

    .line 533
    :cond_e
    invoke-virtual {p3, p1}, Lb01;->c(Lwe;)Ln75;

    .line 534
    .line 535
    .line 536
    move-result-object p1

    .line 537
    invoke-virtual {p1}, Ln75;->b()Z

    .line 538
    .line 539
    .line 540
    move-result p2

    .line 541
    if-eqz p2, :cond_f

    .line 542
    .line 543
    invoke-virtual {p1}, Ln75;->a()Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object p2

    .line 547
    check-cast p2, Ljava/lang/Long;

    .line 548
    .line 549
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 550
    .line 551
    .line 552
    move-result-wide p2

    .line 553
    invoke-static {p2, p3}, Lb01;->k(J)Z

    .line 554
    .line 555
    .line 556
    move-result p2

    .line 557
    if-eqz p2, :cond_f

    .line 558
    .line 559
    invoke-virtual {p1}, Ln75;->a()Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    move-result-object p1

    .line 563
    check-cast p1, Ljava/lang/Long;

    .line 564
    .line 565
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 566
    .line 567
    .line 568
    move-result-wide p1

    .line 569
    goto/16 :goto_a

    .line 570
    .line 571
    :cond_f
    const-wide/16 p1, 0x46

    .line 572
    .line 573
    goto/16 :goto_a

    .line 574
    .line 575
    :goto_d
    new-instance v5, Lzv5;

    .line 576
    .line 577
    invoke-direct/range {v5 .. v10}, Lzv5;-><init>(JJLjava/util/concurrent/TimeUnit;)V

    .line 578
    .line 579
    .line 580
    iput-object v5, p0, Law5;->f:Lzv5;

    .line 581
    .line 582
    iput-wide v6, p0, Law5;->h:J

    .line 583
    .line 584
    return-void

    .line 585
    :goto_e
    :try_start_6
    monitor-exit p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 586
    throw p0

    .line 587
    :goto_f
    :try_start_7
    monitor-exit p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 588
    throw p0
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
.end method


# virtual methods
.method public final declared-synchronized a(Z)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Law5;->e:Lzv5;

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :catchall_0
    move-exception p1

    .line 8
    goto :goto_2

    .line 9
    :cond_0
    iget-object v0, p0, Law5;->f:Lzv5;

    .line 10
    .line 11
    :goto_0
    iput-object v0, p0, Law5;->b:Lzv5;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    iget-wide v0, p0, Law5;->g:J

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    iget-wide v0, p0, Law5;->h:J

    .line 19
    .line 20
    :goto_1
    iput-wide v0, p0, Law5;->c:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    monitor-exit p0

    .line 23
    return-void

    .line 24
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    throw p1
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final declared-synchronized b()Z
    .locals 11

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Lui7;

    .line 3
    .line 4
    invoke-direct {v0}, Lui7;-><init>()V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Law5;->a:Lui7;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-wide v2, v0, Lui7;->x:J

    .line 13
    .line 14
    iget-wide v4, v1, Lui7;->x:J

    .line 15
    .line 16
    sub-long/2addr v2, v4

    .line 17
    long-to-double v1, v2

    .line 18
    iget-object v3, p0, Law5;->b:Lzv5;

    .line 19
    .line 20
    iget-wide v4, v3, Lzv5;->a:J

    .line 21
    .line 22
    iget-wide v6, v3, Lzv5;->b:J

    .line 23
    .line 24
    sget-object v8, Lyv5;->a:[I

    .line 25
    .line 26
    iget-object v3, v3, Lzv5;->c:Ljava/util/concurrent/TimeUnit;

    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 29
    .line 30
    .line 31
    move-result v9

    .line 32
    aget v8, v8, v9

    .line 33
    .line 34
    const/4 v9, 0x1

    .line 35
    if-eq v8, v9, :cond_2

    .line 36
    .line 37
    const/4 v10, 0x2

    .line 38
    if-eq v8, v10, :cond_1

    .line 39
    .line 40
    const/4 v10, 0x3

    .line 41
    if-eq v8, v10, :cond_0

    .line 42
    .line 43
    long-to-double v4, v4

    .line 44
    invoke-virtual {v3, v6, v7}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    .line 45
    .line 46
    .line 47
    move-result-wide v6

    .line 48
    long-to-double v6, v6

    .line 49
    div-double/2addr v4, v6

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    long-to-double v3, v4

    .line 52
    long-to-double v5, v6

    .line 53
    div-double/2addr v3, v5

    .line 54
    const-wide v5, 0x408f400000000000L    # 1000.0

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    :goto_0
    mul-double v4, v3, v5

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    long-to-double v3, v4

    .line 63
    long-to-double v5, v6

    .line 64
    div-double/2addr v3, v5

    .line 65
    const-wide v5, 0x412e848000000000L    # 1000000.0

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    long-to-double v3, v4

    .line 72
    long-to-double v5, v6

    .line 73
    div-double/2addr v3, v5

    .line 74
    const-wide v5, 0x41cdcd6500000000L    # 1.0E9

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :goto_1
    mul-double/2addr v1, v4

    .line 81
    sget-wide v3, Law5;->i:J

    .line 82
    .line 83
    long-to-double v3, v3

    .line 84
    div-double/2addr v1, v3

    .line 85
    const-wide/16 v3, 0x0

    .line 86
    .line 87
    cmpl-double v3, v1, v3

    .line 88
    .line 89
    if-lez v3, :cond_3

    .line 90
    .line 91
    iget-wide v3, p0, Law5;->d:D

    .line 92
    .line 93
    add-double/2addr v3, v1

    .line 94
    iget-wide v1, p0, Law5;->c:J

    .line 95
    .line 96
    long-to-double v1, v1

    .line 97
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(DD)D

    .line 98
    .line 99
    .line 100
    move-result-wide v1

    .line 101
    iput-wide v1, p0, Law5;->d:D

    .line 102
    .line 103
    iput-object v0, p0, Law5;->a:Lui7;

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :catchall_0
    move-exception v0

    .line 107
    goto :goto_3

    .line 108
    :cond_3
    :goto_2
    iget-wide v0, p0, Law5;->d:D

    .line 109
    .line 110
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 111
    .line 112
    cmpl-double v4, v0, v2

    .line 113
    .line 114
    if-ltz v4, :cond_4

    .line 115
    .line 116
    sub-double/2addr v0, v2

    .line 117
    iput-wide v0, p0, Law5;->d:D
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    .line 119
    monitor-exit p0

    .line 120
    return v9

    .line 121
    :cond_4
    monitor-exit p0

    .line 122
    const/4 p0, 0x0

    .line 123
    return p0

    .line 124
    :goto_3
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 125
    throw v0
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
