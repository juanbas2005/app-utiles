.class public final synthetic Lfd7;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lsr2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 11
    iput p1, p0, Lfd7;->w:I

    iput-object p2, p0, Lfd7;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ld98;Lje2;)V
    .locals 0

    .line 1
    const/16 p2, 0x9

    .line 2
    .line 3
    iput p2, p0, Lfd7;->w:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lfd7;->x:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
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
.method public final b()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lfd7;->w:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    sget-object v2, Lvs7;->a:Lvs7;

    .line 5
    .line 6
    iget-object p0, p0, Lfd7;->x:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, Landroidx/work/Worker;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/work/Worker;->c()Lr84;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :pswitch_0
    check-cast p0, Lnd8;

    .line 19
    .line 20
    iget-object v0, p0, Lnd8;->c:Landroidx/work/impl/WorkDatabase;

    .line 21
    .line 22
    iget-object v3, p0, Lnd8;->a:Landroid/content/Context;

    .line 23
    .line 24
    sget-object v4, Lna7;->B:Ljava/lang/String;

    .line 25
    .line 26
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 27
    .line 28
    const/16 v5, 0x22

    .line 29
    .line 30
    if-lt v4, v5, :cond_0

    .line 31
    .line 32
    invoke-static {v3}, Lhl3;->a(Landroid/content/Context;)Landroid/app/job/JobScheduler;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v4}, Landroid/app/job/JobScheduler;->cancelAll()V

    .line 37
    .line 38
    .line 39
    :cond_0
    const-string v4, "jobscheduler"

    .line 40
    .line 41
    invoke-virtual {v3, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, Landroid/app/job/JobScheduler;

    .line 46
    .line 47
    invoke-static {v3, v4}, Lna7;->b(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    if-eqz v3, :cond_1

    .line 52
    .line 53
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-nez v5, :cond_1

    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_1

    .line 68
    .line 69
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    check-cast v5, Landroid/app/job/JobInfo;

    .line 74
    .line 75
    invoke-virtual {v5}, Landroid/app/job/JobInfo;->getId()I

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    invoke-static {v4, v5}, Lna7;->a(Landroid/app/job/JobScheduler;I)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->w()Lfe8;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    iget-object v3, v3, Lfe8;->a:La96;

    .line 88
    .line 89
    new-instance v4, Lrb8;

    .line 90
    .line 91
    const/16 v5, 0x9

    .line 92
    .line 93
    invoke-direct {v4, v5}, Lrb8;-><init>(I)V

    .line 94
    .line 95
    .line 96
    const/4 v5, 0x0

    .line 97
    invoke-static {v3, v5, v1, v4}, Lsg3;->O(La96;ZZLvr2;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    check-cast v1, Ljava/lang/Number;

    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 104
    .line 105
    .line 106
    iget-object v1, p0, Lnd8;->b:Lf01;

    .line 107
    .line 108
    iget-object p0, p0, Lnd8;->e:Ljava/util/List;

    .line 109
    .line 110
    invoke-static {v1, v0, p0}, Lmg6;->b(Lf01;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 111
    .line 112
    .line 113
    return-object v2

    .line 114
    :pswitch_1
    check-cast p0, Lcd8;

    .line 115
    .line 116
    invoke-static {p0}, Lz42;->a(Lcd8;)V

    .line 117
    .line 118
    .line 119
    return-object v2

    .line 120
    :pswitch_2
    check-cast p0, Ld98;

    .line 121
    .line 122
    new-instance v0, Lc98;

    .line 123
    .line 124
    invoke-direct {v0, p0}, Lc98;-><init>(Ld98;)V

    .line 125
    .line 126
    .line 127
    return-object v0

    .line 128
    :pswitch_3
    check-cast p0, Lc98;

    .line 129
    .line 130
    iget-object p0, p0, Lc98;->a:Luj;

    .line 131
    .line 132
    invoke-virtual {p0}, Luj;->d()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    check-cast p0, Ljava/lang/Number;

    .line 137
    .line 138
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 139
    .line 140
    .line 141
    move-result p0

    .line 142
    const/high16 v0, 0x3f800000    # 1.0f

    .line 143
    .line 144
    cmpg-float p0, p0, v0

    .line 145
    .line 146
    if-nez p0, :cond_2

    .line 147
    .line 148
    sget-object p0, Ld98;->x:Ld98;

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_2
    sget-object p0, Ld98;->w:Ld98;

    .line 152
    .line 153
    :goto_1
    return-object p0

    .line 154
    :pswitch_4
    check-cast p0, Lv78;

    .line 155
    .line 156
    new-instance v0, Lcom/wireguard/android/backend/GoBackend;

    .line 157
    .line 158
    iget-object p0, p0, Lv78;->a:Landroid/content/Context;

    .line 159
    .line 160
    invoke-direct {v0, p0}, Lcom/wireguard/android/backend/GoBackend;-><init>(Landroid/content/Context;)V

    .line 161
    .line 162
    .line 163
    return-object v0

    .line 164
    :pswitch_5
    check-cast p0, Lg48;

    .line 165
    .line 166
    iget v0, p0, Lg48;->w:I

    .line 167
    .line 168
    int-to-long v0, v0

    .line 169
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    const/16 v1, 0x20

    .line 174
    .line 175
    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    iget v2, p0, Lg48;->x:I

    .line 180
    .line 181
    int-to-long v2, v2

    .line 182
    invoke-static {v2, v3}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    invoke-virtual {v0, v2}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    iget p0, p0, Lg48;->y:I

    .line 195
    .line 196
    int-to-long v1, p0

    .line 197
    invoke-static {v1, v2}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    invoke-virtual {v0, p0}, Ljava/math/BigInteger;->or(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    return-object p0

    .line 206
    :pswitch_6
    check-cast p0, Lhj7;

    .line 207
    .line 208
    iget-object v0, p0, Lhj7;->j0:Lvr2;

    .line 209
    .line 210
    iget-boolean p0, p0, Lhj7;->i0:Z

    .line 211
    .line 212
    xor-int/2addr p0, v1

    .line 213
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    invoke-interface {v0, p0}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    return-object v2

    .line 221
    :pswitch_7
    check-cast p0, Lsg7;

    .line 222
    .line 223
    const/4 v0, 0x0

    .line 224
    iput-object v0, p0, Lsg7;->U:Lrg7;

    .line 225
    .line 226
    invoke-static {p0}, Lg75;->D(Ldk6;)V

    .line 227
    .line 228
    .line 229
    invoke-static {p0}, Lsu0;->B(Lmy3;)V

    .line 230
    .line 231
    .line 232
    invoke-static {p0}, Lrc9;->e0(Lgz1;)V

    .line 233
    .line 234
    .line 235
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 236
    .line 237
    return-object p0

    .line 238
    :pswitch_8
    check-cast p0, Lse3;

    .line 239
    .line 240
    invoke-virtual {p0}, Lse3;->c()J

    .line 241
    .line 242
    .line 243
    move-result-wide v0

    .line 244
    new-instance p0, Loe3;

    .line 245
    .line 246
    invoke-direct {p0, v0, v1}, Loe3;-><init>(J)V

    .line 247
    .line 248
    .line 249
    return-object p0

    .line 250
    :pswitch_9
    check-cast p0, Lge7;

    .line 251
    .line 252
    const/high16 v0, 0x41800000    # 16.0f

    .line 253
    .line 254
    invoke-virtual {p0}, Lge7;->b()F

    .line 255
    .line 256
    .line 257
    move-result p0

    .line 258
    const/high16 v1, 0x41c00000    # 24.0f

    .line 259
    .line 260
    invoke-static {v1, v0, p0}, Lwe;->E(FFF)F

    .line 261
    .line 262
    .line 263
    move-result p0

    .line 264
    new-instance v0, Llx1;

    .line 265
    .line 266
    invoke-direct {v0, p0}, Llx1;-><init>(F)V

    .line 267
    .line 268
    .line 269
    return-object v0

    .line 270
    :pswitch_a
    check-cast p0, Lqd7;

    .line 271
    .line 272
    iget-boolean v0, p0, Lll4;->J:Z

    .line 273
    .line 274
    if-eqz v0, :cond_3

    .line 275
    .line 276
    invoke-static {p0}, Lf55;->g(Lvo1;)Lyc7;

    .line 277
    .line 278
    .line 279
    move-result-object p0

    .line 280
    goto :goto_2

    .line 281
    :cond_3
    sget-object p0, Lyc7;->b:Lyc7;

    .line 282
    .line 283
    :goto_2
    return-object p0

    .line 284
    :pswitch_b
    check-cast p0, Landroid/app/RemoteAction;

    .line 285
    .line 286
    invoke-static {p0}, Lpc7;->d(Landroid/app/RemoteAction;)Landroid/app/PendingIntent;

    .line 287
    .line 288
    .line 289
    move-result-object p0

    .line 290
    invoke-static {p0}, Lj45;->p(Landroid/app/PendingIntent;)V

    .line 291
    .line 292
    .line 293
    return-object v2

    .line 294
    nop

    .line 295
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
