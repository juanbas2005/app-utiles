.class public final synthetic La88;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lhs2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lw78;


# direct methods
.method public synthetic constructor <init>(Lw78;I)V
    .locals 0

    .line 1
    iput p2, p0, La88;->w:I

    .line 2
    .line 3
    iput-object p1, p0, La88;->x:Lw78;

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
.method public final u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 38

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, La88;->w:I

    .line 4
    .line 5
    sget-object v2, Lvs7;->a:Lvs7;

    .line 6
    .line 7
    sget-object v3, Ljl4;->w:Ljl4;

    .line 8
    .line 9
    const/high16 v6, 0x41500000    # 13.0f

    .line 10
    .line 11
    const/high16 v7, -0x40800000    # -1.0f

    .line 12
    .line 13
    const v8, -0x4119999a    # -0.45f

    .line 14
    .line 15
    .line 16
    const/high16 v9, 0x40400000    # 3.0f

    .line 17
    .line 18
    const/high16 v10, 0x3f800000    # 1.0f

    .line 19
    .line 20
    const/16 v11, 0x10

    .line 21
    .line 22
    const/4 v12, 0x1

    .line 23
    const/4 v13, 0x0

    .line 24
    const/high16 v14, 0x41000000    # 8.0f

    .line 25
    .line 26
    iget-object v0, v0, La88;->x:Lw78;

    .line 27
    .line 28
    packed-switch v1, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    move-object/from16 v1, p1

    .line 32
    .line 33
    check-cast v1, Lfa6;

    .line 34
    .line 35
    move-object/from16 v15, p2

    .line 36
    .line 37
    check-cast v15, Lyt2;

    .line 38
    .line 39
    move-object/from16 v16, p3

    .line 40
    .line 41
    check-cast v16, Ljava/lang/Integer;

    .line 42
    .line 43
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result v16

    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    and-int/lit8 v1, v16, 0x11

    .line 51
    .line 52
    if-eq v1, v11, :cond_0

    .line 53
    .line 54
    move v13, v12

    .line 55
    :cond_0
    and-int/lit8 v1, v16, 0x1

    .line 56
    .line 57
    invoke-virtual {v15, v1, v13}, Lyt2;->V(IZ)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_3

    .line 62
    .line 63
    sget-object v1, Ll55;->a:Lx83;

    .line 64
    .line 65
    if-eqz v1, :cond_1

    .line 66
    .line 67
    goto/16 :goto_0

    .line 68
    .line 69
    :cond_1
    new-instance v16, Lw83;

    .line 70
    .line 71
    const/16 v24, 0x0

    .line 72
    .line 73
    const/16 v26, 0x60

    .line 74
    .line 75
    const/16 v25, 0x0

    .line 76
    .line 77
    const/high16 v18, 0x41c00000    # 24.0f

    .line 78
    .line 79
    const/high16 v19, 0x41c00000    # 24.0f

    .line 80
    .line 81
    const/high16 v20, 0x41c00000    # 24.0f

    .line 82
    .line 83
    const/high16 v21, 0x41c00000    # 24.0f

    .line 84
    .line 85
    const-wide/16 v22, 0x0

    .line 86
    .line 87
    const-string v17, "Rounded.PowerSettingsNew"

    .line 88
    .line 89
    invoke-direct/range {v16 .. v26}, Lw83;-><init>(Ljava/lang/String;FFFFJIZI)V

    .line 90
    .line 91
    .line 92
    move-object/from16 v1, v16

    .line 93
    .line 94
    sget v12, Le38;->a:I

    .line 95
    .line 96
    new-instance v12, Lky6;

    .line 97
    .line 98
    sget-wide v4, Ljt0;->b:J

    .line 99
    .line 100
    invoke-direct {v12, v4, v5}, Lky6;-><init>(J)V

    .line 101
    .line 102
    .line 103
    const/high16 v4, 0x41400000    # 12.0f

    .line 104
    .line 105
    invoke-static {v4, v9}, Lpb4;->e(FF)Lbe5;

    .line 106
    .line 107
    .line 108
    move-result-object v18

    .line 109
    const/high16 v23, -0x40800000    # -1.0f

    .line 110
    .line 111
    const/high16 v24, 0x3f800000    # 1.0f

    .line 112
    .line 113
    const v19, -0x40f33333    # -0.55f

    .line 114
    .line 115
    .line 116
    const/16 v20, 0x0

    .line 117
    .line 118
    const/high16 v21, -0x40800000    # -1.0f

    .line 119
    .line 120
    const v22, 0x3ee66666    # 0.45f

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {v18 .. v24}, Lbe5;->e(FFFFFF)V

    .line 124
    .line 125
    .line 126
    move-object/from16 v4, v18

    .line 127
    .line 128
    invoke-virtual {v4, v14}, Lbe5;->n(F)V

    .line 129
    .line 130
    .line 131
    const/high16 v23, 0x3f800000    # 1.0f

    .line 132
    .line 133
    const/16 v19, 0x0

    .line 134
    .line 135
    const v20, 0x3f0ccccd    # 0.55f

    .line 136
    .line 137
    .line 138
    const v21, 0x3ee66666    # 0.45f

    .line 139
    .line 140
    .line 141
    const/high16 v22, 0x3f800000    # 1.0f

    .line 142
    .line 143
    invoke-virtual/range {v18 .. v24}, Lbe5;->e(FFFFFF)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v4, v10, v8, v10, v7}, Lbe5;->l(FFFF)V

    .line 147
    .line 148
    .line 149
    const/high16 v5, 0x40800000    # 4.0f

    .line 150
    .line 151
    invoke-virtual {v4, v6, v5}, Lbe5;->h(FF)V

    .line 152
    .line 153
    .line 154
    const/high16 v23, -0x40800000    # -1.0f

    .line 155
    .line 156
    const/high16 v24, -0x40800000    # -1.0f

    .line 157
    .line 158
    const v20, -0x40f33333    # -0.55f

    .line 159
    .line 160
    .line 161
    const v21, -0x4119999a    # -0.45f

    .line 162
    .line 163
    .line 164
    const/high16 v22, -0x40800000    # -1.0f

    .line 165
    .line 166
    invoke-virtual/range {v18 .. v24}, Lbe5;->e(FFFFFF)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v4}, Lbe5;->c()V

    .line 170
    .line 171
    .line 172
    const v5, 0x41891eb8    # 17.14f

    .line 173
    .line 174
    .line 175
    const v6, 0x40bb851f    # 5.86f

    .line 176
    .line 177
    .line 178
    invoke-virtual {v4, v5, v6}, Lbe5;->j(FF)V

    .line 179
    .line 180
    .line 181
    const v23, -0x43dc28f6    # -0.01f

    .line 182
    .line 183
    .line 184
    const v24, 0x3fb1eb85    # 1.39f

    .line 185
    .line 186
    .line 187
    const v19, -0x413851ec    # -0.39f

    .line 188
    .line 189
    .line 190
    const v20, 0x3ec7ae14    # 0.39f

    .line 191
    .line 192
    .line 193
    const v21, -0x413d70a4    # -0.38f

    .line 194
    .line 195
    .line 196
    const/high16 v22, 0x3f800000    # 1.0f

    .line 197
    .line 198
    invoke-virtual/range {v18 .. v24}, Lbe5;->e(FFFFFF)V

    .line 199
    .line 200
    .line 201
    const v23, 0x3fef5c29    # 1.87f

    .line 202
    .line 203
    .line 204
    const v24, 0x40923d71    # 4.57f

    .line 205
    .line 206
    .line 207
    const v19, 0x3f90a3d7    # 1.13f

    .line 208
    .line 209
    .line 210
    const v20, 0x3f99999a    # 1.2f

    .line 211
    .line 212
    .line 213
    const v21, 0x3fea3d71    # 1.83f

    .line 214
    .line 215
    .line 216
    const v22, 0x40333333    # 2.8f

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v18 .. v24}, Lbe5;->e(FFFFFF)V

    .line 220
    .line 221
    .line 222
    const v23, -0x3f22e148    # -6.91f

    .line 223
    .line 224
    .line 225
    const v24, 0x40e570a4    # 7.17f

    .line 226
    .line 227
    .line 228
    const v19, 0x3db851ec    # 0.09f

    .line 229
    .line 230
    .line 231
    const v20, 0x40751eb8    # 3.83f

    .line 232
    .line 233
    .line 234
    const v21, -0x3fbae148    # -3.08f

    .line 235
    .line 236
    .line 237
    const v22, 0x40e428f6    # 7.13f

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v18 .. v24}, Lbe5;->e(FFFFFF)V

    .line 241
    .line 242
    .line 243
    const/high16 v23, 0x40a00000    # 5.0f

    .line 244
    .line 245
    const/high16 v24, 0x41400000    # 12.0f

    .line 246
    .line 247
    const v19, 0x4102e148    # 8.18f

    .line 248
    .line 249
    .line 250
    const v20, 0x41986666    # 19.05f

    .line 251
    .line 252
    .line 253
    const/high16 v21, 0x40a00000    # 5.0f

    .line 254
    .line 255
    const v22, 0x417e6666    # 15.9f

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v18 .. v24}, Lbe5;->d(FFFFFF)V

    .line 259
    .line 260
    .line 261
    const v23, 0x3fef5c29    # 1.87f

    .line 262
    .line 263
    .line 264
    const v24, -0x3f67ae14    # -4.76f

    .line 265
    .line 266
    .line 267
    const/16 v19, 0x0

    .line 268
    .line 269
    const v20, -0x40147ae1    # -1.84f

    .line 270
    .line 271
    .line 272
    const v21, 0x3f35c28f    # 0.71f

    .line 273
    .line 274
    .line 275
    const v22, -0x3f9f5c29    # -3.51f

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v18 .. v24}, Lbe5;->e(FFFFFF)V

    .line 279
    .line 280
    .line 281
    const v23, -0x43dc28f6    # -0.01f

    .line 282
    .line 283
    .line 284
    const v24, -0x404f5c29    # -1.38f

    .line 285
    .line 286
    .line 287
    const v19, 0x3ebd70a4    # 0.37f

    .line 288
    .line 289
    .line 290
    const v20, -0x413851ec    # -0.39f

    .line 291
    .line 292
    .line 293
    const v21, 0x3ebd70a4    # 0.37f

    .line 294
    .line 295
    .line 296
    const/high16 v22, -0x40800000    # -1.0f

    .line 297
    .line 298
    invoke-virtual/range {v18 .. v24}, Lbe5;->e(FFFFFF)V

    .line 299
    .line 300
    .line 301
    const v23, -0x4048f5c3    # -1.43f

    .line 302
    .line 303
    .line 304
    const v24, 0x3ca3d70a    # 0.02f

    .line 305
    .line 306
    .line 307
    const v19, -0x41333333    # -0.4f

    .line 308
    .line 309
    .line 310
    const v20, -0x41333333    # -0.4f

    .line 311
    .line 312
    .line 313
    const v21, -0x4079999a    # -1.05f

    .line 314
    .line 315
    .line 316
    const v22, -0x413851ec    # -0.39f

    .line 317
    .line 318
    .line 319
    invoke-virtual/range {v18 .. v24}, Lbe5;->e(FFFFFF)V

    .line 320
    .line 321
    .line 322
    const/high16 v23, 0x40400000    # 3.0f

    .line 323
    .line 324
    const v24, 0x413bd70a    # 11.74f

    .line 325
    .line 326
    .line 327
    const v19, 0x407eb852    # 3.98f

    .line 328
    .line 329
    .line 330
    const v20, 0x40ed70a4    # 7.42f

    .line 331
    .line 332
    .line 333
    const v21, 0x40447ae1    # 3.07f

    .line 334
    .line 335
    .line 336
    const v22, 0x4117851f    # 9.47f

    .line 337
    .line 338
    .line 339
    invoke-virtual/range {v18 .. v24}, Lbe5;->d(FFFFFF)V

    .line 340
    .line 341
    .line 342
    const v23, 0x410b5c29    # 8.71f

    .line 343
    .line 344
    .line 345
    const/high16 v24, 0x41140000    # 9.25f

    .line 346
    .line 347
    const v19, -0x41f0a3d7    # -0.14f

    .line 348
    .line 349
    .line 350
    const v20, 0x409c28f6    # 4.88f

    .line 351
    .line 352
    .line 353
    const v21, 0x40751eb8    # 3.83f

    .line 354
    .line 355
    .line 356
    const v22, 0x4111999a    # 9.1f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v18 .. v24}, Lbe5;->e(FFFFFF)V

    .line 360
    .line 361
    .line 362
    const v23, 0x4114a3d7    # 9.29f

    .line 363
    .line 364
    .line 365
    const/high16 v24, -0x3ef00000    # -9.0f

    .line 366
    .line 367
    const v19, 0x40a33333    # 5.1f

    .line 368
    .line 369
    .line 370
    const v20, 0x3e23d70a    # 0.16f

    .line 371
    .line 372
    .line 373
    const v21, 0x4114a3d7    # 9.29f

    .line 374
    .line 375
    .line 376
    const v22, -0x3f847ae1    # -3.93f

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {v18 .. v24}, Lbe5;->e(FFFFFF)V

    .line 380
    .line 381
    .line 382
    const v23, -0x3fe51eb8    # -2.42f

    .line 383
    .line 384
    .line 385
    const v24, -0x3f3c7ae1    # -6.11f

    .line 386
    .line 387
    .line 388
    const/16 v19, 0x0

    .line 389
    .line 390
    const v20, -0x3fe851ec    # -2.37f

    .line 391
    .line 392
    .line 393
    const v21, -0x40947ae1    # -0.92f

    .line 394
    .line 395
    .line 396
    const v22, -0x3f6fae14    # -4.51f

    .line 397
    .line 398
    .line 399
    invoke-virtual/range {v18 .. v24}, Lbe5;->e(FFFFFF)V

    .line 400
    .line 401
    .line 402
    const v23, -0x4047ae14    # -1.44f

    .line 403
    .line 404
    .line 405
    const v24, -0x435c28f6    # -0.02f

    .line 406
    .line 407
    .line 408
    const v19, -0x413d70a4    # -0.38f

    .line 409
    .line 410
    .line 411
    const v20, -0x412e147b    # -0.41f

    .line 412
    .line 413
    .line 414
    const v21, -0x407ae148    # -1.04f

    .line 415
    .line 416
    .line 417
    const v22, -0x4128f5c3    # -0.42f

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {v18 .. v24}, Lbe5;->e(FFFFFF)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v4}, Lbe5;->c()V

    .line 424
    .line 425
    .line 426
    iget-object v4, v4, Lbe5;->a:Ljava/util/ArrayList;

    .line 427
    .line 428
    const/16 v5, 0x3800

    .line 429
    .line 430
    invoke-static {v1, v4, v12, v5}, Lw83;->a(Lw83;Ljava/util/List;Lky6;I)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v1}, Lw83;->b()Lx83;

    .line 434
    .line 435
    .line 436
    move-result-object v1

    .line 437
    sput-object v1, Ll55;->a:Lx83;

    .line 438
    .line 439
    :goto_0
    sget-wide v18, Ljt0;->c:J

    .line 440
    .line 441
    const/16 v21, 0xc30

    .line 442
    .line 443
    const/16 v22, 0x4

    .line 444
    .line 445
    const/16 v16, 0x0

    .line 446
    .line 447
    const/16 v17, 0x0

    .line 448
    .line 449
    move-object/from16 v20, v15

    .line 450
    .line 451
    move-object v15, v1

    .line 452
    invoke-static/range {v15 .. v22}, Ld83;->a(Lx83;Ljava/lang/String;Lml4;JLyt2;II)V

    .line 453
    .line 454
    .line 455
    move-object/from16 v1, v20

    .line 456
    .line 457
    invoke-static {v3, v14}, Lyu6;->p(Lml4;F)Lml4;

    .line 458
    .line 459
    .line 460
    move-result-object v3

    .line 461
    invoke-static {v1, v3}, Lk75;->a(Lyt2;Lml4;)V

    .line 462
    .line 463
    .line 464
    iget-boolean v0, v0, Lw78;->d:Z

    .line 465
    .line 466
    if-eqz v0, :cond_2

    .line 467
    .line 468
    const v0, 0x7f11044d

    .line 469
    .line 470
    .line 471
    goto :goto_1

    .line 472
    :cond_2
    const v0, 0x7f11044c

    .line 473
    .line 474
    .line 475
    :goto_1
    invoke-static {v0, v1}, Ll55;->u(ILyt2;)Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object v15

    .line 479
    invoke-static {v11}, Lya5;->k(I)J

    .line 480
    .line 481
    .line 482
    move-result-wide v19

    .line 483
    sget-object v21, Lam2;->B:Lam2;

    .line 484
    .line 485
    const/16 v36, 0x0

    .line 486
    .line 487
    const v37, 0x3ffae

    .line 488
    .line 489
    .line 490
    const/16 v16, 0x0

    .line 491
    .line 492
    const-wide/16 v17, 0x0

    .line 493
    .line 494
    const/16 v22, 0x0

    .line 495
    .line 496
    const-wide/16 v23, 0x0

    .line 497
    .line 498
    const/16 v25, 0x0

    .line 499
    .line 500
    const/16 v26, 0x0

    .line 501
    .line 502
    const-wide/16 v27, 0x0

    .line 503
    .line 504
    const/16 v29, 0x0

    .line 505
    .line 506
    const/16 v30, 0x0

    .line 507
    .line 508
    const/16 v31, 0x0

    .line 509
    .line 510
    const/16 v32, 0x0

    .line 511
    .line 512
    const/16 v33, 0x0

    .line 513
    .line 514
    const v35, 0x186000

    .line 515
    .line 516
    .line 517
    move-object/from16 v34, v1

    .line 518
    .line 519
    invoke-static/range {v15 .. v37}, Lyf7;->b(Ljava/lang/String;Lml4;JJLam2;Lea7;JLrd7;Lhc7;JIZIILtg7;Lyt2;III)V

    .line 520
    .line 521
    .line 522
    goto :goto_2

    .line 523
    :cond_3
    move-object v1, v15

    .line 524
    invoke-virtual {v1}, Lyt2;->Y()V

    .line 525
    .line 526
    .line 527
    :goto_2
    return-object v2

    .line 528
    :pswitch_0
    move-object/from16 v1, p1

    .line 529
    .line 530
    check-cast v1, Lbu0;

    .line 531
    .line 532
    move-object/from16 v4, p2

    .line 533
    .line 534
    check-cast v4, Lyt2;

    .line 535
    .line 536
    move-object/from16 v5, p3

    .line 537
    .line 538
    check-cast v5, Ljava/lang/Integer;

    .line 539
    .line 540
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 541
    .line 542
    .line 543
    move-result v5

    .line 544
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 545
    .line 546
    .line 547
    and-int/lit8 v1, v5, 0x11

    .line 548
    .line 549
    if-eq v1, v11, :cond_4

    .line 550
    .line 551
    move v1, v12

    .line 552
    goto :goto_3

    .line 553
    :cond_4
    move v1, v13

    .line 554
    :goto_3
    and-int/2addr v5, v12

    .line 555
    invoke-virtual {v4, v5, v1}, Lyt2;->V(IZ)Z

    .line 556
    .line 557
    .line 558
    move-result v1

    .line 559
    if-eqz v1, :cond_a

    .line 560
    .line 561
    const/high16 v1, 0x41800000    # 16.0f

    .line 562
    .line 563
    invoke-static {v3, v1}, Lx91;->K(Lml4;F)Lml4;

    .line 564
    .line 565
    .line 566
    move-result-object v5

    .line 567
    sget-object v11, Lwr;->c:Lsr;

    .line 568
    .line 569
    sget-object v15, Lxb4;->K:Lg80;

    .line 570
    .line 571
    invoke-static {v11, v15, v4, v13}, Lzt0;->a(Lvr;Lg80;Lyt2;I)Lau0;

    .line 572
    .line 573
    .line 574
    move-result-object v11

    .line 575
    iget-wide v12, v4, Lyt2;->T:J

    .line 576
    .line 577
    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    .line 578
    .line 579
    .line 580
    move-result v12

    .line 581
    invoke-virtual {v4}, Lyt2;->m()Lvf5;

    .line 582
    .line 583
    .line 584
    move-result-object v13

    .line 585
    invoke-static {v4, v5}, Lgw8;->E(Lyt2;Lml4;)Lml4;

    .line 586
    .line 587
    .line 588
    move-result-object v5

    .line 589
    sget-object v19, Lux0;->d:Ltx0;

    .line 590
    .line 591
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 592
    .line 593
    .line 594
    sget-object v15, Ltx0;->b:Lvy0;

    .line 595
    .line 596
    invoke-virtual {v4}, Lyt2;->i0()V

    .line 597
    .line 598
    .line 599
    iget-boolean v9, v4, Lyt2;->S:Z

    .line 600
    .line 601
    if-eqz v9, :cond_5

    .line 602
    .line 603
    invoke-virtual {v4, v15}, Lyt2;->l(Lsr2;)V

    .line 604
    .line 605
    .line 606
    goto :goto_4

    .line 607
    :cond_5
    invoke-virtual {v4}, Lyt2;->r0()V

    .line 608
    .line 609
    .line 610
    :goto_4
    sget-object v9, Ltx0;->f:Lck;

    .line 611
    .line 612
    invoke-static {v9, v4, v11}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 613
    .line 614
    .line 615
    sget-object v9, Ltx0;->e:Lck;

    .line 616
    .line 617
    invoke-static {v9, v4, v13}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 618
    .line 619
    .line 620
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 621
    .line 622
    .line 623
    move-result-object v9

    .line 624
    sget-object v11, Ltx0;->g:Lck;

    .line 625
    .line 626
    invoke-static {v11, v4, v9}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 627
    .line 628
    .line 629
    sget-object v9, Ltx0;->h:Lce;

    .line 630
    .line 631
    invoke-static {v4, v9}, Lg75;->O(Lyt2;Lvr2;)V

    .line 632
    .line 633
    .line 634
    sget-object v9, Ltx0;->d:Lck;

    .line 635
    .line 636
    invoke-static {v9, v4, v5}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 637
    .line 638
    .line 639
    sget-object v5, Lx91;->q:Lx83;

    .line 640
    .line 641
    const/high16 v9, 0x40000000    # 2.0f

    .line 642
    .line 643
    const/high16 v11, 0x41100000    # 9.0f

    .line 644
    .line 645
    const/high16 v12, 0x41600000    # 14.0f

    .line 646
    .line 647
    if-eqz v5, :cond_6

    .line 648
    .line 649
    goto/16 :goto_5

    .line 650
    .line 651
    :cond_6
    new-instance v20, Lw83;

    .line 652
    .line 653
    const/16 v28, 0x0

    .line 654
    .line 655
    const/16 v30, 0x60

    .line 656
    .line 657
    const/16 v29, 0x0

    .line 658
    .line 659
    const/high16 v22, 0x41c00000    # 24.0f

    .line 660
    .line 661
    const/high16 v23, 0x41c00000    # 24.0f

    .line 662
    .line 663
    const/high16 v24, 0x41c00000    # 24.0f

    .line 664
    .line 665
    const/high16 v25, 0x41c00000    # 24.0f

    .line 666
    .line 667
    const-wide/16 v26, 0x0

    .line 668
    .line 669
    const-string v21, "Rounded.Description"

    .line 670
    .line 671
    invoke-direct/range {v20 .. v30}, Lw83;-><init>(Ljava/lang/String;FFFFJIZI)V

    .line 672
    .line 673
    .line 674
    move-object/from16 v5, v20

    .line 675
    .line 676
    sget v13, Le38;->a:I

    .line 677
    .line 678
    new-instance v13, Lky6;

    .line 679
    .line 680
    sget-wide v14, Ljt0;->b:J

    .line 681
    .line 682
    invoke-direct {v13, v14, v15}, Lky6;-><init>(J)V

    .line 683
    .line 684
    .line 685
    const v14, 0x416970a4    # 14.59f

    .line 686
    .line 687
    .line 688
    const v15, 0x4025c28f    # 2.59f

    .line 689
    .line 690
    .line 691
    invoke-static {v14, v15}, Lpb4;->e(FF)Lbe5;

    .line 692
    .line 693
    .line 694
    move-result-object v21

    .line 695
    const v26, -0x404a3d71    # -1.42f

    .line 696
    .line 697
    .line 698
    const v27, -0x40e8f5c3    # -0.59f

    .line 699
    .line 700
    .line 701
    const v22, -0x413d70a4    # -0.38f

    .line 702
    .line 703
    .line 704
    const v23, -0x413d70a4    # -0.38f

    .line 705
    .line 706
    .line 707
    const v24, -0x409c28f6    # -0.89f

    .line 708
    .line 709
    .line 710
    const v25, -0x40e8f5c3    # -0.59f

    .line 711
    .line 712
    .line 713
    invoke-virtual/range {v21 .. v27}, Lbe5;->e(FFFFFF)V

    .line 714
    .line 715
    .line 716
    move-object/from16 v14, v21

    .line 717
    .line 718
    const/high16 v15, 0x40c00000    # 6.0f

    .line 719
    .line 720
    invoke-virtual {v14, v15, v9}, Lbe5;->h(FF)V

    .line 721
    .line 722
    .line 723
    const/high16 v26, -0x40000000    # -2.0f

    .line 724
    .line 725
    const/high16 v27, 0x40000000    # 2.0f

    .line 726
    .line 727
    const v22, -0x40733333    # -1.1f

    .line 728
    .line 729
    .line 730
    const/16 v23, 0x0

    .line 731
    .line 732
    const/high16 v24, -0x40000000    # -2.0f

    .line 733
    .line 734
    const v25, 0x3f666666    # 0.9f

    .line 735
    .line 736
    .line 737
    invoke-virtual/range {v21 .. v27}, Lbe5;->e(FFFFFF)V

    .line 738
    .line 739
    .line 740
    invoke-virtual {v14, v1}, Lbe5;->n(F)V

    .line 741
    .line 742
    .line 743
    const v26, 0x3ffeb852    # 1.99f

    .line 744
    .line 745
    .line 746
    const/16 v22, 0x0

    .line 747
    .line 748
    const v23, 0x3f8ccccd    # 1.1f

    .line 749
    .line 750
    .line 751
    const v24, 0x3f63d70a    # 0.89f

    .line 752
    .line 753
    .line 754
    const/high16 v25, 0x40000000    # 2.0f

    .line 755
    .line 756
    invoke-virtual/range {v21 .. v27}, Lbe5;->e(FFFFFF)V

    .line 757
    .line 758
    .line 759
    const/high16 v1, 0x41b00000    # 22.0f

    .line 760
    .line 761
    const/high16 v15, 0x41900000    # 18.0f

    .line 762
    .line 763
    invoke-virtual {v14, v15, v1}, Lbe5;->h(FF)V

    .line 764
    .line 765
    .line 766
    const/high16 v26, 0x40000000    # 2.0f

    .line 767
    .line 768
    const/high16 v27, -0x40000000    # -2.0f

    .line 769
    .line 770
    const v22, 0x3f8ccccd    # 1.1f

    .line 771
    .line 772
    .line 773
    const/16 v23, 0x0

    .line 774
    .line 775
    const/high16 v24, 0x40000000    # 2.0f

    .line 776
    .line 777
    const v25, -0x4099999a    # -0.9f

    .line 778
    .line 779
    .line 780
    invoke-virtual/range {v21 .. v27}, Lbe5;->e(FFFFFF)V

    .line 781
    .line 782
    .line 783
    const/high16 v1, 0x41a00000    # 20.0f

    .line 784
    .line 785
    const v15, 0x410d47ae    # 8.83f

    .line 786
    .line 787
    .line 788
    invoke-virtual {v14, v1, v15}, Lbe5;->h(FF)V

    .line 789
    .line 790
    .line 791
    const v26, -0x40e8f5c3    # -0.59f

    .line 792
    .line 793
    .line 794
    const v27, -0x404b851f    # -1.41f

    .line 795
    .line 796
    .line 797
    const/16 v22, 0x0

    .line 798
    .line 799
    const v23, -0x40f851ec    # -0.53f

    .line 800
    .line 801
    .line 802
    const v24, -0x41a8f5c3    # -0.21f

    .line 803
    .line 804
    .line 805
    const v25, -0x407ae148    # -1.04f

    .line 806
    .line 807
    .line 808
    invoke-virtual/range {v21 .. v27}, Lbe5;->e(FFFFFF)V

    .line 809
    .line 810
    .line 811
    const v1, -0x3f65c28f    # -4.82f

    .line 812
    .line 813
    .line 814
    const v15, -0x3f6570a4    # -4.83f

    .line 815
    .line 816
    .line 817
    invoke-virtual {v14, v1, v15}, Lbe5;->i(FF)V

    .line 818
    .line 819
    .line 820
    invoke-virtual {v14}, Lbe5;->c()V

    .line 821
    .line 822
    .line 823
    const/high16 v1, 0x41700000    # 15.0f

    .line 824
    .line 825
    const/high16 v15, 0x41900000    # 18.0f

    .line 826
    .line 827
    invoke-virtual {v14, v1, v15}, Lbe5;->j(FF)V

    .line 828
    .line 829
    .line 830
    const/high16 v1, 0x41900000    # 18.0f

    .line 831
    .line 832
    invoke-virtual {v14, v11, v1}, Lbe5;->h(FF)V

    .line 833
    .line 834
    .line 835
    const/high16 v26, -0x40800000    # -1.0f

    .line 836
    .line 837
    const/high16 v27, -0x40800000    # -1.0f

    .line 838
    .line 839
    const v22, -0x40f33333    # -0.55f

    .line 840
    .line 841
    .line 842
    const/16 v23, 0x0

    .line 843
    .line 844
    const/high16 v24, -0x40800000    # -1.0f

    .line 845
    .line 846
    const v25, -0x4119999a    # -0.45f

    .line 847
    .line 848
    .line 849
    invoke-virtual/range {v21 .. v27}, Lbe5;->e(FFFFFF)V

    .line 850
    .line 851
    .line 852
    const v1, 0x3ee66666    # 0.45f

    .line 853
    .line 854
    .line 855
    invoke-virtual {v14, v1, v7, v10, v7}, Lbe5;->l(FFFF)V

    .line 856
    .line 857
    .line 858
    const/high16 v1, 0x40c00000    # 6.0f

    .line 859
    .line 860
    invoke-virtual {v14, v1}, Lbe5;->g(F)V

    .line 861
    .line 862
    .line 863
    const/high16 v26, 0x3f800000    # 1.0f

    .line 864
    .line 865
    const/high16 v27, 0x3f800000    # 1.0f

    .line 866
    .line 867
    const v22, 0x3f0ccccd    # 0.55f

    .line 868
    .line 869
    .line 870
    const/high16 v24, 0x3f800000    # 1.0f

    .line 871
    .line 872
    const v25, 0x3ee66666    # 0.45f

    .line 873
    .line 874
    .line 875
    invoke-virtual/range {v21 .. v27}, Lbe5;->e(FFFFFF)V

    .line 876
    .line 877
    .line 878
    invoke-virtual {v14, v8, v10, v7, v10}, Lbe5;->l(FFFF)V

    .line 879
    .line 880
    .line 881
    const/high16 v1, 0x41700000    # 15.0f

    .line 882
    .line 883
    invoke-static {v14, v1, v12, v11, v12}, Lb81;->v(Lbe5;FFFF)V

    .line 884
    .line 885
    .line 886
    const/high16 v26, -0x40800000    # -1.0f

    .line 887
    .line 888
    const/high16 v27, -0x40800000    # -1.0f

    .line 889
    .line 890
    const v22, -0x40f33333    # -0.55f

    .line 891
    .line 892
    .line 893
    const/high16 v24, -0x40800000    # -1.0f

    .line 894
    .line 895
    const v25, -0x4119999a    # -0.45f

    .line 896
    .line 897
    .line 898
    invoke-virtual/range {v21 .. v27}, Lbe5;->e(FFFFFF)V

    .line 899
    .line 900
    .line 901
    const v1, 0x3ee66666    # 0.45f

    .line 902
    .line 903
    .line 904
    invoke-virtual {v14, v1, v7, v10, v7}, Lbe5;->l(FFFF)V

    .line 905
    .line 906
    .line 907
    const/high16 v1, 0x40c00000    # 6.0f

    .line 908
    .line 909
    invoke-virtual {v14, v1}, Lbe5;->g(F)V

    .line 910
    .line 911
    .line 912
    const/high16 v26, 0x3f800000    # 1.0f

    .line 913
    .line 914
    const/high16 v27, 0x3f800000    # 1.0f

    .line 915
    .line 916
    const v22, 0x3f0ccccd    # 0.55f

    .line 917
    .line 918
    .line 919
    const/high16 v24, 0x3f800000    # 1.0f

    .line 920
    .line 921
    const v25, 0x3ee66666    # 0.45f

    .line 922
    .line 923
    .line 924
    invoke-virtual/range {v21 .. v27}, Lbe5;->e(FFFFFF)V

    .line 925
    .line 926
    .line 927
    invoke-virtual {v14, v8, v10, v7, v10}, Lbe5;->l(FFFF)V

    .line 928
    .line 929
    .line 930
    const/high16 v1, 0x40600000    # 3.5f

    .line 931
    .line 932
    const/high16 v7, 0x41000000    # 8.0f

    .line 933
    .line 934
    invoke-static {v14, v6, v7, v6, v1}, Lb81;->v(Lbe5;FFFF)V

    .line 935
    .line 936
    .line 937
    const/high16 v1, 0x41940000    # 18.5f

    .line 938
    .line 939
    invoke-virtual {v14, v1, v11}, Lbe5;->h(FF)V

    .line 940
    .line 941
    .line 942
    invoke-virtual {v14, v12, v11}, Lbe5;->h(FF)V

    .line 943
    .line 944
    .line 945
    const/high16 v26, -0x40800000    # -1.0f

    .line 946
    .line 947
    const/high16 v27, -0x40800000    # -1.0f

    .line 948
    .line 949
    const v22, -0x40f33333    # -0.55f

    .line 950
    .line 951
    .line 952
    const/high16 v24, -0x40800000    # -1.0f

    .line 953
    .line 954
    const v25, -0x4119999a    # -0.45f

    .line 955
    .line 956
    .line 957
    invoke-virtual/range {v21 .. v27}, Lbe5;->e(FFFFFF)V

    .line 958
    .line 959
    .line 960
    invoke-virtual {v14}, Lbe5;->c()V

    .line 961
    .line 962
    .line 963
    iget-object v1, v14, Lbe5;->a:Ljava/util/ArrayList;

    .line 964
    .line 965
    const/16 v7, 0x3800

    .line 966
    .line 967
    invoke-static {v5, v1, v13, v7}, Lw83;->a(Lw83;Ljava/util/List;Lky6;I)V

    .line 968
    .line 969
    .line 970
    invoke-virtual {v5}, Lw83;->b()Lx83;

    .line 971
    .line 972
    .line 973
    move-result-object v5

    .line 974
    sput-object v5, Lx91;->q:Lx83;

    .line 975
    .line 976
    :goto_5
    const v1, 0x7f11044a

    .line 977
    .line 978
    .line 979
    invoke-static {v1, v4}, Ll55;->u(ILyt2;)Ljava/lang/String;

    .line 980
    .line 981
    .line 982
    move-result-object v1

    .line 983
    iget-object v7, v0, Lw78;->a:Ljava/lang/String;

    .line 984
    .line 985
    const/4 v15, 0x0

    .line 986
    invoke-static {v5, v1, v7, v4, v15}, Lb88;->b(Lx83;Ljava/lang/String;Ljava/lang/String;Lyt2;I)V

    .line 987
    .line 988
    .line 989
    iget-object v1, v0, Lw78;->b:Ljava/lang/String;

    .line 990
    .line 991
    const/high16 v5, 0x41200000    # 10.0f

    .line 992
    .line 993
    if-nez v1, :cond_7

    .line 994
    .line 995
    const v1, 0x73af8243

    .line 996
    .line 997
    .line 998
    invoke-virtual {v4, v1}, Lyt2;->e0(I)V

    .line 999
    .line 1000
    .line 1001
    invoke-virtual {v4, v15}, Lyt2;->r(Z)V

    .line 1002
    .line 1003
    .line 1004
    goto :goto_6

    .line 1005
    :cond_7
    const v7, 0x73af8244

    .line 1006
    .line 1007
    .line 1008
    invoke-virtual {v4, v7}, Lyt2;->e0(I)V

    .line 1009
    .line 1010
    .line 1011
    invoke-static {v3, v5}, Lyu6;->d(Lml4;F)Lml4;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v7

    .line 1015
    invoke-static {v4, v7}, Lk75;->a(Lyt2;Lml4;)V

    .line 1016
    .line 1017
    .line 1018
    invoke-static {}, Li35;->h()Lx83;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v7

    .line 1022
    const v8, 0x7f110450

    .line 1023
    .line 1024
    .line 1025
    invoke-static {v8, v4}, Ll55;->u(ILyt2;)Ljava/lang/String;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v8

    .line 1029
    invoke-static {v7, v8, v1, v4, v15}, Lb88;->b(Lx83;Ljava/lang/String;Ljava/lang/String;Lyt2;I)V

    .line 1030
    .line 1031
    .line 1032
    invoke-virtual {v4, v15}, Lyt2;->r(Z)V

    .line 1033
    .line 1034
    .line 1035
    :goto_6
    iget-object v0, v0, Lw78;->c:Ljava/lang/String;

    .line 1036
    .line 1037
    if-nez v0, :cond_8

    .line 1038
    .line 1039
    const v0, 0x73b56ce7

    .line 1040
    .line 1041
    .line 1042
    invoke-virtual {v4, v0}, Lyt2;->e0(I)V

    .line 1043
    .line 1044
    .line 1045
    invoke-virtual {v4, v15}, Lyt2;->r(Z)V

    .line 1046
    .line 1047
    .line 1048
    :goto_7
    const/4 v0, 0x1

    .line 1049
    goto/16 :goto_9

    .line 1050
    .line 1051
    :cond_8
    const v1, 0x73b56ce8

    .line 1052
    .line 1053
    .line 1054
    invoke-virtual {v4, v1}, Lyt2;->e0(I)V

    .line 1055
    .line 1056
    .line 1057
    invoke-static {v3, v5}, Lyu6;->d(Lml4;F)Lml4;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v1

    .line 1061
    invoke-static {v4, v1}, Lk75;->a(Lyt2;Lml4;)V

    .line 1062
    .line 1063
    .line 1064
    sget-object v1, Lkl8;->u:Lx83;

    .line 1065
    .line 1066
    if-eqz v1, :cond_9

    .line 1067
    .line 1068
    goto/16 :goto_8

    .line 1069
    .line 1070
    :cond_9
    new-instance v20, Lw83;

    .line 1071
    .line 1072
    const/16 v28, 0x0

    .line 1073
    .line 1074
    const/16 v30, 0x60

    .line 1075
    .line 1076
    const/16 v29, 0x0

    .line 1077
    .line 1078
    const/high16 v22, 0x41c00000    # 24.0f

    .line 1079
    .line 1080
    const/high16 v23, 0x41c00000    # 24.0f

    .line 1081
    .line 1082
    const/high16 v24, 0x41c00000    # 24.0f

    .line 1083
    .line 1084
    const/high16 v25, 0x41c00000    # 24.0f

    .line 1085
    .line 1086
    const-wide/16 v26, 0x0

    .line 1087
    .line 1088
    const-string v21, "Rounded.Dns"

    .line 1089
    .line 1090
    invoke-direct/range {v20 .. v30}, Lw83;-><init>(Ljava/lang/String;FFFFJIZI)V

    .line 1091
    .line 1092
    .line 1093
    move-object/from16 v1, v20

    .line 1094
    .line 1095
    sget v3, Le38;->a:I

    .line 1096
    .line 1097
    new-instance v3, Lky6;

    .line 1098
    .line 1099
    sget-wide v7, Ljt0;->b:J

    .line 1100
    .line 1101
    invoke-direct {v3, v7, v8}, Lky6;-><init>(J)V

    .line 1102
    .line 1103
    .line 1104
    new-instance v5, Lbe5;

    .line 1105
    .line 1106
    invoke-direct {v5}, Lbe5;-><init>()V

    .line 1107
    .line 1108
    .line 1109
    const/high16 v7, 0x41980000    # 19.0f

    .line 1110
    .line 1111
    invoke-virtual {v5, v7, v6}, Lbe5;->j(FF)V

    .line 1112
    .line 1113
    .line 1114
    const/high16 v6, 0x40a00000    # 5.0f

    .line 1115
    .line 1116
    invoke-virtual {v5, v6}, Lbe5;->f(F)V

    .line 1117
    .line 1118
    .line 1119
    const/high16 v25, -0x40000000    # -2.0f

    .line 1120
    .line 1121
    const/high16 v26, 0x40000000    # 2.0f

    .line 1122
    .line 1123
    const v21, -0x40733333    # -1.1f

    .line 1124
    .line 1125
    .line 1126
    const/16 v22, 0x0

    .line 1127
    .line 1128
    const/high16 v23, -0x40000000    # -2.0f

    .line 1129
    .line 1130
    const v24, 0x3f666666    # 0.9f

    .line 1131
    .line 1132
    .line 1133
    move-object/from16 v20, v5

    .line 1134
    .line 1135
    invoke-virtual/range {v20 .. v26}, Lbe5;->e(FFFFFF)V

    .line 1136
    .line 1137
    .line 1138
    const/high16 v6, 0x40800000    # 4.0f

    .line 1139
    .line 1140
    invoke-virtual {v5, v6}, Lbe5;->n(F)V

    .line 1141
    .line 1142
    .line 1143
    const/high16 v25, 0x40000000    # 2.0f

    .line 1144
    .line 1145
    const/16 v21, 0x0

    .line 1146
    .line 1147
    const v22, 0x3f8ccccd    # 1.1f

    .line 1148
    .line 1149
    .line 1150
    const v23, 0x3f666666    # 0.9f

    .line 1151
    .line 1152
    .line 1153
    const/high16 v24, 0x40000000    # 2.0f

    .line 1154
    .line 1155
    invoke-virtual/range {v20 .. v26}, Lbe5;->e(FFFFFF)V

    .line 1156
    .line 1157
    .line 1158
    invoke-virtual {v5, v12}, Lbe5;->g(F)V

    .line 1159
    .line 1160
    .line 1161
    const/high16 v26, -0x40000000    # -2.0f

    .line 1162
    .line 1163
    const v21, 0x3f8ccccd    # 1.1f

    .line 1164
    .line 1165
    .line 1166
    const/16 v22, 0x0

    .line 1167
    .line 1168
    const/high16 v23, 0x40000000    # 2.0f

    .line 1169
    .line 1170
    const v24, -0x4099999a    # -0.9f

    .line 1171
    .line 1172
    .line 1173
    invoke-virtual/range {v20 .. v26}, Lbe5;->e(FFFFFF)V

    .line 1174
    .line 1175
    .line 1176
    const/high16 v6, -0x3f800000    # -4.0f

    .line 1177
    .line 1178
    invoke-virtual {v5, v6}, Lbe5;->n(F)V

    .line 1179
    .line 1180
    .line 1181
    const/high16 v25, -0x40000000    # -2.0f

    .line 1182
    .line 1183
    const/16 v21, 0x0

    .line 1184
    .line 1185
    const v22, -0x40733333    # -1.1f

    .line 1186
    .line 1187
    .line 1188
    const v23, -0x4099999a    # -0.9f

    .line 1189
    .line 1190
    .line 1191
    const/high16 v24, -0x40000000    # -2.0f

    .line 1192
    .line 1193
    invoke-virtual/range {v20 .. v26}, Lbe5;->e(FFFFFF)V

    .line 1194
    .line 1195
    .line 1196
    invoke-virtual {v5}, Lbe5;->c()V

    .line 1197
    .line 1198
    .line 1199
    const/high16 v6, 0x40e00000    # 7.0f

    .line 1200
    .line 1201
    invoke-virtual {v5, v6, v7}, Lbe5;->j(FF)V

    .line 1202
    .line 1203
    .line 1204
    const v21, -0x40733333    # -1.1f

    .line 1205
    .line 1206
    .line 1207
    const/16 v22, 0x0

    .line 1208
    .line 1209
    const/high16 v23, -0x40000000    # -2.0f

    .line 1210
    .line 1211
    const v24, -0x4099999a    # -0.9f

    .line 1212
    .line 1213
    .line 1214
    invoke-virtual/range {v20 .. v26}, Lbe5;->e(FFFFFF)V

    .line 1215
    .line 1216
    .line 1217
    const v6, 0x3f666666    # 0.9f

    .line 1218
    .line 1219
    .line 1220
    const/high16 v7, -0x40000000    # -2.0f

    .line 1221
    .line 1222
    invoke-virtual {v5, v6, v7, v9, v7}, Lbe5;->l(FFFF)V

    .line 1223
    .line 1224
    .line 1225
    invoke-virtual {v5, v9, v6, v9, v9}, Lbe5;->l(FFFF)V

    .line 1226
    .line 1227
    .line 1228
    const v6, -0x4099999a    # -0.9f

    .line 1229
    .line 1230
    .line 1231
    invoke-virtual {v5, v6, v9, v7, v9}, Lbe5;->l(FFFF)V

    .line 1232
    .line 1233
    .line 1234
    invoke-virtual {v5}, Lbe5;->c()V

    .line 1235
    .line 1236
    .line 1237
    const/high16 v6, 0x41980000    # 19.0f

    .line 1238
    .line 1239
    const/high16 v7, 0x40400000    # 3.0f

    .line 1240
    .line 1241
    invoke-virtual {v5, v6, v7}, Lbe5;->j(FF)V

    .line 1242
    .line 1243
    .line 1244
    const/high16 v6, 0x40a00000    # 5.0f

    .line 1245
    .line 1246
    invoke-virtual {v5, v6}, Lbe5;->f(F)V

    .line 1247
    .line 1248
    .line 1249
    const/high16 v26, 0x40000000    # 2.0f

    .line 1250
    .line 1251
    const v24, 0x3f666666    # 0.9f

    .line 1252
    .line 1253
    .line 1254
    invoke-virtual/range {v20 .. v26}, Lbe5;->e(FFFFFF)V

    .line 1255
    .line 1256
    .line 1257
    const/high16 v6, 0x40800000    # 4.0f

    .line 1258
    .line 1259
    invoke-virtual {v5, v6}, Lbe5;->n(F)V

    .line 1260
    .line 1261
    .line 1262
    const/high16 v25, 0x40000000    # 2.0f

    .line 1263
    .line 1264
    const/16 v21, 0x0

    .line 1265
    .line 1266
    const v22, 0x3f8ccccd    # 1.1f

    .line 1267
    .line 1268
    .line 1269
    const v23, 0x3f666666    # 0.9f

    .line 1270
    .line 1271
    .line 1272
    const/high16 v24, 0x40000000    # 2.0f

    .line 1273
    .line 1274
    invoke-virtual/range {v20 .. v26}, Lbe5;->e(FFFFFF)V

    .line 1275
    .line 1276
    .line 1277
    invoke-virtual {v5, v12}, Lbe5;->g(F)V

    .line 1278
    .line 1279
    .line 1280
    const/high16 v26, -0x40000000    # -2.0f

    .line 1281
    .line 1282
    const v21, 0x3f8ccccd    # 1.1f

    .line 1283
    .line 1284
    .line 1285
    const/16 v22, 0x0

    .line 1286
    .line 1287
    const/high16 v23, 0x40000000    # 2.0f

    .line 1288
    .line 1289
    const v24, -0x4099999a    # -0.9f

    .line 1290
    .line 1291
    .line 1292
    invoke-virtual/range {v20 .. v26}, Lbe5;->e(FFFFFF)V

    .line 1293
    .line 1294
    .line 1295
    const/high16 v6, 0x40a00000    # 5.0f

    .line 1296
    .line 1297
    invoke-virtual {v5, v6}, Lbe5;->m(F)V

    .line 1298
    .line 1299
    .line 1300
    const/high16 v25, -0x40000000    # -2.0f

    .line 1301
    .line 1302
    const/16 v21, 0x0

    .line 1303
    .line 1304
    const v22, -0x40733333    # -1.1f

    .line 1305
    .line 1306
    .line 1307
    const v23, -0x4099999a    # -0.9f

    .line 1308
    .line 1309
    .line 1310
    const/high16 v24, -0x40000000    # -2.0f

    .line 1311
    .line 1312
    invoke-virtual/range {v20 .. v26}, Lbe5;->e(FFFFFF)V

    .line 1313
    .line 1314
    .line 1315
    invoke-virtual {v5}, Lbe5;->c()V

    .line 1316
    .line 1317
    .line 1318
    const/high16 v6, 0x40e00000    # 7.0f

    .line 1319
    .line 1320
    invoke-virtual {v5, v6, v11}, Lbe5;->j(FF)V

    .line 1321
    .line 1322
    .line 1323
    const v21, -0x40733333    # -1.1f

    .line 1324
    .line 1325
    .line 1326
    const/16 v22, 0x0

    .line 1327
    .line 1328
    const/high16 v23, -0x40000000    # -2.0f

    .line 1329
    .line 1330
    const v24, -0x4099999a    # -0.9f

    .line 1331
    .line 1332
    .line 1333
    invoke-virtual/range {v20 .. v26}, Lbe5;->e(FFFFFF)V

    .line 1334
    .line 1335
    .line 1336
    const v6, 0x3f666666    # 0.9f

    .line 1337
    .line 1338
    .line 1339
    const/high16 v7, -0x40000000    # -2.0f

    .line 1340
    .line 1341
    invoke-virtual {v5, v6, v7, v9, v7}, Lbe5;->l(FFFF)V

    .line 1342
    .line 1343
    .line 1344
    invoke-virtual {v5, v9, v6, v9, v9}, Lbe5;->l(FFFF)V

    .line 1345
    .line 1346
    .line 1347
    const v6, -0x4099999a    # -0.9f

    .line 1348
    .line 1349
    .line 1350
    invoke-virtual {v5, v6, v9, v7, v9}, Lbe5;->l(FFFF)V

    .line 1351
    .line 1352
    .line 1353
    invoke-virtual {v5}, Lbe5;->c()V

    .line 1354
    .line 1355
    .line 1356
    iget-object v5, v5, Lbe5;->a:Ljava/util/ArrayList;

    .line 1357
    .line 1358
    const/16 v7, 0x3800

    .line 1359
    .line 1360
    invoke-static {v1, v5, v3, v7}, Lw83;->a(Lw83;Ljava/util/List;Lky6;I)V

    .line 1361
    .line 1362
    .line 1363
    invoke-virtual {v1}, Lw83;->b()Lx83;

    .line 1364
    .line 1365
    .line 1366
    move-result-object v1

    .line 1367
    sput-object v1, Lkl8;->u:Lx83;

    .line 1368
    .line 1369
    :goto_8
    const v3, 0x7f110447

    .line 1370
    .line 1371
    .line 1372
    invoke-static {v3, v4}, Ll55;->u(ILyt2;)Ljava/lang/String;

    .line 1373
    .line 1374
    .line 1375
    move-result-object v3

    .line 1376
    const/4 v15, 0x0

    .line 1377
    invoke-static {v1, v3, v0, v4, v15}, Lb88;->b(Lx83;Ljava/lang/String;Ljava/lang/String;Lyt2;I)V

    .line 1378
    .line 1379
    .line 1380
    invoke-virtual {v4, v15}, Lyt2;->r(Z)V

    .line 1381
    .line 1382
    .line 1383
    goto/16 :goto_7

    .line 1384
    .line 1385
    :goto_9
    invoke-virtual {v4, v0}, Lyt2;->r(Z)V

    .line 1386
    .line 1387
    .line 1388
    goto :goto_a

    .line 1389
    :cond_a
    invoke-virtual {v4}, Lyt2;->Y()V

    .line 1390
    .line 1391
    .line 1392
    :goto_a
    return-object v2

    .line 1393
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
.end method
