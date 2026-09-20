.class public abstract Lrl4;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lrl4;->a:Ljava/util/concurrent/ConcurrentHashMap;

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
.end method

.method public static final a(Ljava/lang/Class;)Lra6;
    .locals 46

    .line 1
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static/range {p0 .. p0}, Lm06;->d(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, Lm88;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Lm88;-><init>(Ljava/lang/ClassLoader;)V

    .line 11
    .line 12
    .line 13
    sget-object v2, Lrl4;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 20
    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, Lra6;

    .line 28
    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    return-object v4

    .line 32
    :cond_0
    invoke-virtual {v2, v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    :cond_1
    sget-object v21, Ld63;->E:Ld63;

    .line 36
    .line 37
    new-instance v3, Lrg4;

    .line 38
    .line 39
    const/4 v4, 0x5

    .line 40
    invoke-direct {v3, v4, v0}, Lrg4;-><init>(ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    new-instance v5, Lrg4;

    .line 44
    .line 45
    const-class v6, Lvs7;

    .line 46
    .line 47
    invoke-virtual {v6}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-direct {v5, v4, v6}, Lrg4;-><init>(ILjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    new-instance v4, Ly06;

    .line 58
    .line 59
    invoke-direct {v4, v0}, Ly06;-><init>(Ljava/lang/ClassLoader;)V

    .line 60
    .line 61
    .line 62
    new-instance v6, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v7, "runtime module for "

    .line 65
    .line 66
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    sget-object v11, Lme6;->K:Lme6;

    .line 77
    .line 78
    sget-object v31, Ltd0;->L:Ltd0;

    .line 79
    .line 80
    new-instance v6, Lkb4;

    .line 81
    .line 82
    const-string v7, "DeserializationComponentsForJava.ModuleData"

    .line 83
    .line 84
    invoke-direct {v6, v7}, Lkb4;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    new-instance v7, Lun3;

    .line 88
    .line 89
    invoke-direct {v7, v6}, Lun3;-><init>(Lkb4;)V

    .line 90
    .line 91
    .line 92
    new-instance v8, Ltl4;

    .line 93
    .line 94
    new-instance v9, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    const-string v10, "<"

    .line 97
    .line 98
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const/16 v0, 0x3e

    .line 105
    .line 106
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-static {v0}, Luq4;->g(Ljava/lang/String;)Luq4;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    const/16 v9, 0x38

    .line 118
    .line 119
    invoke-direct {v8, v0, v6, v7, v9}, Ltl4;-><init>(Luq4;Lkb4;Lfv3;I)V

    .line 120
    .line 121
    .line 122
    iget-object v9, v6, Lkb4;->a:Ldu6;

    .line 123
    .line 124
    invoke-interface {v9}, Ldu6;->lock()V

    .line 125
    .line 126
    .line 127
    :try_start_0
    iget-object v0, v7, Lfv3;->a:Ltl4;

    .line 128
    .line 129
    if-nez v0, :cond_9

    .line 130
    .line 131
    iput-object v8, v7, Lfv3;->a:Ltl4;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 132
    .line 133
    invoke-interface {v9}, Ldu6;->unlock()V

    .line 134
    .line 135
    .line 136
    new-instance v0, Lsn3;

    .line 137
    .line 138
    const/4 v9, 0x0

    .line 139
    invoke-direct {v0, v8, v9}, Lsn3;-><init>(Ltl4;I)V

    .line 140
    .line 141
    .line 142
    iput-object v0, v7, Lun3;->f:Lsn3;

    .line 143
    .line 144
    new-instance v26, Lkt1;

    .line 145
    .line 146
    invoke-direct/range {v26 .. v26}, Ljava/lang/Object;-><init>()V

    .line 147
    .line 148
    .line 149
    new-instance v0, Lrg4;

    .line 150
    .line 151
    const/16 v10, 0x8

    .line 152
    .line 153
    invoke-direct {v0, v10, v9}, Lrg4;-><init>(IZ)V

    .line 154
    .line 155
    .line 156
    new-instance v14, Lam6;

    .line 157
    .line 158
    invoke-direct {v14, v6, v8}, Lam6;-><init>(Lkb4;Lsl4;)V

    .line 159
    .line 160
    .line 161
    sget-object v33, Lhz2;->H:Lhz2;

    .line 162
    .line 163
    new-instance v10, Lcx3;

    .line 164
    .line 165
    const/16 v12, 0x9

    .line 166
    .line 167
    const/4 v13, 0x1

    .line 168
    invoke-direct {v10, v13, v12, v9}, Lcx3;-><init>(III)V

    .line 169
    .line 170
    .line 171
    new-instance v12, Lzc9;

    .line 172
    .line 173
    sget-object v15, Lmj3;->d:Lnj3;

    .line 174
    .line 175
    iget-object v9, v15, Lnj3;->b:Lcx3;

    .line 176
    .line 177
    if-eqz v9, :cond_2

    .line 178
    .line 179
    iget v9, v9, Lcx3;->y:I

    .line 180
    .line 181
    iget v13, v10, Lcx3;->y:I

    .line 182
    .line 183
    sub-int/2addr v9, v13

    .line 184
    if-gtz v9, :cond_2

    .line 185
    .line 186
    iget-object v9, v15, Lnj3;->c:Lx46;

    .line 187
    .line 188
    goto :goto_0

    .line 189
    :cond_2
    iget-object v9, v15, Lnj3;->a:Lx46;

    .line 190
    .line 191
    :goto_0
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    sget-object v13, Lx46;->y:Lx46;

    .line 195
    .line 196
    if-ne v9, v13, :cond_3

    .line 197
    .line 198
    const/4 v13, 0x0

    .line 199
    goto :goto_1

    .line 200
    :cond_3
    move-object v13, v9

    .line 201
    :goto_1
    new-instance v15, Lln3;

    .line 202
    .line 203
    invoke-direct {v15, v9, v13}, Lln3;-><init>(Lx46;Lx46;)V

    .line 204
    .line 205
    .line 206
    new-instance v9, Lb0;

    .line 207
    .line 208
    const/16 v13, 0x11

    .line 209
    .line 210
    invoke-direct {v9, v13, v10}, Lb0;-><init>(ILjava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    invoke-direct {v12, v15, v9}, Lzc9;-><init>(Lln3;Lb0;)V

    .line 214
    .line 215
    .line 216
    new-instance v22, Lpj3;

    .line 217
    .line 218
    sget-object v27, Lpe2;->N:Lpe2;

    .line 219
    .line 220
    sget-object v29, Lhz2;->D:Lhz2;

    .line 221
    .line 222
    new-instance v9, Ln63;

    .line 223
    .line 224
    invoke-direct {v9, v6}, Ln63;-><init>(Lkb4;)V

    .line 225
    .line 226
    .line 227
    sget-object v34, Lpe2;->O:Lpe2;

    .line 228
    .line 229
    sget-object v35, Lpe2;->H:Lpe2;

    .line 230
    .line 231
    new-instance v10, Lf26;

    .line 232
    .line 233
    invoke-direct {v10, v8, v14}, Lf26;-><init>(Ltl4;Lam6;)V

    .line 234
    .line 235
    .line 236
    new-instance v13, Llm;

    .line 237
    .line 238
    invoke-direct {v13, v12}, Llm;-><init>(Lzc9;)V

    .line 239
    .line 240
    .line 241
    new-instance v15, Lhr2;

    .line 242
    .line 243
    move-object/from16 v32, v0

    .line 244
    .line 245
    new-instance v0, Ls63;

    .line 246
    .line 247
    sget-object v41, Lxb4;->T:Lxb4;

    .line 248
    .line 249
    move-object/from16 v25, v3

    .line 250
    .line 251
    const/4 v3, 0x1

    .line 252
    invoke-direct {v0, v3}, Ls63;-><init>(I)V

    .line 253
    .line 254
    .line 255
    invoke-direct {v15, v0}, Lhr2;-><init>(Ls63;)V

    .line 256
    .line 257
    .line 258
    sget-object v40, Lg22;->B:Lg22;

    .line 259
    .line 260
    sget-object v0, Lkz4;->b:Ljz4;

    .line 261
    .line 262
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    sget-object v18, Ljz4;->b:Llz4;

    .line 266
    .line 267
    new-instance v0, Lpe2;

    .line 268
    .line 269
    const/16 v3, 0x1b

    .line 270
    .line 271
    invoke-direct {v0, v3}, Lpe2;-><init>(I)V

    .line 272
    .line 273
    .line 274
    move-object/from16 v44, v0

    .line 275
    .line 276
    move-object/from16 v24, v4

    .line 277
    .line 278
    move-object/from16 v23, v6

    .line 279
    .line 280
    move-object/from16 v36, v8

    .line 281
    .line 282
    move-object/from16 v30, v9

    .line 283
    .line 284
    move-object/from16 v37, v10

    .line 285
    .line 286
    move-object/from16 v28, v11

    .line 287
    .line 288
    move-object/from16 v43, v12

    .line 289
    .line 290
    move-object/from16 v38, v13

    .line 291
    .line 292
    move-object/from16 v39, v15

    .line 293
    .line 294
    move-object/from16 v42, v18

    .line 295
    .line 296
    invoke-direct/range {v22 .. v44}, Lpj3;-><init>(Lkb4;Ly06;Lrg4;Lkt1;Lpe2;Lr62;Lhz2;Ln63;Ltd0;Lrg4;Lhz2;Lpe2;Lpe2;Lsl4;Lf26;Llm;Lhr2;Lg22;Lxb4;Lkz4;Lzc9;Lpe2;)V

    .line 297
    .line 298
    .line 299
    move-object v3, v7

    .line 300
    move-object/from16 v8, v22

    .line 301
    .line 302
    move-object/from16 v0, v25

    .line 303
    .line 304
    move-object/from16 v4, v26

    .line 305
    .line 306
    move-object/from16 v7, v36

    .line 307
    .line 308
    new-instance v10, Ld14;

    .line 309
    .line 310
    invoke-direct {v10, v8}, Ld14;-><init>(Lpj3;)V

    .line 311
    .line 312
    .line 313
    sget-object v8, Lrk4;->g:Lrk4;

    .line 314
    .line 315
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    new-instance v9, Lhv2;

    .line 319
    .line 320
    const/4 v12, 0x6

    .line 321
    invoke-direct {v9, v12, v0, v4}, Lhv2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    move-object v12, v9

    .line 325
    new-instance v9, Lkd6;

    .line 326
    .line 327
    invoke-direct {v9, v7, v14, v6, v0}, Lkd6;-><init>(Ltl4;Lam6;Lkb4;Lrg4;)V

    .line 328
    .line 329
    .line 330
    iput-object v8, v9, Lkd6;->C:Ljava/lang/Object;

    .line 331
    .line 332
    sget-object v8, Lgo1;->a:Lgo1;

    .line 333
    .line 334
    invoke-static {v8}, Lsg3;->D(Ljava/lang/Object;)Ljava/util/List;

    .line 335
    .line 336
    .line 337
    move-result-object v20

    .line 338
    iget-object v8, v7, Ltl4;->z:Lfv3;

    .line 339
    .line 340
    instance-of v13, v8, Lun3;

    .line 341
    .line 342
    if-eqz v13, :cond_4

    .line 343
    .line 344
    move-object v15, v8

    .line 345
    check-cast v15, Lun3;

    .line 346
    .line 347
    :goto_2
    move-object v8, v5

    .line 348
    goto :goto_3

    .line 349
    :cond_4
    const/4 v15, 0x0

    .line 350
    goto :goto_2

    .line 351
    :goto_3
    new-instance v5, Lws1;

    .line 352
    .line 353
    move-object v13, v8

    .line 354
    move-object v8, v12

    .line 355
    sget-object v12, Lpe2;->F:Lpe2;

    .line 356
    .line 357
    if-eqz v15, :cond_5

    .line 358
    .line 359
    invoke-virtual {v15}, Lun3;->K()Lxn3;

    .line 360
    .line 361
    .line 362
    move-result-object v17

    .line 363
    if-eqz v17, :cond_5

    .line 364
    .line 365
    goto :goto_4

    .line 366
    :cond_5
    sget-object v17, Lpe2;->x:Lpe2;

    .line 367
    .line 368
    :goto_4
    if-eqz v15, :cond_6

    .line 369
    .line 370
    invoke-virtual {v15}, Lun3;->K()Lxn3;

    .line 371
    .line 372
    .line 373
    move-result-object v15

    .line 374
    if-eqz v15, :cond_6

    .line 375
    .line 376
    :goto_5
    move-object/from16 v19, v17

    .line 377
    .line 378
    goto :goto_6

    .line 379
    :cond_6
    sget-object v15, Ltd0;->J:Ltd0;

    .line 380
    .line 381
    goto :goto_5

    .line 382
    :goto_6
    sget-object v17, Lrp3;->a:Ly92;

    .line 383
    .line 384
    move-object/from16 v22, v3

    .line 385
    .line 386
    new-instance v3, Ln63;

    .line 387
    .line 388
    invoke-direct {v3, v6}, Ln63;-><init>(Lkb4;)V

    .line 389
    .line 390
    .line 391
    move-object/from16 v23, v13

    .line 392
    .line 393
    sget-object v13, La42;->w:La42;

    .line 394
    .line 395
    move-object/from16 p0, v1

    .line 396
    .line 397
    move-object/from16 v16, v15

    .line 398
    .line 399
    move-object/from16 v15, v19

    .line 400
    .line 401
    move-object/from16 v1, v32

    .line 402
    .line 403
    const/16 v24, 0x0

    .line 404
    .line 405
    move-object/from16 v19, v3

    .line 406
    .line 407
    move-object/from16 v3, v23

    .line 408
    .line 409
    const/16 v23, 0x1

    .line 410
    .line 411
    invoke-direct/range {v5 .. v21}, Lws1;-><init>(Lkb4;Lsl4;Lyp0;Lzl;Lba5;Lr62;Lpe2;Ljava/lang/Iterable;Lam6;Lu9;Lgj5;Ly92;Lkz4;Ln63;Ljava/util/List;Lv52;)V

    .line 412
    .line 413
    .line 414
    iput-object v5, v4, Lkt1;->a:Lws1;

    .line 415
    .line 416
    new-instance v8, Lns8;

    .line 417
    .line 418
    const/16 v9, 0x18

    .line 419
    .line 420
    invoke-direct {v8, v9, v10}, Lns8;-><init>(ILjava/lang/Object;)V

    .line 421
    .line 422
    .line 423
    iput-object v8, v1, Lrg4;->x:Ljava/lang/Object;

    .line 424
    .line 425
    new-instance v1, Lzn3;

    .line 426
    .line 427
    invoke-virtual/range {v22 .. v22}, Lun3;->K()Lxn3;

    .line 428
    .line 429
    .line 430
    move-result-object v40

    .line 431
    invoke-virtual/range {v22 .. v22}, Lun3;->K()Lxn3;

    .line 432
    .line 433
    .line 434
    move-result-object v41

    .line 435
    new-instance v8, Ln63;

    .line 436
    .line 437
    invoke-direct {v8, v6}, Ln63;-><init>(Lkb4;)V

    .line 438
    .line 439
    .line 440
    invoke-virtual/range {v40 .. v40}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 441
    .line 442
    .line 443
    invoke-virtual/range {v41 .. v41}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 444
    .line 445
    .line 446
    invoke-direct {v1, v6, v3, v7}, Lzn3;-><init>(Lkb4;Lrg4;Ltl4;)V

    .line 447
    .line 448
    .line 449
    new-instance v32, Lws1;

    .line 450
    .line 451
    new-instance v3, Lwv2;

    .line 452
    .line 453
    const/16 v9, 0xf

    .line 454
    .line 455
    invoke-direct {v3, v9, v1}, Lwv2;-><init>(ILjava/lang/Object;)V

    .line 456
    .line 457
    .line 458
    new-instance v9, Lqc3;

    .line 459
    .line 460
    sget-object v11, Lmd0;->m:Lmd0;

    .line 461
    .line 462
    invoke-direct {v9, v7, v14, v11}, Lqc3;-><init>(Lsl4;Lam6;Lmd0;)V

    .line 463
    .line 464
    .line 465
    new-instance v12, Lkd0;

    .line 466
    .line 467
    invoke-direct {v12, v6, v7}, Lkd0;-><init>(Lkb4;Ltl4;)V

    .line 468
    .line 469
    .line 470
    new-instance v13, Lrn3;

    .line 471
    .line 472
    invoke-direct {v13, v6, v7}, Lrn3;-><init>(Lkb4;Ltl4;)V

    .line 473
    .line 474
    .line 475
    const/4 v15, 0x2

    .line 476
    move-object/from16 v37, v1

    .line 477
    .line 478
    new-array v1, v15, [Lbq0;

    .line 479
    .line 480
    aput-object v12, v1, v24

    .line 481
    .line 482
    aput-object v13, v1, v23

    .line 483
    .line 484
    invoke-static {v1}, Lsg3;->E([Ljava/lang/Object;)Ljava/util/List;

    .line 485
    .line 486
    .line 487
    move-result-object v38

    .line 488
    iget-object v1, v11, Lmd0;->a:Ly92;

    .line 489
    .line 490
    const/high16 v45, 0x40000

    .line 491
    .line 492
    move-object/from16 v42, v1

    .line 493
    .line 494
    move-object/from16 v35, v3

    .line 495
    .line 496
    move-object/from16 v33, v6

    .line 497
    .line 498
    move-object/from16 v34, v7

    .line 499
    .line 500
    move-object/from16 v44, v8

    .line 501
    .line 502
    move-object/from16 v36, v9

    .line 503
    .line 504
    move-object/from16 v39, v14

    .line 505
    .line 506
    move-object/from16 v43, v18

    .line 507
    .line 508
    invoke-direct/range {v32 .. v45}, Lws1;-><init>(Lkb4;Lsl4;Lwv2;Lqc3;Lba5;Ljava/lang/Iterable;Lam6;Lu9;Lgj5;Ly92;Lkz4;Ln63;I)V

    .line 509
    .line 510
    .line 511
    move-object/from16 v3, v32

    .line 512
    .line 513
    move-object/from16 v1, v37

    .line 514
    .line 515
    iput-object v3, v1, Lzn3;->c:Lws1;

    .line 516
    .line 517
    filled-new-array {v7}, [Ltl4;

    .line 518
    .line 519
    .line 520
    move-result-object v3

    .line 521
    invoke-static {v3}, Lqs;->p1([Ljava/lang/Object;)Ljava/util/List;

    .line 522
    .line 523
    .line 524
    move-result-object v3

    .line 525
    new-instance v6, Lwv1;

    .line 526
    .line 527
    invoke-direct {v6, v3}, Lwv1;-><init>(Ljava/util/List;)V

    .line 528
    .line 529
    .line 530
    iput-object v6, v7, Ltl4;->C:Lwv1;

    .line 531
    .line 532
    new-instance v3, Liy0;

    .line 533
    .line 534
    new-array v6, v15, [Lba5;

    .line 535
    .line 536
    aput-object v10, v6, v24

    .line 537
    .line 538
    aput-object v1, v6, v23

    .line 539
    .line 540
    invoke-static {v6}, Lsg3;->E([Ljava/lang/Object;)Ljava/util/List;

    .line 541
    .line 542
    .line 543
    move-result-object v1

    .line 544
    new-instance v6, Ljava/lang/StringBuilder;

    .line 545
    .line 546
    const-string v8, "CompositeProvider@RuntimeModuleData for "

    .line 547
    .line 548
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 549
    .line 550
    .line 551
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 552
    .line 553
    .line 554
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 555
    .line 556
    .line 557
    move-result-object v6

    .line 558
    invoke-direct {v3, v1, v6}, Liy0;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 559
    .line 560
    .line 561
    iput-object v3, v7, Ltl4;->D:Lba5;

    .line 562
    .line 563
    new-instance v1, Lra6;

    .line 564
    .line 565
    new-instance v3, Lcf4;

    .line 566
    .line 567
    invoke-direct {v3, v4, v0}, Lcf4;-><init>(Lkt1;Lrg4;)V

    .line 568
    .line 569
    .line 570
    invoke-direct {v1, v5, v3}, Lra6;-><init>(Lws1;Lcf4;)V

    .line 571
    .line 572
    .line 573
    :goto_7
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 574
    .line 575
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 576
    .line 577
    .line 578
    move-object/from16 v3, p0

    .line 579
    .line 580
    invoke-virtual {v2, v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object v0

    .line 584
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 585
    .line 586
    if-nez v0, :cond_7

    .line 587
    .line 588
    return-object v1

    .line 589
    :cond_7
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v4

    .line 593
    check-cast v4, Lra6;

    .line 594
    .line 595
    if-eqz v4, :cond_8

    .line 596
    .line 597
    return-object v4

    .line 598
    :cond_8
    invoke-virtual {v2, v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 599
    .line 600
    .line 601
    move-object/from16 p0, v3

    .line 602
    .line 603
    goto :goto_7

    .line 604
    :cond_9
    move-object/from16 v22, v7

    .line 605
    .line 606
    move-object v7, v8

    .line 607
    :try_start_1
    new-instance v0, Ljava/lang/AssertionError;

    .line 608
    .line 609
    new-instance v1, Ljava/lang/StringBuilder;

    .line 610
    .line 611
    const-string v2, "Built-ins module is already set: "

    .line 612
    .line 613
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 614
    .line 615
    .line 616
    move-object/from16 v3, v22

    .line 617
    .line 618
    iget-object v2, v3, Lfv3;->a:Ltl4;

    .line 619
    .line 620
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 621
    .line 622
    .line 623
    const-string v2, " (attempting to reset to "

    .line 624
    .line 625
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 626
    .line 627
    .line 628
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 629
    .line 630
    .line 631
    const-string v2, ")"

    .line 632
    .line 633
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 634
    .line 635
    .line 636
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 637
    .line 638
    .line 639
    move-result-object v1

    .line 640
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 641
    .line 642
    .line 643
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 644
    :catchall_0
    move-exception v0

    .line 645
    :try_start_2
    iget-object v1, v6, Lkb4;->b:Ltd0;

    .line 646
    .line 647
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 648
    .line 649
    .line 650
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 651
    :catchall_1
    move-exception v0

    .line 652
    invoke-interface {v9}, Ldu6;->unlock()V

    .line 653
    .line 654
    .line 655
    throw v0
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
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
.end method
