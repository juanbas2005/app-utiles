.class public final synthetic Lha7;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lvr2;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 9
    iput p1, p0, Lha7;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lyp7;)V
    .locals 0

    .line 1
    const/16 p1, 0x11

    .line 2
    .line 3
    iput p1, p0, Lha7;->w:I

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
.end method


# virtual methods
.method public final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v0, v0, Lha7;->w:I

    .line 4
    .line 5
    const/4 v1, -0x1

    .line 6
    const/4 v2, 0x2

    .line 7
    const/4 v3, 0x1

    .line 8
    const-wide v4, 0xffffffffL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    sget-object v7, Lvs7;->a:Lvs7;

    .line 15
    .line 16
    const/4 v8, 0x0

    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object/from16 v0, p1

    .line 21
    .line 22
    check-cast v0, Lsi1;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance v1, Lf08;

    .line 28
    .line 29
    invoke-direct {v1, v2}, Lf08;-><init>(I)V

    .line 30
    .line 31
    .line 32
    const-string v2, "Z"

    .line 33
    .line 34
    invoke-static {v0, v2, v1}, Lar7;->L(Lui1;Ljava/lang/String;Lvr2;)V

    .line 35
    .line 36
    .line 37
    return-object v7

    .line 38
    :pswitch_0
    move-object/from16 v0, p1

    .line 39
    .line 40
    check-cast v0, Lsi1;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    const-string v1, "z"

    .line 46
    .line 47
    invoke-interface {v0, v1}, Lui1;->a(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v7

    .line 51
    :pswitch_1
    move-object/from16 v0, p1

    .line 52
    .line 53
    check-cast v0, Lsi1;

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, Lsi1;->n(Lsi1;)V

    .line 59
    .line 60
    .line 61
    return-object v7

    .line 62
    :pswitch_2
    move-object/from16 v0, p1

    .line 63
    .line 64
    check-cast v0, Lsi1;

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    const/16 v1, 0x3a

    .line 70
    .line 71
    invoke-static {v0, v1}, Lar7;->l(Lui1;C)V

    .line 72
    .line 73
    .line 74
    invoke-static {v0}, Lsi1;->n(Lsi1;)V

    .line 75
    .line 76
    .line 77
    return-object v7

    .line 78
    :pswitch_3
    move-object/from16 v0, p1

    .line 79
    .line 80
    check-cast v0, Lua6;

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    const-string v1, "SELECT * FROM ussd_codes ORDER BY category, name"

    .line 86
    .line 87
    invoke-interface {v0, v1}, Lua6;->k0(Ljava/lang/String;)Lab6;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    :try_start_0
    const-string v0, "id"

    .line 92
    .line 93
    invoke-static {v1, v0}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    const-string v2, "name"

    .line 98
    .line 99
    invoke-static {v1, v2}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    const-string v3, "code"

    .line 104
    .line 105
    invoke-static {v1, v3}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    const-string v4, "category"

    .line 110
    .line 111
    invoke-static {v1, v4}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    const-string v5, "description"

    .line 116
    .line 117
    invoke-static {v1, v5}, Lu55;->n(Lab6;Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    new-instance v6, Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 124
    .line 125
    .line 126
    :goto_0
    invoke-interface {v1}, Lab6;->i0()Z

    .line 127
    .line 128
    .line 129
    move-result v7

    .line 130
    if-eqz v7, :cond_0

    .line 131
    .line 132
    invoke-interface {v1, v0}, Lab6;->R(I)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v9

    .line 136
    invoke-interface {v1, v2}, Lab6;->R(I)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v10

    .line 140
    invoke-interface {v1, v3}, Lab6;->R(I)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v11

    .line 144
    invoke-interface {v1, v4}, Lab6;->R(I)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v12

    .line 148
    invoke-interface {v1, v5}, Lab6;->R(I)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v13

    .line 152
    new-instance v8, Lyy7;

    .line 153
    .line 154
    invoke-direct/range {v8 .. v13}, Lyy7;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 158
    .line 159
    .line 160
    goto :goto_0

    .line 161
    :catchall_0
    move-exception v0

    .line 162
    goto :goto_1

    .line 163
    :cond_0
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 164
    .line 165
    .line 166
    return-object v6

    .line 167
    :goto_1
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 168
    .line 169
    .line 170
    throw v0

    .line 171
    :pswitch_4
    move-object/from16 v0, p1

    .line 172
    .line 173
    check-cast v0, Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences;

    .line 174
    .line 175
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0}, Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences;->getUssdAutoSmsCode()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    return-object v0

    .line 183
    :pswitch_5
    move-object/from16 v0, p1

    .line 184
    .line 185
    check-cast v0, Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences;

    .line 186
    .line 187
    invoke-virtual {v0}, Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences;->getUssdAutoPeriodicQuery()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    sget-object v1, Ljy7;->x:Ls63;

    .line 192
    .line 193
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    :try_start_1
    invoke-static {v0}, Ljy7;->valueOf(Ljava/lang/String;)Ljy7;

    .line 200
    .line 201
    .line 202
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 203
    goto :goto_2

    .line 204
    :catchall_1
    move-exception v0

    .line 205
    new-instance v1, Lm66;

    .line 206
    .line 207
    invoke-direct {v1, v0}, Lm66;-><init>(Ljava/lang/Throwable;)V

    .line 208
    .line 209
    .line 210
    move-object v0, v1

    .line 211
    :goto_2
    nop

    .line 212
    instance-of v1, v0, Lm66;

    .line 213
    .line 214
    if-eqz v1, :cond_1

    .line 215
    .line 216
    sget-object v0, Ljy7;->y:Ljy7;

    .line 217
    .line 218
    :cond_1
    check-cast v0, Ljy7;

    .line 219
    .line 220
    iget-object v0, v0, Ljy7;->w:Ljava/lang/String;

    .line 221
    .line 222
    return-object v0

    .line 223
    :pswitch_6
    move-object/from16 v0, p1

    .line 224
    .line 225
    check-cast v0, Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences;

    .line 226
    .line 227
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0}, Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences;->getUssdAutoDataCode()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    return-object v0

    .line 235
    :pswitch_7
    move-object/from16 v0, p1

    .line 236
    .line 237
    check-cast v0, Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences;

    .line 238
    .line 239
    invoke-virtual {v0}, Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences;->getUssdAutoSmsCode()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    return-object v0

    .line 244
    :pswitch_8
    move-object/from16 v0, p1

    .line 245
    .line 246
    check-cast v0, Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences;

    .line 247
    .line 248
    sget-object v1, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->T:Ld37;

    .line 249
    .line 250
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0}, Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences;->getUssdAutoVoiceCode()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    return-object v0

    .line 258
    :pswitch_9
    move-object/from16 v0, p1

    .line 259
    .line 260
    check-cast v0, Lul3;

    .line 261
    .line 262
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    iput-boolean v3, v0, Lul3;->b:Z

    .line 266
    .line 267
    return-object v7

    .line 268
    :pswitch_a
    move-object/from16 v0, p1

    .line 269
    .line 270
    check-cast v0, Lyb5;

    .line 271
    .line 272
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    iget-object v1, v0, Lyb5;->w:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v1, Ljava/lang/String;

    .line 278
    .line 279
    iget-object v0, v0, Lyb5;->x:Ljava/lang/Object;

    .line 280
    .line 281
    if-nez v0, :cond_2

    .line 282
    .line 283
    goto :goto_3

    .line 284
    :cond_2
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    new-instance v2, Ljava/lang/StringBuilder;

    .line 289
    .line 290
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    const/16 v1, 0x3d

    .line 297
    .line 298
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    :goto_3
    return-object v1

    .line 309
    :pswitch_b
    move-object/from16 v0, p1

    .line 310
    .line 311
    check-cast v0, Lgs3;

    .line 312
    .line 313
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    iget-object v1, v0, Lgs3;->a:Lks3;

    .line 317
    .line 318
    if-nez v1, :cond_3

    .line 319
    .line 320
    const-string v6, "*"

    .line 321
    .line 322
    goto :goto_6

    .line 323
    :cond_3
    iget-object v0, v0, Lgs3;->b:Las3;

    .line 324
    .line 325
    instance-of v4, v0, Lyp7;

    .line 326
    .line 327
    if-eqz v4, :cond_4

    .line 328
    .line 329
    move-object v4, v0

    .line 330
    check-cast v4, Lyp7;

    .line 331
    .line 332
    goto :goto_4

    .line 333
    :cond_4
    move-object v4, v6

    .line 334
    :goto_4
    if-eqz v4, :cond_5

    .line 335
    .line 336
    invoke-virtual {v4, v3}, Lyp7;->b(Z)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    goto :goto_5

    .line 341
    :cond_5
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    :goto_5
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 346
    .line 347
    .line 348
    move-result v1

    .line 349
    if-eqz v1, :cond_8

    .line 350
    .line 351
    if-eq v1, v3, :cond_7

    .line 352
    .line 353
    if-ne v1, v2, :cond_6

    .line 354
    .line 355
    const-string v1, "out "

    .line 356
    .line 357
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v6

    .line 361
    goto :goto_6

    .line 362
    :cond_6
    invoke-static {}, Lh;->c()V

    .line 363
    .line 364
    .line 365
    goto :goto_6

    .line 366
    :cond_7
    const-string v1, "in "

    .line 367
    .line 368
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v6

    .line 372
    goto :goto_6

    .line 373
    :cond_8
    move-object v6, v0

    .line 374
    :goto_6
    return-object v6

    .line 375
    :pswitch_c
    move-object/from16 v0, p1

    .line 376
    .line 377
    check-cast v0, Lab6;

    .line 378
    .line 379
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    new-instance v1, Lsn6;

    .line 383
    .line 384
    invoke-direct {v1}, Lsn6;-><init>()V

    .line 385
    .line 386
    .line 387
    :goto_7
    invoke-interface {v0}, Lab6;->i0()Z

    .line 388
    .line 389
    .line 390
    move-result v2

    .line 391
    if-eqz v2, :cond_9

    .line 392
    .line 393
    invoke-interface {v0, v8}, Lab6;->getLong(I)J

    .line 394
    .line 395
    .line 396
    move-result-wide v2

    .line 397
    long-to-int v2, v2

    .line 398
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 399
    .line 400
    .line 401
    move-result-object v2

    .line 402
    invoke-virtual {v1, v2}, Lsn6;->add(Ljava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    goto :goto_7

    .line 406
    :cond_9
    invoke-static {v1}, Lwn6;->d(Lsn6;)Lsn6;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    return-object v0

    .line 411
    :pswitch_d
    move-object/from16 v0, p1

    .line 412
    .line 413
    check-cast v0, Loi6;

    .line 414
    .line 415
    iget-wide v1, v0, Loi6;->B:J

    .line 416
    .line 417
    iget-object v3, v0, Loi6;->D:Lcy6;

    .line 418
    .line 419
    if-eqz v3, :cond_a

    .line 420
    .line 421
    sget-object v4, Lrc9;->p:Lha7;

    .line 422
    .line 423
    iget-object v5, v0, Loi6;->C:Lhx4;

    .line 424
    .line 425
    invoke-virtual {v3, v0, v4, v5}, Lcy6;->e(Ljava/lang/Object;Lvr2;Lsr2;)V

    .line 426
    .line 427
    .line 428
    :cond_a
    iget-wide v3, v0, Loi6;->B:J

    .line 429
    .line 430
    cmp-long v1, v1, v3

    .line 431
    .line 432
    if-eqz v1, :cond_d

    .line 433
    .line 434
    iget-object v1, v0, Loi6;->K:Lhi6;

    .line 435
    .line 436
    if-eqz v1, :cond_c

    .line 437
    .line 438
    iget-wide v5, v1, Lhi6;->a:J

    .line 439
    .line 440
    cmp-long v2, v5, v3

    .line 441
    .line 442
    if-lez v2, :cond_b

    .line 443
    .line 444
    invoke-virtual {v0}, Loi6;->j1()V

    .line 445
    .line 446
    .line 447
    goto :goto_8

    .line 448
    :cond_b
    iput-wide v3, v1, Lhi6;->g:J

    .line 449
    .line 450
    iget-object v2, v1, Lhi6;->b:Lp38;

    .line 451
    .line 452
    if-nez v2, :cond_d

    .line 453
    .line 454
    iget-object v2, v1, Lhi6;->e:Lkl;

    .line 455
    .line 456
    invoke-virtual {v2, v8}, Lkl;->a(I)F

    .line 457
    .line 458
    .line 459
    move-result v2

    .line 460
    float-to-double v2, v2

    .line 461
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 462
    .line 463
    sub-double/2addr v4, v2

    .line 464
    iget-wide v2, v0, Loi6;->B:J

    .line 465
    .line 466
    long-to-double v2, v2

    .line 467
    mul-double/2addr v4, v2

    .line 468
    invoke-static {v4, v5}, Ldh4;->D(D)J

    .line 469
    .line 470
    .line 471
    move-result-wide v2

    .line 472
    iput-wide v2, v1, Lhi6;->h:J

    .line 473
    .line 474
    goto :goto_8

    .line 475
    :cond_c
    const-wide/16 v1, 0x0

    .line 476
    .line 477
    cmp-long v1, v3, v1

    .line 478
    .line 479
    if-eqz v1, :cond_d

    .line 480
    .line 481
    invoke-virtual {v0}, Loi6;->m1()V

    .line 482
    .line 483
    .line 484
    :cond_d
    :goto_8
    return-object v7

    .line 485
    :pswitch_e
    move-object/from16 v0, p1

    .line 486
    .line 487
    check-cast v0, Lab6;

    .line 488
    .line 489
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 490
    .line 491
    .line 492
    invoke-interface {v0}, Lab6;->i0()Z

    .line 493
    .line 494
    .line 495
    move-result v0

    .line 496
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    return-object v0

    .line 501
    :pswitch_f
    move-object/from16 v0, p1

    .line 502
    .line 503
    check-cast v0, Lok6;

    .line 504
    .line 505
    sget-object v1, Ljk6;->B:Lnk6;

    .line 506
    .line 507
    invoke-interface {v0, v1, v7}, Lok6;->f(Lnk6;Ljava/lang/Object;)V

    .line 508
    .line 509
    .line 510
    return-object v7

    .line 511
    :pswitch_10
    move-object/from16 v0, p1

    .line 512
    .line 513
    check-cast v0, Lul;

    .line 514
    .line 515
    iget-object v1, v0, Lul;->a:Ljava/lang/Object;

    .line 516
    .line 517
    instance-of v2, v1, Lb74;

    .line 518
    .line 519
    if-eqz v2, :cond_11

    .line 520
    .line 521
    check-cast v1, Lb74;

    .line 522
    .line 523
    invoke-virtual {v1}, Lb74;->a()Lgg7;

    .line 524
    .line 525
    .line 526
    move-result-object v1

    .line 527
    if-eqz v1, :cond_11

    .line 528
    .line 529
    iget-object v2, v1, Lgg7;->a:Lyy6;

    .line 530
    .line 531
    if-nez v2, :cond_e

    .line 532
    .line 533
    iget-object v2, v1, Lgg7;->b:Lyy6;

    .line 534
    .line 535
    if-nez v2, :cond_e

    .line 536
    .line 537
    iget-object v2, v1, Lgg7;->c:Lyy6;

    .line 538
    .line 539
    if-nez v2, :cond_e

    .line 540
    .line 541
    iget-object v1, v1, Lgg7;->d:Lyy6;

    .line 542
    .line 543
    if-nez v1, :cond_e

    .line 544
    .line 545
    goto :goto_9

    .line 546
    :cond_e
    new-instance v1, Lul;

    .line 547
    .line 548
    iget-object v2, v0, Lul;->a:Ljava/lang/Object;

    .line 549
    .line 550
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 551
    .line 552
    .line 553
    check-cast v2, Lb74;

    .line 554
    .line 555
    invoke-virtual {v2}, Lb74;->a()Lgg7;

    .line 556
    .line 557
    .line 558
    move-result-object v2

    .line 559
    if-eqz v2, :cond_f

    .line 560
    .line 561
    iget-object v2, v2, Lgg7;->a:Lyy6;

    .line 562
    .line 563
    if-nez v2, :cond_10

    .line 564
    .line 565
    :cond_f
    new-instance v3, Lyy6;

    .line 566
    .line 567
    const/16 v21, 0x0

    .line 568
    .line 569
    const v22, 0xffff

    .line 570
    .line 571
    .line 572
    const-wide/16 v4, 0x0

    .line 573
    .line 574
    const-wide/16 v6, 0x0

    .line 575
    .line 576
    const/4 v8, 0x0

    .line 577
    const/4 v9, 0x0

    .line 578
    const/4 v10, 0x0

    .line 579
    const/4 v11, 0x0

    .line 580
    const/4 v12, 0x0

    .line 581
    const-wide/16 v13, 0x0

    .line 582
    .line 583
    const/4 v15, 0x0

    .line 584
    const/16 v16, 0x0

    .line 585
    .line 586
    const/16 v17, 0x0

    .line 587
    .line 588
    const-wide/16 v18, 0x0

    .line 589
    .line 590
    const/16 v20, 0x0

    .line 591
    .line 592
    invoke-direct/range {v3 .. v22}, Lyy6;-><init>(JJLam2;Lyl2;Lzl2;Lea7;Ljava/lang/String;JLh60;Llf7;Lya4;JLrd7;Llq6;I)V

    .line 593
    .line 594
    .line 595
    move-object v2, v3

    .line 596
    :cond_10
    iget v3, v0, Lul;->b:I

    .line 597
    .line 598
    iget v4, v0, Lul;->c:I

    .line 599
    .line 600
    invoke-direct {v1, v3, v4, v2}, Lul;-><init>(IILjava/lang/Object;)V

    .line 601
    .line 602
    .line 603
    filled-new-array {v0, v1}, [Lul;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    invoke-static {v0}, Lsg3;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 608
    .line 609
    .line 610
    move-result-object v0

    .line 611
    goto :goto_a

    .line 612
    :cond_11
    :goto_9
    filled-new-array {v0}, [Lul;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    invoke-static {v0}, Lsg3;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 617
    .line 618
    .line 619
    move-result-object v0

    .line 620
    :goto_a
    return-object v0

    .line 621
    :pswitch_11
    move-object/from16 v0, p1

    .line 622
    .line 623
    check-cast v0, Lbg7;

    .line 624
    .line 625
    sget-object v0, Lyf7;->a:Lyy0;

    .line 626
    .line 627
    return-object v7

    .line 628
    :pswitch_12
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 629
    .line 630
    .line 631
    move-object/from16 v0, p1

    .line 632
    .line 633
    check-cast v0, Ljava/util/List;

    .line 634
    .line 635
    new-instance v1, Lhf7;

    .line 636
    .line 637
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    move-result-object v2

    .line 641
    sget-object v4, Lqf6;->a:Lkg5;

    .line 642
    .line 643
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 644
    .line 645
    invoke-static {v2, v5}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 646
    .line 647
    .line 648
    move-result v7

    .line 649
    if-eqz v7, :cond_13

    .line 650
    .line 651
    :cond_12
    move-object v2, v6

    .line 652
    goto :goto_b

    .line 653
    :cond_13
    if-eqz v2, :cond_12

    .line 654
    .line 655
    iget-object v4, v4, Lkg5;->y:Ljava/lang/Object;

    .line 656
    .line 657
    check-cast v4, Lvr2;

    .line 658
    .line 659
    invoke-interface {v4, v2}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object v2

    .line 663
    check-cast v2, Lvl;

    .line 664
    .line 665
    :goto_b
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 666
    .line 667
    .line 668
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    move-result-object v0

    .line 672
    sget v3, Llg7;->c:I

    .line 673
    .line 674
    sget-object v3, Lqf6;->p:Lkg5;

    .line 675
    .line 676
    invoke-static {v0, v5}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 677
    .line 678
    .line 679
    move-result v4

    .line 680
    if-eqz v4, :cond_15

    .line 681
    .line 682
    :cond_14
    move-object v0, v6

    .line 683
    goto :goto_c

    .line 684
    :cond_15
    if-eqz v0, :cond_14

    .line 685
    .line 686
    iget-object v3, v3, Lkg5;->y:Ljava/lang/Object;

    .line 687
    .line 688
    check-cast v3, Lvr2;

    .line 689
    .line 690
    invoke-interface {v3, v0}, Lvr2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    check-cast v0, Llg7;

    .line 695
    .line 696
    :goto_c
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 697
    .line 698
    .line 699
    iget-wide v3, v0, Llg7;->a:J

    .line 700
    .line 701
    invoke-direct {v1, v2, v3, v4, v6}, Lhf7;-><init>(Lvl;JLlg7;)V

    .line 702
    .line 703
    .line 704
    return-object v1

    .line 705
    :pswitch_13
    move-object/from16 v0, p1

    .line 706
    .line 707
    check-cast v0, Ljava/util/List;

    .line 708
    .line 709
    new-instance v1, Lse7;

    .line 710
    .line 711
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    move-result-object v2

    .line 715
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 716
    .line 717
    .line 718
    check-cast v2, Ljava/lang/Boolean;

    .line 719
    .line 720
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 721
    .line 722
    .line 723
    move-result v2

    .line 724
    if-eqz v2, :cond_16

    .line 725
    .line 726
    sget-object v2, Lz75;->w:Lz75;

    .line 727
    .line 728
    goto :goto_d

    .line 729
    :cond_16
    sget-object v2, Lz75;->x:Lz75;

    .line 730
    .line 731
    :goto_d
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 732
    .line 733
    .line 734
    move-result-object v0

    .line 735
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 736
    .line 737
    .line 738
    check-cast v0, Ljava/lang/Float;

    .line 739
    .line 740
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 741
    .line 742
    .line 743
    move-result v0

    .line 744
    invoke-direct {v1, v2, v0}, Lse7;-><init>(Lz75;F)V

    .line 745
    .line 746
    .line 747
    return-object v1

    .line 748
    :pswitch_14
    move-object/from16 v0, p1

    .line 749
    .line 750
    check-cast v0, Loe7;

    .line 751
    .line 752
    invoke-virtual {v0}, Loe7;->b()Ljava/lang/Integer;

    .line 753
    .line 754
    .line 755
    move-result-object v1

    .line 756
    if-eqz v1, :cond_17

    .line 757
    .line 758
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 759
    .line 760
    .line 761
    move-result v1

    .line 762
    new-instance v6, Lnp1;

    .line 763
    .line 764
    iget-wide v2, v0, Loe7;->f:J

    .line 765
    .line 766
    sget v0, Llg7;->c:I

    .line 767
    .line 768
    and-long/2addr v2, v4

    .line 769
    long-to-int v0, v2

    .line 770
    sub-int/2addr v1, v0

    .line 771
    invoke-direct {v6, v8, v1}, Lnp1;-><init>(II)V

    .line 772
    .line 773
    .line 774
    :cond_17
    return-object v6

    .line 775
    :pswitch_15
    move-object/from16 v0, p1

    .line 776
    .line 777
    check-cast v0, Loe7;

    .line 778
    .line 779
    invoke-virtual {v0}, Loe7;->c()Ljava/lang/Integer;

    .line 780
    .line 781
    .line 782
    move-result-object v1

    .line 783
    if-eqz v1, :cond_18

    .line 784
    .line 785
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 786
    .line 787
    .line 788
    move-result v1

    .line 789
    new-instance v6, Lnp1;

    .line 790
    .line 791
    iget-wide v2, v0, Loe7;->f:J

    .line 792
    .line 793
    sget v0, Llg7;->c:I

    .line 794
    .line 795
    and-long/2addr v2, v4

    .line 796
    long-to-int v0, v2

    .line 797
    sub-int/2addr v0, v1

    .line 798
    invoke-direct {v6, v0, v8}, Lnp1;-><init>(II)V

    .line 799
    .line 800
    .line 801
    :cond_18
    return-object v6

    .line 802
    :pswitch_16
    move-object/from16 v0, p1

    .line 803
    .line 804
    check-cast v0, Loe7;

    .line 805
    .line 806
    invoke-virtual {v0}, Loe7;->d()Ljava/lang/Integer;

    .line 807
    .line 808
    .line 809
    move-result-object v1

    .line 810
    if-eqz v1, :cond_19

    .line 811
    .line 812
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 813
    .line 814
    .line 815
    move-result v1

    .line 816
    new-instance v6, Lnp1;

    .line 817
    .line 818
    iget-wide v2, v0, Loe7;->f:J

    .line 819
    .line 820
    sget v0, Llg7;->c:I

    .line 821
    .line 822
    and-long/2addr v2, v4

    .line 823
    long-to-int v0, v2

    .line 824
    sub-int/2addr v1, v0

    .line 825
    invoke-direct {v6, v8, v1}, Lnp1;-><init>(II)V

    .line 826
    .line 827
    .line 828
    :cond_19
    return-object v6

    .line 829
    :pswitch_17
    move-object/from16 v0, p1

    .line 830
    .line 831
    check-cast v0, Loe7;

    .line 832
    .line 833
    invoke-virtual {v0}, Loe7;->e()Ljava/lang/Integer;

    .line 834
    .line 835
    .line 836
    move-result-object v1

    .line 837
    if-eqz v1, :cond_1a

    .line 838
    .line 839
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 840
    .line 841
    .line 842
    move-result v1

    .line 843
    new-instance v6, Lnp1;

    .line 844
    .line 845
    iget-wide v2, v0, Loe7;->f:J

    .line 846
    .line 847
    sget v0, Llg7;->c:I

    .line 848
    .line 849
    and-long/2addr v2, v4

    .line 850
    long-to-int v0, v2

    .line 851
    sub-int/2addr v0, v1

    .line 852
    invoke-direct {v6, v0, v8}, Lnp1;-><init>(II)V

    .line 853
    .line 854
    .line 855
    :cond_1a
    return-object v6

    .line 856
    :pswitch_18
    move-object/from16 v0, p1

    .line 857
    .line 858
    check-cast v0, Loe7;

    .line 859
    .line 860
    iget-object v2, v0, Loe7;->g:Lvl;

    .line 861
    .line 862
    iget-object v2, v2, Lvl;->x:Ljava/lang/String;

    .line 863
    .line 864
    iget-wide v9, v0, Loe7;->f:J

    .line 865
    .line 866
    sget v3, Llg7;->c:I

    .line 867
    .line 868
    and-long/2addr v9, v4

    .line 869
    long-to-int v3, v9

    .line 870
    invoke-static {v3, v2}, Lt35;->p(ILjava/lang/String;)I

    .line 871
    .line 872
    .line 873
    move-result v2

    .line 874
    if-eq v2, v1, :cond_1b

    .line 875
    .line 876
    new-instance v6, Lnp1;

    .line 877
    .line 878
    iget-wide v0, v0, Loe7;->f:J

    .line 879
    .line 880
    and-long/2addr v0, v4

    .line 881
    long-to-int v0, v0

    .line 882
    sub-int/2addr v2, v0

    .line 883
    invoke-direct {v6, v8, v2}, Lnp1;-><init>(II)V

    .line 884
    .line 885
    .line 886
    :cond_1b
    return-object v6

    .line 887
    :pswitch_19
    move-object/from16 v0, p1

    .line 888
    .line 889
    check-cast v0, Loe7;

    .line 890
    .line 891
    iget-object v2, v0, Loe7;->g:Lvl;

    .line 892
    .line 893
    iget-object v2, v2, Lvl;->x:Ljava/lang/String;

    .line 894
    .line 895
    iget-wide v9, v0, Loe7;->f:J

    .line 896
    .line 897
    sget v3, Llg7;->c:I

    .line 898
    .line 899
    and-long/2addr v9, v4

    .line 900
    long-to-int v3, v9

    .line 901
    if-gtz v3, :cond_1c

    .line 902
    .line 903
    :goto_e
    move v2, v1

    .line 904
    goto :goto_f

    .line 905
    :cond_1c
    invoke-static {}, Lt35;->s()Lw22;

    .line 906
    .line 907
    .line 908
    move-result-object v7

    .line 909
    if-nez v7, :cond_1e

    .line 910
    .line 911
    if-gtz v3, :cond_1d

    .line 912
    .line 913
    goto :goto_e

    .line 914
    :cond_1d
    invoke-static {v2, v3, v1}, Ljava/lang/Character;->offsetByCodePoints(Ljava/lang/CharSequence;II)I

    .line 915
    .line 916
    .line 917
    move-result v2

    .line 918
    goto :goto_f

    .line 919
    :cond_1e
    add-int/lit8 v9, v3, -0x1

    .line 920
    .line 921
    invoke-virtual {v7, v9, v2}, Lw22;->b(ILjava/lang/CharSequence;)I

    .line 922
    .line 923
    .line 924
    move-result v7

    .line 925
    if-gez v7, :cond_20

    .line 926
    .line 927
    if-gtz v3, :cond_1f

    .line 928
    .line 929
    goto :goto_e

    .line 930
    :cond_1f
    invoke-static {v2, v3, v1}, Ljava/lang/Character;->offsetByCodePoints(Ljava/lang/CharSequence;II)I

    .line 931
    .line 932
    .line 933
    move-result v2

    .line 934
    goto :goto_f

    .line 935
    :cond_20
    move v2, v7

    .line 936
    :goto_f
    if-ne v2, v1, :cond_21

    .line 937
    .line 938
    goto :goto_10

    .line 939
    :cond_21
    new-instance v6, Lnp1;

    .line 940
    .line 941
    iget-wide v0, v0, Loe7;->f:J

    .line 942
    .line 943
    and-long/2addr v0, v4

    .line 944
    long-to-int v0, v0

    .line 945
    sub-int/2addr v0, v2

    .line 946
    invoke-direct {v6, v0, v8}, Lnp1;-><init>(II)V

    .line 947
    .line 948
    .line 949
    :goto_10
    return-object v6

    .line 950
    :pswitch_1a
    move-object/from16 v0, p1

    .line 951
    .line 952
    check-cast v0, Ljava/lang/Integer;

    .line 953
    .line 954
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 955
    .line 956
    .line 957
    sget-object v0, Lzd7;->a:Ljava/lang/String;

    .line 958
    .line 959
    return-object v0

    .line 960
    :pswitch_1b
    move-object/from16 v0, p1

    .line 961
    .line 962
    check-cast v0, Ljava/lang/Float;

    .line 963
    .line 964
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 965
    .line 966
    .line 967
    return-object v7

    .line 968
    :pswitch_1c
    move-object/from16 v0, p1

    .line 969
    .line 970
    check-cast v0, Lua6;

    .line 971
    .line 972
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 973
    .line 974
    .line 975
    const-string v1, "SELECT DISTINCT work_spec_id FROM SystemIdInfo"

    .line 976
    .line 977
    invoke-interface {v0, v1}, Lua6;->k0(Ljava/lang/String;)Lab6;

    .line 978
    .line 979
    .line 980
    move-result-object v1

    .line 981
    :try_start_2
    new-instance v0, Ljava/util/ArrayList;

    .line 982
    .line 983
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 984
    .line 985
    .line 986
    :goto_11
    invoke-interface {v1}, Lab6;->i0()Z

    .line 987
    .line 988
    .line 989
    move-result v2

    .line 990
    if-eqz v2, :cond_22

    .line 991
    .line 992
    invoke-interface {v1, v8}, Lab6;->R(I)Ljava/lang/String;

    .line 993
    .line 994
    .line 995
    move-result-object v2

    .line 996
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 997
    .line 998
    .line 999
    goto :goto_11

    .line 1000
    :catchall_2
    move-exception v0

    .line 1001
    goto :goto_12

    .line 1002
    :cond_22
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1003
    .line 1004
    .line 1005
    return-object v0

    .line 1006
    :goto_12
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1007
    .line 1008
    .line 1009
    throw v0

    .line 1010
    nop

    .line 1011
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
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
