.class public final synthetic Lo39;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lv49;


# direct methods
.method public synthetic constructor <init>(Lv49;I)V
    .locals 0

    .line 1
    iput p2, p0, Lo39;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lo39;->x:Lv49;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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
.method public final run()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lo39;->w:I

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    const-wide/16 v4, 0x1

    .line 8
    .line 9
    iget-object v0, v0, Lo39;->x:Lv49;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lv49;->z1()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    invoke-virtual {v0}, Lcx8;->b1()V

    .line 19
    .line 20
    .line 21
    iget-object v1, v0, Lin8;->w:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Ly19;

    .line 24
    .line 25
    iget-object v6, v1, Ly19;->A:Lq09;

    .line 26
    .line 27
    iget-object v7, v1, Ly19;->B:Lpz8;

    .line 28
    .line 29
    invoke-static {v6}, Ly19;->e(Lin8;)V

    .line 30
    .line 31
    .line 32
    iget-object v8, v6, Lq09;->P:Lh09;

    .line 33
    .line 34
    invoke-virtual {v8}, Lh09;->a()Z

    .line 35
    .line 36
    .line 37
    move-result v9

    .line 38
    if-nez v9, :cond_2

    .line 39
    .line 40
    iget-object v6, v6, Lq09;->Q:Ll09;

    .line 41
    .line 42
    invoke-virtual {v6}, Ll09;->a()J

    .line 43
    .line 44
    .line 45
    move-result-wide v9

    .line 46
    add-long/2addr v4, v9

    .line 47
    invoke-virtual {v6, v4, v5}, Ll09;->b(J)V

    .line 48
    .line 49
    .line 50
    const-wide/16 v4, 0x5

    .line 51
    .line 52
    cmp-long v4, v9, v4

    .line 53
    .line 54
    if-ltz v4, :cond_0

    .line 55
    .line 56
    invoke-static {v7}, Ly19;->g(Ly29;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, v7, Lpz8;->E:Lmz8;

    .line 60
    .line 61
    const-string v1, "Permanently failed to retrieve Deferred Deep Link. Reached maximum retries."

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Lmz8;->a(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const/4 v0, 0x1

    .line 67
    invoke-virtual {v8, v0}, Lh09;->b(Z)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    iget-object v4, v0, Lv49;->O:Lp39;

    .line 72
    .line 73
    if-nez v4, :cond_1

    .line 74
    .line 75
    new-instance v4, Lp39;

    .line 76
    .line 77
    const/4 v5, 0x3

    .line 78
    invoke-direct {v4, v0, v1, v5}, Lp39;-><init>(Lv49;La39;I)V

    .line 79
    .line 80
    .line 81
    iput-object v4, v0, Lv49;->O:Lp39;

    .line 82
    .line 83
    :cond_1
    iget-object v0, v0, Lv49;->O:Lp39;

    .line 84
    .line 85
    invoke-virtual {v0, v2, v3}, Lxq8;->b(J)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_2
    invoke-static {v7}, Ly19;->g(Ly29;)V

    .line 90
    .line 91
    .line 92
    iget-object v0, v7, Lpz8;->I:Lmz8;

    .line 93
    .line 94
    const-string v1, "Deferred Deep Link already retrieved. Not fetching again."

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Lmz8;->a(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :goto_0
    return-void

    .line 100
    :pswitch_1
    iget-object v0, v0, Lv49;->M:Lv09;

    .line 101
    .line 102
    iget-object v1, v0, Lv09;->w:Ly19;

    .line 103
    .line 104
    iget-object v6, v1, Ly19;->C:Lr19;

    .line 105
    .line 106
    iget-object v7, v1, Ly19;->I:Lv49;

    .line 107
    .line 108
    iget-object v8, v1, Ly19;->A:Lq09;

    .line 109
    .line 110
    invoke-static {v6}, Ly19;->g(Ly29;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v6}, Lr19;->b1()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Lv09;->e()Z

    .line 117
    .line 118
    .line 119
    move-result v6

    .line 120
    if-nez v6, :cond_3

    .line 121
    .line 122
    goto/16 :goto_5

    .line 123
    .line 124
    :cond_3
    invoke-virtual {v0}, Lv09;->d()Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    const-string v6, "_cc"

    .line 129
    .line 130
    const/4 v9, 0x0

    .line 131
    if-eqz v0, :cond_4

    .line 132
    .line 133
    invoke-static {v8}, Ly19;->e(Lin8;)V

    .line 134
    .line 135
    .line 136
    iget-object v0, v8, Lq09;->S:Ll90;

    .line 137
    .line 138
    invoke-virtual {v0, v9}, Ll90;->k(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    new-instance v0, Landroid/os/Bundle;

    .line 142
    .line 143
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 144
    .line 145
    .line 146
    const-string v1, "source"

    .line 147
    .line 148
    const-string v9, "(not set)"

    .line 149
    .line 150
    invoke-virtual {v0, v1, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    const-string v1, "medium"

    .line 154
    .line 155
    invoke-virtual {v0, v1, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    const-string v1, "_cis"

    .line 159
    .line 160
    const-string v9, "intent"

    .line 161
    .line 162
    invoke-virtual {v0, v1, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, v6, v4, v5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 166
    .line 167
    .line 168
    invoke-static {v7}, Ly19;->f(Lfy8;)V

    .line 169
    .line 170
    .line 171
    const-string v1, "auto"

    .line 172
    .line 173
    const-string v4, "_cmpx"

    .line 174
    .line 175
    invoke-virtual {v7, v1, v4, v0}, Lv49;->j1(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 176
    .line 177
    .line 178
    goto/16 :goto_4

    .line 179
    .line 180
    :cond_4
    invoke-static {v8}, Ly19;->e(Lin8;)V

    .line 181
    .line 182
    .line 183
    iget-object v0, v8, Lq09;->S:Ll90;

    .line 184
    .line 185
    invoke-virtual {v0}, Ll90;->j()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    if-eqz v5, :cond_5

    .line 194
    .line 195
    iget-object v1, v1, Ly19;->B:Lpz8;

    .line 196
    .line 197
    invoke-static {v1}, Ly19;->g(Ly29;)V

    .line 198
    .line 199
    .line 200
    iget-object v1, v1, Lpz8;->C:Lmz8;

    .line 201
    .line 202
    const-string v4, "Cache still valid but referrer not found"

    .line 203
    .line 204
    invoke-virtual {v1, v4}, Lmz8;->a(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    goto :goto_3

    .line 208
    :cond_5
    iget-object v1, v8, Lq09;->T:Ll09;

    .line 209
    .line 210
    invoke-virtual {v1}, Ll09;->a()J

    .line 211
    .line 212
    .line 213
    move-result-wide v10

    .line 214
    const-wide/32 v12, 0x36ee80

    .line 215
    .line 216
    .line 217
    div-long/2addr v10, v12

    .line 218
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    new-instance v4, Landroid/os/Bundle;

    .line 223
    .line 224
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 225
    .line 226
    .line 227
    new-instance v5, Landroid/util/Pair;

    .line 228
    .line 229
    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v14

    .line 233
    invoke-direct {v5, v14, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v1}, Landroid/net/Uri;->getQueryParameterNames()Ljava/util/Set;

    .line 237
    .line 238
    .line 239
    move-result-object v14

    .line 240
    invoke-interface {v14}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 241
    .line 242
    .line 243
    move-result-object v14

    .line 244
    :goto_1
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 245
    .line 246
    .line 247
    move-result v15

    .line 248
    if-eqz v15, :cond_6

    .line 249
    .line 250
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v15

    .line 254
    check-cast v15, Ljava/lang/String;

    .line 255
    .line 256
    move-wide/from16 v16, v12

    .line 257
    .line 258
    invoke-virtual {v1, v15}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v12

    .line 262
    invoke-virtual {v4, v15, v12}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    move-wide/from16 v12, v16

    .line 266
    .line 267
    goto :goto_1

    .line 268
    :cond_6
    move-wide/from16 v16, v12

    .line 269
    .line 270
    const-wide/16 v12, -0x1

    .line 271
    .line 272
    add-long/2addr v10, v12

    .line 273
    mul-long v10, v10, v16

    .line 274
    .line 275
    iget-object v1, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v1, Landroid/os/Bundle;

    .line 278
    .line 279
    invoke-virtual {v1, v6, v10, v11}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 280
    .line 281
    .line 282
    iget-object v1, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 283
    .line 284
    if-nez v1, :cond_7

    .line 285
    .line 286
    const-string v1, "app"

    .line 287
    .line 288
    goto :goto_2

    .line 289
    :cond_7
    check-cast v1, Ljava/lang/String;

    .line 290
    .line 291
    :goto_2
    invoke-static {v7}, Ly19;->f(Lfy8;)V

    .line 292
    .line 293
    .line 294
    iget-object v4, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast v4, Landroid/os/Bundle;

    .line 297
    .line 298
    const-string v5, "_cmp"

    .line 299
    .line 300
    invoke-virtual {v7, v1, v5, v4}, Lv49;->j1(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 301
    .line 302
    .line 303
    :goto_3
    invoke-virtual {v0, v9}, Ll90;->k(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    :goto_4
    invoke-static {v8}, Ly19;->e(Lin8;)V

    .line 307
    .line 308
    .line 309
    iget-object v0, v8, Lq09;->T:Ll09;

    .line 310
    .line 311
    invoke-virtual {v0, v2, v3}, Ll09;->b(J)V

    .line 312
    .line 313
    .line 314
    :goto_5
    return-void

    .line 315
    :pswitch_2
    invoke-virtual {v0}, Lv49;->z1()V

    .line 316
    .line 317
    .line 318
    return-void

    .line 319
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
