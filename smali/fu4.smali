.class public final Lfu4;
.super Lrt4;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final g:Lox4;

.field public final h:Lgq3;

.field public final i:Ljava/lang/Object;

.field public final j:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lox4;Lgq3;Ljava/util/Map;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const-class v0, Lhu4;

    .line 11
    .line 12
    invoke-static {v0}, Ltf4;->A(Ljava/lang/Class;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1, v0}, Lox4;->b(Ljava/lang/String;)Lnx4;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {p0, v0, v1, p3}, Lrt4;-><init>(Lnx4;Lgq3;Ljava/util/Map;)V

    .line 22
    .line 23
    .line 24
    new-instance p3, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p3, p0, Lfu4;->j:Ljava/util/ArrayList;

    .line 30
    .line 31
    iput-object p1, p0, Lfu4;->g:Lox4;

    .line 32
    .line 33
    iput-object p2, p0, Lfu4;->h:Lgq3;

    .line 34
    .line 35
    return-void
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
.end method

.method public constructor <init>(Lox4;Ljava/lang/Object;Lgq3;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    const-class v0, Lhu4;

    .line 37
    invoke-static {v0}, Ltf4;->A(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    .line 38
    invoke-virtual {p1, v0}, Lox4;->b(Ljava/lang/String;)Lnx4;

    move-result-object v0

    .line 39
    sget-object v1, Lb42;->w:Lb42;

    invoke-direct {p0, v0, p3, v1}, Lrt4;-><init>(Lnx4;Lgq3;Ljava/util/Map;)V

    .line 40
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lfu4;->j:Ljava/util/ArrayList;

    .line 41
    iput-object p1, p0, Lfu4;->g:Lox4;

    .line 42
    iput-object p2, p0, Lfu4;->i:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Lqt4;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lfu4;->i()Leu4;

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

.method public final i()Leu4;
    .locals 13

    .line 1
    invoke-super {p0}, Lrt4;->a()Lqt4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Leu4;

    .line 6
    .line 7
    iget-object v1, p0, Lfu4;->j:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v2, v0, Leu4;->B:Lr14;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v3, v2, Lr14;->x:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Leu4;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    const/4 v5, 0x0

    .line 30
    if-eqz v4, :cond_9

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, Lqt4;

    .line 37
    .line 38
    if-nez v4, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iget-object v6, v2, Lr14;->y:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v6, Lcz6;

    .line 44
    .line 45
    iget-object v7, v3, Lqt4;->x:Lao;

    .line 46
    .line 47
    iget-object v8, v4, Lqt4;->x:Lao;

    .line 48
    .line 49
    iget v9, v8, Lao;->a:I

    .line 50
    .line 51
    iget-object v10, v8, Lao;->e:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v10, Ljava/lang/String;

    .line 54
    .line 55
    if-nez v9, :cond_2

    .line 56
    .line 57
    if-eqz v10, :cond_1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    const-string p0, "Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML."

    .line 61
    .line 62
    invoke-static {p0}, Lh;->q(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object v5

    .line 66
    :cond_2
    :goto_1
    iget-object v11, v7, Lao;->e:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v11, Ljava/lang/String;

    .line 69
    .line 70
    const-string v12, "Destination "

    .line 71
    .line 72
    if-eqz v11, :cond_4

    .line 73
    .line 74
    invoke-static {v10, v11}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v10

    .line 78
    if-nez v10, :cond_3

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_3
    const-string p0, " cannot have the same route as graph "

    .line 82
    .line 83
    invoke-static {v12, v4, p0, v3}, Lku4;->y(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    return-object v5

    .line 87
    :cond_4
    :goto_2
    iget v7, v7, Lao;->a:I

    .line 88
    .line 89
    if-eq v9, v7, :cond_8

    .line 90
    .line 91
    invoke-virtual {v6, v9}, Lcz6;->c(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v7

    .line 95
    check-cast v7, Lqt4;

    .line 96
    .line 97
    if-ne v7, v4, :cond_5

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_5
    iget-object v9, v4, Lqt4;->y:Leu4;

    .line 101
    .line 102
    if-nez v9, :cond_7

    .line 103
    .line 104
    if-eqz v7, :cond_6

    .line 105
    .line 106
    iput-object v5, v7, Lqt4;->y:Leu4;

    .line 107
    .line 108
    :cond_6
    iput-object v3, v4, Lqt4;->y:Leu4;

    .line 109
    .line 110
    iget v5, v8, Lao;->a:I

    .line 111
    .line 112
    invoke-virtual {v6, v5, v4}, Lcz6;->e(ILjava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_7
    const-string p0, "Destination already has a parent set. Call NavGraph.remove() to remove the previous parent."

    .line 117
    .line 118
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    return-object v5

    .line 122
    :cond_8
    const-string p0, " cannot have the same id as graph "

    .line 123
    .line 124
    invoke-static {v12, v4, p0, v3}, Lku4;->y(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    return-object v5

    .line 128
    :cond_9
    iget-object v1, p0, Lfu4;->i:Ljava/lang/Object;

    .line 129
    .line 130
    iget-object v4, p0, Lfu4;->h:Lgq3;

    .line 131
    .line 132
    if-nez v4, :cond_b

    .line 133
    .line 134
    if-nez v1, :cond_b

    .line 135
    .line 136
    iget-object p0, p0, Lrt4;->a:Ljava/lang/String;

    .line 137
    .line 138
    if-eqz p0, :cond_a

    .line 139
    .line 140
    const-string p0, "You must set a start destination route"

    .line 141
    .line 142
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    return-object v5

    .line 146
    :cond_a
    const-string p0, "You must set a start destination id"

    .line 147
    .line 148
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    return-object v5

    .line 152
    :cond_b
    const-string p0, " from NavGraph. Ensure the starting NavDestination was added with route from KClass."

    .line 153
    .line 154
    const-string v6, "Cannot find startDestination "

    .line 155
    .line 156
    if-eqz v4, :cond_d

    .line 157
    .line 158
    invoke-static {v4}, Li95;->D(Lgq3;)Lzr3;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-static {v1}, Lb35;->m(Lzr3;)I

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    invoke-virtual {v2, v3}, Lr14;->a(I)Lqt4;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    if-eqz v4, :cond_c

    .line 171
    .line 172
    iget-object p0, v4, Lqt4;->x:Lao;

    .line 173
    .line 174
    iget-object p0, p0, Lao;->e:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast p0, Ljava/lang/String;

    .line 177
    .line 178
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2, p0}, Lr14;->f(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    iput v3, v2, Lr14;->w:I

    .line 185
    .line 186
    return-object v0

    .line 187
    :cond_c
    invoke-interface {v1}, Lzr3;->getDescriptor()Lll6;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-interface {v0}, Lll6;->a()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-static {v0, p0, v6}, Lh;->p(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    return-object v5

    .line 199
    :cond_d
    if-eqz v1, :cond_f

    .line 200
    .line 201
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    sget-object v4, Lb26;->a:Lc26;

    .line 206
    .line 207
    invoke-virtual {v4, v3}, Lc26;->b(Ljava/lang/Class;)Lgq3;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    invoke-static {v3}, Li95;->D(Lgq3;)Lzr3;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    new-instance v4, Lg34;

    .line 216
    .line 217
    const/4 v5, 0x1

    .line 218
    invoke-direct {v4, v5, v1}, Lg34;-><init>(ILjava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    invoke-static {v3}, Lb35;->m(Lzr3;)I

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    invoke-virtual {v2, v1}, Lr14;->a(I)Lqt4;

    .line 226
    .line 227
    .line 228
    move-result-object v5

    .line 229
    if-eqz v5, :cond_e

    .line 230
    .line 231
    invoke-interface {v4, v5}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    check-cast p0, Ljava/lang/String;

    .line 236
    .line 237
    invoke-virtual {v2, p0}, Lr14;->f(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    iput v1, v2, Lr14;->w:I

    .line 241
    .line 242
    goto :goto_3

    .line 243
    :cond_e
    invoke-interface {v3}, Lzr3;->getDescriptor()Lll6;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    invoke-interface {v1}, Lll6;->a()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    invoke-static {v1, p0, v6}, Lh;->p(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    :goto_3
    return-object v0

    .line 255
    :cond_f
    iget-object p0, v3, Lqt4;->x:Lao;

    .line 256
    .line 257
    iget p0, p0, Lao;->a:I

    .line 258
    .line 259
    if-eqz p0, :cond_11

    .line 260
    .line 261
    iget-object p0, v2, Lr14;->A:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast p0, Ljava/lang/String;

    .line 264
    .line 265
    if-eqz p0, :cond_10

    .line 266
    .line 267
    invoke-virtual {v2, v5}, Lr14;->f(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    :cond_10
    const/4 p0, 0x0

    .line 271
    iput p0, v2, Lr14;->w:I

    .line 272
    .line 273
    iput-object v5, v2, Lr14;->z:Ljava/io/Serializable;

    .line 274
    .line 275
    return-object v0

    .line 276
    :cond_11
    const-string p0, "Start destination 0 cannot use the same id as the graph "

    .line 277
    .line 278
    invoke-static {p0, v3}, Lrf2;->j(Ljava/lang/String;Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    return-object v5
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
