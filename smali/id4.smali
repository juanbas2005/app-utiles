.class public final Lid4;
.super Lwx3;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lsr2;


# instance fields
.field public final synthetic x:I

.field public final synthetic y:Ljd4;


# direct methods
.method public synthetic constructor <init>(Ljd4;I)V
    .locals 0

    .line 1
    iput p2, p0, Lid4;->x:I

    .line 2
    .line 3
    iput-object p1, p0, Lid4;->y:Ljd4;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lwx3;-><init>(I)V

    .line 7
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
    .locals 11

    .line 1
    iget v0, p0, Lid4;->x:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lvs7;->a:Lvs7;

    .line 5
    .line 6
    iget-object p0, p0, Lid4;->y:Ljd4;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Ljd4;->B:Lyy3;

    .line 12
    .line 13
    invoke-virtual {v0}, Lyy3;->a()Lxz4;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lxz4;->a1()Lfd4;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-wide v3, p0, Ljd4;->U:J

    .line 25
    .line 26
    invoke-interface {v0, v3, v4}, Lgh4;->y(J)Leh5;

    .line 27
    .line 28
    .line 29
    return-object v2

    .line 30
    :pswitch_0
    iget-object v0, p0, Ljd4;->B:Lyy3;

    .line 31
    .line 32
    iget-object v3, v0, Lyy3;->a:Luy3;

    .line 33
    .line 34
    invoke-static {v3}, Lwe;->B(Luy3;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-nez v3, :cond_0

    .line 39
    .line 40
    iget-boolean v3, v0, Lyy3;->c:Z

    .line 41
    .line 42
    if-nez v3, :cond_0

    .line 43
    .line 44
    invoke-virtual {v0}, Lyy3;->a()Lxz4;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    iget-object v3, v3, Lxz4;->Q:Lxz4;

    .line 49
    .line 50
    if-eqz v3, :cond_1

    .line 51
    .line 52
    invoke-virtual {v3}, Lxz4;->a1()Lfd4;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    if-eqz v3, :cond_1

    .line 57
    .line 58
    iget-object v1, v3, Ldd4;->L:Led4;

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    invoke-virtual {v0}, Lyy3;->a()Lxz4;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    iget-object v3, v3, Lxz4;->Q:Lxz4;

    .line 66
    .line 67
    if-eqz v3, :cond_1

    .line 68
    .line 69
    iget-object v1, v3, Ldd4;->L:Led4;

    .line 70
    .line 71
    :cond_1
    :goto_0
    if-nez v1, :cond_2

    .line 72
    .line 73
    iget-object v1, v0, Lyy3;->a:Luy3;

    .line 74
    .line 75
    invoke-static {v1}, Lxy3;->a(Luy3;)Lp95;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    check-cast v1, Lje;

    .line 80
    .line 81
    invoke-virtual {v1}, Lje;->getPlacementScope()Ldh5;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    :cond_2
    invoke-virtual {v0}, Lyy3;->a()Lxz4;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v0}, Lxz4;->a1()Lfd4;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    iget-wide v3, p0, Ljd4;->K:J

    .line 97
    .line 98
    invoke-static {v1, v0, v3, v4}, Ldh5;->j(Ldh5;Leh5;J)V

    .line 99
    .line 100
    .line 101
    return-object v2

    .line 102
    :pswitch_1
    iget-object v0, p0, Ljd4;->B:Lyy3;

    .line 103
    .line 104
    const/4 v3, 0x0

    .line 105
    iput v3, v0, Lyy3;->h:I

    .line 106
    .line 107
    iget-object v4, v0, Lyy3;->a:Luy3;

    .line 108
    .line 109
    invoke-virtual {v4}, Luy3;->z()Leq4;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    iget-object v5, v4, Leq4;->w:[Ljava/lang/Object;

    .line 114
    .line 115
    iget v4, v4, Leq4;->y:I

    .line 116
    .line 117
    move v6, v3

    .line 118
    :goto_1
    const v7, 0x7fffffff

    .line 119
    .line 120
    .line 121
    if-ge v6, v4, :cond_4

    .line 122
    .line 123
    aget-object v8, v5, v6

    .line 124
    .line 125
    check-cast v8, Luy3;

    .line 126
    .line 127
    iget-object v8, v8, Luy3;->b0:Lyy3;

    .line 128
    .line 129
    iget-object v8, v8, Lyy3;->q:Ljd4;

    .line 130
    .line 131
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    iget v9, v8, Ljd4;->E:I

    .line 135
    .line 136
    iput v9, v8, Ljd4;->D:I

    .line 137
    .line 138
    iput v7, v8, Ljd4;->E:I

    .line 139
    .line 140
    iget-object v7, v8, Ljd4;->F:Lsy3;

    .line 141
    .line 142
    sget-object v9, Lsy3;->x:Lsy3;

    .line 143
    .line 144
    if-ne v7, v9, :cond_3

    .line 145
    .line 146
    sget-object v7, Lsy3;->y:Lsy3;

    .line 147
    .line 148
    iput-object v7, v8, Ljd4;->F:Lsy3;

    .line 149
    .line 150
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_4
    iget-object v4, v0, Lyy3;->a:Luy3;

    .line 154
    .line 155
    iget-object v0, v0, Lyy3;->a:Luy3;

    .line 156
    .line 157
    invoke-virtual {v4}, Luy3;->z()Leq4;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    iget-object v5, v4, Leq4;->w:[Ljava/lang/Object;

    .line 162
    .line 163
    iget v4, v4, Leq4;->y:I

    .line 164
    .line 165
    move v6, v3

    .line 166
    :goto_2
    if-ge v6, v4, :cond_5

    .line 167
    .line 168
    aget-object v8, v5, v6

    .line 169
    .line 170
    check-cast v8, Luy3;

    .line 171
    .line 172
    iget-object v8, v8, Luy3;->b0:Lyy3;

    .line 173
    .line 174
    iget-object v8, v8, Lyy3;->q:Ljd4;

    .line 175
    .line 176
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    iget-object v8, v8, Ljd4;->N:Lvy3;

    .line 180
    .line 181
    iput-boolean v3, v8, Lvy3;->d:Z

    .line 182
    .line 183
    add-int/lit8 v6, v6, 0x1

    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_5
    invoke-virtual {p0}, Ljd4;->f()Lhc3;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    iget-object p0, p0, Lhc3;->s0:Lgc3;

    .line 191
    .line 192
    if-eqz p0, :cond_10

    .line 193
    .line 194
    invoke-virtual {v0}, Luy3;->n()Ljava/util/List;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    check-cast v4, Ljp4;

    .line 199
    .line 200
    iget-object v5, v4, Ljp4;->x:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v5, Leq4;

    .line 203
    .line 204
    iget v5, v5, Leq4;->y:I

    .line 205
    .line 206
    move v6, v3

    .line 207
    :goto_3
    if-ge v6, v5, :cond_9

    .line 208
    .line 209
    invoke-virtual {v4, v6}, Ljp4;->get(I)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v8

    .line 213
    check-cast v8, Luy3;

    .line 214
    .line 215
    iget-object v9, v8, Luy3;->a0:Lo00;

    .line 216
    .line 217
    iget-object v9, v9, Lo00;->e:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v9, Lxz4;

    .line 220
    .line 221
    invoke-virtual {v9}, Lxz4;->a1()Lfd4;

    .line 222
    .line 223
    .line 224
    move-result-object v9

    .line 225
    if-nez v9, :cond_6

    .line 226
    .line 227
    goto :goto_4

    .line 228
    :cond_6
    iget-boolean v10, v9, Ldd4;->K:Z

    .line 229
    .line 230
    if-eqz v10, :cond_8

    .line 231
    .line 232
    if-nez v1, :cond_7

    .line 233
    .line 234
    new-instance v1, Llp4;

    .line 235
    .line 236
    invoke-direct {v1}, Llp4;-><init>()V

    .line 237
    .line 238
    .line 239
    :cond_7
    invoke-virtual {v1, v8}, Llp4;->a(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    :cond_8
    iget-boolean v8, p0, Ldd4;->K:Z

    .line 243
    .line 244
    iput-boolean v8, v9, Ldd4;->K:Z

    .line 245
    .line 246
    :goto_4
    add-int/lit8 v6, v6, 0x1

    .line 247
    .line 248
    goto :goto_3

    .line 249
    :cond_9
    invoke-virtual {p0}, Lfd4;->J0()Lmh4;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    invoke-interface {p0}, Lmh4;->b()V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0}, Luy3;->n()Ljava/util/List;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    check-cast p0, Ljp4;

    .line 261
    .line 262
    iget-object v4, p0, Ljp4;->x:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v4, Leq4;

    .line 265
    .line 266
    iget v4, v4, Leq4;->y:I

    .line 267
    .line 268
    move v5, v3

    .line 269
    :goto_5
    const/4 v6, 0x1

    .line 270
    if-ge v5, v4, :cond_c

    .line 271
    .line 272
    invoke-virtual {p0, v5}, Ljp4;->get(I)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v8

    .line 276
    check-cast v8, Luy3;

    .line 277
    .line 278
    if-eqz v1, :cond_a

    .line 279
    .line 280
    invoke-virtual {v1, v8}, Llp4;->g(Ljava/lang/Object;)I

    .line 281
    .line 282
    .line 283
    move-result v9

    .line 284
    if-ltz v9, :cond_a

    .line 285
    .line 286
    goto :goto_6

    .line 287
    :cond_a
    move v6, v3

    .line 288
    :goto_6
    iget-object v8, v8, Luy3;->a0:Lo00;

    .line 289
    .line 290
    iget-object v8, v8, Lo00;->e:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast v8, Lxz4;

    .line 293
    .line 294
    invoke-virtual {v8}, Lxz4;->a1()Lfd4;

    .line 295
    .line 296
    .line 297
    move-result-object v8

    .line 298
    if-eqz v8, :cond_b

    .line 299
    .line 300
    iput-boolean v6, v8, Ldd4;->K:Z

    .line 301
    .line 302
    :cond_b
    add-int/lit8 v5, v5, 0x1

    .line 303
    .line 304
    goto :goto_5

    .line 305
    :cond_c
    invoke-virtual {v0}, Luy3;->z()Leq4;

    .line 306
    .line 307
    .line 308
    move-result-object p0

    .line 309
    iget-object v1, p0, Leq4;->w:[Ljava/lang/Object;

    .line 310
    .line 311
    iget p0, p0, Leq4;->y:I

    .line 312
    .line 313
    move v4, v3

    .line 314
    :goto_7
    if-ge v4, p0, :cond_e

    .line 315
    .line 316
    aget-object v5, v1, v4

    .line 317
    .line 318
    check-cast v5, Luy3;

    .line 319
    .line 320
    iget-object v5, v5, Luy3;->b0:Lyy3;

    .line 321
    .line 322
    iget-object v5, v5, Lyy3;->q:Ljd4;

    .line 323
    .line 324
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    iget v8, v5, Ljd4;->D:I

    .line 328
    .line 329
    iget v9, v5, Ljd4;->E:I

    .line 330
    .line 331
    if-eq v8, v9, :cond_d

    .line 332
    .line 333
    if-ne v9, v7, :cond_d

    .line 334
    .line 335
    invoke-virtual {v5, v6}, Ljd4;->p0(Z)V

    .line 336
    .line 337
    .line 338
    :cond_d
    add-int/lit8 v4, v4, 0x1

    .line 339
    .line 340
    goto :goto_7

    .line 341
    :cond_e
    invoke-virtual {v0}, Luy3;->z()Leq4;

    .line 342
    .line 343
    .line 344
    move-result-object p0

    .line 345
    iget-object v0, p0, Leq4;->w:[Ljava/lang/Object;

    .line 346
    .line 347
    iget p0, p0, Leq4;->y:I

    .line 348
    .line 349
    :goto_8
    if-ge v3, p0, :cond_f

    .line 350
    .line 351
    aget-object v1, v0, v3

    .line 352
    .line 353
    check-cast v1, Luy3;

    .line 354
    .line 355
    iget-object v1, v1, Luy3;->b0:Lyy3;

    .line 356
    .line 357
    iget-object v1, v1, Lyy3;->q:Ljd4;

    .line 358
    .line 359
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    iget-object v1, v1, Ljd4;->N:Lvy3;

    .line 363
    .line 364
    iget-boolean v4, v1, Lvy3;->d:Z

    .line 365
    .line 366
    iput-boolean v4, v1, Lvy3;->e:Z

    .line 367
    .line 368
    add-int/lit8 v3, v3, 0x1

    .line 369
    .line 370
    goto :goto_8

    .line 371
    :cond_f
    move-object v1, v2

    .line 372
    goto :goto_9

    .line 373
    :cond_10
    const-string p0, "Expected lookahead delegate"

    .line 374
    .line 375
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    :goto_9
    return-object v1

    .line 379
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
